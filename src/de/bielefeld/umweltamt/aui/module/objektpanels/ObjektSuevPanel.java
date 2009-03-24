/*
 * Created on 28.06.2005 by u633d
 */
package de.bielefeld.umweltamt.aui.module.objektpanels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.factories.ButtonBarFactory;
import com.jgoodies.forms.layout.FormLayout;

import de.bielefeld.umweltamt.aui.AUIKataster;
import de.bielefeld.umweltamt.aui.HauptFrame;
import de.bielefeld.umweltamt.aui.mappings.indeinl.AnhSuevFachdaten;
import de.bielefeld.umweltamt.aui.module.ObjektBearbeiten;
import de.bielefeld.umweltamt.aui.utils.AuikUtils;
import de.bielefeld.umweltamt.aui.utils.IntegerField;
import de.bielefeld.umweltamt.aui.utils.TextFieldDateChooser;

/**
 * Das "Zahnarzt"-Tab des ObjektBearbeiten-Moduls 
 * @author Gerd Genuit
 */
public class ObjektSuevPanel extends JPanel {
	private String name;
	private ObjektBearbeiten hauptModul;
	
	// Widgets
	private JCheckBox groesser3haCheck = null;
	private JFormattedTextField versFlaecheFeld = null;
	private JCheckBox suevkanPflichtCheck = null;
	private JCheckBox indirektswCheck = null;
	private JCheckBox indirektrwCheck = null;
	private JCheckBox direktswCheck = null;
	private JCheckBox direktrwCheck = null;
	private JCheckBox datumAnzeige58Check = null;
	private JCheckBox sanierungErfolgtCheck = null;
	private JCheckBox sanierungskonzeptCheck = null;
	private JCheckBox keineAngabenCheck = null;
	private TextFieldDateChooser datAnzeige58Datum = null;
	private TextFieldDateChooser datAnschreibenDatum = null;
	private JButton saveSuevButton = null;


	
	// Daten
	private AnhSuevFachdaten fachdaten = null;
	
	//Listener
	private ActionListener editButtonListener;
	
	
	public ObjektSuevPanel(ObjektBearbeiten hauptModul) {
		name = "Suev-Kan Verfahren";
		this.hauptModul = hauptModul;
		
		FormLayout layout = new FormLayout (
				"r:70dlu, 5dlu, 90dlu, 5dlu, 10dlu, 5dlu, 90dlu", // Spalten
				"");
		
		
		DefaultFormBuilder builder = new DefaultFormBuilder(layout, this);
		builder.setDefaultDialogBorder();
		
		builder.appendSeparator("Fachdaten");
		builder.append("Datum Anschreiben:", getDatAnschreibenDatum());
		builder.append("", getSanierungskonzeptCheck());
		builder.nextLine();
		builder.append("Datum Anzeige:", getDatAnzeige58Datum());
		builder.append("", getSanierungErfolgtCheck());
		builder.nextLine();
		builder.append("versiegelte Fläche:", getVersFlaecheFeld());
		builder.append("", getDirektrwCheck());
		builder.nextLine();
		builder.append("", getGroesser3haCheck());
		builder.append("", getDirektswCheck());
		builder.nextLine();
		builder.append("", getSuevkanPflichtCheck());
		builder.append("", getIndirektrwCheck());
		builder.nextLine();
		builder.append("", getKeineAngabenCheck());
		builder.append("", getIndirektswCheck());
		builder.nextLine();


		
		JPanel buttonBar = ButtonBarFactory.buildOKBar(getSaveSuevButton());
		builder.append(buttonBar, 7);
	}
	
