public class Hello {
    public static void main(String a[]) {

        Sample s1=new Sample();
        Sample s2=new Sample();

        s1.a=20;
        s1.b=50;
        s2.a=100;
        s2.b=200;

        s1.display();
        s2.display();
   System.out.println("S1-a :"+s1.a+"   S1-b :"  +s1.b+"  s2.a : "+s2.a+"   s2.b : "+s2.b);


    }
}


