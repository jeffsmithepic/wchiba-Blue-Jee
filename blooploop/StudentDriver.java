import java.lang.Math;

public class StudentDriver
{
    public static void main(){
        int arrayLength = 7;
        String[] olderNames = new String[arrayLength];
        Student[] female=new Student[arrayLength];
        Student[] male=new Student[arrayLength];
        
        female[0]=new Student("Susan",11);
        female[1]=new Student("susan",12);
        female[2]=new Student("suesan",12);
        female[3]=new Student("sussan",13);
        female[4]=new Student(null,10);
        female[5]=new Student("suasn",11);
        female[6]=new Student(null,12);
        
        male[0]=new Student("Jeff",2);
        male[1]=new Student("jeff",525);
        male[2]=new Student("geoff",12);
        male[3]=new Student("jeef",22);
        male[4]=new Student("Jef",2);
        male[5]=new Student(null,155);
        male[6]=new Student(null,14);
        
        int a = 0;
        
        
        for (int i = 0; i < arrayLength; i++)
        {
            if (female[i].getGrade() > male[i].getGrade())
            {
                olderNames[i] = female[i].getName();
            }
            else if (female[i].getGrade() < male[i].getGrade())
            {
                olderNames[i] = male[i].getName();
            }
            else
            {
                if (Math.random()>=0.5)
                {
                    olderNames[i] = male[i].getName();
                }
                else
                {
                    olderNames[i] = female[i].getName();
                }
            }
            if(female[i].getName()==null){
                olderNames[i] = male[i].getName();
            }
            else if(male[i].getName()==null){
                olderNames[i] = female[i].getName();
            }
            if(female[i].getName()==null && male[i].getName()==null){
                olderNames[i] = "Space";
            }
        }
        System.out.println("Female Name\t"+"Grade\t"+"Male Name\t"+"Grade\t"+"Older Student");
        for(int e=0; e<arrayLength; e++){
            System.out.println(female[e].getName()+"\t\t"+female[e].getGrade()+"\t"+male[e].getName()+"\t\t"+male[e].getGrade()+"\t"+olderNames[e]);
        }
        
    }
    
}
