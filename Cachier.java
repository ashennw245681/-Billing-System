/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_market_system;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.ColumnText;
import com.lowagie.text.pdf.FontSelector;
import com.lowagie.text.pdf.GrayColor;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
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
import java.io.File;
import java.io.FileOutputStream;
import static java.lang.Integer.sum;
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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Blocker
 */
class Cachier extends JFrame{
     static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
     String RET = Return_bill.return_bill();
     String return_bill = null;
     
String TID = Login_frame.username();
      String username = null;
    
Cachier(){ 
setLayout(null);

//JLabel cname = new JLabel(CNA);




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
            
            
            

JFrame frame = new JFrame();
JTable table = new JTable();
      
 Object[] columns = {"Item ID","Description","Price","Quantity","Total"};
	DefaultTableModel model = new DefaultTableModel();
	model.setColumnIdentifiers(columns);   

table.setModel(model);
table.setBackground(Color.LIGHT_GRAY);
table.setForeground(Color.black);   


	JScrollPane pane = new JScrollPane(table);
	pane.setBounds(135, 50, 660, 220);
	frame.setLayout(null);
    add(pane);



JLabel rre = new JLabel("Return ID = ");
       rre.setBounds(135,275,500, 20);
       rre.setForeground(Color.black);
   add(rre);
   Font Arre = new Font ("calibri",Font.BOLD,16);
        rre.setFont(Arre);   
   
JLabel rr = new JLabel(RET);
       rr.setBounds(220,275,500, 20);
       rr.setForeground(Color.red);
   add(rr);
   Font Arr = new Font ("calibri",Font.BOLD,16);
        rr.setFont(Arr);

 JTextField t1=new JTextField();
            t1.setBounds(140,300,100,20);
        add(t1);
   Font At1 = new Font ("calibri",Font.BOLD,16);
        t1.setFont(At1);        

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
 
JLabel t3 = new JLabel("");   
       t3.setBounds(160,353,100,20);
       t3.setForeground(Color.red);
   add(t3);        
   Font At3 = new Font ("calibri",Font.BOLD,16);
       t3.setFont(At3);
       
 JTextField t4=new JTextField();
            t4.setBounds(260,300,100,20);
        add(t4);
   Font At4 = new Font ("calibri",Font.BOLD,16);
            t4.setFont(At4);        
        
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

JLabel bn = new JLabel("Bill No =");        
       bn.setBounds(140,410,200,20);
       bn.setForeground(Color.DARK_GRAY);
   add(bn);
      Font Abn = new Font ("calibri",Font.BOLD,16);
       bn.setFont(Abn);
        
JLabel bnn = new JLabel("");   
       bnn.setBounds(200,410,60,20);
       bnn.setForeground(Color.BLACK);
   add(bnn);
      Font Abnn = new Font ("calibri",Font.BOLD,16);
       bnn.setFont(Abnn);
       
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
      Font Ag1 = new Font ("calibri",Font.BOLD,22);
       g1.setFont(Ag1);    

JLabel CASH1 = new JLabel("CASH = Rs");        
       CASH1.setBounds(500,310,200,20);
       CASH1.setForeground(Color.WHITE);
   add(CASH1);
Font ACASH1 = new Font ("calibri",Font.BOLD,16);
       CASH1.setFont(ACASH1);
       
JTextField CASH = new JTextField();        
       CASH.setBounds(550,310,200,20);
       CASH.setForeground(Color.BLACK);
   add(CASH);
Font ACASH = new Font ("calibri",Font.BOLD,16);
       CASH.setFont(ACASH);   
   
JLabel CASHM = new JLabel("Rs:");        
       CASHM.setBounds(550,340,200,20);
       CASHM.setForeground(Color.BLACK);
   add(CASHM);   
   
JLabel CASH1M = new JLabel("");        
       CASH1M.setBounds(570,340,200,20);
       CASH1M.setForeground(Color.BLACK);
   add(CASH1M);        
   Font ACASH1M = new Font ("calibri",Font.BOLD,16);
       CASH1M.setFont(ACASH1M);       
       
 JLabel tea = new JLabel ("");
        tea.setBounds(500,275,200,22);
        tea.setForeground(Color.BLACK);
    add(tea);
   Font hhhh = new Font ("calibri",Font.BOLD,16);
        tea.setFont(hhhh);   
        
JLabel uxx = new JLabel();
JLabel totxx = new JLabel();
JLabel datexx = new JLabel();   


/*



String sum;       
 String sValue = (String) String.format("%.2f", Double.parseDouble(sum));
 double newValue = Double.parseDouble(sValue);

 page_tot.setText("RS."+String.valueOf(newValue)); 

*/
        
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
            bnn.setText(String.valueOf(i+1));
            con.close();
            st.close();
            rs.close();
            
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }        
//==================================================================================================    

