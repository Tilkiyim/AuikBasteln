package de.bielefeld.umweltamt.aui.module.common.editors;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.hibernate.HibernateException;

import com.jgoodies.forms.builder.PanelBuilder;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import de.bielefeld.umweltamt.aui.AUIKataster;
import de.bielefeld.umweltamt.aui.HauptFrame;
import de.bielefeld.umweltamt.aui.mappings.basis.BasisGemarkung;
import de.bielefeld.umweltamt.aui.mappings.basis.BasisStandort;
import de.bielefeld.umweltamt.aui.mappings.basis.BasisStrassen;
import de.bielefeld.umweltamt.aui.mappings.vaws.VawsStandortgghwsg;
import de.bielefeld.umweltamt.aui.mappings.vaws.VawsWassereinzugsgebiete;
import de.bielefeld.umweltamt.aui.utils.AuikUtils;
import de.bielefeld.umweltamt.aui.utils.DoubleField;
import de.bielefeld.umweltamt.aui.utils.IntegerField;
import de.bielefeld.umweltamt.aui.utils.LimitedTextField;
import de.bielefeld.umweltamt.aui.utils.SearchBox;
import de.bielefeld.umweltamt.aui.utils.SwingWorkerVariant;
/**
 * Ein Dialog zum Bearbeiten eines Standorts.
 * @author David Klotz
 */
public class StandortEditor extends AbstractBaseEditor {
	// F�r die Comboboxen beim Bearbeiten
	private static String[] strassen = null;
	private static BasisGemarkung[] gemarkungen = null;
	private static VawsStandortgghwsg[] standortggs = null;
	private static String[] entwgebiete = null;
	private static VawsWassereinzugsgebiete[] wEinzugsgebiete = null;
	
	private JFormattedTextField hausnrEditFeld;
	private JTextField hausnrZusFeld;
	private JTextField plzFeld;
	private JTextField flurFeld;
	private JTextField flurStkFeld;
	private JFormattedTextField rechtsWFeld;
	private JFormattedTextField hochWFeld;
	private JTextField datumFeld;
	private JLabel handzeichenLabel;
	private JTextField handzeichenAltFeld;
	private JTextField handzeichenNeuFeld;
	
	private JComboBox strassenBox;
	private JComboBox gemarkungBox;
	private JComboBox standortGgBox;
	private JComboBox entwGebBox;
	private JComboBox wEinzugsGebBox;
	
	/**
	 * Erzeugt einen neuen Dialog zum Bearbeiten eines Standorts.
	 */
	public StandortEditor(BasisStandort bsta, HauptFrame owner) {
		super("Standort ("+ bsta.getStandortid() +")", bsta, owner);
	}
	
