import javax.swing.JOptionPane;
public class stringystuffy
{
   public static void main(){
       
       //String[] classmates = {"jeff", "jeffison", "jeffery", null, "jeffanos"};
       //for(int i=0; i<=classmates.length-1; i++){
       //    if(classmates[i] != null)
       //    System.out.println(classmates[i].length());
       
       String school = JOptionPane.showInputDialog("what is your'are school?:");
       String mascot = JOptionPane.showInputDialog("what is the mascot?:");
       
       if(school.equals("Granada")){
           school = "true";
        }
       else{
           System.out.println("school is WRONG");
        }
       if(mascot.equals("Matadors")){
           mascot = "true";
        }
       else{
           System.out.println("mascot is WRONG");
        }
       
       if(school.equals("true")){
           if(mascot.equals("true")){
              String[] array = {"Spongebob", "Squidward", "Waldo", "Mr. Krabs", "Jonathan"};
              array[4] = null;
              for(int i=0; i<=array.length-1; i++){
                  if(array[i] == null){
                      System.out.println("Area "+i+" is null.");
                    }
                  
                  else if(array[i].equals("Waldo")){
                      System.out.println("Waldo has been captured. He was located at Area "+i+".");
                    }
                  else{
                      System.out.println("Waldo was not found at Area "+i+". We found "+array[i]+" instead.");
                    }
                
            }
            String water = JOptionPane.showInputDialog("favorite drink?");
            if(water.equals("Water")){
                System.out.println("you are a hydrated fellow");         
            }
            else{
                System.out.println("DRINK MORE WATER");
            }
}
}
}
}
