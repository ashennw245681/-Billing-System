/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_market_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Blocker
 */
class Add_items extends JFrame{
     static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
     private Object l1;
     private static String z;
                    String xx;
    
Add_items(){ 
setLayout(null);




JLabel ll=new JLabel("Order No=");
       ll.setBounds(250,350,225,20);
       ll.setForeground(Color.WHITE);
   add(ll);   
 Font All = new Font ("calibri",Font.BOLD,18);
       ll.setFont(All);    

JLabel ll1=new JLabel("");
       ll1.setBounds(335,350,225,20);
       ll1.setForeground(Color.BLACK);
   add(ll1);   
 Font All1 = new Font ("calibri",Font.BOLD,18);
       ll1.setFont(All1);   


JLabel l1=new JLabel("Item ID                  = ");
       l1.setBounds(250,120,200,20);
       l1.setForeground(Color.BLACK);
   add(l1);
 Font Al1 = new Font ("calibri",Font.BOLD,18);
       l1.setFont(Al1);   
         
JLabel l2=new JLabel("Item Description =");
       l2.setBounds(250,165,225,20);
       l2.setForeground(Color.BLACK);
   add(l2);
 Font Al2 = new Font ("calibri",Font.BOLD,18);
       l2.setFont(Al2);   
         
JLabel l3=new JLabel("Suppler ID            =");
       l3.setBounds(250,210,250,20);
       l3.setForeground(Color.BLACK);
   add(l3);
 Font Al3 = new Font ("calibri",Font.BOLD,18);
       l3.setFont(Al3);   
             
JLabel l4=new JLabel("Unit Price             =");
       l4.setBounds(250,255,275,20);
       l4.setForeground(Color.BLACK);
   add(l4);
 Font Al4 = new Font ("calibri",Font.BOLD,18);
       l4.setFont(Al4);   
         
JLabel l5=new JLabel("Quantity               =");
       l5.setBounds(250,300,300,20);
       l5.setForeground(Color.BLACK);
   add(l5);
 Font Al5 = new Font ("calibri",Font.BOLD,18);
       l5.setFont(Al5); 
       
JLabel CC=new JLabel("Item = ");
       CC.setBounds(550,50,200,20);
       CC.setForeground(Color.BLACK);
   add(CC);
 Font ACC = new Font ("calibri",Font.BOLD,18);
       CC.setFont(ACC);        
       

JLabel l6=new JLabel("");
       l6.setBounds(250,383,300,20);
   add(l6);   
  Font Al6 = new Font ("calibri",Font.BOLD,16);
       l6.setFont(Al6);


 JTextField t1=new JTextField();
            t1.setBounds(600,48,180,25);
            t1.setForeground(Color.BLACK);
            t1.setBorder(null);
            t1.setEditable(true);
//            t1.setOpaque(false);
        add(t1);
      Font AT1 = new Font ("calibri",Font.BOLD,18);
       t1.setFont(AT1);  
       
       
     
 JTextField t2=new JTextField();
            t2.setBounds(390,120,250,25);
        add(t2);
       Font AT2 = new Font ("calibri",Font.BOLD,18);
       t2.setFont(AT2); 
       
       
        
 JTextField t3=new JTextField();
            t3.setBounds(390,162,250,25);
        add(t3);
       Font AT3 = new Font ("calibri",Font.BOLD,18);
       t3.setFont(AT3);         
        
 JTextField t4=new JTextField();
            t4.setBounds(390,210,250,25);
        add(t4);
       Font AT4 = new Font ("calibri",Font.BOLD,18);
       t4.setFont(AT4);         
        
 JTextField t5=new JTextField();
            t5.setBounds(390,255,250,25);
        add(t5);
       Font AT5 = new Font ("calibri",Font.BOLD,18);
       t5.setFont(AT5);         
        
 JTextField t6=new JTextField();
            t6.setBounds(390,300,250,25);
        add(t6);
       Font AT6 = new Font ("calibri",Font.BOLD,18);
       t6.setFont(AT6);

JComboBox dura = new JComboBox();
          dura.setBounds(660,120,120,20);
          dura.addItem("Company");
      add(dura);

t1.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_SHIFT){

t2.requestFocus(true);
 
    }
  }
}); 
t1.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){

t2.requestFocus(true);
 
    }
  }
}); 
t2.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){

dura.requestFocus(true);
 
    }
  }
});
dura.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){

t3.requestFocus(true);
 
    }
  }
});
t3.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){

t4.requestFocus(true);
 
    }
  }
});
t4.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){

t5.requestFocus(true);
 
    }
  }
}); 
t5.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){

t6.requestFocus(true);
 
    }
  }
}); 

  try{
        Connection con; Statement st; ResultSet rs;
       
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            st=con.createStatement();
            rs=st.executeQuery("select max(Order_No) from All_item");
            int i = 0;
            while (rs.next())
            {
                i=rs.getInt(1);
            }
            ll1.setText(String.valueOf(i+1));
            con.close();
            st.close();
            rs.close();
            
       }
       catch (Exception e)
       {
           e.printStackTrace();
       } 

  try{
        Connection con; Statement st; ResultSet rs;
       
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            st=con.createStatement();
            rs=st.executeQuery("select max(Item_ID) from All_item");
            int i = 0;
            while (rs.next())
            {
                i=rs.getInt(1);
            }
            t2.setText(String.valueOf(i+1));
            con.close();
            st.close();
            rs.close();
            
       }
       catch (Exception e)
       {
           e.printStackTrace();
       } 

