/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_market_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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
class Return_bill extends JFrame{
     static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
     private Object l1;
     private static String z;
                    String xx;
    
Return_bill(){ 
setLayout(null);


JLabel date = new JLabel();

            LocalDate myDateObj = LocalDate.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Date: " + formattedDate);
            
            date.setText(formattedDate);     
            
JLabel time = new JLabel();            
            
            LocalTime myDateObjq = LocalTime.now();
            DateTimeFormatter myFormatObjq = DateTimeFormatter.ofPattern("HH:mm:ss");
            
            String formattedTime = myDateObjq.format(myFormatObjq);
            System.out.println("Time: " + formattedTime);
            
            time.setText(formattedTime);
            
            
//===============================================================================================

//Bill ID

 JTextField t1=new JTextField();
            t1.setBounds(135,280,70,20);
        add(t1);
       Font At1 = new Font ("calibri",Font.BOLD,16);
            t1.setFont(At1);       
//Item ID        

 JTextField t2=new JTextField();
            t2.setBounds(213,280,70,20);
        add(t2);
      Font At2 = new Font ("calibri",Font.BOLD,16);
            t2.setFont(At2);        
//Quantity        
        
 JTextField t3=new JTextField();
            t3.setBounds(290,280,70,20);
        add(t3); 
      Font At3 = new Font ("calibri",Font.BOLD,16);
            t3.setFont(At3);
//==============================================================================        
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

t3.requestFocus(true);  
 
    }
  }
}); 
//============================================================================== 
//====================================================================================================
this.addWindowListener(new WindowAdapter(){
    public void windowOpened( WindowEvent e){
    
 t1.requestFocus();    
}
});     
//====================================================================================================  
 
JLabel bn = new JLabel("Return ID =");        
       bn.setBounds(140,410,200,20);
       bn.setForeground(Color.DARK_GRAY);
   add(bn);
      Font Abn = new Font ("calibri",Font.BOLD,16);
       bn.setFont(Abn);   
        
JLabel bnn = new JLabel("25");   
       bnn.setBounds(220,410,60,20);
       bnn.setForeground(Color.black);
   add(bnn);     
      Font Abnn = new Font ("calibri",Font.BOLD,16);
       bnn.setFont(Abnn);
       
       
  try{
        Connection con; Statement st; ResultSet rs;
       
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            st=con.createStatement();
            rs=st.executeQuery("select max(Return_id) from return_no");
            int i = 0;
            while (rs.next())
            {
                i=rs.getInt(1);
            }
            bnn.setText(String.valueOf(i+1));
            con.close();
            st.close();
            rs.close();
            
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }   
z = bnn.getText();  
  
//================================================================================================== 
    
JLabel Name = new JLabel("");        
       Name.setBounds(140,328,280,20);
       Name.setForeground(Color.black);
   add(Name);
   Font AName = new Font ("calibri",Font.BOLD,16);
       Name.setFont(AName);    
   
JLabel tr2 = new JLabel("Rs:");        
       tr2.setBounds(140,353,200,20);
       tr2.setForeground(Color.black);
   add(tr2);   
   Font Atr2 = new Font ("calibri",Font.BOLD,16);
       tr2.setFont(Atr2);
 
JLabel price = new JLabel("");   
       price.setBounds(160,353,100,20);
       price.setForeground(Color.DARK_GRAY);
   add(price);        
   Font Aprice = new Font ("calibri",Font.BOLD,16);
       price.setFont(Aprice);
       
 //==============================================================================     
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
            ResultSet rs = st.executeQuery("SELECT * FROM bill_save WHERE Bill_no = '"+t1.getText()+ "' && Item_ID ='"+t2.getText()+"'");
            
            while(rs.next()){
                String it= rs.getString("Item_ID");
                String na= rs.getString("Item_Description");
                String un= rs.getString("Unit_Price");

                Name.setText(na);
                price.setText(un);

                 }
                } catch (Exception ew) {
                    System.out.println(ew);
                }        
          
            }
        };   
    
        t2.getDocument().addDocumentListener(documentListener);    
//==============================================================================
       
