public class Ghost{
    //instance variables for the class Ghost
    private String color;
    private int speed;
    private String food;
    //zero-argument constructor, basically makes a default-ghost
    public Ghost(){
        color=null;
        speed=0;
        System.out.println("OEEEEIIIIAAAAAAAAAAAAAAAA");
    }
    //two-argument-constructor,-can-set-the-instance-variables-to-anything
    public Ghost(String color, int speed, String food){
        this.color=color;
        this.speed=speed;
        this.food=food;
        System.out.println("A unique goiest was constructed");
    }
    //public-means-other-classes-have-acces-to-this-method
    //String-is-the-return-type-of-this-method,-it-gives-back-a-String
    //toString-is-the-name-of-this-method
    public String toString(){
        return "Color:"+this.color+" Speed:"+this.speed+" Favorite Food:"+this.food;
    }

    public void bumpSpeed(){
        this.speed++;
    }

    public void bumpSpeed(int s){
        this.speed+=(s);
    }

    public void doubleColor(){
        this.color = color+" "+color;
    }
    
    public void spicyFood(){
        this.food = "Spicy "+food;
    }
    
}