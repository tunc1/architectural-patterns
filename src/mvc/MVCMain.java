package mvc;

public class MVCMain
{
    public static void main(String[] args)
    {
        Controller controller=new Controller(new View(),new Model("0"));
        controller.start();
    }
}