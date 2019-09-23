
public class zlooploop
{
    public static void main(){
        for(int i=0;i<10000000;i++){
        int a = (int)(Math.random()*32);
        int b = (int)(Math.random()*32);
        int c = (int)(Math.random()*32);
        int stupidSum = a*a+b*b+c*c;
        if(stupidSum==1000){
            System.out.println("the numbers are"+a+" "+b+" "+c);
    }
}
}
}