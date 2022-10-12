package java09;

class  Caaa       
{
   private static double pi=3.14;
   private double radius;

   public Caaa(double r)       
   {
      radius=r;
   }
   public void show()
   {
      System.out.println("area="+pi*radius*radius);
   }
}
public class Class16
{
   public static void main(String args[])
   {
      Caaa cir[];
      cir=new Caaa[3];
      cir[0]=new Caaa(1.0);
      cir[1]=new Caaa(4.0);
      cir[2]=new Caaa(2.0);

      cir[0].show();   
      cir[1].show();   
      cir[2].show();   
   }
}
