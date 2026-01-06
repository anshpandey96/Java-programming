class Nokia 
{
     private int mic;
     private int cam;
     void setValue()
     {
         mic = 2;
          cam = 40;  
     } 
      void display()
      {
      System.out.println(mic);
      System.out.println(cam);
      }
}
    class classesAndObjects
 {
    public static void main ( String [] args )
    {
         Nokia n1 = new Nokia();
         Nokia n2 = new Nokia();
           n1.setValue();
           n2.setValue();
           n1.display();
           n2.display();
    }

 }
   