JLabel wr2 = new JLabel("Total  = Rs:");        
       wr2.setBounds(140,380,200,20);
       wr2.setForeground(Color.black);
   add(wr2);
    Font Awr2 = new Font ("calibri",Font.BOLD,16);
       wr2.setFont(Awr2);  
    
JLabel w1 = new JLabel("");   
       w1.setBounds(217,380,150,20);
       w1.setForeground(Color.RED);
   add(w1);
   Font Aw1 = new Font ("calibri",Font.BOLD,16);
       w1.setFont(Aw1);
//====================================================================================================   
JFrame frame = new JFrame();
JTable table = new JTable();
      
 Object[] columns = {"Bill ID","Item ID","Description","Price","Quantity","Total"};
	DefaultTableModel model = new DefaultTableModel();
	model.setColumnIdentifiers(columns);   

table.setModel(model);   


	JScrollPane pane = new JScrollPane(table);
	pane.setBounds(135, 50, 660, 220);	
	frame.setLayout(null);
    add(pane);
    
//====================================================================================================
 JLabel tea = new JLabel ("Items =");
        tea.setBounds(500,275,200,22);
        tea.setForeground(Color.BLACK);
    add(tea);
   Font htea = new Font ("calibri",Font.BOLD,17);
        tea.setFont(htea);    

    
 JLabel te = new JLabel ("");
        te.setBounds(558,275,200,22);
        te.setForeground(Color.BLACK);
    add(te); 
   Font hte = new Font ("calibri",Font.BOLD,17);
        te.setFont(hte);  
        
//====================================================================================================   
   

//====================================================================================================   
JLabel gtt = new JLabel("Grand Total  = Rs:");        
       gtt.setBounds(380,380,200,20);
       gtt.setForeground(Color.black);
   add(gtt); 
      Font Agtt = new Font ("calibri",Font.BOLD,16);
       gtt.setFont(Agtt);   

JLabel g1 = new JLabel("");   
       g1.setBounds(502,378,150,22);
       g1.setForeground(Color.RED);
   add(g1);
      Font Ag1 = new Font ("calibri",Font.BOLD,21);
       g1.setFont(Ag1);
   

    
 JLabel Next = new JLabel("Next Bill ID =");
        Next.setBounds(590, 320, 120, 25);
        Next.setForeground(Color.black);
    add(Next);
Font ANext = new Font ("calibri",Font.BOLD,16);
        Next.setFont(ANext);    
    
 JLabel b = new JLabel("");
        b.setBounds(685, 320, 120, 25);
        b.setForeground(Color.RED);
    add(b);
Font Ab = new Font ("calibri",Font.BOLD,16);
        b.setFont(Ab);     

    
//==================================================================================================        
  try{
        Connection con; Statement st; ResultSet rs;
       
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            st=con.createStatement();
            rs=st.executeQuery("select max(Bill_no) from save_bill_no");
            int i = 0;
            while (rs.next())
            {
                i=rs.getInt(1);
            }
            b.setText(String.valueOf(i+1));
            con.close();
            st.close();
            rs.close();
            
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }        
//==================================================================================================      
   
//==================================================================================================
t3.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){
        
      
        
	Object[] row = new Object[6];

  int v1 = Integer.parseInt(price.getText());
  int v2 = Integer.parseInt(t3.getText());


  
  int tot = v1*v2;
 
           w1.setText(""+tot);
           
           
                row[0] = t1.getText();
                row[1] = t2.getText();
		row[2] = Name.getText();
		row[3] = price.getText();
		row[4] = t3.getText();
                row[5] = tot;
	
	// add row to the model
	model.addRow(row);        
           


    int cccc = table.getRowCount();
    int cols = table.getColumnCount();
    
   te.setText(String.valueOf(cccc));
    System.out.println(cols);             
        
        
       
       Connection con;
       try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            
            String query = "insert into return_save (Item_id,Bill_no,Unit_Price,Quantity,Total,Return_id,Date,Time)" + " values (?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Date and Time: " + formattedDate);
            
            preparedStmt.setString(1, t2.getText());
            preparedStmt.setString(2, Name.getText()+"("+(t1.getText())+")");
            preparedStmt.setString(3, price.getText());
            preparedStmt.setString(4, t3.getText());
            preparedStmt.setString(5, "-"+w1.getText());
            preparedStmt.setString(6, bnn.getText());
            preparedStmt.setString(7, date.getText());
            preparedStmt.setString(8, time.getText());
                                       
