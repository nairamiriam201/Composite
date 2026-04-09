package loja;

public class Main {
    public static void main(String[] args) {


        ItemLoja mouse = new Produto("Mouse", 80);
        ItemLoja teclado = new Produto("Teclado", 150);
        ItemLoja monitor = new Produto("Monitor", 900);
        ItemLoja mousepad = new Produto("Mousepad", 40);

        Kit kitPerifericos = new Kit("Kit Perifericos");
        kitPerifericos.adicionar(mouse);
        kitPerifericos.adicionar(teclado);
        kitPerifericos.adicionar(mousepad);

        Kit kitSetup = new Kit("Kit Setup");
        kitSetup.adicionar(monitor);
        kitSetup.adicionar(kitPerifericos);

        kitSetup.exibir("");
    }
}