try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("select Company from Supple_Register");
            
            while(rs.next()){

                dura.addItem(rs.getString("Company"));
               
                
            
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }  

dura.addItemListener(new ItemListener(){
    public void itemStateChanged(ItemEvent e){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM Supple_Register WHERE Company = '"+(String)dura.getSelectedItem()+"'");
            
        
            while(rs.next()){
                String na= rs.getString("Suppler_ID");
                
                
                t4.setText(na);
                
                
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
    }
});



DocumentListener  documentListener = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIt(documentEvent);
            }

            public void insertUpdate(DocumentEvent documentEvent) {
                printIt(documentEvent);
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                
                printIt(documentEvent);
            }

            private void printIt(DocumentEvent documentEvent) {

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM All_item WHERE Item_ID = '"+t1.getText()+"'");
            
            while(rs.next()){
                String it= rs.getString("Item_ID");
                String id= rs.getString("Item_Description");
                String si= rs.getString("Suppler_ID");
                String un= rs.getString("Unit_Price");
                String qu= rs.getString("Quantity");
                String or= rs.getString("Order_No");
                String co= rs.getString("Company");
               
                
                t2.setText(it);
                t3.setText(id);
                t4.setText(si);
                t5.setText(un);
                t6.setText(qu);
                ll1.setText(or);
               dura.setSelectedItem(co);
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }       
          
                
            }
        };   
    
        t1.getDocument().addDocumentListener(documentListener);    
 

t6.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){

   if(t3.getText().isEmpty()&& t4.getText().isEmpty()&& t5.getText().isEmpty()&& t6.getText().isEmpty()){
        l6.setText(" Type Items ");
        l6.setForeground(Color.YELLOW);
       }
       else{              
               
       
       Connection con;
       try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            
            String query = "insert into All_item (Item_ID,Item_Description,Suppler_ID,Unit_Price,Quantity,Order_No,Company,Date_Time)" + " values (?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            
             LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Date and Time: " + formattedDate);
            
            
            preparedStmt.setString(1, t2.getText());
            preparedStmt.setString(2, t3.getText());
            preparedStmt.setString(3, t4.getText());
            preparedStmt.setString(4, t5.getText());
            preparedStmt.setString(5, t6.getText());
            preparedStmt.setString(6, ll1.getText());
            preparedStmt.setString(7, (String)dura.getSelectedItem());
            preparedStmt.setString(8, formattedDate);
            
 l6.setText("Successfully saved");
 l6.setForeground(Color.GREEN);
 preparedStmt.execute();
 
 con.close();
       }
       catch (ClassNotFoundException | SQLException en)
       {
           System.err.println("Got an excepttion!");
           System.err.println(en.getMessage());
           
       }
       
       }
 
        
       Connection con;
       try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            
            String query = "insert into Item_Stock (Item_ID,Item_Description,Quantity,Date_Time,Update_date_time)" + " values (?,?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            
             LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Date and Time: " + formattedDate);
            
            
            preparedStmt.setString(1, t2.getText());
            preparedStmt.setString(2, t3.getText());
            preparedStmt.setString(3, t6.getText());
            preparedStmt.setString(4, formattedDate);
            preparedStmt.setString(5, formattedDate);

            

 preparedStmt.execute();
 
 con.close();
       }
       catch (ClassNotFoundException | SQLException en)
       {
           System.err.println("Got an excepttion!");
           System.err.println(en.getMessage());
           
       }  
   
   
   
   
   
   
   
   
   
    }
  }
});



//  Item_ID,Item_Description,Suppler_ID,Unit_Price,Quantity,Order_No,Company,Date_Time

















 JLabel nn = new JLabel ("Add Items");
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
     
     
    Add_items Frame = new Add_items();
       
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