// l6.setText("Successfully saved");
// l6.setForeground(Color.GREEN);
 preparedStmt.execute();
 
 con.close();
       }
       catch (ClassNotFoundException | SQLException en)
       {
           System.err.println("Got an excepttion!");
           System.err.println(en.getMessage());
           
       }
       
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            
            Statement tr = (Statement) conn.createStatement ();
            ResultSet er = tr.executeQuery("SELECT SUM(Total) FROM return_save WHERE Return_id = '"+bnn.getText()+"'");
      
            while (er.next()){
            
                int i = er.getInt(1);
            
            g1.setText(String.valueOf(i));
            conn.close();
            tr.close();
            er.close();
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        } 

JOptionPane.showMessageDialog(null, "Next Item ","success",JOptionPane.WARNING_MESSAGE);




       Connection cona;
       try{
            Class.forName("com.mysql.jdbc.Driver");
            cona = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            
            String query = "insert into bill_save (Item_ID,Item_Description,Unit_Price,Quantity,Total,Bill_no,Date,Time)" + " values (?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStmt = cona.prepareStatement(query);
            
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Date and Time: " + formattedDate);
            
            preparedStmt.setString(1, t2.getText());
            preparedStmt.setString(2, Name.getText()+"[Return Item]");
            preparedStmt.setString(3, price.getText());
            preparedStmt.setString(4, t3.getText());
            preparedStmt.setString(5, "-"+w1.getText());
            preparedStmt.setString(6, b.getText());
            preparedStmt.setString(7, date.getText());
            preparedStmt.setString(8, time.getText());
                                       
// l6.setText("Successfully saved");
// l6.setForeground(Color.GREEN);
 preparedStmt.execute();
 
 cona.close();
       }
       catch (ClassNotFoundException | SQLException en)
       {
           System.err.println("Got an excepttion!");
           System.err.println(en.getMessage());
           
       }

t2.setText("");
t3.setText("");
Name.setText("");
price.setText("");
w1.setText("");
t1.requestFocus(true);

    }
  }
});

//==================================================================================================


