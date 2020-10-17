/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriodda.dominio;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumno
 */
public class MiOtroTableModel extends AbstractTableModel{
    
    Carta[]cartas;
    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public int getColumnCount() {
        return cartas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return cartas[columnIndex];
    }
    
    public MiOtroTableModel(Carta cartas[])
    {
        this.cartas = cartas;
    }
    
}
