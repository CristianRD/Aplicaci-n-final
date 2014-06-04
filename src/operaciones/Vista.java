/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operaciones;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;


/**
 *
 * @author JONATHAN
 */
public class Vista extends javax.swing.JFrame {

    
    public Vista() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        Consulta = new javax.swing.JButton();
        Insertar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        txtcampo = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Consulta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Consulta.setForeground(new java.awt.Color(0, 0, 255));
        Consulta.setText("Consultar");
        Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaActionPerformed(evt);
            }
        });

        Insertar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Insertar.setForeground(new java.awt.Color(0, 0, 255));
        Insertar.setText("Insertar");
        Insertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InsertarMousePressed(evt);
            }
        });
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });

        Eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(0, 0, 255));
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Modificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Modificar.setForeground(new java.awt.Color(0, 0, 255));
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        txtcampo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcampo.setForeground(new java.awt.Color(0, 0, 153));
        txtcampo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcampo.setToolTipText("");
        txtcampo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(txtcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Consulta)
                    .addComponent(Insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(179, 179, 179))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(Insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(txtcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
     public int camp()
      {
         try
         {
            int campo = Integer.parseInt(txtcampo.getText());
            return campo;
         }catch(NumberFormatException ex){}
        int campo = 0;
        return campo;
       }
     
    public Statement conexion()
        {
          try 
          {
            Connection conexion = null;
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver") ;

            // Connect with a url string
            conexion = DriverManager.getConnection("jdbc:odbc:conexion");
            Statement consulta = conexion.createStatement(); 
            
            return consulta;

            } catch (Exception e) {}
          Statement consulta = null;
         return consulta;
        }
    
   
    private void ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaActionPerformed
      
        /*Se optiene el codigo digitado por el usuario y se valida en caso de
        que sea un valor incorrecto*/
      int campo = camp();
      if (campo==0)
       {
         JOptionPane.showMessageDialog(null, "Valor incorrecto");
       }else{
         /*
          Mediante el metodo conexion, se hace un entable a sql-server 
          retornando una declaracion que posteriormente sera utlizada
          */
          Statement consulta = conexion();
     
        try
           {
               //Sentencia para SQL-SERVER
            ResultSet resultado = consulta.executeQuery("SELECT * FROM tblprodutos "
                                 + "WHERE codigo="+campo); 
            //Se imprime los datos retornados por SQL-SERVER
            while (resultado.next())
               {
                JOptionPane.showMessageDialog(null, 
                " Codigo: "+campo+"\n Descripcion: "+resultado.getObject(2)+
                "\n Cantidad: "+resultado.getObject(3)+"\n Cantidad "
                +resultado.getObject(4)+"\n Precio Unitario: "+resultado.getObject(5)); 
               }
        
             //Se comprueba si existe el producto con el codigo en labase de datos     
             ResultSet resultado1 = consulta.executeQuery("SELECT * FROM tblprodutos "
                                 + "WHERE codigo="+campo);
          boolean columnas = resultado1.next();
          if (columnas==false)
          {JOptionPane.showMessageDialog(null, "No existen datos con este codigo");}
            
           }catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Ha digitado un valor incorrecto");
            }
       }
    }//GEN-LAST:event_ConsultaActionPerformed

  
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
      
       /*Se optiene el codigo digitado por el usuario y se valida en caso de
        que sea un valor incorrecto*/
      int campo = camp();
      if (campo==0)
       {
         JOptionPane.showMessageDialog(null, "Valor incorrecto");
       }else{
         /*
          Mediante el metodo conexion, se hace un entable a sql-server 
          retornando una declaracion que posteriormente sera utlizada
          */
          Statement consulta = conexion();
        try
           {
              //Se comprueba si existe el producto con el codigo en labase de datos     
            ResultSet resultado1 = consulta.executeQuery("SELECT * FROM tblprodutos "
                                                  + "WHERE codigo="+campo);
          boolean columnas = resultado1.next();
          if (columnas==false)
          {JOptionPane.showMessageDialog(null, "No existen datos con este codigo");}
          else{
                JOptionPane.showMessageDialog(null, "El producto con el codigo "
                 +campo+" ha sido eliminado");
               consulta.executeQuery("DELETE FROM tblprodutos "
                + "WHERE codigo="+campo); 
          }
               
           }catch (Exception e) {}
      }
    }//GEN-LAST:event_EliminarActionPerformed

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed
     
           /*Se optiene el codigo digitado por el usuario y se valida en caso de
        que sea un valor incorrecto*/
      int campo = camp();
      if (campo==0)
       {
         JOptionPane.showMessageDialog(null, "Valor incorrecto");
       }else{
     Statement consulta = conexion();
    
     try
     {
          //Se comprueba si existe el producto con el codigo en labase de datos     
            ResultSet resultado1 = consulta.executeQuery("SELECT * FROM tblprodutos "
                                                  + "WHERE codigo="+campo);
          boolean columnas = resultado1.next();
          if (columnas!=false)
          {JOptionPane.showMessageDialog(null, "Ya existen datos con este codigo"
          +" y no se puede repetir esta clave primaria");}
          else{
     String nombre = JOptionPane.showInputDialog("Nombre: ",
                        JOptionPane.QUESTION_MESSAGE);
     String descripcion = JOptionPane.showInputDialog("Descripcion: ",
                        JOptionPane.QUESTION_MESSAGE); 
     int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad: ",
                        JOptionPane.QUESTION_MESSAGE));
     int precio_unitario = Integer.parseInt(JOptionPane.showInputDialog("Precio Unitario: ",
                        JOptionPane.QUESTION_MESSAGE));
     
      JOptionPane.showMessageDialog(null, "El producto con el codigo "+campo
                +" ha sido registrado");
      
         
         consulta.executeQuery("INSERT INTO tblprodutos "
             + "VALUES ("+campo+", '"+nombre+"', '"+descripcion+"',"+cantidad+
                      ", "+precio_unitario+")"); 
       
          }
         

     }catch(NumberFormatException e)
     {
       JOptionPane.showMessageDialog(null, e);  
     }  catch (SQLException ex) {
     
         
     }
    }
    }//GEN-LAST:event_InsertarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
     
         /*Se optiene el codigo digitado por el usuario y se valida en caso de
        que sea un valor incorrecto*/
      int campo = camp();
      if (campo==0)
       {
         JOptionPane.showMessageDialog(null, "Valor incorrecto");
       }else{
            Statement consulta = conexion();
     
            try
            {
                       //Se comprueba si existe el producto con el codigo en labase de datos     
      ResultSet resultado1 = consulta.executeQuery("SELECT * FROM tblprodutos "
                                                  + "WHERE codigo="+campo);
    boolean columnas = resultado1.next();
          if (columnas==false)
          {JOptionPane.showMessageDialog(null, "No existen datos con este codigo");}
          else{
            String nombre = JOptionPane.showInputDialog("Nombre: ",
                               JOptionPane.QUESTION_MESSAGE);
            String descripcion = JOptionPane.showInputDialog("Descripcion: ",
                               JOptionPane.QUESTION_MESSAGE); 
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad: ",
                               JOptionPane.QUESTION_MESSAGE));
            int precio_unitario = Integer.parseInt(JOptionPane.showInputDialog("Precio Unitario: ",
                               JOptionPane.QUESTION_MESSAGE));

             JOptionPane.showMessageDialog(null, "El producto con el codigo "+campo
                       +" ha sido modificado");


                consulta.executeQuery("UPDATE tblprodutos "
                    + "set nombre='"+nombre+"', descripcion='"+descripcion+"', "
                        + "cantidad="+cantidad+", precio_unitario="+precio_unitario+
                        " WHERE codigo="+campo); 

                }


            }catch(NumberFormatException e)
            {
              JOptionPane.showMessageDialog(null, "Se digito un valor incorrecto");  
            }  catch (SQLException ex) {}
   }
    }//GEN-LAST:event_ModificarActionPerformed

    private void InsertarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertarMousePressed

    }//GEN-LAST:event_InsertarMousePressed

    
    
    
    public static void main(String args[]) {
      
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consulta;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Insertar;
    private javax.swing.JButton Modificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField txtcampo;
    // End of variables declaration//GEN-END:variables
}
