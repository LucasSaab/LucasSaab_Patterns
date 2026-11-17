package abstractFactory;

public class LightModeCheckBox implements Checkbox{
    @Override
    public void render() {
        System.out.println("Renderizando Checkbox com tema claro");
    }
}
