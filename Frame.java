

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;

import javax.swing.JFrame;


//import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import static java.lang.System.exit;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Karthikeyan
 */
public class Frame extends JFrame {
String[] value={"10","20","30"};
  public static String text;
  public static Double p;
  public static Double pr;
  private JFrame jFrame1;
  public static float x,x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x13,x12,x14,x15,x16,x17,x18,x19,x20,x21,x22,x23,x24,x25,x26,x27,x28,x29,x30,xd;
  public static float y,y1,y2,y3,y4,y5,y6,y7,y8,y9,y10,y11,y12,y13,y14,y15,y16,y17,y18,y19,y20,y21,y22,y23,y24,y25,y26,y27,y28,y29,y30,yd;
  public static float m,m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20,m21,m22,m23,m24,m25,m26,m27,m28,m29,m30,md;
  public static float sd,sd1,sd2,sd3,sd4,sd5,sd6,sd7,sd8,sd9,sd10,sd11,sd12,sd13,sd14,sd15,sd16,sd17,sd18,sd19,sd20,sd21,sd22,sd23,sd24,sd25,sd26,sd27,sd28,sd29,sd30,sdd;
  public static float tb,tb1,tb2,tb3,tb4,tb5,tb6,tb7,tb8,tb9,tb10,tb11,tb12,tb13,tb14,tb15,tb16,tb17,tb18,tb19,tb20,tb21,tb22,tb23,tb24,tb25,tb26,tb27,tb28,tb29,tb30,tbd;
  public static String n,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17,n18,n19,n20,n21,n22,n23,n24,n25,n26,n27,n28,n29,n30,nd;
  public static float ub,ub1,ub2,ub3,ub4,ub5,ub6,ub7,ub8,ub9,ub10,ub11,ub12,ub13,ub14,ub15,ub16,ub17,ub18,ub19,ub20,ub21,ub22,ub23,ub24,ub25,ub26,ub27,ub28,ub29,ub30,ubd;
  public static float t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,td;
  public static float tl,tl1,tl2,tl3,tl4,tl5,tl6,tl7,tl8,tl9,tl10,tl11,tl12,tl13,tl14,tl15,tl16,tl17,tl18,tl19,tl20,tl21,tl22,tl23,tl24,tl25,tl26,tl27,tl28,tl29,tl30,tld;
  public static float nb,nb1,nb2,nb3,nb4,nb5,nb6,nb7,nb8,nb9,nb10,nb11,nb12,nb13,nb14,nb15,nb16,nb17,nb18,nb19,nb20,nb21,nb22,nb23,nb24,nb25,nb26,nb27,nb28,nb29,nb30,nbd;
  public static int nnode;
  private JLabel jLable4;
  private JTextField jTextField4;
  public static double nvertex;
  private JButton jButton2;
  private JButton jButton3;
  public int s=2;
  private JFrame jFrame2;
  private java.lang.String i;        
     public Frame() {
        initComponents();
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new JComboBox();
        //JComboBox p=new JComboBox((ComboBoxModel) jComboBox1);
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("No of Nodes");

       jComboBox1.addItem(30);
       jComboBox1.addItem(20);
       jComboBox1.addItem(10);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
                
            }
        });

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               
                jButton1ActionPerformed(evt);
                
                
            }

    public void jButton1ActionPerformed(ActionEvent evt) {
       
      nnode=(int) jComboBox1.getSelectedItem();
      System.out.print("nodeno:"+ nnode);
       
         Display m2=new Display();
        //Display d=new Display();
        
        }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(56, 56, 56))
        );

        pack();
        setVisible(true);
    }// </editor-fold>                        

    private void jComboBox1ActionPerformed(ActionEvent evt) {                                           
        // TODO add your handling code here:
        
        
    }                                          
    public static void main(String args[]) {
        Frame f=new Frame();
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   

public class Display extends javax.swing.JFrame {
public int click=0,i=1;
 public Graph<String,String> g;
    /**
     * Creates new form Display
     */
    public Display() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        setTitle("Setting");
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
     

        jLabel1.setText("GetX");

        jLabel2.setText("GetY");

        jLabel3.setText("Node Name");

        jLabel4.setText("Mobility");

        jLabel5.setText("Node behavior");

        jComboBox1.setEditable(true);
        jComboBox1.addItem(1.0);
        jComboBox1.addItem(2.0);
        jComboBox1.addItem(3.0);
        jComboBox1.addItem(4.0);
        jComboBox1.addItem(5.0);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Start");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Signal Rate");

        jLabel7.setText("TTL");

        jLabel8.setText("Total Buffer-size");

        jLabel9.setText("Utilized Buffer-size");

        jLabel17.setText("Transmission Range");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(59, 59, 59)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField10)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField6)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(jTextField9))))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(30, 30, 30))
        );

        pack();
        setVisible(true);
    }// </editor-fold>                        

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
           kotty k=new kotty();
       
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:


        if(click<=nnode+2){
         System.out.print("n="+nnode); 
         if (click==0){
         x=Float.parseFloat(jTextField1.getText());
         y=Float.parseFloat(jTextField2.getText());
         m=Float.parseFloat(jTextField3.getText());
         n=jTextField10.getText();
         t=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb = Float.valueOf(cb.toString());
         tb=Float.parseFloat(jTextField6.getText());
         ub=Float.parseFloat(jTextField7.getText());
         sd=Float.parseFloat(jTextField4.getText());
         tl=Float.parseFloat(jTextField5.getText());
          }else
        if (click==1){
         x1=Float.parseFloat(jTextField1.getText());
         y1=Float.parseFloat(jTextField2.getText());
         m1=Float.parseFloat(jTextField3.getText());
         n1=jTextField10.getText();
         t1=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb1 = Float.valueOf(cb.toString());
         tb1=Float.parseFloat(jTextField6.getText());
         ub1=Float.parseFloat(jTextField7.getText());
         sd1=Float.parseFloat(jTextField4.getText());
         tl1=Float.parseFloat(jTextField5.getText());
          }else
            if (click==2){
         x2=Float.parseFloat(jTextField1.getText());
         y2=Float.parseFloat(jTextField2.getText());
         m2=Float.parseFloat(jTextField3.getText());
         n2=jTextField10.getText();
         t2=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb2 = Float.valueOf(cb.toString());
         tb2=Float.parseFloat(jTextField6.getText());
         ub2=Float.parseFloat(jTextField7.getText());
         sd2=Float.parseFloat(jTextField4.getText());
         tl2=Float.parseFloat(jTextField5.getText());
        }else
                if (click==3){
         x3=Float.parseFloat(jTextField1.getText());
         y3=Float.parseFloat(jTextField2.getText());
         m3=Float.parseFloat(jTextField3.getText());
         n3=jTextField10.getText();
         t3=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb3 = Float.valueOf(cb.toString());
         tb3=Float.parseFloat(jTextField6.getText());
         ub3=Float.parseFloat(jTextField7.getText());
         sd3=Float.parseFloat(jTextField4.getText());
         tl3=Float.parseFloat(jTextField5.getText());
          }else
    if (click==4){
         x4=Float.parseFloat(jTextField1.getText());
         y4=Float.parseFloat(jTextField2.getText());
         m4=Float.parseFloat(jTextField3.getText());
         n4=jTextField10.getText();
         t4=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb4 = Float.valueOf(cb.toString());
         tb4=Float.parseFloat(jTextField6.getText());
         ub4=Float.parseFloat(jTextField7.getText());
         sd4=Float.parseFloat(jTextField4.getText());
         tl4=Float.parseFloat(jTextField5.getText());
          }else
     if (click==5){
         x5=Float.parseFloat(jTextField1.getText());
         y5=Float.parseFloat(jTextField2.getText());
         m5=Float.parseFloat(jTextField3.getText());
         n5=jTextField10.getText();
         t5=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb5 = Float.valueOf(cb.toString());
         tb5=Float.parseFloat(jTextField6.getText());
         ub5=Float.parseFloat(jTextField7.getText());
         sd5=Float.parseFloat(jTextField4.getText());
         tl5=Float.parseFloat(jTextField5.getText());
             }else
                   if (click==6){
          x6=Float.parseFloat(jTextField1.getText());
         y6=Float.parseFloat(jTextField2.getText());
         m6=Float.parseFloat(jTextField3.getText());
         n6=jTextField10.getText();
         t6=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb6 = Float.valueOf(cb.toString());
         tb6=Float.parseFloat(jTextField6.getText());
         ub6=Float.parseFloat(jTextField7.getText());
         sd6=Float.parseFloat(jTextField4.getText());
         tl6=Float.parseFloat(jTextField5.getText());
             }else
                                if (click==7){
         x7=Float.parseFloat(jTextField1.getText());
         y7=Float.parseFloat(jTextField2.getText());
         m7=Float.parseFloat(jTextField3.getText());
         n7=jTextField10.getText();
         t7=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb7 = Float.valueOf(cb.toString());
         tb7=Float.parseFloat(jTextField6.getText());
         ub7=Float.parseFloat(jTextField7.getText());
         sd7=Float.parseFloat(jTextField4.getText());
         tl7=Float.parseFloat(jTextField5.getText());
                 }else if (click==8){
         x8=Float.parseFloat(jTextField1.getText());
         y8=Float.parseFloat(jTextField2.getText());
         m8=Float.parseFloat(jTextField3.getText());
         n8=jTextField10.getText();
         t8=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb8 = Float.valueOf(cb.toString());
         tb8=Float.parseFloat(jTextField6.getText());
         ub8=Float.parseFloat(jTextField7.getText());
         sd8=Float.parseFloat(jTextField4.getText());
         tl8=Float.parseFloat(jTextField5.getText());
             }else
        if (click==9){
         x9=Float.parseFloat(jTextField1.getText());
         y9=Float.parseFloat(jTextField2.getText());
         m9=Float.parseFloat(jTextField3.getText());
         n9=jTextField10.getText();
         t9=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb9 = Float.valueOf(cb.toString());
         tb9=Float.parseFloat(jTextField6.getText());
         ub9=Float.parseFloat(jTextField7.getText());
         sd9=Float.parseFloat(jTextField4.getText());
         tl9=Float.parseFloat(jTextField5.getText());
                 }else if (click==10){
         x10=Float.parseFloat(jTextField1.getText());
         y10=Float.parseFloat(jTextField2.getText());
         m10=Float.parseFloat(jTextField3.getText());
         n10=jTextField10.getText();
         t10=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb10 = Float.valueOf(cb.toString());
         tb10=Float.parseFloat(jTextField6.getText());
         ub10=Float.parseFloat(jTextField7.getText());
         sd10=Float.parseFloat(jTextField4.getText());
         tl10=Float.parseFloat(jTextField5.getText());
                 }else if (click==11){
         x11=Float.parseFloat(jTextField1.getText());
         y11=Float.parseFloat(jTextField2.getText());
         m11=Float.parseFloat(jTextField3.getText());
         n11=jTextField10.getText();
         t11=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb11 = Float.valueOf(cb.toString());
         tb11=Float.parseFloat(jTextField6.getText());
         ub11=Float.parseFloat(jTextField7.getText());
         sd11=Float.parseFloat(jTextField4.getText());
         tl11=Float.parseFloat(jTextField5.getText());
                 }else if (click==12){
          x12=Float.parseFloat(jTextField1.getText());
         y12=Float.parseFloat(jTextField2.getText());
         m12=Float.parseFloat(jTextField3.getText());
         n12=jTextField10.getText();
         t12=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb12 = Float.valueOf(cb.toString());
         tb12=Float.parseFloat(jTextField6.getText());
         ub12=Float.parseFloat(jTextField7.getText());
         sd12=Float.parseFloat(jTextField4.getText());
         tl12=Float.parseFloat(jTextField5.getText());
                }else if (click==13){
         x13=Float.parseFloat(jTextField1.getText());
         y13=Float.parseFloat(jTextField2.getText());
         m13=Float.parseFloat(jTextField3.getText());
         n13=jTextField10.getText();
         t13=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb13 = Float.valueOf(cb.toString());
         tb13=Float.parseFloat(jTextField6.getText());
         ub13=Float.parseFloat(jTextField7.getText());
         sd13=Float.parseFloat(jTextField4.getText());
         tl13=Float.parseFloat(jTextField5.getText());
                 }else if (click==14){
         x14 = Float.parseFloat(jTextField1.getText());
         y14 = Float.parseFloat(jTextField2.getText());
         m14 = Float.parseFloat(jTextField3.getText());
         n14 = jTextField10.getText();
         t14 = Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb14 = Float.valueOf(cb.toString());
         tb14 = Float.parseFloat(jTextField6.getText());
         ub14 = Float.parseFloat(jTextField7.getText());
         sd14 = Float.parseFloat(jTextField4.getText());
         tl14 = Float.parseFloat(jTextField5.getText());
        }else if (click==15){
            x15 = Float.parseFloat(jTextField1.getText());
            y15 = Float.parseFloat(jTextField2.getText());
            m15 = Float.parseFloat(jTextField3.getText());
            n15 = jTextField10.getText();
            t15 = Float.parseFloat(jTextField2.getText());
            Object cb=jComboBox1.getSelectedItem();
            nb15 = Float.valueOf(cb.toString());
            tb15 = Float.parseFloat(jTextField6.getText());
            ub15 = Float.parseFloat(jTextField7.getText());
            sd15 = Float.parseFloat(jTextField4.getText());
            tl15 = Float.parseFloat(jTextField5.getText());
              }else if (click==16){
          x16=Float.parseFloat(jTextField1.getText());
         y16=Float.parseFloat(jTextField2.getText());
         m16=Float.parseFloat(jTextField3.getText());
         n16=jTextField10.getText();
         t16=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb16 = Float.valueOf(cb.toString());
         tb16=Float.parseFloat(jTextField6.getText());
         ub16=Float.parseFloat(jTextField7.getText());
         sd16=Float.parseFloat(jTextField4.getText());
         tl16=Float.parseFloat(jTextField5.getText());
                }else if (click==17){
         x17=Float.parseFloat(jTextField1.getText());
         y17=Float.parseFloat(jTextField2.getText());
         m17=Float.parseFloat(jTextField3.getText());
         n17=jTextField10.getText();
         t17=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb17 = Float.valueOf(cb.toString());
         tb17=Float.parseFloat(jTextField6.getText());
         ub17=Float.parseFloat(jTextField7.getText());
         sd17=Float.parseFloat(jTextField4.getText());
         tl17=Float.parseFloat(jTextField5.getText());
              }else if (click==18){
         x18=Float.parseFloat(jTextField1.getText());
         y18=Float.parseFloat(jTextField2.getText());
         m18=Float.parseFloat(jTextField3.getText());
         n18=jTextField10.getText();
         t18=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb18 = Float.valueOf(cb.toString());
         tb18=Float.parseFloat(jTextField6.getText());
         ub18=Float.parseFloat(jTextField7.getText());
         sd18=Float.parseFloat(jTextField4.getText());
         tl18=Float.parseFloat(jTextField5.getText());
              }else if (click==19){
            x19 = Float.parseFloat(jTextField1.getText());
            y19 = Float.parseFloat(jTextField2.getText());
            m19 = Float.parseFloat(jTextField3.getText());
            n19 = jTextField10.getText();
            t19 = Float.parseFloat(jTextField2.getText());
            Object cb=jComboBox1.getSelectedItem();
            nb19 = Float.valueOf(cb.toString());
            tb19 = Float.parseFloat(jTextField6.getText());
            ub19 = Float.parseFloat(jTextField7.getText());
            sd19 = Float.parseFloat(jTextField4.getText());
            tl19 = Float.parseFloat(jTextField5.getText());
              }else if (click==20){
         x20=Float.parseFloat(jTextField1.getText());
         y20=Float.parseFloat(jTextField2.getText());
         m20=Float.parseFloat(jTextField3.getText());
         n20=jTextField10.getText();
         t20=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb20 = Float.valueOf(cb.toString());
         tb20=Float.parseFloat(jTextField6.getText());
         ub20=Float.parseFloat(jTextField7.getText());
         sd20=Float.parseFloat(jTextField4.getText());
         tl20=Float.parseFloat(jTextField5.getText());
             }else if (click==21) {
         x21=Float.parseFloat(jTextField1.getText());
         y21=Float.parseFloat(jTextField2.getText());
         m21=Float.parseFloat(jTextField3.getText());
         n21=jTextField10.getText();
         t21=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb21 = Float.valueOf(cb.toString());
         tb21=Float.parseFloat(jTextField6.getText());
         ub21=Float.parseFloat(jTextField7.getText());
         sd21=Float.parseFloat(jTextField4.getText());
         tl21=Float.parseFloat(jTextField5.getText());
               }
         else if (click==22) {
         x22=Float.parseFloat(jTextField1.getText());
         y22=Float.parseFloat(jTextField2.getText());
         m22=Float.parseFloat(jTextField3.getText());
         n22=jTextField10.getText();
         t22=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb22 = Float.valueOf(cb.toString());
         tb22=Float.parseFloat(jTextField6.getText());
         ub22=Float.parseFloat(jTextField7.getText());
         sd22=Float.parseFloat(jTextField4.getText());
         tl22=Float.parseFloat(jTextField5.getText());
               }
         else if (click==23) {
         x23=Float.parseFloat(jTextField1.getText());
         y23=Float.parseFloat(jTextField2.getText());
         m23=Float.parseFloat(jTextField3.getText());
         n23=jTextField10.getText();
         t23=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb23 = Float.valueOf(cb.toString());
         tb23=Float.parseFloat(jTextField6.getText());
         ub23=Float.parseFloat(jTextField7.getText());
         sd23=Float.parseFloat(jTextField4.getText());
         tl23=Float.parseFloat(jTextField5.getText());
               }
         else if (click==24) {
         x24=Float.parseFloat(jTextField1.getText());
         y24=Float.parseFloat(jTextField2.getText());
         m24=Float.parseFloat(jTextField3.getText());
         n24=jTextField10.getText();
         t24=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb24 = Float.valueOf(cb.toString());
         tb24=Float.parseFloat(jTextField6.getText());
         ub=Float.parseFloat(jTextField7.getText());
         sd=Float.parseFloat(jTextField4.getText());
         tl=Float.parseFloat(jTextField5.getText());
               }else if (click==25) {
         x25=Float.parseFloat(jTextField1.getText());
         y25=Float.parseFloat(jTextField2.getText());
         m25=Float.parseFloat(jTextField3.getText());
         n25=jTextField10.getText();
         t25=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb25 = Float.valueOf(cb.toString());
         tb25=Float.parseFloat(jTextField6.getText());
         ub25=Float.parseFloat(jTextField7.getText());
         sd25=Float.parseFloat(jTextField4.getText());
         tl25=Float.parseFloat(jTextField5.getText());
               }
         else if (click==26) {
         x26=Float.parseFloat(jTextField1.getText());
         y26=Float.parseFloat(jTextField2.getText());
         m26=Float.parseFloat(jTextField3.getText());
         n26=jTextField10.getText();
         t26=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb26 = Float.valueOf(cb.toString());
         tb26=Float.parseFloat(jTextField6.getText());
         ub26=Float.parseFloat(jTextField7.getText());
         sd26=Float.parseFloat(jTextField4.getText());
         tl26=Float.parseFloat(jTextField5.getText());
               }
         else if (click==27) {
         x27=Float.parseFloat(jTextField1.getText());
         y27=Float.parseFloat(jTextField2.getText());
         m27=Float.parseFloat(jTextField3.getText());
         n27=jTextField10.getText();
         t27=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb27 = Float.valueOf(cb.toString());
         tb27=Float.parseFloat(jTextField6.getText());
         ub27=Float.parseFloat(jTextField7.getText());
         sd27=Float.parseFloat(jTextField4.getText());
         tl27=Float.parseFloat(jTextField5.getText());
               }
         else if (click==28) {
         x28=Float.parseFloat(jTextField1.getText());
         y28=Float.parseFloat(jTextField2.getText());
         m28=Float.parseFloat(jTextField3.getText());
         n28=jTextField10.getText();
         t28=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb28 = Float.valueOf(cb.toString());
         tb28=Float.parseFloat(jTextField6.getText());
         ub28=Float.parseFloat(jTextField7.getText());
         sd28=Float.parseFloat(jTextField4.getText());
         tl28=Float.parseFloat(jTextField5.getText());
               }
         else if (click==29) {
         x29=Float.parseFloat(jTextField1.getText());
         y29=Float.parseFloat(jTextField2.getText());
         m29=Float.parseFloat(jTextField3.getText());
         n29=jTextField10.getText();
         t29=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb29 = Float.valueOf(cb.toString());
         tb29=Float.parseFloat(jTextField6.getText());
         ub29=Float.parseFloat(jTextField7.getText());
         sd29=Float.parseFloat(jTextField4.getText());
         tl29=Float.parseFloat(jTextField5.getText());
               }
         else if (click==30) {
         x30=Float.parseFloat(jTextField1.getText());
         y30=Float.parseFloat(jTextField2.getText());
         m30=Float.parseFloat(jTextField3.getText());
         n30=jTextField10.getText();
         t30=Float.parseFloat(jTextField2.getText());
         Object cb=jComboBox1.getSelectedItem();
         nb30 = Float.valueOf(cb.toString());
         tb30=Float.parseFloat(jTextField6.getText());
         ub30=Float.parseFloat(jTextField7.getText());
         sd30=Float.parseFloat(jTextField4.getText());
         tl30=Float.parseFloat(jTextField5.getText());
               }
        //click++;
        }
           click++;
          i++; 
                   
    }                                     
   
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration                   

    public Graph<String,String>  readNet() {
        // Graph<V, E> where V is the type of the vertices
        // and E is the type of the edges
              Graph<String,String> g2=new  SparseMultigraph<String, String>();
             
              for(int i = 0;i<=nvertex;i++)
              {
                  g2.addVertex(""+i);
              }
     
              return g2;
         }
}

}


