package abstractFactory;

public class DarkModeButton implements Button{
    @Override
    public void render() {
        System.out.println("Renderizando Botão com fundo cinza escuro");
    }
}