 //==============================================================================     

DocumentListener  documentListener = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIt(documentEvent);
            }

            public void insertUpdate(DocumentEvent documentEvent) {
                printIt(documentEvent);
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                Name.setText("");
                t3.setText("");
                t4.setText("");
                w1.setText("");
                totxx.setText("");
                uxx.setText("");
                
                printIt(documentEvent);
            }

            private void printIt(DocumentEvent documentEvent) {

                

         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM all_item WHERE Item_ID = '"+t1.getText()+"'");
            
            while(rs.next()){
                String it= rs.getString("Item_ID");
                String id= rs.getString("Item_Description");
                String un= rs.getString("Unit_Price");

                Name.setText(id);
                t3.setText(un);

                 }
                } catch (Exception ew) {
                    System.out.println(ew);
                }        
          
                
            }
        };   
    
        t1.getDocument().addDocumentListener(documentListener);    
 
//==============================================================================         
       
t1.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){

t4.requestFocus(true);
 
    }
  }
});    
t1.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_SPACE){

    Return_bill Frame = new Return_bill();
    dispose();
 
    }
  }
}); 
      
bnn.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_SPACE){

t1.requestFocus(true);
 
    }
  }
}); 
t1.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_SHIFT){

CASH.requestFocus(true);
 
    }
  }
});               
this.addWindowListener(new WindowAdapter(){
    public void windowOpened( WindowEvent e){
    
 t1.requestFocus();
    
}
});       
t1.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_DELETE){

    Cachier Frame = new Cachier();
    dispose();
    }
  }
});
CASH.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_DELETE){

    Cachier Frame = new Cachier();
    dispose();
    }
  }
});

t1.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ALT){
        
 rr.setText("");

    }
  }
});

//====================================================================================================
t1.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_INSERT){
        
//  int v1 = Integer.parseInt(bnn.getText());
//  int v2 = 1;
//  
//
//  int tot = v1-v2;
// 
//           bnn.setText(""+tot);        
        


Object[] row = new Object[5];

         try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system", "root", "");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM bill_save WHERE Bill_no = '"+bnn.getText()+"'");

                    while (rs.next()) {

                        row[0] = rs.getString("Item_ID");
                        row[1] = rs.getString("Item_Description");
                        row[2] = rs.getString("Unit_Price");
                        row[3] = rs.getString("Quantity");
                        row[4] = rs.getString("Total");
                        
                        model.addRow(row);

                    }
                } catch (Exception ew) {
                    System.out.println(ew);
                }
         
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            
            Statement tr = (Statement) con.createStatement ();
            ResultSet er = tr.executeQuery("SELECT SUM(Total) FROM bill_save WHERE Bill_no = '"+bnn.getText()+"'");
      
            while (er.next()){
            
                int i = er.getInt(1);
            
            g1.setText(String.valueOf(i));
            con.close();
            tr.close();
            er.close();
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }             
         
   }
  }
});         

//====================================================================================================        

