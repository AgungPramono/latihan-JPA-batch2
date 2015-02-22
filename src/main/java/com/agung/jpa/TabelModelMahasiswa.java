/*
 * Silahkan digunakan dengan bebas / dimodifikasi
 * Dengan tetap mencantumkan nama @author dan Referensi / Source
 * Terima Kasih atas Kerjasamanya.
 */
package com.agung.jpa;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Agung Pramono
 */
public class TabelModelMahasiswa extends AbstractTableModel{

    private List<Mahasiswa> list;
    
    //mengubah seluruh data
    public void setData(List<Mahasiswa> list){
        this.list = list;
        //memberi peingatan ke tabel bahwa data telah berubah
        fireTableDataChanged();
    }
    
    //menambah data mahasiswa
    /**
     *
     * @param mahasiswa
     */
    public void add(Mahasiswa mahasiswa){
        list.add(mahasiswa);
        //memberi peringatan ke tabel bahwa data bertambah
        fireTableRowsInserted(getRowCount() -1, getRowCount()-1);       
    }
    
    //mengubah data mahasiswa
    public void edit(int index, Mahasiswa mahasiswa){
        list.set(index, mahasiswa);
        //memberi peringatan tabel bahwa data berubah pada index ke-?
        fireTableRowsUpdated(index,index);
    }
    
    //menghapus data mahasiswa
    public void delete(int index){
        list.remove(index);
        //memeberi peringatan data terhapus pada index ke-?
        fireTableRowsDeleted(index,index);
    }
    
    //mendapatkan mahasiswa pada baris ke-?
    public Mahasiswa get(int row){
        return list.get(row);
    }
    
    //mendapatkan total baris
    @Override
    public int getRowCount() {
        return list.size();
    }

    //mendapatkan total kolom
    @Override
    public int getColumnCount() {
        return 3;
    }

    //mendapatkan nilai pada baris ke-? dan kolom ke-?
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
		return list.get(rowIndex).getId();
	    case 1:
		return list.get(rowIndex).getNama();
	    case 2:
		return list.get(rowIndex).getAlamat();
	    default:
		return null;
        }
    }

    @Override
    // mendapatkan nama kolom pada index ke-?
   public String getColumnName(int column) {
	switch (column) {
	    case 0:
		return "Nim";
	    case 1:
		return "Nama";
	    case 2:
		return "Alamat";
	    default:
		return null;
	}
    }
    
}
