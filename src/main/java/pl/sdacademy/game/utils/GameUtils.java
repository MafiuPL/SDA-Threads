package pl.sdacademy.game.utils;

import pl.sdacademy.game.model.Gamer;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class GameUtils {

    public static void message(String message) {
        System.out.println(message);
    }

    public static void playGame(String name, int gamersAmount) {

        ExecutorService execut = Executors.newFixedThreadPool(gamersAmount);
        Gamer gamer = new Gamer(name);

        /*
        Runnable thread = (gamer) -> {

            message(gamer.getName() + "1: throw a dice...");
            Random random = new Random();
            int number = random.nextInt(6) + 1;
            message("1: you threw: " + number);

        };

        executor.execute(thread);
        excutor.shutdown();
        */
    }
}
