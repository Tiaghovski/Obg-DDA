/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriodda;

import java.io.File;
import javax.swing.JOptionPane;
import obligatoriodda.dominio.Carta;
import obligatoriodda.dominio.CartaCellRenderer;
import obligatoriodda.dominio.Jugador;
import obligatoriodda.dominio.JugadorPartida;
import obligatoriodda.dominio.MiOtroTableModel;
import obligatoriodda.dominio.Partida;
import obligatoriodda.dominio.PartidaController;
import obligatoriodda.dominio.UIPartida;

/**
 *
 * @author alumno
 */
public class FrmPartida extends javax.swing.JFrame implements UIPartida{
   JugadorPartida jugadorPartida;
   PartidaController controller;
   int pozo = 0;
   
    
    /**
     * Creates new form FrmPartida
     */
    public FrmPartida(JugadorPartida jp){
        initComponents();
        PnlPartida.setVisible(false);
        jugadorPartida = jp;
        this.setTitle("Jugador: " + jp.getJugador().getNombreUsuario() + " - Esperando en Lobby...");  
        controller = new PartidaController(this, jugadorPartida);
        lblNumeroJugadores.setText("Jugadores esperando: " + jp.getPartida().getColJugadores().size()); 
        btnTirarCarta.setEnabled(false);
        pozo = (jugadorPartida.getPartida().getValorApuesta() * 3);
       
   
     
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PnlContenedor = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblNumeroJugadores = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PnlPartida = new javax.swing.JPanel();
        CartasMesa = new javax.swing.JTable();
        btnCortar = new javax.swing.JButton();
        btnTomardelMazo = new javax.swing.JButton();
        btnTomardelaMesa = new javax.swing.JButton();
        btnTirarCarta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CartasJugador = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lblPozoAcumulado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        PnlContenedor.setBackground(new java.awt.Color(0, 51, 51));
        PnlContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        PnlContenedor.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 140, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("de 3 para completar la sala.");
        PnlContenedor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        lblNumeroJugadores.setBackground(new java.awt.Color(255, 255, 255));
        lblNumeroJugadores.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNumeroJugadores.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroJugadores.setText("0");
        PnlContenedor.add(lblNumeroJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jugadores esperando:");
        PnlContenedor.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Esperando que se inicie una partida...");
        PnlContenedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        PnlPartida.setBackground(new java.awt.Color(0, 51, 51));

        CartasMesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));

