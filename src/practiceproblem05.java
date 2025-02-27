class CAR{
    private String owner;
    private String brand;
    private String serialno;
    private double fuel;
    private boolean isrunning;
    public CAR(String owner,String brand,String serialno,double fuel)
    {
        this.owner=owner;
        this.brand=brand;
        this.serialno=serialno;
        this.fuel=fuel;
        this.isrunning=false;
    }
    public void start(){
        if(fuel>0)
        {
            isrunning=true;
            System.out.println(brand+"is running");
        }
        else
            System.out.println("cannot run");
    }
    public void stop()
    {
        if(isrunning) {
            isrunning = false;
            System.out.println(brand+" stopped");
        }
        else
            System.out.println(brand+" is already stopped");
    }
    public void checkfuel()
    {
        System.out.println("fuel: "+fuel+" litres");
    }
    void display()
    {
        System.out.println("Owner: " + owner);
        System.out.println("Brand: " + brand);
        System.out.println("Serial Number: " + serialno);
        System.out.println("Fuel Level: " + fuel + " liters");
        System.out.println("Status: " + (isrunning ? "Running" : "Stopped"));
    }
}
public class practiceproblem05 {
    public static void main(String[]args)
    {
        CAR mycar=new CAR("me","toyota","12817D",20);
        mycar.display();
        mycar.checkfuel();
        mycar.start();
        mycar.stop();
    }
}
