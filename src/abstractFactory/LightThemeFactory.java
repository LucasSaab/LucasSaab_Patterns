package abstractFactory;

public class LightThemeFactory implements UIComponentFactory{
    @Override
    public Button criarBotao() {
        return new LightModeButton();
    }

    @Override
    public Checkbox criarCheckBox() {
        return new LightModeCheckBox();
    }

    @Override
    public TextField criarTextField() {
        return new LightModeTextField();
    }
}
