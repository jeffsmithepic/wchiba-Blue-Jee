
public class glooploop
{
    public static void main(){
        int a=0;
        int b=0;
        int c=0;
        int square1;
        int square2;
        int square3;
        int i=0;

        while(i<500){
            i++;
            a++;
            b=150;
            c=150;
         for(int u=0;u<500;u++){
            b++;
            c=150;
         for(int e=0;e<500;e++){
            c++;
 
                 if((a+b+c)==1000){
                     System.out.println(a+" "+b+" "+c);
                     square1=a*a;
                     square2=b*b;
                     square3=c*c;
                     //System.out.println(square3-square2-square1);
                               // System.out.println(i);
                     if((square3-square2-square1)==0){
                         System.out.println("The numbers are:");
                         System.out.println(a+" "+b+" "+c+"");
                         
                         return;
}
}
}
}
}
}
}

