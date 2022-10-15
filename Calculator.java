import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {

    boolean isoperatedClicked=false;

    JFrame jf;
    JLabel displayLabel;
    JButton seveButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton zerobutton;
    JButton equalButton;
    JButton mulButton;
    JButton divButton;
    JButton minusButton;
    JButton plusButton;
    JButton clearButton;
    

    
    String oldValue;
    char operator;   
   
    
    /**
     * 
     */
    public  Calculator()
    {
        jf=new JFrame("CALCULATOR");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300,150);
        
        displayLabel=new JLabel("");
        displayLabel.setBounds(30,20,540,40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.WHITE); 
        jf.add(displayLabel);

       
        seveButton=new JButton("7");
        seveButton.setBounds(30, 120,80, 80);
        seveButton.addActionListener(this);

        seveButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(seveButton); 

        eightButton=new JButton("8");
        eightButton.setBounds(130, 120,80, 80);
        eightButton.addActionListener(this);

        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(eightButton);

        nineButton=new JButton("9");
        nineButton.setBounds(230, 120,80, 80);
        nineButton.addActionListener(this);

        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(nineButton);

        fourButton=new JButton("4");
        fourButton.setBounds(30, 220,80, 80);
        fourButton.addActionListener(this);

        fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(fourButton);

        fiveButton=new JButton("5");
        fiveButton.setBounds(130, 220,80, 80);
        fiveButton.addActionListener(this);

        fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(fiveButton);

        sixButton=new JButton("6");
        sixButton.setBounds(230, 220,80, 80);
        sixButton.addActionListener(this);

        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(sixButton);

        oneButton=new JButton("1");
        oneButton.setBounds(30, 320,80, 80);
       oneButton.addActionListener(this);
           
        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(oneButton);

         twoButton=new JButton("2");
        twoButton.setBounds(130, 320,80, 80);
        twoButton.addActionListener(this);

        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(twoButton);

         threeButton=new JButton("3");
        threeButton.setBounds(230, 320,80, 80);
        threeButton.addActionListener(this);

        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(threeButton);

        dotButton=new JButton(".");
        dotButton.setBounds(30, 420,80, 80);

        dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zerobutton=new JButton("0");
        zerobutton.setBounds(130, 420,80, 80);

        zerobutton.setFont(new Font("Arial", Font.PLAIN, 40));
        zerobutton.addActionListener(this);
        jf.add(zerobutton);

        equalButton=new JButton("=");
        equalButton.setBounds(230, 420,80, 80);

        equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
        equalButton.addActionListener(this);
        jf.add(equalButton);
        
        divButton=new JButton("/");
        divButton.setBounds(330, 120,80, 80);

        divButton.setFont(new Font("Arial", Font.PLAIN, 40));
        divButton.addActionListener(this);
        jf.add(divButton);


        mulButton=new JButton("x");
        mulButton.setBounds(330, 220,80, 80);

        mulButton.setFont(new Font("Arial", Font.PLAIN, 40));
        mulButton.addActionListener(this);
        jf.add(mulButton);

        minusButton=new JButton("-");
        minusButton.setBounds(330, 320,80, 80);

        minusButton.setFont(new Font("Arial", Font.PLAIN, 40));
        minusButton.addActionListener(this);
        jf.add(minusButton);

        plusButton=new JButton("+");
        plusButton.setBounds(330, 420,80, 80);

        plusButton.setFont(new Font("Arial", Font.PLAIN, 40));
        plusButton.addActionListener(this);
        jf.add(plusButton);

        clearButton=new JButton("Clear");
        clearButton.setBounds(430, 420,80, 80);

       // clearButton.setFont(new Font("Arial", , 40));
        clearButton.addActionListener(this);
        jf.add(clearButton);
    
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   public static void main(String[] args) {
        new Calculator();

   }

  @Override
  public void actionPerformed(ActionEvent e) {
    jf.getContentPane().setBackground(Color.BLACK);
    //displayLabel.setText("7");


        if(e.getSource()==seveButton){
        if(isoperatedClicked)  {
       
          displayLabel.setText("7");
          isoperatedClicked=false;
        }else{
          displayLabel.setText(displayLabel.getText()+"7");
        }


      }
      else if(e.getSource()==eightButton)
      { 
        if(isoperatedClicked){
       // displayLabel.setText("8");
       
          displayLabel.setText("8");
          isoperatedClicked=false;
        }else{
          displayLabel.setText(displayLabel.getText()+"8");
        }


      }
      else if(e.getSource()==nineButton){
      //  displayLabel.setText(displayLabel.getText()+"9");
        if(isoperatedClicked)  {
       
          displayLabel.setText("9");
          isoperatedClicked=false;
        }else{
          displayLabel.setText(displayLabel.getText()+"9");
        }


      }else if(e.getSource()==fourButton){
          if(isoperatedClicked)  {
       
          displayLabel.setText("4");
          isoperatedClicked=false;
        }else{
          displayLabel.setText(displayLabel.getText()+"4");
        }


      }else if(e.getSource()==fiveButton){
       
        if(isoperatedClicked)  {
       
          displayLabel.setText("5");
          isoperatedClicked=false;

        }else{
          displayLabel.setText(displayLabel.getText()+"5");
        }

        
      }else if(e.getSource()==sixButton){
        

        if(isoperatedClicked){
          displayLabel.setText("6");
          isoperatedClicked=false;
        }else{
          displayLabel.setText(displayLabel.getText()+"6");
        }

      }else if(e.getSource()==oneButton){
        
        if(isoperatedClicked)  {
       
          displayLabel.setText("1");
          isoperatedClicked=false;
        }else{
          displayLabel.setText(displayLabel.getText()+"1");
        }


      }else if(e.getSource()==twoButton){
        
        if(isoperatedClicked)  {
       
          displayLabel.setText("2");
          isoperatedClicked=false;
        }else{
          displayLabel.setText(displayLabel.getText()+"2");
        }


      }else if(e.getSource()==threeButton){
        
        if(isoperatedClicked)  {
       
          displayLabel.setText("3");
          isoperatedClicked=false;
        }else{
          displayLabel.setText(displayLabel.getText()+"3");
        }


      }else if(e.getSource()==zerobutton){
        
        if(isoperatedClicked)  {
       
          displayLabel.setText("0");
          isoperatedClicked=false;
        }else{
          displayLabel.setText(displayLabel.getText()+"0");
        }


      }else if(e.getSource()==dotButton){
        displayLabel.setText(displayLabel.getText()+".");

      }else if(e.getSource()==equalButton){
        String newValue=displayLabel.getText();

        float oldValueF=Float.parseFloat(oldValue);
        float newValueF=Float.parseFloat(newValue);

      float result=0;
      switch(operator){
        case'+':{
          result=oldValueF+newValueF;
          break;
        }
        case'*':{
          result=oldValueF*newValueF;
          break;
        }
        case'/':{
          result=oldValueF/newValueF;
          break;
        }
        case '-':{
          result=oldValueF-newValueF;
          break;
        }
        default:{
          result=1;
          break;
        }
      }

       displayLabel.setText(result+"");
       
      }else if(e.getSource()==plusButton){
          operator='+';
         isoperatedClicked=true;
         oldValue=displayLabel.getText();

      } else if(e.getSource()==mulButton){
        operator='*';
         isoperatedClicked=true;
         oldValue=displayLabel.getText();
        
      }else if(e.getSource()==divButton){
        operator='/';
         isoperatedClicked=true;
         oldValue=displayLabel.getText();
        
      }else if(e.getSource()==minusButton){
        operator='-';
         isoperatedClicked=true;
         oldValue=displayLabel.getText();
         
      }
         else if(e.getSource()==clearButton){
          displayLabel.setText("");

  }
}
}