t4.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){
        
	Object[] row = new Object[5];

  int v11 = Integer.parseInt(t3.getText());
  int v21 = Integer.parseInt(t4.getText());

  int tot = v11*v21;
 
           w1.setText(""+tot);
     
                row[0] = t1.getText();
		row[1] = Name.getText();
		row[2] = t3.getText();
		row[3] = t4.getText();
                row[4] = tot;
	
	// add row to the model
	model.addRow(row);        

    int cccc = table.getRowCount();
    int cols = table.getColumnCount();
    
   tea.setText("Items = "+ String.valueOf(cccc));
    System.out.println(cols);             
       
       Connection con;
       try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            
            String query = "insert into bill_save (Item_ID,Item_Description,Unit_Price,Quantity,Total,Bill_no,Date,Time)" + " values (?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Date and Time: " + formattedDate);
            
            preparedStmt.setString(1, t1.getText());
            preparedStmt.setString(2, Name.getText());
            preparedStmt.setString(3, t3.getText());
            preparedStmt.setString(4, t4.getText());
            preparedStmt.setString(5, w1.getText());
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
//==============================================================================        
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            
            Statement tr = (Statement) conn.createStatement ();
            ResultSet er = tr.executeQuery("SELECT SUM(Total) FROM bill_save WHERE Bill_no = '"+bnn.getText()+"'");
      
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
//============================================================================== 
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cona = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            
            Statement tr = (Statement) cona.createStatement ();
            ResultSet er = tr.executeQuery("SELECT * FROM item_stock WHERE Item_ID = '"+t1.getText()+"'");
      
            while (er.next()){
          
           String un= er.getString("Quantity");

                uxx.setText(un);   
            
            
            cona.close();
            tr.close();
            er.close();
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }   
//============================================================================== 
int v1 = Integer.parseInt(uxx.getText());
int v2 = Integer.parseInt(t4.getText());

       int totX = v1-v2;
       totxx.setText(""+totX);
       
PreparedStatement pst;
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conw = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            Statement st = (Statement) conw.createStatement ();

          
            pst = (PreparedStatement) conw.prepareStatement("update item_stock set Quantity=? WHERE Item_ID ="+t1.getText());
        
            {
             
pst.setString(1, totxx.getText());


pst.executeUpdate();
JOptionPane.showMessageDialog(null, "Next Item ","success",JOptionPane.WARNING_MESSAGE);
                t1.setText("");
                Name.setText("");
                t3.setText("");
                t4.setText("");
                w1.setText("");
                totxx.setText("");
                uxx.setText("");
                t1.requestFocus(true);
                

            }
            st.close();
            conw.close();
            
            
            }catch (Exception eo){
            System.out.println(eo);
            }       
       

    }
  }
});       
         

JLabel qqx = new JLabel();
JLabel qqxq= new JLabel();
JLabel qlod= new JLabel();
JLabel x4= new JLabel();
//===================================================================================================================           
//===================================================================================================================
t1.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_CONTROL){


         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM bill_save WHERE Bill_no = '"+bnn.getText()+"' && Item_ID ='"+t1.getText()+"'");
            
            while(rs.next()){
                String it= rs.getString("Item_ID");
                String id= rs.getString("Item_Description");
                String un= rs.getString("Unit_Price");
                String qn= rs.getString("Quantity");

                Name.setText(id);
                t3.setText(un);
                t4.setText(qn);
                x4.setText(qn);

                 }
                } catch (Exception ew) {
                    System.out.println(ew);
                }          

//---------------------------------------------------------------------------------------------------------------------------------------------         
         
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            Statement sat = (Statement) conn.createStatement ();
            ResultSet rqs = sat.executeQuery("SELECT * FROM item_stock WHERE Item_ID ='"+t1.getText()+"'");
            
            while(rqs.next()){

                String qn= rqs.getString("Quantity");

                qlod.setText(qn);

                 }
                } catch (Exception ew) {
                    System.out.println(ew);
                }   
                  
                  
                  
t4.requestFocus(true); 


         
    }
  }
}); 

//==================================================================================================      

t4.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_CONTROL){

//==============================================================================
int v1 = Integer.parseInt(x4.getText());
int v2 = Integer.parseInt(t4.getText());

       int qtot = v1-v2;
       
       qqx.setText(""+qtot);
       
//==============================================================================
       
int v4 = Integer.parseInt(qlod.getText());
int v5 = Integer.parseInt(qqx.getText());

       int qtowt = v4+v5;
       
       qqxq.setText(""+qtowt);  
//==============================================================================       
       
PreparedStatement pswt;
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conw = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            Statement st = (Statement) conw.createStatement ();

          
            pswt = (PreparedStatement) conw.prepareStatement("update item_stock set Quantity=? WHERE Item_ID ="+t1.getText());
        
            {
             
pswt.setString(1, qqxq.getText());


pswt.executeUpdate();
            }
            st.close();
            conw.close();
            
            
            }catch (Exception eo){
            System.out.println(eo);
            } 

        
        
        
        
        
        
        
        
  int v11 = Integer.parseInt(t3.getText());
  int v21 = Integer.parseInt(t4.getText());

  int tot = v11*v21;  
         totxx.setText(""+tot);

