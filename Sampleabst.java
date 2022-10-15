public class Sampleabst extends Helloabst {

    void onText(String text){

        System.out.println("hai broo");

    }
     Sampleabst(){

        Textscanner t=new Textscanner(this);
        t.scan();

     }
    public static void main(String[] args) {
        
        Sampleabst s=new Sampleabst();
    }
}
    
