/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Naga
 */
public class Item extends javax.swing.JDialog {
    private int x;
    private int y;
    private Connection conn;
    private boolean editar;
    private int id;
    Pincipal p;
    /**
     * Creates new form Item
     */
    public Item(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        p=(Pincipal)parent;
        this.conn=p.getConnection();
        this.editar=p.getEditar();
        rellenaCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_tipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel_cancelar = new javax.swing.JLabel();
        jLabel_aceptar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jTextField_descripcion = new javax.swing.JTextField();
        jTextField_isbn = new javax.swing.JTextField();
        jTextField_locacizacion = new javax.swing.JTextField();
        jRadioButton_libro = new javax.swing.JRadioButton();
        jRadioButton_comic = new javax.swing.JRadioButton();
        jRadioButton_manga = new javax.swing.JRadioButton();
        jRadioButton_revista = new javax.swing.JRadioButton();
        jRadioButton_cd = new javax.swing.JRadioButton();
        jRadioButton_dvd = new javax.swing.JRadioButton();
        jRadioButton_br = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_cancelar.setBackground(new java.awt.Color(111, 236, 111));
        jLabel_cancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_cancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_cancelar.setText("Cancelar");
        jLabel_cancelar.setOpaque(true);
        jLabel_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_cancelarMouseClicked(evt);
            }
        });

        jLabel_aceptar.setBackground(new java.awt.Color(111, 236, 111));
        jLabel_aceptar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel_aceptar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_aceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_aceptar.setText("Aceptar");
        jLabel_aceptar.setOpaque(true);
        jLabel_aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_aceptarMouseClicked(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Descripcion:");

        jLabel3.setText("ISBN:");

        jLabel4.setText("Localizacion:");

        jTextField_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_nombreKeyPressed(evt);
            }
        });

        jTextField_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_descripcionKeyPressed(evt);
            }
        });

        jTextField_isbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_isbnKeyPressed(evt);
            }
        });

        jTextField_locacizacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_locacizacionKeyPressed(evt);
            }
        });

        buttonGroup_tipo.add(jRadioButton_libro);
        jRadioButton_libro.setSelected(true);
        jRadioButton_libro.setText("Libro");
        jRadioButton_libro.setOpaque(false);

        buttonGroup_tipo.add(jRadioButton_comic);
        jRadioButton_comic.setText("Comic");
        jRadioButton_comic.setOpaque(false);

        buttonGroup_tipo.add(jRadioButton_manga);
        jRadioButton_manga.setText("Manga");
        jRadioButton_manga.setOpaque(false);

        buttonGroup_tipo.add(jRadioButton_revista);
        jRadioButton_revista.setText("Revista");
        jRadioButton_revista.setOpaque(false);

        buttonGroup_tipo.add(jRadioButton_cd);
        jRadioButton_cd.setText("CD");
        jRadioButton_cd.setOpaque(false);

        buttonGroup_tipo.add(jRadioButton_dvd);
        jRadioButton_dvd.setText("DVD");
        jRadioButton_dvd.setOpaque(false);

        buttonGroup_tipo.add(jRadioButton_br);
        jRadioButton_br.setText("Blue-Ray");
        jRadioButton_br.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20)
                                .addComponent(jTextField_descripcion))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(20, 20, 20)
                                .addComponent(jTextField_nombre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(20, 20, 20)
                                .addComponent(jTextField_locacizacion)))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(20, 20, 20)
                                .addComponent(jTextField_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton_libro)
                                    .addComponent(jRadioButton_cd))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton_manga)
                                    .addComponent(jRadioButton_dvd))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton_comic)
                                    .addComponent(jRadioButton_br))
                                .addGap(20, 20, 20)
                                .addComponent(jRadioButton_revista)))
                        .addGap(0, 125, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_libro)
                    .addComponent(jRadioButton_comic)
                    .addComponent(jRadioButton_manga)
                    .addComponent(jRadioButton_revista))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_cd)
                    .addComponent(jRadioButton_dvd)
                    .addComponent(jRadioButton_br))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_locacizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jPanel2.setBackground(new java.awt.Color(111, 236, 111));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_cancelarMouseClicked
        dispose();
    }//GEN-LAST:event_jLabel_cancelarMouseClicked

    private void jLabel_aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_aceptarMouseClicked
        //obtenemos los datos a insertar
        String nombre=jTextField_nombre.getText().trim();
        String descripcion=jTextField_descripcion.getText().trim();
        String isbn=jTextField_isbn.getText().trim();
        String localizacion=jTextField_locacizacion.getText().trim();
        //comprobamos que sean correctos
        if(nombre.length()==0){
            jTextField_nombre.setBackground(Color.RED);
        }
        if(descripcion.length()==0){
            jTextField_descripcion.setBackground(Color.RED);
        }
        if(isbn.length()==0){
            jTextField_isbn.setBackground(Color.RED);
        }
        if(localizacion.length()==0){
            jTextField_locacizacion.setBackground(Color.RED);
        }
        //insertamos
        if(nombre.length()>0 && descripcion.length()>0 && isbn.length()>0 && localizacion.length()>0){
            String tipo="";
            if(jRadioButton_br.isSelected()){tipo="Blue-Ray";}
            else if(jRadioButton_cd.isSelected()){tipo="CD";}
            else if(jRadioButton_comic.isSelected()){tipo="Comic";}
            else if(jRadioButton_dvd.isSelected()){tipo="DVD";}
            else if(jRadioButton_libro.isSelected()){tipo="Libro";}
            else if(jRadioButton_manga.isSelected()){tipo="Manga";}
            else if(jRadioButton_revista.isSelected()){tipo="Revista";}
            try {
                PreparedStatement ps=null;
                if(editar){
                    ps=conn.prepareStatement("UPDATE item SET nombre=?,descripcion=?,isbn=?,tipo=?,"
                            + "localizacion=? WHERE id="+id);
                }
                else{
                    ps=conn.prepareStatement("INSERT INTO item(nombre,descripcion,isbn,tipo,"
                            + "localizacion) VALUES(?,?,?,?,?)");
                }
                ps.setString(1,nombre);
                ps.setString(2,descripcion);
                ps.setString(3,isbn);
                ps.setString(4,tipo);
                ps.setString(5,localizacion);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
            }        
            dispose();
        }
        
    }//GEN-LAST:event_jLabel_aceptarMouseClicked

    //metodos para mover la ventana
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_jPanel2MouseDragged

    //metodos para resetear el color de los campos
    private void jTextField_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nombreKeyPressed
        jTextField_nombre.setBackground(Color.WHITE);
    }//GEN-LAST:event_jTextField_nombreKeyPressed

    private void jTextField_descripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_descripcionKeyPressed
        jTextField_descripcion.setBackground(Color.WHITE);
    }//GEN-LAST:event_jTextField_descripcionKeyPressed

    private void jTextField_isbnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_isbnKeyPressed
        jTextField_isbn.setBackground(Color.WHITE);
    }//GEN-LAST:event_jTextField_isbnKeyPressed

    private void jTextField_locacizacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_locacizacionKeyPressed
        jTextField_locacizacion.setBackground(Color.WHITE);
    }//GEN-LAST:event_jTextField_locacizacionKeyPressed

    //si editamos, rellenamos los campos
    private void rellenaCampos() {
        if(editar){
            id=p.getId();
            try {
                Statement st = conn.createStatement();
                String query="SELECT nombre,descripcion,isbn,tipo,localizacion "
                + "FROM item "
                + "WHERE id="+id;
                ResultSet rs=st.executeQuery(query);
                rs.next();
                jTextField_descripcion.setText(rs.getString(2));
                jTextField_isbn.setText(rs.getString(3));
                jTextField_locacizacion.setText(rs.getString(5));
                jTextField_nombre.setText(rs.getString(1));
                switch(rs.getString(4)){
                    case "Blue-Ray":
                        jRadioButton_br.setSelected(true);
                        break;
                    case "CD":
                        jRadioButton_cd.setSelected(true);
                        break;
                    case "Comic":
                        jRadioButton_comic.setSelected(true);
                        break;
                    case "DVD":
                        jRadioButton_dvd.setSelected(true);
                        break;
                    case "Libro":
                        jRadioButton_libro.setSelected(true);
                        break;
                    case "Manga":
                        jRadioButton_manga.setSelected(true);
                        break;
                    case "Revista":
                        jRadioButton_revista.setSelected(true);
                        break;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
    }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Item dialog = new Item(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_aceptar;
    private javax.swing.JLabel jLabel_cancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton_br;
    private javax.swing.JRadioButton jRadioButton_cd;
    private javax.swing.JRadioButton jRadioButton_comic;
    private javax.swing.JRadioButton jRadioButton_dvd;
    private javax.swing.JRadioButton jRadioButton_libro;
    private javax.swing.JRadioButton jRadioButton_manga;
    private javax.swing.JRadioButton jRadioButton_revista;
    private javax.swing.JTextField jTextField_descripcion;
    private javax.swing.JTextField jTextField_isbn;
    private javax.swing.JTextField jTextField_locacizacion;
    private javax.swing.JTextField jTextField_nombre;
    // End of variables declaration//GEN-END:variables

    
}