PreparedStatement pst;
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conw = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            Statement st = (Statement) conw.createStatement ();

          
            pst = (PreparedStatement) conw.prepareStatement("update bill_save set Quantity=?,Total=? WHERE Item_ID ="+t1.getText());
        
            {
             
pst.setString(1, t4.getText());
pst.setString(2, totxx.getText());


pst.executeUpdate();
JOptionPane.showMessageDialog(null, "Next Item ","success",JOptionPane.WARNING_MESSAGE);
                t1.setText("");
                Name.setText("");
                t3.setText("");
                t4.setText("");
                w1.setText("");
                totxx.setText("");
                uxx.setText("");
                t1.requestFocus(true);   
                model.setRowCount(0);
             }
            st.close();
            conw.close();
            
            
            
            }catch (Exception eo){
            System.out.println(eo);
            }  








Object[] row = new Object[5];

         try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system", "root", "");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM bill_save WHERE Bill_no = '"+bnn.getText()+"'");

                    while (rs.next()) {

                        row[0] = rs.getString("Item_ID");
                        row[1] = rs.getString("Item_Description");
                        row[2] = rs.getString("Unit_Price");
                        row[3] = rs.getString("Quantity");
                        row[4] = rs.getString("Total");
                        
                        model.addRow(row);

                    }
                } catch (Exception ew) {
                    System.out.println(ew);
                }
         
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            
            Statement tr = (Statement) con.createStatement ();
            ResultSet er = tr.executeQuery("SELECT SUM(Total) FROM bill_save WHERE Bill_no = '"+bnn.getText()+"'");
      
            while (er.next()){
            
                int i = er.getInt(1);
            
            g1.setText(String.valueOf(i));
            con.close();
            tr.close();
            er.close();
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        } 
                
               

t1.requestFocus(true); 
qqxq.setText("");
qqx.setText("");

         
    }
  }
}); 

//==================================================================================================  
//===================================================================================================================
t4.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_DELETE){
        
        
int v4 = Integer.parseInt(qlod.getText());
int v5 = Integer.parseInt(t4.getText());

       int qtowt = v4+v5;
       
       qqxq.setText(""+qtowt);  
//==============================================================================       
       
PreparedStatement pswt;
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conw = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            Statement st = (Statement) conw.createStatement ();

          
            pswt = (PreparedStatement) conw.prepareStatement("update item_stock set Quantity=? WHERE Item_ID ="+t1.getText());
        
            {
             
pswt.setString(1, qqxq.getText());


pswt.executeUpdate();
            }
            st.close();
            conw.close();
            
            
            }catch (Exception eo){
            System.out.println(eo);
            } 

       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
             java.sql.Statement stmt = con.createStatement();
    String sql = ("DELETE FROM bill_save WHERE Bill_no = '"+bnn.getText()+"' And Item_ID= '"+t1.getText()+"'");
    
    int delete = stmt.executeUpdate(sql);
    if(delete == 1){
//        a2.setText("Index Noumber Deleted");
                }
    stmt.close();
    con.close();
    
       }catch (Exception eo) {
           System.out.println(eo);
       }
       
        
JOptionPane.showMessageDialog(null, "Delete Item ","success",JOptionPane.WARNING_MESSAGE);
    
 t1.setText("");
 Name.setText("");
 t3.setText("");
 t4.setText("");
 w1.setText("");
 totxx.setText("");
 uxx.setText("");
 t1.requestFocus(true);   
 model.setRowCount(0);   


Object[] row = new Object[5];

         try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system", "root", "");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM bill_save WHERE Bill_no = '"+bnn.getText()+"'");

                    while (rs.next()) {

                        row[0] = rs.getString("Item_ID");
                        row[1] = rs.getString("Item_Description");
                        row[2] = rs.getString("Unit_Price");
                        row[3] = rs.getString("Quantity");
                        row[4] = rs.getString("Total");
                        
                        model.addRow(row);

                    }
                } catch (Exception ew) {
                    System.out.println(ew);
                }
         
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            
            Statement tr = (Statement) con.createStatement ();
            ResultSet er = tr.executeQuery("SELECT SUM(Total) FROM bill_save WHERE Bill_no = '"+bnn.getText()+"'");
      
            while (er.next()){
            
                int i = er.getInt(1);
            
            g1.setText(String.valueOf(i));
            con.close();
            tr.close();
            er.close();
                
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }    
    }
  }
}); 

