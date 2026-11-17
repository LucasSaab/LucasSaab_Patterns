package abstractFactory;

public interface UIComponentFactory {
    Button criarBotao();
    Checkbox criarCheckBox();
    TextField criarTextField();
}
