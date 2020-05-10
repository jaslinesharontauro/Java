import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FibonacciSwing extends JFrame implements ActionListener  {
    
    JButton jb1;
    JTextField jt1, jt2;
    JLabel lb1,lb2;

    FibonacciSwing() {
           
        lb1 = new JLabel("Enter the limit:");
        lb1.setBounds(10, 50, 150, 30);
        add(lb1);


        jt1 = new JTextField();
        jt1.setBounds(100, 50, 150, 30);
        add(jt1);

        lb2 = new JLabel("Result :");
        lb2.setBounds(100, 140, 150, 30);
        add(lb2);

        jb1 = new JButton("Calculate Fibonacci series");
        jb1.setBounds(100, 200, 200, 30);
        add(jb1);

        jb1.addActionListener(this);

        jt2 = new JTextField();
        jt2.setBounds(10, 280, 350, 30);
        add(jt2);
        
        setLayout(null);
        setSize(400, 400);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(jt1.getText());
        String s="";
         int n1=0,n2=1,n3,i;  
         if(a<=0)
             jt2.setText("Enter a positive value");
         else if(a==1)
              jt2.setText(String.valueOf(n1));
         else
         {
            jt2.setText(String.valueOf(n1)+ " " + String.valueOf(n2)); 
         for(i=2;i<a;++i)  
        {    
            n3=n1+n2;    
            
            n1=n2;    
            n2=n3; 
            s=jt2.getText();
            jt2.setText(s + "   " +String.valueOf(n3));
        }  
           
         }
    }

    public static void main(String args[]) {
         FibonacciSwing obj = new  FibonacciSwing();
    }
}