	public void fetchFormData() throws RuntimeException {
		fachdaten = AnhSuevFachdaten.getSuevByObjekt(hauptModul.getObjekt());
		AUIKataster.debugOutput("SuevKan-Verfahren aus DB geholt: " + fachdaten, "ObjektSuevPanel.fetchFormData");

	}
	
	
	public void updateForm() throws RuntimeException {

		if (fachdaten != null) {
			if (fachdaten.getVersFlaeche() != null) {
				getVersFlaecheFeld().setText(fachdaten.getVersFlaeche().toString());
			}
			if (fachdaten.getDatAnschreiben() != null) {
				getDatAnschreibenDatum().setDate(fachdaten.getDatAnschreiben());
			}
			if (fachdaten.getDatAnzeige58() != null) {
				getDatAnzeige58Datum().setDate(fachdaten.getDatAnzeige58());
			}
			if (fachdaten.getDatumAnzeige58() != null) {
				if (fachdaten.getDatumAnzeige58() == true) {
					getDatumAnzeige58Check().setSelected(true);
				}
				else {
					getDatumAnzeige58Check().setSelected(false);
				}
			}
			if (fachdaten.getDirektrw() != null) {
				if (fachdaten.getDirektrw() == true) {
					getDirektrwCheck().setSelected(true);
				}
				else {
					getDirektrwCheck().setSelected(false);
				}
			}
			if (fachdaten.getDirektsw() != null) {
				if (fachdaten.getDirektsw() == true) {
					getDirektswCheck().setSelected(true);
				}
				else {
					getDirektswCheck().setSelected(false);
				}
			}
			if (fachdaten.getGroesser3ha() != null) {
				if (fachdaten.getGroesser3ha() == true) {
					getGroesser3haCheck().setSelected(true);
				}
				else {
					getGroesser3haCheck().setSelected(false);
				}
			}
			if (fachdaten.getIndirektrw() != null) {
				if (fachdaten.getIndirektrw() == true) {
					getIndirektrwCheck().setSelected(true);
				}
				else {
					getIndirektrwCheck().setSelected(false);
				}
			}
			if (fachdaten.getIndirektsw() != null) {
				if (fachdaten.getIndirektsw() == true) {
					getIndirektswCheck().setSelected(true);
				}
				else {
					getIndirektswCheck().setSelected(false);
				}
			}
			if (fachdaten.getKeineAngaben() != null) {
				if (fachdaten.getKeineAngaben() == true) {
					getKeineAngabenCheck().setSelected(true);
				}
				else {
					getKeineAngabenCheck().setSelected(false);
				}
			}
			if (fachdaten.getSanierungErfolgt() != null) {
				if (fachdaten.getSanierungErfolgt() == true) {
					getSanierungErfolgtCheck().setSelected(true);
				}
				else {
					getSanierungErfolgtCheck().setSelected(false);
				}
			}
			if (fachdaten.getSanierungskonzept() != null) {
				if (fachdaten.getSanierungskonzept() == true) {
					getSanierungskonzeptCheck().setSelected(true);
				}
				else {
					getSanierungskonzeptCheck().setSelected(false);
				}
			}

		}

		}
	
	
	public void clearForm() {
		
		getVersFlaecheFeld().setText(null);
		getDatAnschreibenDatum().setDate(null);
		getDatAnzeige58Datum().setDate(null);
		getDatumAnzeige58Check().setSelected(false);
		getDirektrwCheck().setSelected(false);
		getDirektswCheck().setSelected(false);
		getGroesser3haCheck().setSelected(false);
		getIndirektrwCheck().setSelected(false);
		getIndirektswCheck().setSelected(false);
		getKeineAngabenCheck().setSelected(false);
		getSanierungErfolgtCheck().setSelected(false);
		getSanierungskonzeptCheck().setSelected(false);
		getSuevkanPflichtCheck().setSelected(false);

	}
	
	public void enableAll(boolean enabled) {

	}

	
	public String getName() {
		return name;
	}
	
	private boolean saveSuevDaten() {
		boolean success;

		Integer versfl = ((IntegerField)versFlaecheFeld).getIntValue();
		fachdaten.setVersFlaeche(versfl);			
		
		Date anschreiben = datAnschreibenDatum.getDate();
		fachdaten.setDatAnschreiben(anschreiben);		
		
		Date anzeigedatum = datAnzeige58Datum.getDate();
		fachdaten.setDatAnzeige58(anzeigedatum);			
		
		if (getDatumAnzeige58Check().isSelected())  {
			fachdaten.setDatumAnzeige58(true);
		} else {
			fachdaten.setDatumAnzeige58(false);
		}
					
		if (getDirektrwCheck().isSelected())  {
			fachdaten.setDirektrw(true);
		} else {
			fachdaten.setDirektrw(false);
		}
					
		if (getDirektswCheck().isSelected())  {
			fachdaten.setDirektsw(true);	
		} else {
			fachdaten.setDirektsw(false);	
		}
		
		if (getGroesser3haCheck().isSelected())  {
			fachdaten.setGroesser3ha(true);	
		} else {
			fachdaten.setGroesser3ha(false);	
		}
		
		if (getIndirektrwCheck().isSelected())  {
			fachdaten.setIndirektrw(true);	
		} else {
			fachdaten.setIndirektrw(false);	
		}
				
		if (getIndirektswCheck().isSelected())  {
			fachdaten.setIndirektsw(true);	
		} else {
			fachdaten.setIndirektsw(false);	
		}
				
		if (getKeineAngabenCheck().isSelected())  {
			fachdaten.setKeineAngaben(true);
		} else {
			fachdaten.setKeineAngaben(false);
		}
					
		if (getSanierungErfolgtCheck().isSelected())  {
			fachdaten.setSanierungErfolgt(true);
		} else {
			fachdaten.setSanierungErfolgt(false);
		}
			
		if (getSanierungskonzeptCheck().isSelected())  {
			fachdaten.setSanierungskonzept(true);
		} else {
			fachdaten.setSanierungskonzept(false);
		}
			
		if (getSuevkanPflichtCheck().isSelected())  {
			fachdaten.setSuevkanPflicht(true);
		} else {
			fachdaten.setSuevkanPflicht(false);
		}
		
		success = AnhSuevFachdaten.saveFachdaten(fachdaten);
		if (success) {
			AUIKataster.debugOutput("SuevKan Verfahren " + fachdaten.getObjektid() + " gespeichert.",
			"SuevFachdaten.saveFachdaten");
		} else {
			AUIKataster.debugOutput("SuevKan Verfahren " + fachdaten
					+ " konnte nicht gespeichert werden!",
			"SuevFachdaten.saveFachdaten");
		}
		return success;
	}
	
