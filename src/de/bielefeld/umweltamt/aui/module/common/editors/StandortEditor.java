/**
 * Copyright 2005-2011, Stadt Bielefeld
 *
 * This file is part of AUIK (Anlagen- und Indirekteinleiter-Kataster).
 *
 * AUIK is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 2 of the License, or (at your
 * option) any later version.
 *
 * AUIK is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with AUIK. If not, see <http://www.gnu.org/licenses/>.
 *
 * AUIK has been developed by Stadt Bielefeld and Intevation GmbH.
 */

package de.bielefeld.umweltamt.aui.module.common.editors;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.hibernate.criterion.MatchMode;

import com.jgoodies.forms.builder.PanelBuilder;
import com.jgoodies.forms.factories.Paddings;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import de.bielefeld.umweltamt.aui.HauptFrame;
import de.bielefeld.umweltamt.aui.mappings.DatabaseQuery;
import de.bielefeld.umweltamt.aui.mappings.basis.Gemarkung;
import de.bielefeld.umweltamt.aui.mappings.basis.Orte;
import de.bielefeld.umweltamt.aui.mappings.basis.Strassen;
import de.bielefeld.umweltamt.aui.mappings.awsv.Standortgghwsg;
import de.bielefeld.umweltamt.aui.mappings.awsv.Wassereinzugsgebiet;
import de.bielefeld.umweltamt.aui.utils.AuikLogger;
import de.bielefeld.umweltamt.aui.utils.AuikUtils;
import de.bielefeld.umweltamt.aui.utils.DoubleField;
import de.bielefeld.umweltamt.aui.utils.IntegerField;
import de.bielefeld.umweltamt.aui.utils.LimitedTextField;
import de.bielefeld.umweltamt.aui.utils.SearchBox;
import de.bielefeld.umweltamt.aui.utils.StringUtils;
import de.bielefeld.umweltamt.aui.utils.SwingWorkerVariant;
import de.bielefeld.umweltamt.aui.mappings.basis.Standort;

/**
 * Ein Dialog zum Bearbeiten eines Standorts.
 * 
 * @author David Klotz
 */
public class StandortEditor extends AbstractBaseEditor
{
	private static final long serialVersionUID = 2023212804506559226L;

	/** Logging */
	private static final AuikLogger log = AuikLogger.getLogger();

	// Für die Comboboxen beim Bearbeiten
	private static Gemarkung[] gemarkungen = null;
	private static Standortgghwsg[] standortggs = null;
	private static String[] entwgebiete = null;
	private static Wassereinzugsgebiet[] wEinzugsgebiete = null;

	private JTextField bezeichnungFeld;
	private JTextField flurFeld;
	private JTextField flurStkFeld;
	private JFormattedTextField e32Feld;
	private JFormattedTextField n32Feld;
	private JButton ausAblageButton;
	private JTextField sachbeFeld;
	private JFormattedTextField wassermengeFeld;

	private JComboBox gemarkungBox;
	private JComboBox standortGgBox;
	private JComboBox entwGebBox;
	private JComboBox wEinzugsGebBox;

	/**
	 * Erzeugt einen neuen Dialog zum Bearbeiten eines Standorts.
	 */
	public StandortEditor(Standort bsta, HauptFrame owner)
	{
		super("Standort (" + bsta.getId() + ")", bsta, owner);
	}

