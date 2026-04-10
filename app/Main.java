package app;

import model.Personagem;

public class Main {
    public static void main(String[] args) {

        // 1
        Personagem arthas = new Personagem("Arthas", "Guerreiro", 1000.00);

        // 2
        System.out.println(arthas);

        // 3
        arthas.curar(500.00);
        System.out.println("Após cura de 500: " + arthas.getVida());

        // 4
        arthas.curar(-100.00);

        // 5
        arthas.recDano(200.00);
        System.out.println("Após dano de 200: " + arthas.getVida());

        // 6
        arthas.recDano(5000.00);

        // 7
        Personagem zara = new Personagem("Zara", "Maga", -500.00);

        // 8
        System.out.println(zara);
    }
}