t1.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_SHIFT){
        
        Connection cons;
       try{
            Class.forName("com.mysql.jdbc.Driver");
            cons = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            
            String query = "insert into return_no (Return_id,Bill_no,Total,Items,Date,Time)" + " values (?,?,?,?,?,?)";
            PreparedStatement preparedStmt = cons.prepareStatement(query);
            
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Date and Time: " + formattedDate);
            
            preparedStmt.setString(1, bnn.getText());
            preparedStmt.setString(2, t1.getText());
            preparedStmt.setString(3, g1.getText());
            preparedStmt.setString(4, te.getText());
            preparedStmt.setString(5, date.getText());
            preparedStmt.setString(6, time.getText());
                                       
// l6.setText("Successfully saved");
// l6.setForeground(Color.GREEN);
    Cachier Frame = new Cachier();
    dispose();            
            
 preparedStmt.execute();
 
 cons.close();
       }
       catch (ClassNotFoundException | SQLException en)
       {
           System.err.println("Got an excepttion!");
           System.err.println(en.getMessage());
           
       }           
        
        
        
   }
  }
});    
//==================================================================================================
























 JLabel nn = new JLabel ("Add Return Bill");
        nn.setBounds(160,10,300,33);
        nn.setForeground(Color.BLACK);
    add(nn);
   Font Ann = new Font ("Berlin Sans FB Demi",Font.BOLD,33);
        nn.setFont(Ann);

 JLabel A1 = new JLabel ("Add Bill  ");
        A1.setBounds(10,146,152,17);
        A1.setForeground(Color.BLACK);
    add(A1);
   Font A11 = new Font ("calibri",Font.BOLD,17);
        A1.setFont(A11);
        
 JLabel A2 = new JLabel ("Add Return Bill");
        A2.setBounds(10,180,152,17);
        A2.setForeground(Color.BLACK);
    add(A2);
   Font A22 = new Font ("calibri",Font.BOLD,17);
        A2.setFont(A22);        
        
 JLabel A3 = new JLabel ("Find Items");
        A3.setBounds(10,215,152,17);
        A3.setForeground(Color.BLACK);
    add(A3);
   Font A33 = new Font ("calibri",Font.BOLD,17);
        A3.setFont(A33);
        
 JLabel A4 = new JLabel ("Find Bill");
        A4.setBounds(10,250,152,17);
        A4.setForeground(Color.BLACK);
    add(A4);
   Font A44 = new Font ("calibri",Font.BOLD,17);
        A4.setFont(A44);          
        
 JLabel A5 = new JLabel ("Settings");
        A5.setBounds(10,282,152,17);
        A5.setForeground(Color.black);
    add(A5);
   Font A55= new Font ("calibri",Font.BOLD,17);
        A5.setFont(A55);         

 JLabel A6 = new JLabel ("");
        A6.setBounds(10,316,152,17);
        A6.setForeground(Color.WHITE);
    add(A6);
   Font A66= new Font ("calibri",Font.BOLD,17);
        A6.setFont(A66); 
        
 JLabel A7 = new JLabel ("");
        A7.setBounds(10,350,152,17);
        A7.setForeground(Color.WHITE);
    add(A7);
   Font A77= new Font ("calibri",Font.BOLD,17);
        A7.setFont(A77);         

 JLabel A8 = new JLabel ("");
        A8.setBounds(10,384,152,17);
        A8.setForeground(Color.WHITE);
    add(A8);
   Font A88= new Font ("calibri",Font.BOLD,17);
        A8.setFont(A88);        

    JLabel aa2 = new JLabel();
           aa2.setIcon(new ImageIcon(getClass().getResource("shop/Rectangle 1.png")));      
       add(aa2);

A1.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
aa2.setBounds(0,140,130,27);

  }
});
A1.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
aa2.setBounds(0,0,0,0);

  }
}); 
A2.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
aa2.setBounds(0,175,130,27);

  }
});
A2.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
aa2.setBounds(0,0,0,0);

  }
}); 
A3.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
aa2.setBounds(0,208,130,27);

  }
});
A3.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
aa2.setBounds(0,0,0,0);

  }
}); 
A4.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
aa2.setBounds(0,243,130,27);

  }
});
A4.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
aa2.setBounds(0,0,0,0);

  }
});
A5.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
aa2.setBounds(0,277,130,27);

  }
});
A5.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
aa2.setBounds(0,0,0,0);

  }
}); 
A6.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
aa2.setBounds(0,311,130,27);

  }
});
A6.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
aa2.setBounds(0,0,0,0);

  }
}); 
A7.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
aa2.setBounds(0,345,130,27);

  }
});
A7.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
aa2.setBounds(0,0,0,0);

  }
}); 
A8.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
aa2.setBounds(0,378,130,27);

  }
});
A8.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
aa2.setBounds(0,0,0,0);

  }
});


A1.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
                          
    Cachier Frame = new Cachier();
    dispose();
    
  } 
    });
A2.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
                          
    Return_bill Frame = new Return_bill();
    dispose();
    
  } 
    });
A3.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
                          
    Find_items Frame = new Find_items();
    dispose();
    
  } 
    });
A4.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
                          
    Find_bill Frame = new Find_bill();
    dispose();
    
  } 
    });
A5.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
                          
    set_c Frame = new set_c();
    dispose();
    
  } 
    });
A6.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
                          
//    All_bill Frame = new All_bill();
//    dispose();
    
  } 
    });
A7.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
                          
//    All_bill Frame = new All_bill();
//    dispose();
    
  } 
    });
A8.addMouseListener(new MouseAdapter()  {
           public void mouseClicked(MouseEvent e) {
                          
//    Shop_settings Frame = new Shop_settings();
//    dispose();
    
  } 
    });
        
//===============================================================================================
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
//===============================================================================================    
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
     
     
    Return_bill Frame = new Return_bill();
       
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
  public static String return_bill(){
           return z;
       }    
}



