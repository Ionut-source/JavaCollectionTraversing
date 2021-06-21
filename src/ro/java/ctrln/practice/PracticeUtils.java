package ro.java.ctrln.practice;

import ro.java.ctrln.practice.lambda.Platform;
import ro.java.ctrln.practice.lambda.VideoGame;
import ro.java.ctrln.practice.method_references.VideoGameFactory;

import java.util.ArrayList;

public class PracticeUtils {

    private final static VideoGameFactory videoGameFactory = VideoGame::new;

    public static ArrayList<VideoGame> getVideoGames() {
        ArrayList<VideoGame> videoGames = new ArrayList<>();
        videoGames.add(new VideoGame("Game1", 7.85, Platform.PC));
        videoGames.add(new VideoGame("Game2", 8.43, Platform.MOBILE));
        videoGames.add(new VideoGame("Game3", 6.7, Platform.PC));
        videoGames.add(new VideoGame("Game4", 9.2, Platform.CONSOLE));
        videoGames.add(new VideoGame("Game5", 9.45, Platform.CONSOLE));
        return videoGames;
    }

    public static  ArrayList<VideoGame> getVideoGamesByFactory() {
        ArrayList<VideoGame> videoGames = new ArrayList<>();
        VideoGameFactory videoGameFactory = VideoGame::new;
        videoGames.add(videoGameFactory.getVideoGame("Game1",  7.85, Platform.PC));
        videoGames.add(videoGameFactory.getVideoGame("Game2", 8.43, Platform.MOBILE));
        videoGames.add(videoGameFactory.getVideoGame("Game3", 6.7, Platform.PC));
        videoGames.add(videoGameFactory.getVideoGame("Game4", 9.2, Platform.CONSOLE));
        videoGames.add(videoGameFactory.getVideoGame("Game5", 9.45, Platform.CONSOLE));
        return videoGames;

    }
}
