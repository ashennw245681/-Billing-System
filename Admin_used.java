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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.DateFormatter;
import static super_market_system.Login_frame.mouseDownScreenCoords;

/**
 *
 * @author Blocker
 */
class Admin_used extends JFrame{
     static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
     private Object l1;
     private static String z;
                    String xx;
    
Admin_used(){ 
setLayout(null);

JLabel date = new JLabel();

            LocalDate myDateObj = LocalDate.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Date: " + formattedDate);
            
            date.setText(formattedDate);
            

//   ResultSet er = tr.executeQuery("SELECT SUM(Total) FROM save_bill_no WHERE Date BETWEEN 10 AND 20");   
            
//  ResultSet rs=st.executeQuery("SELECT SUM(Total) FROM save_bill_no WHERE Date BETWEEN = '"+A1.getText()+ "' AND '"+t2.getText()+"'");            
            
                     
            

 JLabel today_earn = new JLabel ("Today Total Amount  =");
        today_earn.setBounds(160,100,350,33);
        today_earn.setForeground(Color.DARK_GRAY);
    add(today_earn);
   Font Atoday_earn = new Font ("Berlin Sans FB Demi",Font.PLAIN,26);
        today_earn.setFont(Atoday_earn);

 JLabel earn = new JLabel ("");
        earn.setBounds(435,100,350,33);
        earn.setForeground(Color.black);
    add(earn);
   Font Aearn = new Font ("calibri",Font.BOLD,26);
        earn.setFont(Aearn); 
        
        
        
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            
            Statement tr = (Statement) conn.createStatement ();
             ResultSet er = tr.executeQuery("SELECT SUM(Total) FROM save_bill_no WHERE Date = '"+date.getText()+"'");
      
            while (er.next()){
            
                int i = er.getInt(1);
            
            earn.setText(String.valueOf(i));
            conn.close();
            tr.close();
            er.close();
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }          
        
        
        
        
 JLabel last_week = new JLabel ("Last Week Amount    =");
        last_week.setBounds(160,165,350,33);
        last_week.setForeground(Color.DARK_GRAY);
    add(last_week);
   Font Alast_week = new Font ("Berlin Sans FB Demi",Font.PLAIN,26);
        last_week.setFont(Alast_week);
        
 JLabel week = new JLabel ("");
        week.setBounds(435,165,350,33);
        week.setForeground(Color.black);
    add(week);
   Font Aweek = new Font ("calibri",Font.BOLD,26);
        week.setFont(Aweek);    
 
JLabel A1q = new JLabel("02-01-2023");        
        
 //   07 - date         
        
        
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            
            Statement tr = (Statement) conn.createStatement ();                       
       ResultSet er=tr.executeQuery("SELECT SUM(Total) FROM save_bill_no  WHERE Date BETWEEN '"+A1q.getText()+ "' AND '"+date.getText()+"'");                             
      
            while (er.next()){
            
                int i = er.getInt(1);
            
            week.setText(String.valueOf(i));
            conn.close();
            tr.close();
            er.close();
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        } 





        
        

 JLabel last_month = new JLabel ("Last Month Amount   =");
        last_month.setBounds(160,230,350,33);
        last_month.setForeground(Color.DARK_GRAY);
    add(last_month);
   Font Alast_month = new Font ("Berlin Sans FB Demi",Font.PLAIN,26);
        last_month.setFont(Alast_month);

 JLabel month = new JLabel ("");
        month.setBounds(435,230,350,33);
        month.setForeground(Color.black);
    add(month);
   Font Amonth = new Font ("calibri",Font.BOLD,26);
        month.setFont(Amonth);
        
        
JLabel mon = new JLabel("02-01-2023");        
        
        
//   30 - date        
        
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            
            Statement tr = (Statement) conn.createStatement ();                       
       ResultSet er=tr.executeQuery("SELECT SUM(Total) FROM save_bill_no  WHERE Date BETWEEN '"+mon.getText()+ "' AND '"+date.getText()+"'");                             
      
            while (er.next()){
            
                int i = er.getInt(1);
            
            month.setText(String.valueOf(i));
            conn.close();
            tr.close();
            er.close();
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        } 
        
        
        
 JLabel nn = new JLabel ("Home");
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
     
     
    Admin_used Frame = new Admin_used();
       
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