//==================================================================================================    
        
CASH.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){

 int v1 = Integer.parseInt(CASH.getText());
 int v2 = Integer.parseInt(g1.getText());

  int totM = v1-v2;
 
           CASH1M.setText(""+totM);   
//==============================================================================            
       Connection con;
       try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            
            String query = "insert into save_bill_no (Bill_no,Total,Date,Time,Balance,Cash)" + " values (?,?,?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Date and Time: " + formattedDate);
            
            preparedStmt.setString(1, bnn.getText());
            preparedStmt.setString(2, g1.getText());
            preparedStmt.setString(3, date.getText());
            preparedStmt.setString(4, time.getText());
            preparedStmt.setString(5, CASH1M.getText());
            preparedStmt.setString(6, CASH.getText());
            
                                       
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
       
JOptionPane.showMessageDialog(null, "Do you need a Bill? ","Print Bill success",JOptionPane.WARNING_MESSAGE);



  com.lowagie.text.Document document = new com.lowagie.text.Document(PageSize.A9, 50, 70, 50, 50) {
                      
 }; 
  
try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conx = DriverManager.getConnection("jdbc:mysql://localhost/Super_market_system","root","");
            java.sql.Statement st = (java.sql.Statement) conx.createStatement ();
            ResultSet query_set = st.executeQuery("SELECT * FROM bill_save WHERE Bill_no = '"+bnn.getText()+"'");
                
                Document my_pdf_report = new Document();

                
                PdfWriter writer =PdfWriter.getInstance(my_pdf_report, new FileOutputStream("My first.pdf"));
                
BaseFont bf2 = BaseFont.createFont(BaseFont.COURIER, BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);
BaseFont bf = BaseFont.createFont(BaseFont.TIMES_BOLD,BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);
BaseFont bf1 = BaseFont.createFont(BaseFont.HELVETICA_BOLD, BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);
BaseFont bf22 = BaseFont.createFont(BaseFont.COURIER, BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);
BaseFont bf3 = BaseFont.createFont(BaseFont.HELVETICA_BOLDOBLIQUE, BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);
BaseFont bf4 = BaseFont.createFont(BaseFont.COURIER_OBLIQUE, BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);
BaseFont bf5 = BaseFont.createFont(BaseFont.TIMES_ITALIC, BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);

               
                int u =1;
                my_pdf_report.open();            
                float[] columnWidths = {0,11, 4, 4, 3};
                PdfPTable my_report_table = new PdfPTable(columnWidths);
                my_report_table.setWidthPercentage(100);
                
                      
             com.lowagie.text.Font ffont = FontFactory.getFont(FontFactory.TIMES_ROMAN, 8);
               PdfContentByte cb = writer.getDirectContent();
               
 
              Phrase header = new Phrase("   ", ffont);
              Phrase footer = new Phrase("Softwared by @Color Studio - 0703620555", ffont);
        ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,header,(my_pdf_report.right() - my_pdf_report.left()) / 2 + my_pdf_report.leftMargin(),my_pdf_report.top() + 10, 0);
        ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,footer,(my_pdf_report.right() - my_pdf_report.left()) / 2 + my_pdf_report.leftMargin(),my_pdf_report.bottom() - 10, 0);
        
        
        FontSelector selector = new FontSelector();
             com.lowagie.text.Font f1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12);
             com.lowagie.text.Font f2 = FontFactory.getFont("MSung-Light","UniCNS-UCS2-H", BaseFont.NOT_EMBEDDED);

selector.addFont(f1);
selector.addFont(f2);