        btnCortar.setText("Cortar");
        btnCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCortarActionPerformed(evt);
            }
        });

        btnTomardelMazo.setText("Tomar del Mazo");
        btnTomardelMazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomardelMazoActionPerformed(evt);
            }
        });

        btnTomardelaMesa.setText("Tomar de la Mesa");
        btnTomardelaMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomardelaMesaActionPerformed(evt);
            }
        });

        btnTirarCarta.setText("Tirar Carta");
        btnTirarCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTirarCartaActionPerformed(evt);
            }
        });

        CartasJugador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        CartasJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CartasJugadorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CartasJugador);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pozo Acumulado: ");

        lblPozoAcumulado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPozoAcumulado.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("$");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mazo");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Carta en Mesa");

        javax.swing.GroupLayout PnlPartidaLayout = new javax.swing.GroupLayout(PnlPartida);
        PnlPartida.setLayout(PnlPartidaLayout);
        PnlPartidaLayout.setHorizontalGroup(
            PnlPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPartidaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(CartasMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPozoAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlPartidaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PnlPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(PnlPartidaLayout.createSequentialGroup()
                        .addComponent(btnTirarCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTomardelMazo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addComponent(btnTomardelaMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnCortar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(PnlPartidaLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel6)
                .addGap(53, 53, 53)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlPartidaLayout.setVerticalGroup(
            PnlPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPartidaLayout.createSequentialGroup()
                .addGroup(PnlPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlPartidaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(CartasMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlPartidaLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(PnlPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPozoAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PnlPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PnlPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTirarCarta)
                    .addComponent(btnTomardelMazo)
                    .addComponent(btnTomardelaMesa)
                    .addComponent(btnCortar))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PnlPartida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlContenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PnlPartida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       this.setVisible(false);
       jugadorPartida.getJugador().setEstado(false);
       //Llamar al método remover jugador y notificar al observer
       jugadorPartida.getPartida().eliminarJugador(this.jugadorPartida); 
       lblNumeroJugadores.setText("Jugadores esperando: " + jugadorPartida.getPartida().getColJugadores().size()); 
      
    }//GEN-LAST:event_btnSalirActionPerformed

    private void CartasJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartasJugadorMouseClicked
        btnTirarCarta.setEnabled(true);
    }//GEN-LAST:event_CartasJugadorMouseClicked

    private void btnTirarCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTirarCartaActionPerformed
        if(jugadorPartida.getMano().contains(Carta.NoTieneCarta()))
        {
            JOptionPane.showMessageDialog(this, "Debe tener 8 cartas en mano para tirar");
        }
        else
        {
            controller.TirarCarta((Carta) CartasJugador.getValueAt(0, CartasJugador.getSelectedColumn()));
        }

    }//GEN-LAST:event_btnTirarCartaActionPerformed

    private void btnTomardelaMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomardelaMesaActionPerformed
        if(jugadorPartida.getMano().contains(Carta.NoTieneCarta()))
        {
            controller.TomardelaMesa();
            JOptionPane.showMessageDialog(this, "Ahora seleccione una carta para tirar");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No puede tomar más cartas");
        }

    }//GEN-LAST:event_btnTomardelaMesaActionPerformed

    private void btnTomardelMazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomardelMazoActionPerformed
        if(jugadorPartida.getMano().contains(Carta.NoTieneCarta()))
        {
            controller.TomardelMazo();
            JOptionPane.showMessageDialog(this, "Ahora seleccione una carta para tirar");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No puede tomar más cartas");
        }

    }//GEN-LAST:event_btnTomardelMazoActionPerformed

    private void btnCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCortarActionPerformed
        controller.Cortar(jugadorPartida);
    }//GEN-LAST:event_btnCortarActionPerformed

        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JugadorPartida jp = new JugadorPartida(new Jugador(), new Partida());
                new FrmPartida(jp).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CartasJugador;
    private javax.swing.JTable CartasMesa;
    private javax.swing.JPanel PnlContenedor;
    private javax.swing.JPanel PnlPartida;
    private javax.swing.JButton btnCortar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTirarCarta;
    private javax.swing.JButton btnTomardelMazo;
    private javax.swing.JButton btnTomardelaMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNumeroJugadores;
    private javax.swing.JLabel lblPozoAcumulado;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setJugadoresEsperando(int i) {
        lblNumeroJugadores.setText(Integer.toString(i));
    }

    @Override
    public void PartidaIniciada() {            
        PnlContenedor.setVisible(false);
        PnlPartida.setVisible(true);
        this.setTitle("Jugador: " + this.jugadorPartida.getJugador().getNombreUsuario() + " - Partida Iniciada!" + " - Partida Nº " + this.jugadorPartida.getPartida().getNumeroPartida());     
        lblPozoAcumulado.setText(String.valueOf(pozo));
        btnCortar.setEnabled(false);
    }  
   
        


    @Override
    public void MostrarCartas() {
        CartasJugador.setModel(new MiOtroTableModel(controller.ObtenerManojo()));
        CartasJugador.setRowHeight(150);         
        CartasJugador.setCellSelectionEnabled(true); 
        CartasJugador.setDefaultRenderer(Object.class, new CartaCellRenderer());  
    }
    
   @Override
    public void MostrarMazo() {
        CartasMesa.setModel(new MiOtroTableModel(controller.ObtenerMazo()));
        CartasMesa.setRowHeight(150);         
        CartasMesa.setCellSelectionEnabled(true); 
        CartasMesa.setDefaultRenderer(Object.class, new CartaCellRenderer()); 
    } 

    @Override
    public void AvisarTurno() {        
         JOptionPane.showMessageDialog(this, this.jugadorPartida.getJugador().getNombre() + " es su turno!");
    }

    @Override
    public Carta ObtenerCartaSeleccionada(Carta c) {
        return c;
    }

    @Override
    public void MostrarCartasMesa() {
        CartasMesa.setModel(new MiOtroTableModel(controller.ObtenerCartasMesa()));
        CartasMesa.setRowHeight(150);         
        CartasMesa.setCellSelectionEnabled(true); 
        CartasMesa.setDefaultRenderer(Object.class, new CartaCellRenderer()); 
    }

    @Override
    public void DeshabilitarBotonTirar() {
        btnTirarCarta.setEnabled(false);
    }

    @Override
    public void DeshabilitarTomarCartas() {
        btnTomardelMazo.setEnabled(false);
        btnTomardelaMesa.setEnabled(false);
    }

    @Override
    public void HabilitarBotonesTomar() {
        btnTomardelMazo.setEnabled(true);
        btnTomardelaMesa.setEnabled(true);
    }

    @Override
    public void AvisarCorte() {
        JOptionPane.showMessageDialog(this, " " + jugadorPartida.getJugador().getNombre() + " cortó");         
    }

    @Override
    public void MostrarMensajedeTirar() {
        JOptionPane.showMessageDialog(this, "Seleccione una carta para tirar");
    }

   

  
   
    

  
   

  

  

    

}