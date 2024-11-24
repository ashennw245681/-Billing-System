/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_market_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Blocker
 */
class All_bill extends JFrame{
     static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
     private Object l1;
     private static String z;
                    String xx;
    
All_bill(){ 
setLayout(null);

 JLabel l1 = new JLabel ("Item ");
        l1.setBounds(220,77,300,20);
        l1.setForeground(Color.BLACK);
    add(l1);
 Font Al1 = new Font ("calibri",Font.BOLD,18);
        l1.setFont(Al1); 

 JTextField t=new JTextField();
            t.setBounds(260,75,230,25);
            t.setForeground(Color.BLACK);
        add(t);
     Font Tl1 = new Font ("calibri",Font.BOLD,18);
        t.setFont(Tl1); 

JFrame frame = new JFrame();
JTable table = new JTable();
      
 Object[] columns = {"Bill No","Total Amount","Cash","Balance","Date","Time"};
	DefaultTableModel model = new DefaultTableModel();
	model.setColumnIdentifiers(columns);   

table.setModel(model);
table.setBackground(Color.LIGHT_GRAY);
table.setForeground(Color.black);   


	JScrollPane pane = new JScrollPane(table);
	pane.setBounds(160, 120, 630, 220);
	frame.setLayout(null);
    add(pane);        
        



Object[] row = new Object[6];


           try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system", "root", "");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM save_bill_no");

                    while (rs.next()) {

                        row[0] = rs.getString("Bill_no");
                        row[1] = rs.getString("Total");
                        row[2] = rs.getString("Cash");
                        row[3] = rs.getString("Balance");
                        row[4] = rs.getString("Date");
                        row[5] = rs.getString("Time");

                        // add row to the model
                        model.addRow(row);
                        //int i = table.getSelectedRow();



                    }
                } catch (Exception ew) {
                    System.out.println(ew);
                }


JButton item = new JButton("Items");
        item.setBounds(600, 75, 70, 25);
    add(item);
    
JButton bill = new JButton("Bill Only");    
    add(bill);    
    
    



bill.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
               
item.setBounds(600, 75, 70, 25);
bill.setBounds(0, 0, 0, 0);

 Object[] columns = {"Bill No","Total Amount","Cash","Balance","Date","Time"};
	DefaultTableModel model = new DefaultTableModel();
	model.setColumnIdentifiers(columns);   

table.setModel(model);
table.setBackground(Color.LIGHT_GRAY);
table.setForeground(Color.black);   


Object[] row = new Object[6];


           try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system", "root", "");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM save_bill_no");

                    while (rs.next()) {

                        row[0] = rs.getString("Bill_no");
                        row[1] = rs.getString("Total");
                        row[2] = rs.getString("Cash");
                        row[3] = rs.getString("Balance");
                        row[4] = rs.getString("Date");
                        row[5] = rs.getString("Time");

                        // add row to the model
                        model.addRow(row);
                        //int i = table.getSelectedRow();



                    }
                } catch (Exception ew) {
                    System.out.println(ew);
                }

               
               
  } 
    });

 


item.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
               
bill.setBounds(600, 75, 70, 25);
item.setBounds(0, 0, 0, 0);

 Object[] columns = {"Bill No","Item ID","Name","Price","Quantity","Total","Date","Time"};   
 
 	DefaultTableModel model = new DefaultTableModel();
	model.setColumnIdentifiers(columns);
        
table.setModel(model);
table.setBackground(Color.LIGHT_GRAY);
table.setForeground(Color.black);   


Object[] row = new Object[8];


           try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system", "root", "");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM bill_save");

                    while (rs.next()) {

                        row[0] = rs.getString("Bill_no");
                        row[1] = rs.getString("Item_ID");
                        row[2] = rs.getString("Item_Description");
                        row[3] = rs.getString("Unit_Price");
                        row[4] = rs.getString("Quantity");
                        row[5] = rs.getString("Total");
                        row[6] = rs.getString("Date");
                        row[7] = rs.getString("Time");

                        // add row to the model
                        model.addRow(row);
                        //int i = table.getSelectedRow();



                    }
                } catch (Exception ew) {
                    System.out.println(ew);
                }
               
               
  } 
    });

    


 JLabel nn = new JLabel ("All Bill");
        nn.setBounds(160,20,152,33);
        nn.setForeground(Color.BLACK);
    add(nn);
   Font Ann = new Font ("Berlin Sans FB Demi",Font.BOLD,33);
        nn.setFont(Ann);

 JLabel A1 = new JLabel ("Home");
        A1.setBounds(10,146,152,17);
        A1.setForeground(Color.BLACK);
    add(A1);
   Font A11 = new Font ("calibri",Font.BOLD,17);
        A1.setFont(A11);
        
 JLabel A2 = new JLabel ("Suppler Register");
        A2.setBounds(10,180,152,17);
        A2.setForeground(Color.BLACK);
    add(A2);
   Font A22 = new Font ("calibri",Font.BOLD,17);
        A2.setFont(A22);        
        
 JLabel A3 = new JLabel ("Add Items");
        A3.setBounds(10,215,152,17);
        A3.setForeground(Color.BLACK);
    add(A3);
   Font A33 = new Font ("calibri",Font.BOLD,17);
        A3.setFont(A33);
        
 JLabel A4 = new JLabel ("All Items");
        A4.setBounds(10,250,152,17);
        A4.setForeground(Color.BLACK);
    add(A4);
   Font A44 = new Font ("calibri",Font.BOLD,17);
        A4.setFont(A44);          
        
 JLabel A5 = new JLabel ("Delete Items");
        A5.setBounds(10,282,152,17);
        A5.setForeground(Color.BLACK);
    add(A5);
   Font A55= new Font ("calibri",Font.BOLD,17);
        A5.setFont(A55);         

 JLabel A6 = new JLabel ("All Bill");
        A6.setBounds(10,316,152,17);
        A6.setForeground(Color.BLACK);
    add(A6);
   Font A66= new Font ("calibri",Font.BOLD,17);
        A6.setFont(A66); 
        
 JLabel A7 = new JLabel ("Return Bill");
        A7.setBounds(10,350,152,17);
        A7.setForeground(Color.BLACK);
    add(A7);
   Font A77= new Font ("calibri",Font.BOLD,17);
        A7.setFont(A77);         

 JLabel A8 = new JLabel ("Settings");
        A8.setBounds(10,384,152,17);
        A8.setForeground(Color.BLACK);
    add(A8);
   Font A88= new Font ("calibri",Font.BOLD,17);
        A8.setFont(A88);         

    JLabel aa2 = new JLabel();
           aa2.setIcon(new ImageIcon(getClass().getResource("shop/Rectangle 5.png")));      
       add(aa2);

