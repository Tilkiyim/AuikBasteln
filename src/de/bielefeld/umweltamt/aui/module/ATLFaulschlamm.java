/*
 * Datei:
 * $Id: ATLFaulschlamm.java,v 1.2 2009-03-24 12:35:20 u633d Exp $
 * 
 * Erstellt am 17.02.2005 von David Klotz (u633z)
 * 
 * CVS-Log:
 * $Log: not supported by cvs2svn $
 * Revision 1.1  2008/06/05 11:38:32  u633d
 * Start AUIK auf Informix und Postgresql
 *
 * Revision 1.6  2005/06/09 15:27:03  u633z
 * - (CVS-)Header hinzugefügt
 *
 */
package de.bielefeld.umweltamt.aui.module;

import javax.swing.Icon;
import javax.swing.JPanel;

import de.bielefeld.umweltamt.aui.AbstractModul;
import de.bielefeld.umweltamt.aui.mappings.atl.AtlProbeart;
import de.bielefeld.umweltamt.aui.module.common.SchlammPanel;

/**
 * Das Modul um Faulschlamm-Probenahmen zu bearbeiten.
 * @author David Klotz
 */
public class ATLFaulschlamm extends AbstractModul {

	public Icon getIcon() {
		return super.getIcon("recycled_braun32.png");
	}
	
	/* (non-Javadoc)
	 * @see de.bielefeld.umweltamt.aui.Modul#getName()
	 */
	public String getName() {
		return "Faulschlamm Probenahmen";
	}

	/* (non-Javadoc)
	 * @see de.bielefeld.umweltamt.aui.Modul#getIdentifier()
	 */
	public String getIdentifier() {
		return "m_schlaemme_faul";
	}

	/* (non-Javadoc)
	 * @see de.bielefeld.umweltamt.aui.Modul#getCategory()
	 */
	public String getCategory() {
		return "Analysen";
	}

	/* (non-Javadoc)
	 * @see de.bielefeld.umweltamt.aui.Modul#getPanel()
	 */
	public JPanel getPanel() {
		if (panel == null) {
			panel = new SchlammPanel(AtlProbeart.getProbeart(AtlProbeart.FAULSCHLAMM), frame);
		}
		return panel;
	}
	
	/* (non-Javadoc)
	 * @see de.bielefeld.umweltamt.aui.Modul#show()
	 */
	public void show() {
		super.show();
		if (panel != null && panel instanceof SchlammPanel) {
			((SchlammPanel)panel).showContent();
		}
	}
}