	@Override
	protected JComponent buildContentArea()
	{

		bezeichnungFeld = new LimitedTextField(50);
		flurFeld = new LimitedTextField(50);
		flurStkFeld = new LimitedTextField(50);
		sachbeFeld = new LimitedTextField(50);
		wassermengeFeld = new IntegerField();

		e32Feld = new DoubleField(1);
		n32Feld = new DoubleField(1);

		gemarkungBox = new JComboBox();
		standortGgBox = new JComboBox();
		entwGebBox = new JComboBox();
		entwGebBox.setEditable(true);
		wEinzugsGebBox = new JComboBox();

		
		String linkeSpalten = "r:p, 3dlu, 50dlu:g, 3dlu, 50dlu:g, 5dlu, 20dlu:g(0.2), 3dlu, 15dlu:g(0.2)";
		String rechteSpalten = "r:p, 3dlu, 50dlu:g, 3dlu, 50dlu:g";
		int rS = 10;

		FormLayout layout = new FormLayout(
				linkeSpalten + ", 10dlu, " + rechteSpalten, // Spalten
				"pref, " + //1
						"3dlu, " + //2
						"pref, " + //3
						"3dlu, " + //4
						"pref, " + //5
						"3dlu, " + //6
						"pref, " + //7
						"3dlu, " + //8
						"pref, " + //9
						"3dlu, " + //10
						"pref, " + //11
						"3dlu, " + //12
						"pref, " + //13
						"3dlu, " + //14
						"pref, " + //15
						"3dlu, " + //16
						"pref, " + //17
						"3dlu, " + //18
						"pref, " + //19
						"10dlu, " + //20
						"pref, " + //21
						"3dlu, " + //22
						"pref, " + //23
						"10dlu, " + //24
						"bottom:pref:grow"); //25

		PanelBuilder builder = new PanelBuilder(layout);
		CellConstraints cc = new CellConstraints();

		// Stammdaten
		builder.addSeparator("Stammdaten", cc.xyw(1, 1, 9));

		builder.addLabel("Bezeichnung:", cc.xy(1, 3));
		builder.add(bezeichnungFeld, cc.xyw(3, 3, 3));

		//Gemarkung
		builder.addLabel("Gemarkung:", cc.xy(1, 5));
		builder.add(gemarkungBox, cc.xyw(3, 5, 3));

		// Flur
		builder.addLabel("Flur:", cc.xy(1, 7));
		builder.add(flurFeld, cc.xy(3, 7));
		builder.addLabel("Flurstück:", cc.xy(1, 9));
		builder.add(flurStkFeld, cc.xy(3, 9));
		
		// Koordinaten
		builder.addLabel("E32:", cc.xy(1, 11));
		builder.add(e32Feld, cc.xy(3, 11));
		builder.addLabel("N32:", cc.xy(1, 13));
		builder.add(n32Feld, cc.xy(3, 13));
		builder.add(getAusAblageButton(), cc.xywh(5, 11, 1, 3));

		// VAWS
		builder.addSeparator("VAWS", cc.xyw(1 + rS, 1, 5));
		builder.addLabel("Standortgegebenheit:", cc.xy(1 + rS, 3));
		builder.add(standortGgBox, cc.xyw(3 + rS, 3, 3));
		builder.addLabel("W.Einzugsgebiet:", cc.xy(1 + rS, 5));
		builder.add(wEinzugsGebBox, cc.xyw(3 + rS, 5, 3));

		// Indirekteinleiter
		builder.addSeparator("Indirekteinleiter", cc.xyw(1 + rS, 9, 5));
		builder.addLabel("Entwässerungsgebiet:", cc.xy(1 + rS, 11));
		builder.add(entwGebBox, cc.xyw(3 + rS, 11, 3));
		builder.addLabel("Sachbearbeiter:", cc.xy(1 + rS, 13));
		builder.add(sachbeFeld, cc.xyw(3 + rS, 13, 3));
		builder.addLabel("Wasserverbrauch:", cc.xy(1 + rS, 15));
		builder.add(wassermengeFeld, cc.xyw(3 + rS, 15, 3));

		JPanel panel = builder.getPanel();
		panel.setBorder(Paddings.DIALOG);
		return panel;
	}

	
	@Override
	protected void fillForm()
	{
		frame.changeStatus("Beschäftigt...");

		SwingWorkerVariant worker = new SwingWorkerVariant(this)
		{

			@Override
			protected void doNonUILogic() throws RuntimeException
			{

				if (gemarkungen == null)
				{
					gemarkungen = DatabaseQuery.getGemarkungen();
				}
				if (standortggs == null)
				{
					standortggs = DatabaseQuery.getStandortgghwsg();
				}
				if (entwgebiete == null)
				{
					entwgebiete = DatabaseQuery.getEntwaesserungsgebiete();
				}
				if (wEinzugsgebiete == null)
				{
					wEinzugsgebiete = DatabaseQuery.getWassereinzugsgebiet();
				}
			}

			@Override
			protected void doUIUpdateLogic() throws RuntimeException
			{

				if (gemarkungen != null)
				{
					gemarkungBox.setModel(new DefaultComboBoxModel(gemarkungen));
					gemarkungBox.setSelectedItem(getStandort().getGemarkung());
				}
				if (standortggs != null)
				{
					standortGgBox.setModel(new DefaultComboBoxModel(standortggs));
					standortGgBox.setSelectedItem(getStandort().getStandortgghwsg());
				}

				if (entwgebiete != null)
				{
					entwGebBox.setModel(new DefaultComboBoxModel(entwgebiete));
					entwGebBox.setSelectedItem(getStandort().getEntgebid());
				}

				if (wEinzugsgebiete != null)
				{
					wEinzugsGebBox.setModel(new DefaultComboBoxModel(wEinzugsgebiete));
					wEinzugsGebBox.setSelectedItem(getStandort().getWassereinzugsgebiet());
				}


				bezeichnungFeld.setText(getStandort().getBezeichnung());
				flurFeld.setText(getStandort().getFlur());
				flurStkFeld.setText(getStandort().getFlurstueck());
				e32Feld.setValue(getStandort().getE32());
				n32Feld.setValue(getStandort().getN32());
				sachbeFeld.setText(getStandort().getSachbe33rav());
				wassermengeFeld.setValue(getStandort().getWassermenge());

				frame.clearStatus();
			}
		};
		worker.start();
	}

