
import java.awt.geom.Point2D;

public class Point2DImpl extends Point2D {
        
double x,y;
       

        public Point2DImpl() {
            this.x=x;
            this.y=y;
                 }

        public Point2DImpl(double d, double d0) {
this.x=d;
        this.y=d0;}
            
            
            
                   
@Override
         public double getX() {
            return x;
        }

      
@Override
        public double getY() {
            return y;}
        
     
@Override
        public void setLocation(double d, double d1) {
            d=getX();
            d1=getY();
        }
    }
