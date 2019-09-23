

public class Student
{
    private String name;
    private int grade;
    
    public Student(String n, int g)
    {
        this.name=n;
        this.grade=g; 
    }
    public Student()
    {
        this.name = null;
        this.grade = 0;
    }
    public int getGrade()
    {
        return this.grade;
    }
    public String getName()
    {
        return this.name;
    }
   
}
