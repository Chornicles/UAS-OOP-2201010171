/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Private_Driving;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gung Ardi
 */
public interface Driving {
    public void insert(Driving1 Aplikasi_Private_Driving);

    public void update(int index, Driving1 Aplikasi_Private_Driving);

    public void delete(int index);

    public DefaultTableModel view();
}
