package org.academiadecodigo.bootcamp.oportunity;

public class Main {
    private static Game play;

    public static void main(String[] args) throws InterruptedException {

        Game game = new Game();
        game.init();
        game.start();

        play.playMusic();

    }
}
