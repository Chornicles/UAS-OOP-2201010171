/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Private_Driving;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Gung Ardi
 */
public class Driving3 implements Driving {
     @Override
    public void insert(Driving1 FormDriving) {
        Driving2.listDriving.add(FormDriving);
        JOptionPane.showMessageDialog(null, "Data Pengguna Baru tersimpan!");
    }
    @Override
    public void update(int index, Driving1 FormDriving) {
        Driving2.listDriving.set(index, FormDriving);
        JOptionPane.showMessageDialog(null, "Data Pengguna Berahasil diubah!");
    }
    @Override
    public void delete(int index) {
        Driving2.listDriving.remove(index);
        JOptionPane.showMessageDialog(null, "Data Pengguna Berhasil dihapus!");
    }
    @Override
    public DefaultTableModel view() {
        String[] kolom = { "Nama", "No HP", "Alamat", "Jenis Kelamin", "Status", "Kelas", "Praktik 1 Kali", "Pilihan Praktik", "Instruktur", "Hari", "Waktu", "Total" };
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        for (Driving1 a : Driving2.listDriving) {
            Object[] o = new Object[12];
            double total = 0, tp, jumlah;
            o[0] = a.getnama();
            o[1] = a.gethp();
            o[2] = a.getalamat();
            o[3] = a.getjk();
            o[4] = a.getstatus();
            o[5] = a.getkelas();
            o[6] = a.gettp();
            tp = a.gettp();
            o[7] = a.getjumlah();
            jumlah = a.getjumlah();
            total = tp*jumlah;
            o[8] = a.getinstruktur();
            o[9] = a.gethari();
            o[10] = a.getwaktu();
            o[11] = total;
            dtm.addRow(o);
        }
        return dtm;
    }
}
