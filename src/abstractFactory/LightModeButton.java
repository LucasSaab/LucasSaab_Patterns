package abstractFactory;

public class LightModeButton implements Button{
    @Override
    public void render() {
        System.out.println("Renderizando Botão com fundo branco");
    }
}