A1.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
aa2.setBounds(0,140,155,27);

  }
});
A1.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
aa2.setBounds(0,0,0,0);

  }
}); 
A2.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
aa2.setBounds(0,175,155,27);

  }
});
A2.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
aa2.setBounds(0,0,0,0);

  }
}); 
A3.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
aa2.setBounds(0,208,155,27);

  }
});
A3.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
aa2.setBounds(0,0,0,0);

  }
}); 
A4.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
aa2.setBounds(0,243,155,27);

  }
});
A4.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
aa2.setBounds(0,0,0,0);

  }
});
A5.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
aa2.setBounds(0,277,155,27);

  }
});
A5.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
aa2.setBounds(0,0,0,0);

  }
}); 
A6.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
aa2.setBounds(0,311,155,27);

  }
});
A6.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
aa2.setBounds(0,0,0,0);

  }
}); 
A7.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
aa2.setBounds(0,345,155,27);

  }
});
A7.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
aa2.setBounds(0,0,0,0);

  }
}); 
A8.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
aa2.setBounds(0,378,155,27);

  }
});
A8.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
aa2.setBounds(0,0,0,0);

  }
});


A1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
                          
    Admin_used Frame = new Admin_used();
    dispose();
    
  } 
    });
A2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
                          
    Suppler_register Frame = new Suppler_register();
    dispose();
    
  } 
    });
A3.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
                          
    Add_items Frame = new Add_items();
    dispose();
    
  } 
    });
A4.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
                          
    All_items Frame = new All_items();
    dispose();
    
  } 
    });
A5.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
                          
    Delete_items Frame = new Delete_items();
    dispose();
    
  } 
    });
A6.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
                          
    All_bill Frame = new All_bill();
    dispose();
    
  } 
    });
A7.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
                          
    admin_r_bill Frame = new admin_r_bill();
    dispose();
    
  } 
    });
A8.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
                          
    Shop_settings Frame = new Shop_settings();
    dispose();
    
  } 
    });

JButton back = new JButton("Logout"); 
        back.setBounds(30,415,70,25);
    add(back); 
    
back.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
               
JOptionPane.showMessageDialog(null, "Logout","Logout success",JOptionPane.WARNING_MESSAGE);                          
    Login_frame Frame = new Login_frame();
    dispose();
    
  } 
    });
        
//===============================================================================================
JLabel exit = new JLabel ("Exit");
        exit.setBounds(755,421,40,20);
        exit.setForeground(Color.WHITE);
    add(exit);
   Font Exit = new Font ("calibri",Font.BOLD,18);
        exit.setFont(Exit);
        
    JLabel a2 = new JLabel();
           a2.setIcon(new ImageIcon(getClass().getResource("shop/exit.png")));      
       add(a2);        
        
exit.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
a2.setBounds(735,420,70,25);
exit.setForeground(Color.WHITE);
  }
});
exit.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
a2.setBounds(0,0,0,0);
exit.setForeground(Color.WHITE);
  }
}); 
exit.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
 
     System.exit(0);
  } 
    });
//===============================================================================================
 JLabel zx = new JLabel();
        zx.setIcon(new ImageIcon(getClass().getResource("shop/Cachier.png")));
        zx.setBounds(0,0,800,450);
    add(zx);
//====================================================================================================  
setSize (800,450);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setUndecorated(true);
setBackground(new Color(21,21,21,0));
setVisible(true); 
   }
 public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
     
 for(UIManager.LookAndFeelInfo lafInfo : UIManager.getInstalledLookAndFeels()){
        }
        
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
     
     
    All_bill Frame = new All_bill();
       
           Frame.addMouseListener(new MouseListener(){
                public void mouseReleased(MouseEvent e) {
                  
                }
                public void mousePressed(MouseEvent e) {
                    mouseDownScreenCoords = e.getLocationOnScreen();
                    mouseDownCompCoords = e.getPoint();
                }
                public void mouseExited(MouseEvent e) {
                }
                public void mouseEntered(MouseEvent e) {
                }
                public void mouseClicked(MouseEvent e) {
                }
            });
            Frame.addMouseMotionListener(new MouseMotionListener(){
                public void mouseMoved(MouseEvent e) {
                }
                public void mouseDragged(MouseEvent e) {
                     
                    
                    Point currCoords = e.getLocationOnScreen();
                   Frame.setLocation(mouseDownScreenCoords.x + (currCoords.x - 
                           mouseDownScreenCoords.x) - mouseDownCompCoords.x,
                           mouseDownScreenCoords.y + (currCoords.y - 
                                   mouseDownScreenCoords.y) - mouseDownCompCoords.y);
               
                
                }
            });
    }
    
}


