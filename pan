/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
*/
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class pan extends JPanel implements ActionListener {
     public float x1=Frame.x,y1=Frame.y,vx=Frame.m;
    private static float a=Frame.x,a1=Frame.x1,a2=Frame.x2,a3=Frame.x3,a4=Frame.x4,a5=Frame.x5,a6=Frame.x6,a7=Frame.x7,a8=Frame.x8,a9=Frame.x9,a10=Frame.x10,a11=Frame.x11,a12=Frame.x12,a13=Frame.x13,a14=Frame.x14,a15=Frame.x15,a16=Frame.x16,a17=Frame.x17,a18=Frame.x18,a19=Frame.x19,a20=Frame.x20,a21=Frame.x21,a22=Frame.x22,a23=Frame.x23,a24=Frame.x24,a25=Frame.x25,a26=Frame.x26,a27=Frame.x27,a28=Frame.x28,a29=Frame.x29,a30=Frame.x30,ad=Frame.xd;
    private static float b=Frame.y,b1=Frame.y1,b2=Frame.y2,b3=Frame.y3,b4=Frame.y4,b5=Frame.y5,b6=Frame.y6,b7=Frame.y7,b8=Frame.y8,b9=Frame.y9,b10=Frame.y10,b11=Frame.y11,b12=Frame.y12,b13=Frame.y13,b14=Frame.y14,b15=Frame.y15,b16=Frame.y16,b17=Frame.y17,b18=Frame.y18,b19=Frame.y19,b20=Frame.y20,b21=Frame.y21,b22=Frame.y22,b23=Frame.y23,b24=Frame.y24,b25=Frame.y25,b26=Frame.y26,b27=Frame.y27,b28=Frame.y28,b29=Frame.y29,b30=Frame.y30,bd=Frame.yd;
   // private static float a=50,a1=70,a2=120,a3=210,a4=90,a5=20,a6=90,a7=150,a8=100,a9=40,a10=210,a11=250,a12=170,a13=200,a14=290,a15=80,a16=250,a17=165,a18=300,a19=120,a20=40,a21=160,a22=170,a23=70,a24=80,a25=210,a26=230,a27=260,a28=310,a29=290,a30=265,ad=215;
    //private static float b=90,b1=120,b2=120,b3=110,b4=70,b5=70,b6=90,b7=50,b8=140,b9=100,b10=150,b11=140,b12=65,b13=130,b14=140,b15=40,b16=65,b17=135,b18=250,b19=280,b20=210,b21=225,b22=180,b23=160,b24=210,b25=300,b26=240,b27=170,b28=190,b29=100,b30=125,bd=45;
    private static float r=Frame.t,r1=Frame.t1,r2=Frame.t2,r3=Frame.t3,r4=Frame.t4,r5=Frame.t5,r6=Frame.t6,r7=Frame.t7,r8=Frame.t8,r9=Frame.t9,r10=Frame.t10,r11=Frame.t11,r12=Frame.t12,r13=Frame.t13,r14=Frame.t14,r15=Frame.t15,r16=Frame.t16,r17=Frame.t17,r18=Frame.t18,r19=Frame.t19,r20=Frame.t20,r21=Frame.t21,r22=Frame.t22,r23=Frame.t23,r24=Frame.t24,r25=Frame.t25,r26=Frame.t26,r27=Frame.t27,r28=Frame.t28,r29=Frame.t29,r30=Frame.t30,rd=Frame.td;
    public String nn=Frame.n,nn1=Frame.n1,nn2=Frame.n2,nn3=Frame.n3,nn4=Frame.n4,nn5=Frame.n5,nn6=Frame.n6,nn7=Frame.n7,nn8=Frame.n8,nn9=Frame.n9,nn10=Frame.n10,nn11=Frame.n11,nn12=Frame.n12,nn13=Frame.n13,nn14=Frame.n14,nn15=Frame.n15,nn16=Frame.n16,nn17=Frame.n17,nn18=Frame.n18,nn19=Frame.n19,nn20=Frame.n20,nn21=Frame.n21,nn22=Frame.n22,nn23=Frame.n23,nn24=Frame.n24,nn25=Frame.n25,nn26=Frame.n26,nn27=Frame.n27,nn28=Frame.n28,nn29=Frame.n29,nn30=Frame.n30,nnd=Frame.nd;
    private static float s=Frame.m,s1=Frame.m1,s2=Frame.m2,s3=Frame.m3,s4=Frame.m4,s5=Frame.m5,s6=Frame.m6,s7=Frame.m7,s8=Frame.m8,s9=Frame.m9,s10=Frame.m10,s11=Frame.m11,s12=Frame.m12,s13=Frame.m13,s14=Frame.m14,s15=Frame.m15,s16=Frame.m16,s17=Frame.m17,s18=Frame.m18,s19=Frame.m19,s20=Frame.m20,s21=Frame.m21,s22=Frame.m22,s23=Frame.m23,s24=Frame.m24,s25=Frame.m25,s26=Frame.m26,s27=Frame.m27,s28=Frame.m28,s29=Frame.m29,s30=Frame.m30,sd=Frame.md;
    private static float sr=Frame.sd,sr1=Frame.sd1,sr2=Frame.sd2,sr3=Frame.sd3,sr4=Frame.sd4,sr5=Frame.sd5,sr6=Frame.sd6,sr7=Frame.sd7,sr8=Frame.sd8,sr9=Frame.sd9,sr10=Frame.sd10,sr11=Frame.sd11,sr12=Frame.sd12,sr13=Frame.sd13,sr14=Frame.sd14,sr15=Frame.sd15,sr16=Frame.sd16,sr17=Frame.sd17,sr18=Frame.sd18,sr19=Frame.sd19,sr20=Frame.sd20,sr21=Frame.sd21,sr22=Frame.sd22,sr23=Frame.sd23,sr24=Frame.sd24,sr25=Frame.sd25,sr26=Frame.sd26,sr27=Frame.sd27,sr28=Frame.sd28,sr29=Frame.sd29,sr30=Frame.sd30,srd=Frame.sdd;
    
    Timer t= new Timer(10,this);
   JButton w=new JButton("N");
   
  

    public void paintComponent(Graphics g){
        if( Frame.nnode==10) {
        super.paintComponent(g);
       Graphics2D g2=(Graphics2D) g;
       
       Ellipse2D circle=new Ellipse2D.Float(a,b,20,20);
        g2.setColor(Color.GREEN);
        g2.fill(circle);
        g2.setColor(Color.black);
        g2.drawString(nn,a+7, b+13);
        Ellipse2D circle1=new Ellipse2D.Float(a1,b1,20,20);
        g2.setColor(Color.red);
        g2.fill(circle1);
        g2.setColor(Color.black);
        g2.drawString(nn1,a1+7, b1+13);
          //drawArrowLine(g2,(int)x1+16,(int)y1+16,(int)a+7,(int)b+7);
        Ellipse2D circle2=new Ellipse2D.Float(a2,b2,20,20);
        g2.setColor(Color.red);
        g2.fill(circle2);
        g2.setColor(Color.black);
        g2.drawString(nn2,a2+7, b2+13);
        Ellipse2D circle3=new Ellipse2D.Float(a3,b3,20,20);
        g2.setColor(Color.red);
        g2.fill(circle3);
        g2.setColor(Color.black);
        g2.drawString(nn3,a3+7, b3+13);
        Ellipse2D circle4=new Ellipse2D.Float(a4,b4,20,20);
        g2.setColor(Color.red);
        g2.fill(circle4);
        g2.setColor(Color.black);
        g2.drawString(nn4,a4+7, b4+13);
        Ellipse2D circle5=new Ellipse2D.Float(a5,b5,20,20);
        g2.setColor(Color.red);
        g2.fill(circle5);
        g2.setColor(Color.black);
        g2.drawString(nn5,a5+7, b5+13);
        Ellipse2D circle6=new Ellipse2D.Float(a6,b6,20,20);
        g2.setColor(Color.red);
        g2.fill(circle6);
        g2.setColor(Color.black);
        g2.drawString(nn6,a6+7, b6+13);
        Ellipse2D circle7=new Ellipse2D.Float(a7,b7,20,20);
        g2.setColor(Color.red);
        g2.fill(circle7);
        g2.setColor(Color.black);
        g2.drawString(nn7,a7+7, b7+13);
        Ellipse2D circle8=new Ellipse2D.Float(a8,b8,20,20);
        g2.setColor(Color.red);
        g2.fill(circle8);
        g2.setColor(Color.black);
        g2.drawString(nn8,a8+7, b8+13);
        Ellipse2D circle9=new Ellipse2D.Float(a9,b9,20,20);
        g2.setColor(Color.red);
        g2.fill(circle9);
        g2.setColor(Color.black);
        g2.drawString(nn9,a9+7, b9+13); 
        Ellipse2D circle10=new Ellipse2D.Float(a10,b10,20,20);
        g2.setColor(Color.GREEN);
        g2.fill(circle10);
        g2.setColor(Color.black);
        g2.drawString(nn10,a10+7, b10+13); 
        t.start();
        }
        else
            if( Frame.nnode==20) {
        super.paintComponent(g);
       Graphics2D g2=(Graphics2D) g;
       
       Ellipse2D circle=new Ellipse2D.Float(a,b,20,20);
        g2.setColor(Color.GREEN);
        g2.fill(circle);
        g2.setColor(Color.black);
        g2.drawString(nn,a+7, b+13);
        Ellipse2D circle1=new Ellipse2D.Float(a1,b1,20,20);
        g2.setColor(Color.red);
        g2.fill(circle1);
        g2.setColor(Color.black);
        g2.drawString(nn1,a1+7, b1+13);
          //drawArrowLine(g2,(int)x1+16,(int)y1+16,(int)a+7,(int)b+7);
        Ellipse2D circle2=new Ellipse2D.Float(a2,b2,20,20);
        g2.setColor(Color.red);
        g2.fill(circle2);
        g2.setColor(Color.black);
        g2.drawString(nn2,a2+7, b2+13);
        Ellipse2D circle3=new Ellipse2D.Float(a3,b3,20,20);
        g2.setColor(Color.red);
        g2.fill(circle3);
        g2.setColor(Color.black);
        g2.drawString(nn3,a3+7, b3+13);
        Ellipse2D circle4=new Ellipse2D.Float(a4,b4,20,20);
        g2.setColor(Color.red);
        g2.fill(circle4);
        g2.setColor(Color.black);
        g2.drawString(nn4,a4+7, b4+13);
        Ellipse2D circle5=new Ellipse2D.Float(a5,b5,20,20);
        g2.setColor(Color.red);
        g2.fill(circle5);
        g2.setColor(Color.black);
        g2.drawString(nn5,a5+7, b5+13);
        Ellipse2D circle6=new Ellipse2D.Float(a6,b6,20,20);
        g2.setColor(Color.red);
        g2.fill(circle6);
        g2.setColor(Color.black);
        g2.drawString(nn6,a6+7, b6+13);
        Ellipse2D circle7=new Ellipse2D.Float(a7,b7,20,20);
        g2.setColor(Color.red);
        g2.fill(circle7);
        g2.setColor(Color.black);
        g2.drawString(nn7,a7+7, b7+13);
        Ellipse2D circle8=new Ellipse2D.Float(a8,b8,20,20);
        g2.setColor(Color.red);
        g2.fill(circle8);
        g2.setColor(Color.black);
        g2.drawString(nn8,a8+7, b8+13);
        Ellipse2D circle9=new Ellipse2D.Float(a9,b9,20,20);
        g2.setColor(Color.red);
        g2.fill(circle9);
        g2.setColor(Color.black);
        g2.drawString(nn9,a9+7, b9+13); 
        Ellipse2D circle10=new Ellipse2D.Float(a10,b10,20,20);
        g2.setColor(Color.red);
        g2.fill(circle10);
        g2.setColor(Color.black);
        g2.drawString(nn10,a10+7, b10+13);
        Ellipse2D circle11=new Ellipse2D.Float(a11,b11,20,20);
        g2.setColor(Color.red);
        g2.fill(circle11);
        g2.setColor(Color.black);
        g2.drawString(nn11,a11+7, b11+13);
        Ellipse2D circle12=new Ellipse2D.Float(a12,b12,20,20);
        g2.setColor(Color.red);
        g2.fill(circle12);
        g2.setColor(Color.black);
        g2.drawString(nn12,a12+7, b12+13);
        Ellipse2D circle13=new Ellipse2D.Float(a13,b13,20,20);
        g2.setColor(Color.red);
        g2.fill(circle13);
        g2.setColor(Color.black);
        g2.drawString(nn13,a13+7, b13+13);
        Ellipse2D circle14=new Ellipse2D.Float(a14,b14,20,20);
        g2.setColor(Color.red);
        g2.fill(circle14);
        g2.setColor(Color.black);
        g2.drawString(nn14,a14+7, b14+13);
        Ellipse2D circle15=new Ellipse2D.Float(a15,b15,20,20);
        g2.setColor(Color.red);
        g2.fill(circle15);
        g2.setColor(Color.black);
        g2.drawString(nn15,a15+7, b15+13);
        Ellipse2D circle16=new Ellipse2D.Float(a16,b16,20,20);
        g2.setColor(Color.red);
        g2.fill(circle16);
        g2.setColor(Color.black);
        g2.drawString(nn16,a16+7, b16+13);
        Ellipse2D circle17=new Ellipse2D.Float(a17,b17,20,20);
        g2.setColor(Color.red);
        g2.fill(circle17);
        g2.setColor(Color.black);
        g2.drawString(nn17,a17+7, b17+13);
        Ellipse2D circle18=new Ellipse2D.Float(a18,b18,20,20);
        g2.setColor(Color.red);
        g2.fill(circle18);
        g2.setColor(Color.black);
        g2.drawString(nn18,a18+7, b18+13);
        Ellipse2D circle19=new Ellipse2D.Float(a19,b19,20,20);
        g2.setColor(Color.red);
        g2.fill(circle19);
        g2.setColor(Color.black);
        g2.drawString(nn19,a19+7, b19+13);
        Ellipse2D circle20=new Ellipse2D.Float(a20,b20,20,20);
        g2.setColor(Color.GREEN);
        g2.fill(circle20);
        g2.setColor(Color.black);
        g2.drawString(nn20,a20+7, b20+13);
        t.start();
            }
        else
        if( Frame.nnode==30) {
        super.paintComponent(g);
       Graphics2D g2=(Graphics2D) g;
       
       Ellipse2D circle=new Ellipse2D.Float(a,b,20,20);
        g2.setColor(Color.GREEN);
        g2.fill(circle);
        g2.setColor(Color.black);
        g2.drawString(nn,a+7, b+13);
        Ellipse2D circle1=new Ellipse2D.Float(a1,b1,20,20);
        g2.setColor(Color.red);
        g2.fill(circle1);
        g2.setColor(Color.black);
        g2.drawString(nn1,a1+7, b1+13);
        Ellipse2D circle2=new Ellipse2D.Float(a2,b2,20,20);
        g2.setColor(Color.red);
        g2.fill(circle2);
        g2.setColor(Color.black);
        g2.drawString(nn2,a2+7, b2+13);
        Ellipse2D circle3=new Ellipse2D.Float(a3,b3,20,20);
        g2.setColor(Color.red);
        g2.fill(circle3);
        g2.setColor(Color.black);
        g2.drawString(nn3,a3+7, b3+13);
        Ellipse2D circle4=new Ellipse2D.Float(a4,b4,20,20);
        g2.setColor(Color.red);
        g2.fill(circle4);
        g2.setColor(Color.black);
        g2.drawString(nn4,a4+7, b4+13);
        Ellipse2D circle5=new Ellipse2D.Float(a5,b5,20,20);
        g2.setColor(Color.red);
        g2.fill(circle5);
        g2.setColor(Color.black);
        g2.drawString(nn5,a5+7, b5+13);
        Ellipse2D circle6=new Ellipse2D.Float(a6,b6,20,20);
        g2.setColor(Color.red);
        g2.fill(circle6);
        g2.setColor(Color.black);
        g2.drawString(nn6,a6+7, b6+13);
        Ellipse2D circle7=new Ellipse2D.Float(a7,b7,20,20);
        g2.setColor(Color.red);
        g2.fill(circle7);
        g2.setColor(Color.black);
        g2.drawString(nn7,a7+7, b7+13);
        Ellipse2D circle8=new Ellipse2D.Float(a8,b8,20,20);
        g2.setColor(Color.red);
        g2.fill(circle8);
        g2.setColor(Color.black);
        g2.drawString(nn8,a8+7, b8+13);
        Ellipse2D circle9=new Ellipse2D.Float(a9,b9,20,20);
        g2.setColor(Color.red);
        g2.fill(circle9);
        g2.setColor(Color.black);
        g2.drawString(nn9,a9+7, b9+13); 
        Ellipse2D circle10=new Ellipse2D.Float(a10,b10,20,20);
        g2.setColor(Color.red);
        g2.fill(circle10);
        g2.setColor(Color.black);
        g2.drawString(nn10,a10+7, b10+13);
        Ellipse2D circle11=new Ellipse2D.Float(a11,b11,20,20);
        g2.setColor(Color.red);
        g2.fill(circle11);
        g2.setColor(Color.black);
        g2.drawString(nn11,a11+7, b11+13);
        Ellipse2D circle12=new Ellipse2D.Float(a12,b12,20,20);
        g2.setColor(Color.red);
        g2.fill(circle12);
        g2.setColor(Color.black);
        g2.drawString(nn12,a12+7, b12+13);
        Ellipse2D circle13=new Ellipse2D.Float(a13,b13,20,20);
        g2.setColor(Color.red);
        g2.fill(circle13);
        g2.setColor(Color.black);
        g2.drawString(nn13,a13+7, b13+13);
        Ellipse2D circle14=new Ellipse2D.Float(a14,b14,20,20);
        g2.setColor(Color.red);
        g2.fill(circle14);
        g2.setColor(Color.black);
        g2.drawString(nn14,a14+7, b14+13);
        Ellipse2D circle15=new Ellipse2D.Float(a15,b15,20,20);
        g2.setColor(Color.red);
        g2.fill(circle15);
        g2.setColor(Color.black);
        g2.drawString(nn15,a15+7, b15+13);
        Ellipse2D circle16=new Ellipse2D.Float(a16,b16,20,20);
        g2.setColor(Color.red);
        g2.fill(circle16);
        g2.setColor(Color.black);
        g2.drawString(nn16,a16+7, b16+13);
        Ellipse2D circle17=new Ellipse2D.Float(a17,b17,20,20);
        g2.setColor(Color.red);
        g2.fill(circle17);
        g2.setColor(Color.black);
        g2.drawString(nn17,a17+7, b17+13);
        Ellipse2D circle18=new Ellipse2D.Float(a18,b18,20,20);
        g2.setColor(Color.red);
        g2.fill(circle18);
        g2.setColor(Color.black);
        g2.drawString(nn18,a18+7, b18+13);
        Ellipse2D circle19=new Ellipse2D.Float(a19,b19,20,20);
        g2.setColor(Color.red);
        g2.fill(circle19);
        g2.setColor(Color.black);
        g2.drawString(nn19,a19+7, b19+13);
        Ellipse2D circle20=new Ellipse2D.Float(a20,b20,20,20);
        g2.setColor(Color.red);
        g2.fill(circle20);
        g2.setColor(Color.black);
        g2.drawString(nn20,a20+7, b20+13);
        Ellipse2D circle21=new Ellipse2D.Float(a21,b21,20,20);
        g2.setColor(Color.red);
        g2.fill(circle21);
        g2.setColor(Color.black);
        g2.drawString(nn21,a21+7, b21+13);
        Ellipse2D circle22=new Ellipse2D.Float(a22,b22,20,20);
        g2.setColor(Color.red);
        g2.fill(circle22);
        g2.setColor(Color.black);
        g2.drawString(nn22,a22+7, b22+13);
        Ellipse2D circle23=new Ellipse2D.Float(a23,b23,20,20);
        g2.setColor(Color.red);
        g2.fill(circle23);
        g2.setColor(Color.black);
        g2.drawString(nn23,a23+7, b23+13);
        Ellipse2D circle24=new Ellipse2D.Float(a24,b24,20,20);
        g2.setColor(Color.red);
        g2.fill(circle24);
        g2.setColor(Color.black);
        g2.drawString(nn24,a24+7, b24+13);
        Ellipse2D circle25=new Ellipse2D.Float(a25,b25,20,20);
        g2.setColor(Color.red);
        g2.fill(circle25);
        g2.setColor(Color.black);
        g2.drawString(nn25,a25+7, b25+13);
        Ellipse2D circle26=new Ellipse2D.Float(a26,b26,20,20);
        g2.setColor(Color.red);
        g2.fill(circle26);
        g2.setColor(Color.black);
        g2.drawString(nn26,a26+7, b26+13);
        Ellipse2D circle27=new Ellipse2D.Float(a27,b27,20,20);
        g2.setColor(Color.red);
        g2.fill(circle27);
        g2.setColor(Color.black);
        g2.drawString(nn27,a27+7, b27+13);
        Ellipse2D circle28=new Ellipse2D.Float(a28,b28,20,20);
        g2.setColor(Color.red);
        g2.fill(circle28);
        g2.setColor(Color.black);
        g2.drawString(nn28,a28+7, b28+13);
        Ellipse2D circle29=new Ellipse2D.Float(a29,b29,20,20);
        g2.setColor(Color.red);
        g2.fill(circle29);
        g2.setColor(Color.black);
        g2.drawString(nn29,a29+7, b29+13);
        Ellipse2D circle30=new Ellipse2D.Float(a30,b30,20,20);
        g2.setColor(Color.GREEN);
        g2.fill(circle30);
        g2.setColor(Color.black);
        g2.drawString(nn30,a30+7, b30+13);
        t.start();
     }
         else
             System.out.print("not run");
    }
     public static void drawArrowLine(Graphics g, int i, int j, int k, int l)
    {
        double d = Math.sqrt((k - i) * (k - i) + (l - j) * (l - j));
        double d1 = (double)(-(k - i)) / (double)(l - j);
        double d2 = 6D / Math.sqrt(1.0D + d1 * d1);
        double d3 = 6D / Math.sqrt(1.0D + 1.0D / d1 / d1);
        if(d1 < 0.0D)
            d3 = -d3;
        double d4 = (double)k - (double)(10 * (k - i)) / d;
        double d5 = (double)l - (double)(10 * (l - j)) / d;
        g.drawLine(i, j, (int)d4, (int)d5);
        int ai[] = {
            (int)(d4 - d2), k, (int)(d4 + d2)
        };
        int ai1[] = {
            (int)(d5 - d3), l, (int)(d5 + d3)
        };
        g.fillPolygon(ai, ai1, 3);
    }

    public void actionPerformed(ActionEvent e){
       
        if(a<0 || a>r && b<0 || b>r)
        {
            s=-s;
        }
        if(a1<0 || a1>r1 && b1<0 || b1>r1)
        {
            s1=-s1;
        }
        if(a2<0 || a2>r2 && b2<0 || b2>r2)
        {
            s2=-s2;
        }
        if(a3<0 || a3>r3 && b3<0 || b3>r3)
        {
            s3=-s3;
        }
        if(a4<0 || a4>r4 && b4<0 || b4>r4)
        {
            s4=-s4;
        }
        if(a5<0 || a5>r5 && b5<0 || b5>r5)
        {
            s5=-s5;
        }
        if(a6<0 || a6>r6 && b6<0 || b6>r6)
        {
            s6=-s6;
        }
        if(a7<0 || a7>r7 && b7<0 || b7>r7)
        {
            s7=-s7;
        }
        if(a8<0 || a8>r8 && b8<0 || b8>r8)
        {
            s8=-s8;
        }
        if(a9<0 || a9>r9 && b9<0 || b9>r9)
        {
            s9=-s9;
        }
        if(a10<0 || a10>r10 && b10<0 || b10>r10)
        {
            s10=-s10;
        }
              
        if(a11<0 || a11>r11 && b11<0 || b11>r11)
        {
            s11=-s11;
        }
        if(a12<0 || a12>r12 && b12<0 || b12>r12)
        {
            s12=-s12;
        }
        if(a13<0 || a13>r13 && b13<0 || b13>r13)
        {
            s13=-s13;
        }
        if(a14<0 || a14>r14 && b14<0 || b14>r14)
        {
            s14=-s14;
        }
        if(a15<0 || a15>r15 && b15<0 || b15>r15)
        {
            s15=-s15;
        }
        if(a16<0 || a16>r16 && b16<0 || b16>r16)
        {
            s16=-s16;
        }
        if(a17<0 || a17>r17 && b17<0 || b17>r17)
        {
            s17=-s17;
        }
        if(a18<0 || a18>r18 && b18<0 || b18>r18)
        {
            s18=-s18;
        }
        if(a19<0 || a19>r19 && b19<0 || b19>r19)
        {
            s19=-s19;
        }
        if(a20<0 || a20>r20 && b20<0 || b20>r20)
        {
            s20=-s20;
        }
        if(a21<0 || a21>r21 && b21<0 || b21>r21)
        {
            s21=-s21;
        }
        if(a22<0 || a22>r22 && b22<0 || b22>r22)
        {
            s22=-s22;
        }
        if(a23<0 || a23>r23 && b23<0 || b23>r23)
        {
            s23=-s23;
        }
        if(a24<0 || a24>r24 && b24<0 || b24>r24)
        {
            s24=-s24;
        }
        if(a25<0 || a25>r25 && b25<0 || b25>r25)
        {
            s25=-s25;
        }
        if(a26<0 || a26>r26 && b26<0 || b26>r26)
        {
            s26=-s26;
        }
        if(a27<0 || a27>r27 && b27<0 || b27>r27)
        {
            s27=-s27;
        }
        if(a28<0 || a28>r28 && b28<0 || b28>r28)
        {
            s28=-s28;
        }
        if(a29<0 || a29>r29 && b29<0 || b29>r29)
        {
            s29=-s29;
        }
        if(a30<0 || a30>r30 && b30<0 || b30>r30)
        {
            s30=-s30;
        }
       
     a+=s;b+=s;a1+=s1; b1+=s1; a2+=s2;b2+=s2; a3+=s3;b3+=s3; a4+=s4;b4+=s4; a5+=s5;b5+=s5;
     a6+=s6;b6+=s6; a7+=s7;b7+=s7; a8+=s8;b8+=s8; a9+=s9;b9+=s9; a10+=s10;b10+=s10;
      a11+=s11;b11+=s11;
     a12+=s12;b12+=s12; a13+=s13;b13+=s13; a14+=s14;b14+=s14; a15+=s15;b15+=s15;
     a16+=s16;b16+=s16; a17+=s17;b17+=s17; a18+=s18;b18+=s18; a19+=s19;b19+=s19; a20+=s20;b20+=s20;
     a21+=s21; b21+=s21; a22+=s22;b22+=s22; a23+=s23;b23+=s23; a24+=s24;b24+=s24; a25+=s25;b25+=s25;
     a26+=s26;b26+=s26; a27+=s27;b27+=s27; a28+=s28;b28+=s28; a29+=s29;b29+=s29; a30+=s30;b30+=s30;
     repaint();
        
     
 }}
