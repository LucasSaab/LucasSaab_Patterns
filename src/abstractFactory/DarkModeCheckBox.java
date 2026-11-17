package abstractFactory;

public class DarkModeCheckBox implements Checkbox{
    @Override
    public void render() {
        System.out.println("Renderizando Checkbox com tema escuro");
    }
}
