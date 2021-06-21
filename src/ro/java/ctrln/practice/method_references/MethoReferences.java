package ro.java.ctrln.practice.method_references;

import ro.java.ctrln.practice.PracticeUtils;
import ro.java.ctrln.practice.lambda.Platform;
import ro.java.ctrln.practice.lambda.VideoGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class MethoReferences {

    public static void main(String[] args) {

        ArrayList<VideoGame> videoGames = PracticeUtils.getVideoGamesByFactory();

        StringBuilder gameNames = new StringBuilder();
        for (VideoGame videoGame : videoGames) {
            gameNames.append(videoGame.getName()).append(", ");
        }
        String finalTouchesGameNames = gameNames.substring(0, gameNames.toString().length() - 2);
        System.out.println("Numele jocurilor: " + finalTouchesGameNames);

        String videoGamesNames = videoGames
                .stream()
                .map(VideoGame::getName)
                .collect(Collectors.joining(", "));

        System.out.println("Numele jocurilor cu , intre ele: " + videoGamesNames);

        HashMap<Integer, VideoGame> videoGamesHashMap = new HashMap<>();
        VideoGameFactory videoGameFactory = VideoGame::new;
        double rangeMin = 5;
        double rangeMax = 10;
        for (int i = 0; i < 5; i++) {
            videoGamesHashMap.put(i, videoGameFactory
                    .getVideoGame("Game" + (i+1),
                           rangeMin + (rangeMax - rangeMin) * new Random().nextDouble(),
                            Platform.PC));
        }
        System.out.println(videoGamesHashMap);

        for (Map.Entry<Integer, VideoGame> videoGameEntry : videoGamesHashMap.entrySet()) {
            if (videoGameEntry.getValue().getRating() < 9) {
                videoGameEntry.getValue().setRating(8.0);
            }
        }

        videoGamesHashMap.replaceAll((key, value) -> {
            if (value.getRating() < 7) {
                value.setRating(6.0);
            }
            return value;
        });

        videoGamesHashMap.replaceAll((key, value) -> value.getRating() < 7 ?
                videoGameFactory.getVideoGame(value.getName(), 7.0, value.getPlatform()) :
                value);

        System.out.println(videoGamesHashMap);
    }
}
