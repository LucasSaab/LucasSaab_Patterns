package abstractFactory;

public class DarkModeTextField implements TextField{
    @Override
    public void render() {
        System.out.println("Renderizando Caixa de Texto com borda cinza escura");
    }
}
