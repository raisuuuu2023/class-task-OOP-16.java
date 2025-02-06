class caar{
    private String license;
    private String model;
    private boolean isavailable;
    public caar(String license,String model){
        this.license=license;
        this.model= model;
        this.isavailable=true;
    }
    public boolean reserve()
    {
        if(isavailable)
        {
            isavailable=false;
            System.out.println("car "+license+" is reserved");
            return true;
        }
        else
        {
            System.out.println("car "+license+" is not reserved");
            return false;
        }
    }
    public void release()
    {
        if(!isavailable)
        {
            isavailable=true;
            System.out.println("car "+license+" has been released and now available");
        }
        else
        {
            System.out.println("car "+license+" is available");
        }
    }
    public boolean isIsavailable()
    {
        return isavailable;
    }

        }
public class car {
    public static void main(String[] args)
    {
        caar car1=new caar("abc-123","toyota corolla");
        caar car2=new caar("xyz-789","honda");
        System.out.println(car1);
        System.out.println(car2);
        car1.reserve();
        car2.reserve();
        car1.release();
        car2.release();
        car2.reserve();

        System.out.println(car2);
        System.out.println(car1);
        System.out.println(car2);
    }
}
