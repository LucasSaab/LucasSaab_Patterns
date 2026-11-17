package abstractFactory;

public class LightModeTextField implements TextField{
    @Override
    public void render() {
        System.out.println("Renderizando Caixa de Texto com borda cinza clara");
    }
}
