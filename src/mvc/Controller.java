package mvc;

public class Controller
{
    private View view;
    private Model model;
    public Controller(View view,Model model)
    {
        this.view=view;
        this.model=model;
        model.addPropertyChangeListener(view);
        view.setOnUpdate(this::onUpdate);
    }
    public void start()
    {
        view.show();
    }
    private void onUpdate()
    {
        model.setValue(view.getValue());
    }
}
