/*
 * Created on 25.02.2005 by u633z
 */
package de.bielefeld.umweltamt.aui.utils.tablemodelbase;


/**
 * Eine TableModel-Grundlage, basierend auf einer <code>java.util.List</code>e .
 * Jede Zeile der Tabelle ist ein Objekt in der Liste. 
 * Im EditableListTableModel ist die Liste zus�tzlich noch editier- und erweiterbar.
 * @author David Klotz
 */
public abstract class EditableListTableModel extends ListTableModel {
	private boolean hasChanged;
	
	public EditableListTableModel(String[] columns, boolean updateAtInit) {
		this(columns, updateAtInit, true);
	}
	
	public EditableListTableModel(String[] columns, boolean updateAtInit, boolean removeAllowed) {
		super(columns, updateAtInit, removeAllowed);
		hasChanged = false;
	}
	
	/**
	 * Liefert das Objekt in einer bestimmten Zelle dieser Tabelle.
	 * @param rowIndex Die Tabellen-Zeile
	 * @param columnIndex Die Tabelle-Spalte
	 * @return Das Objekt in der Zelle (rowIndex, columnIndex) der Liste 
	 * oder <code>null</code>, falls es die Zeile oder Spalte nicht gibt
	 */
	public Object getValueAt(int rowIndex, int columnIndex) {
		Object value = null;
		if (getList() != null && rowIndex < getList().size()) {
			if (columnIndex < columns.length) {
				Object objectAtRow = getObjectAtRow(rowIndex);
				value = getColumnValue(objectAtRow, columnIndex);
			}
		}
		return value;
	}
	
	/**
	 * Liefert das Objekt in einer bestimmten Zeile der Tabelle,
	 * bzw. der Liste.
	 * @param rowIndex Die Zeile
	 * @return Das Objekt in der Zeile rowIndex oder <code>null</code>, falls die Zeile nicht existiert
	 */
	public Object getObjectAtRow(int rowIndex) {
		if (rowExists(rowIndex)) {
			return super.getObjectAtRow(rowIndex);
		} else {
			return null;
		}
	}
	
	/**
	 * Liefert die Anzahl Zeilen in der Liste + 1. Damit wird
	 * sichergestellt, dass immer eine Leerzeile zum anlegen
	 * einer neuen Zeile zur Verf�gung steht.
	 * @return Die Anzahlt der Zeilen + 1
	 */
	public int getRowCount() {
		return super.getRowCount() + 1;
	}
	
	/**
	 * @return <code>true</code>
	 */
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}
	
	/**
	 * Leitet die Ver�nderung an das entsprechende Objekt in der Liste
	 * weiter, bzw. erzeugt zu erst ein neues Objekt (wenn die Leerzeile
	 * bearbeitet wird).
	 */
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		if (rowExists(rowIndex)) {
			//System.out.println("%%% EDIT LISTE: col: " + columnIndex + ", newValue: " + aValue);
			editObject(getObjectAtRow(rowIndex), columnIndex, aValue);
		} else {
			//System.out.println("%%% EDIT NEU! %%%");
			Object tmp = newObject();
			getList().add(tmp);
			editObject(tmp, columnIndex, aValue);
			//System.out.println("NEU: " + tmp);
			fireTableRowsInserted(rowIndex + 1, rowIndex + 1);
		}
		fireTableRowsUpdated(rowIndex, rowIndex);
		//fireTableCellUpdated(rowIndex, columnIndex);
		
		hasChanged = true;
		
		/*System.out.println("%%% EDIT: row: " + rowIndex + ", " +
				"old.s: " + getList().size() + ", " +
				"new.s: " + getNewList().size() + ", " +
				"total.s: " + getTotalRowCount() + " %%%");*/
		
	}
	
	/**
	 * L�scht eine Zeile der Tabelle, falls das erlaubt und implementiert ist. 
	 * @param rowIndex Die Zeile
	 * @return <code>true</code>, wenn wirklich gel�scht wurde,
	 * <code>false</code>, falls dabei ein Fehler auftrat oder es aus anderen Gr�nden
	 * nicht m�glich war
	 */
	public boolean removeRow(int rowIndex) {
		boolean tmp = super.removeRow(rowIndex);
		
		if (tmp) {
			hasChanged = true;
		}
		
		return tmp;
	}
	/**
	 * �berpr�ft, ob die Liste ver�ndert wurde.
	 * @return <code>true</code>, wenn die Liste ver�ndert wurde, sonst <code>false</code>
	 */
	public boolean hasChanged() {
		return this.hasChanged;
	}
	
	/**
	 * Wird aufgerufen um das Attribut von <code>objectAtRow</code>
	 * in der Zeile <code>columnIndex</code> auf <code>newValue</code>
	 * zu �ndern.
	 * @param objectAtRow Das zu ver�ndernde Objekt
	 * @param columnIndex Welche Spalte ver�ndert werden soll
	 * @param newValue Der ge�nderte Wert
	 */
	public abstract void editObject(Object objectAtRow, int columnIndex, Object newValue);
	
	/**
	 * Wird aufgerufen um ein neues (mit Standard-Werten initialisiertes)
	 * Objekt der Liste hinzuzuf�gen. Wird ben�tigt, wenn der Benutzer
	 * eine neue Zeile anlegt.
	 * @return Ein neues Objekt, dass der Liste hinzugef�gt wird
	 */
	public abstract Object newObject();
}