	@Override
	protected boolean canSave()
	{
		return true;
		// Eingaben überprüfen:

	}

	/**
	 * Wird aufgerufen, wenn der Benutzen auf "Speichern" geklickt hat.
	 */
	@Override
	protected boolean doSave()
	{

		// Gemarkung
		Gemarkung bgem = (Gemarkung) gemarkungBox.getSelectedItem();
		getStandort().setGemarkung(bgem);

		// Standortgg
		Standortgghwsg stgg = (Standortgghwsg) standortGgBox.getSelectedItem();
		getStandort().setStandortgghwsg(stgg);

		// Entwässerungsgebiet
		String entgb = (String) entwGebBox.getSelectedItem();

		// Nötig, weil getSelectedItem bei editierbarer ComboBox auch NULL liefern kann
		if (entgb != null)
		{
			entgb = entgb.trim();
		}
		if ("".equals(entgb))
		{
			getStandort().setEntgebid(null);
		}
		else
		{
			getStandort().setEntgebid(entgb);
		}

		// VAWS-Einzugsgebiet
		Wassereinzugsgebiet wezg = (Wassereinzugsgebiet) wEinzugsGebBox.getSelectedItem();
		getStandort().setWassereinzugsgebiet(wezg);

		//Bezeichnung
		String bezeichnung = bezeichnungFeld.getText();
		if (bezeichnung != null)
		{
			bezeichnung = bezeichnung.trim();
			if (bezeichnung.equals(""))
			{
				getStandort().setBezeichnung(null);
			}
			else
			{
				getStandort().setBezeichnung(bezeichnung);
			}
		}
		
		// Flur
		String flur = flurFeld.getText();
		if (flur != null)
		{
			flur = flur.trim();
			if (flur.equals(""))
			{
				getStandort().setFlur(null);
			}
			else
			{
				getStandort().setFlur(flur);
			}
		}

		// Flurstueck
		String flurstk = flurStkFeld.getText();
		if (flurstk != null)
		{
			if (flurstk.equals(""))
			{
				getStandort().setFlurstueck(null);
			}
			else
			{
				getStandort().setFlurstueck(flurstk);
			}
		}

		// E32
		Float e32Wert = ((DoubleField) e32Feld).getFloatValue();
		getStandort().setE32(e32Wert);

		// N32
		Float n32Wert = ((DoubleField) n32Feld).getFloatValue();
		getStandort().setN32(n32Wert);

		// Indirekteinleiter
		String sach = sachbeFeld.getText();
		if (sach != null)
		{
			if (sach.equals(""))
			{
				getStandort().setSachbe33rav(null);
			}
			else
			{
				getStandort().setSachbe33rav(sach);
			}
		}

		// Wassermenge:
		Integer wassermng = ((IntegerField) wassermengeFeld).getIntValue();
		getStandort().setWassermenge(wassermng);

		Standort bsta = Standort.merge(getStandort());
		if (bsta != null)
		{
			setEditedObject(bsta);
			log.debug("Änderungen gespeichert!");
			return true;
		}
		else
		{
			return false;
		}
	}

	public Standort getStandort()
	{
		return (Standort) getEditedObject();
	}

	private void readClipboard()
	{

		Clipboard systemClipboard;
		systemClipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		Transferable transferData = systemClipboard.getContents(null);
		for (DataFlavor dataFlavor : transferData.getTransferDataFlavors())
		{
			Object content = null;
			try
			{
				content = transferData.getTransferData(dataFlavor);
			}
			catch (UnsupportedFlavorException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (content instanceof String)
			{

				String[] tmp = content.toString().split(",");
				if (tmp.length == 4)
				{
					String e32AusZeile = tmp[2];
					String n32AusZeile = tmp[3];
					e32Feld.setText(e32AusZeile.substring(0, 7));
					n32Feld.setText(n32AusZeile.substring(0, 7));
					frame.changeStatus("E32- und N32 eingetragen",
										HauptFrame.SUCCESS_COLOR);
				}
				else
				{
					frame.changeStatus(
										"Zwischenablage enthält keine verwertbaren Daten",
										HauptFrame.ERROR_COLOR);
				}
				break;
			}
		}
	}

	public JButton getAusAblageButton()
	{
		if (ausAblageButton == null)
		{

			ausAblageButton = new JButton("aus QGis");
			ausAblageButton.setToolTipText("Rechts- und Hochwert aus Zwischenablage einfügen");
			ausAblageButton.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					readClipboard();
				}
			});
		}

		return ausAblageButton;
	}
}
