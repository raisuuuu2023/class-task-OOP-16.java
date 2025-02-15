class dog {
    private String name;
    private int age;
    private String breed;

    public dog(String name,int age,String breed)
    {
        this.name=name;
        this.age=age;
        this.breed=breed;
    }
    public void bark()
    {
        System.out.println(name+" is barking");
    }
    public void spin()
    {
        System.out.println(name+" is spinning");
    }
    public void run()
    {
        System.out.println(name+" is running");
    }
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Breed: "+breed);
    }
    public static void main(String[] args)
    {
        dog mydog=new dog("Tom",2,"Golden retriever");
        mydog.display();
        mydog.bark();
        mydog.spin();
        mydog.run();
    }
}
