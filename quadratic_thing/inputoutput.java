import javax.swing.JOptionPane;
public class inputoutput
{

    public static void main(){
        //String name = JOptionPane.showInputDialog("what is a");
        int a = Integer.parseInt(JOptionPane.showInputDialog("what is a?"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("what is b?"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("what is c?"));
        boolean i = false;
        //System.out.println("Hello" + name);
        System.out.println("The value of b squared is "+b*b);
        System.out.println("The value of 4ac is "+4*a*c);
        int d = b*b;
        int e = 4*a*c;
        if((d-e)<0){
            i = true;
        }
        
        if(i == false){
            System.out.println("The square root of b squared -4ac is "+Math.sqrt(d-e));
            System.out.println("The first root minus b is "+(-b+Math.sqrt(d-e))/(2*a));
            System.out.println("The second root minus b is "+(-b-Math.sqrt(d-e))/(2*a));
    }
        else{
            System.out.println("the roots are imaginary lol");
            
        }
    System.out.println(i);
}
}