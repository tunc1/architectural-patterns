package mvp;

public class MVPMain
{
    public static void main(String[] args)
    {
        Presenter presenter=new Presenter(new View(),new Model("0"));
        presenter.start();
    }
}