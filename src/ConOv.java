class person{
    private String name;
    private int age;
    public person()
    {
        this.name="janina";
        this.age=0;
    }
    public person(String name)
    {
        this.name=name;
        this.age=0;
    }
    public person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void display()
    {
        System.out.println("name: "+name+", age:" +age);
    }
}
public class ConOv {
    public static void main(String[] args)
    {
        person person1=new person();
        person person2=new person("Raisu");
        person person3=new person("Raisuu",20);
        person1.display();
        person2.display();
        person3.display();

    }
}