cb.setFontAndSize(bf, 12);
cb.beginText();
    


        PdfPCell cell = new PdfPCell(new Phrase("This is a header", f1));
        cell.setBackgroundColor(GrayColor.WHITE);
 
        
        
        
        
            String title =("REMIX_AB");
            cb.setFontAndSize(bf5, 50);
            cb.setTextMatrix(160, 750); 
            cb.showText(title);
            
            String title2 =("Servicers");
            cb.setFontAndSize(bf5, 50);
            cb.setTextMatrix(250, 699);
            cb.showText(title2);
            
            String LINE1 =("--------------------------------------------");
            cb.setFontAndSize(bf2, 20);
            cb.setTextMatrix(35, 680);
            cb.showText(LINE1);

  
            
            
            
             String address =("No,505 Wijeyapura Anuradhapura");
            cb.setFontAndSize(bf2, 23);
            cb.setTextMatrix(82, 660);
            cb.showText(address);
            
            String tel =("Tel: 0712345698,0712345698");
            cb.setFontAndSize(bf2, 23);
            cb.setTextMatrix(120, 638);
            cb.showText(tel);
              
            String LINE2 =("--------------------------------------------");
            cb.setFontAndSize(bf2, 20);
            cb.setTextMatrix(35, 615);
            cb.showText(LINE2);
  

            
            String LINE3 =("Bill ID: "+bnn.getText());
            cb.setFontAndSize(bf4, 16);
            cb.setTextMatrix(90, 600);
            cb.showText(LINE3);
            
            String LINE4 =("Cachier: "+(TID));
            cb.setFontAndSize(bf4, 15);
            cb.setTextMatrix(90, 580);
            cb.showText(LINE4);
    
            String LINE5 =("Date: "+date.getText());
            cb.setFontAndSize(bf4, 15);
            cb.setTextMatrix(380, 600);
            cb.showText(LINE5); 

            
            String tie =("Time: "+time.getText());
            cb.setFontAndSize(bf4, 15);
            cb.setTextMatrix(380, 580);
            cb.showText(tie); 

           
            
            String LINE6 =("--------------------------------------------");
            cb.setFontAndSize(bf2, 20);
            cb.setTextMatrix(35, 560);
            cb.showText(LINE6);
            
            String sch_d10 =("Name                                             PRICE              QTY                  AMOUNT");
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(80, 548);
            cb.showText(sch_d10); 
            
            String LINEL8 =("--------------------------------------------");
            cb.setFontAndSize(bf2, 20);
            cb.setTextMatrix(35, 535);
            cb.showText(LINEL8);          
        
        
        
        
        
        
        
        
        
        
        
        

//        Paragraph paragraph1 = new Paragraph("                                              REMIX_AB");
//        my_pdf_report.add(paragraph1);
//        Paragraph paragraph2 = new Paragraph("                                                  Servicers");
//        my_pdf_report.add(paragraph2);
//        Paragraph paragraph3 = new Paragraph("----------------------------------------------------------------------------------------------------");
//        my_pdf_report.add(paragraph3);
//        Paragraph paragraph4 = new Paragraph("No,505 Wijeyapura Anuradhapura");
//        my_pdf_report.add(paragraph4);
//        Paragraph paragraph5 = new Paragraph("Tel: 0712345698,0712345698");
//        my_pdf_report.add(paragraph5);
//        Paragraph paragraph6 = new Paragraph("----------------------------------------------------------------------------------------------------");
//        my_pdf_report.add(paragraph6);
//        Paragraph paragraph7 = new Paragraph("Bill ID: 10                                         Date & Time: ");
//        my_pdf_report.add(paragraph7); 
//        
//        
//        
//        
//        
//        String sch_d1 =("10");
//    cb.setFontAndSize(bf, 10);
//    cb.setTextMatrix(36, 587);
//    cb.showText(sch_d1);
        

    

     
//     Chunk underline = new Chunk("Salaries for the Month of -150200");
 //     underline.setUnderline(0.1f, -2f); 

       
             com.lowagie.text.Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 14);
 //       Paragraph para = new Paragraph(underline);
   //     para.setLeading(0, 1);
        PdfPTable table2 = new PdfPTable(1);
        table2.setWidthPercentage(50);
        table2.getDefaultCell().setBorder(Rectangle.BOTTOM);


        PdfPCell cell1 = new PdfPCell();
        
         cell1.setBorder(Rectangle.NO_BORDER);
        cell1.setMinimumHeight(275);
        cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
        table2.addCell(cell1);
        my_pdf_report.add(table2);
        

          

                PdfPCell table_cell;
              
                while (query_set.next()) {  
                    
                           // String id = query_set.getString(u);
                               table_cell=new PdfPCell(new Phrase(u));
                                my_report_table.addCell(table_cell);
                      
                                String dept_id = query_set.getString("Item_Description");
                                table_cell=new PdfPCell(new Phrase(dept_id));
                                my_report_table.addCell(table_cell);
                                
                                String dept_name=query_set.getString("Unit_Price");
                                table_cell=new PdfPCell(new Phrase(dept_name));
                                my_report_table.addCell(table_cell);
                                
                                String manager_id=query_set.getString("Quantity");
                                table_cell=new PdfPCell(new Phrase(manager_id));
                                my_report_table.addCell(table_cell);
                                
                                String location_id=query_set.getString("Total");
                                table_cell=new PdfPCell(new Phrase(location_id));


                                my_report_table.addCell(table_cell);
                                
                              
                                }
                u++;
                

                my_pdf_report.add(my_report_table); 
                

                
                               
                
                
