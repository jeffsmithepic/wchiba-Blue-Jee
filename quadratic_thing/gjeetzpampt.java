import java.lang.Math;
public class gjeetzpampt
{
    public static void main(){
    String[] firstNames = {"Jimothy","Jeffson","Zamuel","Mannuelson","Johnman","Creeper","xXx_Yeetman_xXx","fat","Hriday","Ninja","Obama"};
    String[] lastNames = {"Njeet","Jeremite","Egg","Ree","Aweman"};
    System.out.println("First Name\tLast Name");
    for(int i=0; i<10; i++){
        double rand = Math.random()*5;
        rand = Math.round(rand);
        System.out.print(firstNames[i]+"\t");
        if(rand==0){
            System.out.println(lastNames[0]);
}
else if(rand==1){
    System.out.println(lastNames[1]);
}
else if(rand==2){
    System.out.println(lastNames[2]);
}
else if(rand==3){
    System.out.println(lastNames[3]);
}
else if(rand==4){
    System.out.println(lastNames[4]);
}
}
}
}