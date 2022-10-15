public class SuperB extends SuperA{
  
    int b;
    SuperB(){
        System.out.println("it is b constructor");
    } 
    SuperB(int a,int b){
        System.out.println("it is  argumebt b");
    }

   // void display(){
     //   System.out.println("it 's: b");
       // b=4;
        //super.a=322;
        //int c=b+super.a;
        //System.out.println("c "+c);
    //}

        void basedisplay(){
            super.display();
        }
    
        public static void main(String[] args) {
            
             SuperB b=new SuperB(10,54);
           // b.display();
         //    b.basedisplay();
        }
    }

//first call as parent class default argument then call baseclass
//constructor