//my_pdf_report.add(new Phrase("\n"));
//              
//my_pdf_report.add(new Phrase("\n"));
//
//my_pdf_report.add(new Phrase("\n"));
//
//my_pdf_report.add(new Phrase("\n"));
//                Paragraph total = new Paragraph("                                                            TOTAL        :   "+g1.getText());
//        my_pdf_report.add(total);
//        
//
//
//
//        
//        Paragraph pr1 = new Paragraph("                                                                                ---------------");
//        my_pdf_report.add(pr1); 
//  
//         Paragraph prc = new Paragraph("                                                            CASH          :   "+CASH.getText());
//        my_pdf_report.add(prc);
//        
//my_pdf_report.add(new Phrase("\n"));
//        
//        Paragraph ps = new Paragraph("                                                            BALANCE   :   "+CASH1M.getText());
//        my_pdf_report.add(ps);
//        
//        my_pdf_report.add(new Phrase("\n"));
//
//        Paragraph x1 = new Paragraph("                                                   --------------------------------------------");
//        my_pdf_report.add(x1);
//        
//        Paragraph x2 = new Paragraph("                                                    THANK YOU VISIT US AGAIN");
//        my_pdf_report.add(x2);
//        
//        Paragraph x3 = new Paragraph("                                                   --------------------------------------------");
//        my_pdf_report.add(x3);
//        
        
        
         
            String LINEL7 =("TOTAL        : "+g1.getText());
            cb.setFontAndSize(bf, 15); 
            cb.setTextMatrix(200, 160);
            cb.showText(LINEL7); 

            String LINEL6 =("---------------------");
            cb.setFontAndSize(bf2, 20);
            cb.setTextMatrix(290, 145);
            cb.showText(LINEL6);
            
            String LINEL5 =("CASH           : "+CASH.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(200, 130);
            cb.showText(LINEL5);
            
            
            String LINEL4 =("BALANCE   : "+CASH1M.getText());
            cb.setFontAndSize(bf, 15);
            cb.setTextMatrix(200, 100);
            cb.showText(LINEL4);
                
                
            String LINEL3 =("--------------------------------------------");
            cb.setFontAndSize(bf2, 20);
            cb.setTextMatrix(35, 65);
            cb.showText(LINEL3);
            
            String LINEL2 =("THANK YOU VISIT US AGAIN");
            cb.setFontAndSize(bf, 20);
            cb.setTextMatrix(150, 50);
            cb.showText(LINEL2);
            
            String LINEL1 =("--------------------------------------------");
            cb.setFontAndSize(bf2, 20);
            cb.setTextMatrix(35, 35);
            cb.showText(LINEL1);            
        
        
                my_pdf_report.close();
                
                
                
                
                
                try {
 
		File pdfFile = new File("My First.pdf");
		if (pdfFile.exists()) {
 
			if (Desktop.isDesktopSupported()) {
				Desktop.getDesktop().open(pdfFile);
			} else {
				System.out.println("Awt Desktop is not supported!");
			}
 
		} else {
                    
			JOptionPane.showMessageDialog(null,"No file found ","No files",javax.swing.JOptionPane.WARNING_MESSAGE);
		}
                
                 
	  } catch (Exception ex) {
	  }
                /* Close all DB related objects */
                query_set.close();
                      
    
    
                }
                catch(Exception ew){
                System.out.println(ew);
                } 

 //-----------------------------------------------------         
        
       
    }
  }
}); 

//==================================================================================================   
     
 JLabel nn = new JLabel ("Add Bill");
        nn.setBounds(160,10,152,33);
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
     
     
    Cachier Frame = new Cachier();
       
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