	protected JComponent buildContentArea() {
		strassenBox = new SearchBox();
		
		hausnrEditFeld = new IntegerField();
		hausnrZusFeld = new JTextField();
		plzFeld = new LimitedTextField(10, "");
		
		flurFeld = new LimitedTextField(50);
		flurStkFeld = new LimitedTextField(50);
		
		rechtsWFeld = new DoubleField(1);
		hochWFeld = new DoubleField(1);
		
		datumFeld = new JTextField();
		datumFeld.setEditable(false);
		datumFeld.setFocusable(false);
		datumFeld.setToolTipText("Wird bei �nderungen automatisch aktualisiert.");
		
		handzeichenLabel = new JLabel("Handzeichen:");
		handzeichenAltFeld = new JTextField();
		handzeichenAltFeld.setEditable(false);
		handzeichenAltFeld.setFocusable(false);
		handzeichenAltFeld.setToolTipText("Handzeichen der letzten Revision");
		handzeichenNeuFeld = new LimitedTextField(10);
		handzeichenNeuFeld.setToolTipText("Neues Handzeichen bei �nderungen obligatorisch!");
		
		gemarkungBox = new JComboBox();
		standortGgBox = new JComboBox();
		entwGebBox = new JComboBox();
		entwGebBox.setEditable(true);
		wEinzugsGebBox = new JComboBox();
		
		// Der folgende KeyListener wird benutzt um mit Escape 
		// das Bearbeiten abzubrechen und bei Enter im
		// Handzeichen-Feld (wenn das Feld nicht leer ist) zum
		// Speichern-Button zu springen.
		KeyListener escEnterListener = new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getSource().equals(handzeichenNeuFeld)) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						if (handzeichenNeuFeld.getText().equals("")) {
							handzeichenLabel.setForeground(HauptFrame.ERROR_COLOR);
							handzeichenNeuFeld.requestFocus();
						} else {
							button1.requestFocus();
						}
					}
				}
				
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					doCancel();
				}
			}
		};
		strassenBox.addKeyListener(escEnterListener);
		hausnrEditFeld.addKeyListener(escEnterListener);
		hausnrZusFeld.addKeyListener(escEnterListener);
		plzFeld.addKeyListener(escEnterListener);
		gemarkungBox.addKeyListener(escEnterListener);
		standortGgBox.addKeyListener(escEnterListener);
		entwGebBox.addKeyListener(escEnterListener);
		wEinzugsGebBox.addKeyListener(escEnterListener);
		flurFeld.addKeyListener(escEnterListener);
		flurStkFeld.addKeyListener(escEnterListener);
		rechtsWFeld.addKeyListener(escEnterListener);
		hochWFeld.addKeyListener(escEnterListener);
		handzeichenNeuFeld.addKeyListener(escEnterListener);
		
		String linkeSpalten = "r:p, 3dlu, 50dlu:g, 3dlu, 50dlu:g, 5dlu, 20dlu:g(0.2), 3dlu, 15dlu:g(0.2)";
		String rechteSpalten = "r:p, 3dlu, 50dlu:g, 3dlu, 50dlu:g";
		int rS = 10;
		
		FormLayout layout = new FormLayout(
				linkeSpalten + ", 10dlu, " + rechteSpalten,	// Spalten
				"pref, " +	//1
				"3dlu, " +	//2
				"pref, " +	//3
				"3dlu, " +	//4
				"pref, " +	//5
				"10dlu, " +	//6
				"pref, " +	//7
				"3dlu, " +	//8
				"pref, " +	//9
				"3dlu, " +	//10
				"pref, " +	//11
				"3dlu, " +	//12
				"pref, " +	//13
				"10dlu, " +	//14
				"pref, " +	//15
				"3dlu, " +	//16
				"pref, " +	//17
				"10dlu, " +	//18
		"bottom:pref:grow");	//19
		
		PanelBuilder builder = new PanelBuilder(layout);
		builder.setDefaultDialogBorder();
		CellConstraints cc = new CellConstraints();
		
		// Adresse
		builder.addSeparator("Stammdaten", 	cc.xyw( 1, 1, 9));
		builder.addLabel("Stra�e:",			cc.xy(  1, 3 ));
		builder.add(strassenBox,			cc.xyw( 3, 3 , 3 ));
		builder.add(hausnrEditFeld,			cc.xy(  7, 3 ));
		builder.add(hausnrZusFeld,			cc.xy(  9, 3 ));
		builder.addLabel("PLZ:",			cc.xy(  1, 5 ));
		builder.add(plzFeld,				cc.xy(  3, 5 ));
		
		// Koordinaten
		builder.addLabel("Rechtswert:",		cc.xy(  1, 7 ));
		builder.add(rechtsWFeld,			cc.xyw( 3, 7, 3 ));
		builder.addLabel("Hochwert:",		cc.xy(  1, 9 ));
		builder.add(hochWFeld,				cc.xyw( 3, 9, 3 ));
		
		// 
		builder.addLabel("Gemarkung:",		cc.xy(  1, 11 ));
		builder.add(gemarkungBox,			cc.xyw( 3, 11, 3 ));
		builder.addLabel("Entw�sserungsgebiet:",	cc.xy(  1, 13 ));
		builder.add(entwGebBox,				cc.xyw( 3, 13, 3 ));
		
		// Flur
		builder.addLabel("Flur:",			cc.xy(  1, 15 ));
		builder.add(flurFeld,				cc.xy(  3, 15 ));
		builder.addLabel("Flurst�ck:",		cc.xy(  1, 17 ));
		builder.add(flurStkFeld,			cc.xy(  3, 17 ));
		
		// VAWS
		builder.addSeparator("VAWS", 		cc.xyw(1+rS, 1, 5));
		builder.addLabel("Standortgegebenheit:",	cc.xy( 1+rS, 3));
		builder.add(standortGgBox,			cc.xyw( 3+rS, 3, 3));
		builder.addLabel("W.Einzugsgebiet:",cc.xy(  1+rS, 5 ));
		builder.add(wEinzugsGebBox,			cc.xyw( 3+rS, 5, 3));
		
		// Letzte Revision
		builder.addSeparator("Letzte Revision",	cc.xyw(1+rS, 9, 5));
		builder.addLabel("Datum:",			cc.xy(  1+rS, 11 ));
		builder.add(datumFeld,				cc.xyw( 3+rS, 11, 3 ));
		builder.addLabel("Handzeichen:",	cc.xy(  1+rS, 13 ));
		builder.add(handzeichenAltFeld,		cc.xyw( 3+rS, 13, 3 ));
		
		// Neue Revision
		builder.addSeparator("Neue Revision",cc.xyw(1+rS, 15, 5));
		builder.add(handzeichenLabel, 		cc.xy(  1+rS, 17));
		builder.add(handzeichenNeuFeld,		cc.xyw( 3+rS, 17, 3 ));
		
		strassenBox.addActionListener(new ActionListener() {
			private int strassenCounter = 0; 
			
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == strassenBox) {
					if (plzFeld.getText().equals("") || strassenCounter > 0) {
						// Wenn wir eine Stra�e ausw�hlen, wird die PLZ upgedatet.
						BasisStrassen stra = BasisStrassen.getStrasseByName((String) strassenBox.getSelectedItem());
						if (stra != null) {
							if (stra.getPlz() != null) {
								frame.clearStatus();
								plzFeld.setText(stra.getPlz().toString());
								//AUIKataster.debugOutput("Die Stra�e '"+stra+"' hat die eindeutige PLZ: " + stra.getPlz(), "strassenBox.focusLost("+e.getActionCommand()+", Nr: "+strassenCounter+")");
							} else {
								frame.changeStatus("Die Stra�e '"+stra+"' hat keine eindeutige PLZ, bitte selbst eintragen!");
								//AUIKataster.debugOutput("Die Stra�e '"+stra+"' hat keine eindeutige PLZ, bitte selbst eintragen!", "strassenBox.focusLost("+e.getActionCommand()+", Nr: "+strassenCounter+")");
								plzFeld.setText("");
							}
						}
					}
					strassenCounter++;
				}
			}
		});
		
		return builder.getPanel();
	}
	
	protected void fillForm() {
		frame.changeStatus("Besch�ftigt...");
		
		SwingWorkerVariant worker = new SwingWorkerVariant(this) {
			
			protected void doNonUILogic() throws RuntimeException {
				try {
					if (strassen == null) {
						strassen = BasisStrassen.getStrassen();
					}
					if (gemarkungen == null) {
						gemarkungen = BasisGemarkung.getGemarkungen();
					}
					if (standortggs == null) {
						standortggs = VawsStandortgghwsg.getStandortGg();
					}
					if (entwgebiete == null) {
						entwgebiete = BasisStandort.getEntwGebiete();
					}
					if (wEinzugsgebiete == null) {
						wEinzugsgebiete = VawsWassereinzugsgebiete.getWEinzugsgebiete();
					}
				} catch (HibernateException e) {
					throw new RuntimeException(e);
				}
			}
			
			protected void doUIUpdateLogic() throws RuntimeException {
				if (strassen != null) {
					strassenBox.setModel(new DefaultComboBoxModel(strassen));
					strassenBox.setSelectedItem(getStandort().getStrasse());
				}
				if (gemarkungen != null) {
					gemarkungBox.setModel(new DefaultComboBoxModel(gemarkungen));
					gemarkungBox.setSelectedItem(getStandort().getBasisGemarkung());
				}
				if (standortggs != null) {
					standortGgBox.setModel(new DefaultComboBoxModel(standortggs));
					standortGgBox.setSelectedItem(getStandort().getVawsStandortgghwsg());
				}
				
				if (entwgebiete != null) {
					entwGebBox.setModel(new DefaultComboBoxModel(entwgebiete));
					entwGebBox.setSelectedItem(getStandort().getEntgebid());
				}
				
				if (wEinzugsgebiete != null) {
					wEinzugsGebBox.setModel(new DefaultComboBoxModel(wEinzugsgebiete));
					wEinzugsGebBox.setSelectedItem(getStandort().getVawsWassereinzugsgebiete());
				}
				
				hausnrEditFeld.setValue(getStandort().getHausnr());
				hausnrZusFeld.setText(getStandort().getHausnrzus());
				if (getStandort().getPlz() != null) {
					plzFeld.setText(getStandort().getPlz());
				}
				flurFeld.setText(getStandort().getFlur());
				flurStkFeld.setText(getStandort().getFlurstueck());
				rechtsWFeld.setValue(getStandort().getRechtswert());
				hochWFeld.setValue(getStandort().getHochwert());
				Date datum = getStandort().getRevidatum();
				datumFeld.setText(AuikUtils.getStringFromDate(datum));
				handzeichenAltFeld.setText(getStandort().getRevihandz());
				
				frame.clearStatus();
			}
		};
		worker.start();
	}
	
	protected boolean canSave() {
		// Eingaben �berpr�fen:
		// Das Handzeichen darf nicht leer sein
		if (handzeichenNeuFeld.getText() == null || handzeichenNeuFeld.getText().equals("")) {
			handzeichenLabel.setForeground(HauptFrame.ERROR_COLOR);
			handzeichenNeuFeld.requestFocus();
			frame.changeStatus("Neues Handzeichen erforderlich!", HauptFrame.ERROR_COLOR);
			//AUIKataster.debugOutput("Neues Handzeichen erforderlich!", "doSave");
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * Wird aufgerufen, wenn der Benutzen auf "Speichern" geklickt hat.
	 */
	protected boolean doSave() {
		// Stra�e:
		String stra = (String) strassenBox.getSelectedItem(); 
		getStandort().setStrasse(stra);
		
		// Hausnummer:
		Integer hausnr = ((IntegerField)hausnrEditFeld).getIntValue();
		getStandort().setHausnr(hausnr);
		
		// Hausnummer-Zusatz:
		String hausnrZus = hausnrZusFeld.getText();
		if ("".equals(hausnrZus)) {
			getStandort().setHausnrzus(null);
		} else {
			getStandort().setHausnrzus(hausnrZus);
		}
		// PLZ:
		String plz = plzFeld.getText().trim();
		if ("".equals(plz)) {
			getStandort().setPlz(null);
		} else {
			getStandort().setPlz(plz);
		}
		// Gemarkung
		BasisGemarkung bgem = (BasisGemarkung) gemarkungBox.getSelectedItem(); 
		getStandort().setBasisGemarkung(bgem);
		
		// Standortgg
		VawsStandortgghwsg stgg = (VawsStandortgghwsg) standortGgBox.getSelectedItem(); 
		getStandort().setVawsStandortgghwsg(stgg);
		
		// Entw�sserungsgebiet
		String entgb = (String) entwGebBox.getSelectedItem();
		
		// N�tig, weil getSelectedItem bei editierbarer ComboBox auch NULL liefern kann
		if (entgb != null) {
			entgb = entgb.trim();
		}
		if ("".equals(entgb)) {
			getStandort().setEntgebid(null);
		} else {
			getStandort().setEntgebid(entgb);
		}
		
		// VAWS-Einzugsgebiet
		VawsWassereinzugsgebiete wezg = (VawsWassereinzugsgebiete) wEinzugsGebBox.getSelectedItem(); 
		getStandort().setVawsWassereinzugsgebiete(wezg);
		
		// Flur
		String flur = flurFeld.getText();
		if (flur != null) {
			flur = flur.trim();
			if (flur.equals("")) {
				getStandort().setFlur(null);
			} else { 
				getStandort().setFlur(flur);
			}
		}
		
		// Flurstueck
		String flurstk = flurStkFeld.getText();
		if (flurstk != null) {
			if (flurstk.equals("")) {
				getStandort().setFlurstueck(null);
			} else { 
				getStandort().setFlurstueck(flurstk);
			}
		}
		
		// Rechtswert
		Float rechtsWert = ((DoubleField)rechtsWFeld).getFloatValue();
		getStandort().setRechtswert(rechtsWert);
		
		// Hochwert
		Float hochWert= ((DoubleField)hochWFeld).getFloatValue();
		getStandort().setHochwert(hochWert);
		
		// Handzeichen
		String handzeichen = handzeichenNeuFeld.getText().trim();
		getStandort().setRevihandz(handzeichen);
		
		getStandort().setRevidatum(new Date());
		
		BasisStandort bsta = BasisStandort.saveStandort(getStandort());
		if (bsta != null) {
			setEditedObject(bsta);
			AUIKataster.debugOutput("�nderungen gespeichert!", "editStandort");
			return true;
		} else {
			return false;
		}
	}
	
	public BasisStandort getStandort() {
		return (BasisStandort) getEditedObject();
	}
}