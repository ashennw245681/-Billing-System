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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Blocker
 */
public class Login_frame extends JFrame{
     static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
     private Object l1;
     String xx;
     private static String z;
    
Login_frame(){ 
setLayout(null);



    JTextField A1 =new JTextField();
	       A1.setBounds(55,75,170,20);
               A1.setForeground(Color.WHITE);
               A1.setBorder(null);
               A1.setEditable(true);
               A1.setOpaque(false);
	   add(A1); 
          Font All = new Font ("calibri",Font.BOLD,18);
    A1.setFont(All); 
    
     
      
JPasswordField t2 =new JPasswordField();
	       t2.setBounds(56,114,170,20);
               t2.setForeground(Color.WHITE);
               t2.setBorder(null);
               t2.setEditable(true);
               t2.setOpaque(false);
	   add(t2);
          Font t22 = new Font ("calibri",Font.BOLD,18);
    t2.setFont(t22);          
           
    

JComboBox dura = new JComboBox();
          dura.setBounds(238,77,70,20);
          dura.setForeground(Color.BLACK);
          dura.addItem("Select");
          dura.addItem("Admin");
          dura.addItem("Cachier");
      add(dura);
      
A1.addKeyListener(new KeyAdapter() {
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

t2.requestFocus(true);
 
    }
  }
});       
 
        JLabel l3 =new JLabel("");
	       l3.setBounds(40,155,300,20);
	   add(l3);
          Font l33 = new Font ("calibri",Font.BOLD,18);
    l3.setFont(l33); 
      
//--------------------------------------------------------------------------------------
t2.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){


       
       if(A1.getText().isEmpty() && t2.getText().isEmpty()){
        l3.setText("Type Item User Name and Password");
        l3.setForeground(Color.YELLOW);
       }
       else{    
       
       
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            Statement st = conn.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM management WHERE User_name = '"+A1.getText()+ "' && Password ='"+t2.getText()+"' && User ='"+(String)dura.getSelectedItem()+"'");
    
    
      if(rs.next()){
           
            xx = rs.getString("User_name");
            xx = rs.getString("Password");
            
                  z = A1.getText();
           
           l3.setText("Login Success");
           l3.setForeground(Color.GREEN);
           System.out.println(xx);
          
           
          if(dura.getSelectedItem().equals("Admin")){
             Admin_used Frame = new Admin_used();   
             dispose();
             
        
      }else if(dura.getSelectedItem().equals("Cachier")){
             Cachier Frame = new Cachier();
              dispose();
           } 
  
           
       }
       else{System.out.println(xx);
           l3.setText("Invalid Username or Password");
           l3.setForeground(Color.RED);
       }    
       }
     
       catch (Exception ew){
            System.out.println(ew);
       }
       }

       
      
//--------------------------------------------------------------------------------------       
Connection con;       
   try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            
            String query = "insert into login_infor (User_name,Password,User,Date_time)" + " values (?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Date and Time: " + formattedDate);
            
            
            preparedStmt.setString(1, A1.getText());
            preparedStmt.setString(2, t2.getText());
            preparedStmt.setString(3, (String)dura.getSelectedItem());
            preparedStmt.setString(4, formattedDate);
            
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

//--------------------------------------------------------------------------------------


t2.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_DELETE){

A1.setText("");
t2.setText("");
A1.requestFocus(true);
 
    }
  }
});  



















//===============================================================================================
JLabel exit = new JLabel ("Exit");
        exit.setBounds(560,310,30,20);
        exit.setForeground(Color.BLACK);
    add(exit);
   Font Exit = new Font ("calibri",Font.BOLD,18);
        exit.setFont(Exit);
        
    JLabel a2 = new JLabel();
           a2.setIcon(new ImageIcon(getClass().getResource("shop/exit.png")));      
       add(a2);        
        
exit.addMouseListener(new MouseAdapter() {
   public void mouseEntered(MouseEvent e) {  
a2.setBounds(550,308,70,25);
exit.setForeground(Color.WHITE);
  }
});

exit.addMouseListener(new MouseAdapter() {
   public void mouseExited(MouseEvent e) {  
a2.setBounds(0,0,0,0);
exit.setForeground(Color.BLACK);
  }
}); 

exit.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
 
     System.exit(0);
  } 
    });

//===============================================================================================
 JLabel zx = new JLabel();
        zx.setIcon(new ImageIcon(getClass().getResource("shop/Login.png")));
        zx.setBounds(0,0,600,338);
    add(zx);
//====================================================================================================  
setSize (600,338);
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
     
     
    Login_frame Frame = new Login_frame();
       
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
  public static String username(){
           return z;
       } 
}