	public void completeObjekt() {
		if (hauptModul.isNew() || fachdaten == null) {
			// Neues SuevKan Verfahren erzeugen
			fachdaten = new AnhSuevFachdaten();
			// Objekt_Id setzen
			fachdaten.setBasisObjekt(hauptModul.getObjekt());
			
			// SuevKan speichern
			AnhSuevFachdaten.saveFachdaten(fachdaten);
			AUIKataster.debugOutput("Neues SuevKan Verfahren "+fachdaten+" gespeichert.", "ObjektBearbeiten.completeObjekt");
		}
	}
	


	private TextFieldDateChooser getDatAnschreibenDatum() {
		if (datAnschreibenDatum == null) {			
			datAnschreibenDatum = new TextFieldDateChooser(AuikUtils.DATUMSFORMATE);
		}
		return datAnschreibenDatum;
	}
	private TextFieldDateChooser getDatAnzeige58Datum() {
		if (datAnzeige58Datum == null) {			
			datAnzeige58Datum = new TextFieldDateChooser(AuikUtils.DATUMSFORMATE);
		}
		return datAnzeige58Datum;
	}
	private JCheckBox getDatumAnzeige58Check() {
		if (datumAnzeige58Check == null) {
			datumAnzeige58Check = new JCheckBox("Datum Anzeige");
		}
		return datumAnzeige58Check;
	}
	private JCheckBox getDirektrwCheck() {
		if (direktrwCheck == null) {
			direktrwCheck = new JCheckBox("Direkt RW");
		}
		return direktrwCheck;
	}
	private JCheckBox getDirektswCheck() {
		if (direktswCheck == null) {
			direktswCheck = new JCheckBox("Direkt SW");
		}
		return direktswCheck;
	}
	private JCheckBox getGroesser3haCheck() {
		if (groesser3haCheck == null) {
			groesser3haCheck = new JCheckBox("Größer 3 ha");
		}
		return groesser3haCheck;
	}
	private JCheckBox getIndirektrwCheck() {
		if (indirektrwCheck == null) {
			indirektrwCheck = new JCheckBox("Indirekt RW");
		}
		return indirektrwCheck;
	}
	private JCheckBox getIndirektswCheck() {
		if (indirektswCheck == null) {
			indirektswCheck = new JCheckBox("Indirekt SW");
		}
		return indirektswCheck;
	}
	private JCheckBox getKeineAngabenCheck() {
		if (keineAngabenCheck == null) {
			keineAngabenCheck = new JCheckBox("Keine Angaben");
		}
		return keineAngabenCheck;
	}
	private JCheckBox getSanierungErfolgtCheck() {
		if (sanierungErfolgtCheck == null) {
			sanierungErfolgtCheck = new JCheckBox("Sanierung erfolgt");
		}
		return sanierungErfolgtCheck;
	}
	private JCheckBox getSanierungskonzeptCheck() {
		if (sanierungskonzeptCheck == null) {
			sanierungskonzeptCheck = new JCheckBox("Sanierungskonzept");
		}
		return sanierungskonzeptCheck;
	}
	private JCheckBox getSuevkanPflichtCheck() {
		if (suevkanPflichtCheck == null) {
			suevkanPflichtCheck = new JCheckBox("SuevKan pflichtig");
		}
		return suevkanPflichtCheck;
	}
	private JFormattedTextField getVersFlaecheFeld() {
		if (versFlaecheFeld == null) {			
			versFlaecheFeld = new IntegerField();
		}
		return versFlaecheFeld;
	}
	private JButton getSaveSuevButton() {
		if (saveSuevButton == null) {
			saveSuevButton = new JButton("Speichern");
			
			saveSuevButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					enableAll(false);
					if (saveSuevDaten()) {
						hauptModul.getFrame().changeStatus("SuevKan Verfahren "+fachdaten.getObjektid()+" erfolgreich gespeichert.", HauptFrame.SUCCESS_COLOR);
					} else {
						hauptModul.getFrame().changeStatus("Fehler beim Speichern des SuevKan Verfahrens!", HauptFrame.ERROR_COLOR);
					}
					
					hauptModul.fillForm();
				}
			});
		}
		return saveSuevButton;
	}
}

