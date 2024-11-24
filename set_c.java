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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import static super_market_system.Find_bill.mouseDownScreenCoords;

/**
 *
 * @author Blocker
 */
class set_c extends JFrame{
     static Point mouseDownScreenCoords;
     static Point mouseDownCompCoords;
     private Object l1;
     private static String z;
                    String xx;
    
set_c(){ 
setLayout(null);

//==============================================================================

 JLabel B1 = new JLabel ("--Bill Pannel--");
        B1.setBounds(150,63,152,20);
        B1.setForeground(Color.RED);
    add(B1);
   Font B11 = new Font ("calibri",Font.BOLD,24);
        B1.setFont(B11);


 JLabel B2 = new JLabel ("= Reture Pannel                =  Item ID + SPACE");
        B2.setBounds(160,100,600,17);
        B2.setForeground(Color.BLACK);
    add(B2);
   Font B22 = new Font ("calibri",Font.BOLD,16);
        B2.setFont(B22);

 JLabel B3 = new JLabel ("= Clear                                =  Item ID + DELETE");
        B3.setBounds(160,125,600,17);
        B3.setForeground(Color.BLACK);
    add(B3);
   Font B33 = new Font ("calibri",Font.BOLD,16);
        B3.setFont(B33);

 JLabel B4 = new JLabel ("= CASH                               =  Item ID + SHIFT");
        B4.setBounds(160,150,600,17);
        B4.setForeground(Color.BLACK);
    add(B4);
   Font B44 = new Font ("calibri",Font.BOLD,16);
        B4.setFont(B44);

 JLabel B5 = new JLabel ("= Item Quantity                =  Item ID + ENTER");
        B5.setBounds(160,175,600,17);
        B5.setForeground(Color.BLACK);
    add(B5);
   Font B55 = new Font ("calibri",Font.BOLD,16);
        B5.setFont(B55);

 JLabel B6 = new JLabel ("= Reture Item                    =  Item ID + INSERT");
        B6.setBounds(160,200,600,17);
        B6.setForeground(Color.BLACK);
    add(B6);
   Font B66 = new Font ("calibri",Font.BOLD,16);
        B6.setFont(B66);

 JLabel B7 = new JLabel ("= Reture ID Remove         =  Item ID + ALT");
        B7.setBounds(160,225,600,17);
        B7.setForeground(Color.BLACK);
    add(B7);
   Font B77 = new Font ("calibri",Font.BOLD,16);
        B7.setFont(B77);        

 JLabel B8 = new JLabel ("= Print Bill                         =  CASH + ENTER");
        B8.setBounds(160,250,600,17);
        B8.setForeground(Color.BLACK);
    add(B8);
   Font B88 = new Font ("calibri",Font.BOLD,16);
        B8.setFont(B88);          
        
 JLabel C1 = new JLabel ("--Reture Pannel--");
        C1.setBounds(150,280,300,20);
        C1.setForeground(Color.RED);
    add(C1);
   Font C11 = new Font ("calibri",Font.BOLD,24);
        C1.setFont(C11);
        
 JLabel C2 = new JLabel ("= Bill Pannel           =  Bill ID + SHIFT");
        C2.setBounds(160,310,600,17);
        C2.setForeground(Color.BLACK);
    add(C2);
   Font C22 = new Font ("calibri",Font.BOLD,16);
        C2.setFont(C22);

 JLabel C3 = new JLabel ("= Item ID                 =  Bill ID + ENTER");
        C3.setBounds(160,335,600,17);
        C3.setForeground(Color.BLACK);
    add(C3);
   Font C33 = new Font ("calibri",Font.BOLD,16);
        C3.setFont(C33);        
        
 JLabel C4 = new JLabel ("= Item Quantity     =  Bill ID + ENTER");
        C4.setBounds(160,360,600,17);
        C4.setForeground(Color.BLACK);
    add(C4);
   Font C44 = new Font ("calibri",Font.BOLD,16);
        C4.setFont(C44);        
        



 JLabel nn = new JLabel ("Settings");
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
     
     
    set_c Frame = new set_c();
       
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




