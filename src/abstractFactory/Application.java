package abstractFactory;

public class Application {
    public static void main(String[] args) {

        System.out.println("=== Tema Claro ===\n");
        UIComponentFactory fabricaModoEscuro = new DarkThemeFactory();

        Button botaoModoEscuro = fabricaModoEscuro.criarBotao();
        Checkbox caixaSelecaoModoEscuro = fabricaModoEscuro.criarCheckBox();
        TextField caixaTextoModoEscuro = fabricaModoEscuro.criarTextField();

        botaoModoEscuro.render();
        caixaSelecaoModoEscuro.render();
        caixaTextoModoEscuro.render();

        System.out.println("\n=== Tema escuro ===\n");
        UIComponentFactory fabricaModoClaro = new DarkThemeFactory();

        Button botaoModoClaro = fabricaModoClaro.criarBotao();
        Checkbox caixaSelecaoModoClaro = fabricaModoClaro.criarCheckBox();
        TextField caixaTextoModoClaro = fabricaModoClaro.criarTextField();

        botaoModoClaro.render();
        caixaSelecaoModoClaro.render();
        caixaTextoModoClaro.render();

    }
}
