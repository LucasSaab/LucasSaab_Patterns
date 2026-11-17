package abstractFactory;

public class DarkThemeFactory implements UIComponentFactory{
    @Override
    public Button criarBotao() {
        return new DarkModeButton();
    }

    @Override
    public Checkbox criarCheckBox() {
        return new DarkModeCheckBox();
    }

    @Override
    public TextField criarTextField() {
        return new DarkModeTextField();
    }
}
