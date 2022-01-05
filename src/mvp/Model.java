package mvp;

public class Model
{
    private String value;
    public Model(String value)
    {
        this.value=value;
    }
    public String getValue()
    {
        return value;
    }
    public void setValue(String value)
    {
        this.value=value;
    }
}