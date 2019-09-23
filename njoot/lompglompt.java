public class lompglompt{
    public static void main(){
        Ghost g1=new Ghost();
        Ghost g2=new Ghost();
        
        Ghost g3=new Ghost("Gjootnreekt", 100, "sand");
        g3.bumpSpeed(100);
        g3.bumpSpeed();
        g3.spicyFood();
        System.out.println(g3.toString());
    }
}