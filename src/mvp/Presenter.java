package mvp;

public class Presenter
{
    private View view;
    private Model model;
    public Presenter(View view,Model model)
    {
        this.view=view;
        this.model=model;
        view.setOnUpdate(this::onUpdate);
    }
    public void start()
    {
        view.show();
    }
    private void onUpdate()
    {
        model.setValue(view.getValue());
        view.setValue(model.getValue());
    }
}
