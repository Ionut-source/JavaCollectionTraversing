package ro.java.ctrln.practice.pipelines;

import ro.java.ctrln.practice.PracticeUtils;
import ro.java.ctrln.practice.lambda.Platform;
import ro.java.ctrln.practice.lambda.VideoGame;

import java.util.*;
import java.util.stream.Collectors;

public class Pipelines {

    public static void main(String[] args) {

        ArrayList<VideoGame> videoGames = PracticeUtils.getVideoGames();

        System.out.println("Jocurile cu rating mai mic decat 7: ");

        videoGames
                .stream()
                .filter(videoGame -> videoGame.getRating() > 7)
                .forEach(System.out::println);

        Optional<VideoGame> optionalMinRatingvideoGames = videoGames.stream()
                .min(Comparator.comparing(VideoGame::getRating));
        optionalMinRatingvideoGames.ifPresent(videoGame -> System.out.println("Jocul cu cel mai mic rating este: "
                + videoGame.getName() + " cu rating " + videoGame.getRating()));


        Optional<VideoGame> optionalMaxRatingvideoGames = videoGames.stream()
                .max(Comparator.comparing(VideoGame::getRating));
        optionalMaxRatingvideoGames.ifPresent(videoGame -> System.out.println("Jocul cu cel mai mare rating este: "
                + videoGame.getName() + " cu rating " + videoGame.getRating()));

        double average = videoGames
                .stream()
                .mapToDouble(VideoGame::getRating)
                .average()
                .getAsDouble();
        System.out.println("Media rating-urilor este: " + average);

        long count = videoGames
                .stream()
                .filter(videoGame -> videoGame.getRating() > 9)
                .count();
        System.out.println("Numarul jocurilor cu rating mai mare decat 9 este: " + count);

        DoubleSummaryStatistics statistics = videoGames
                .stream()
                .mapToDouble(VideoGame::getRating)
                .summaryStatistics();
        System.out.println("Statistics - min rating este " + statistics.getMin());
        System.out.println("Statistics - max rating este: " + statistics.getMax());
        System.out.println("Statistic - media rating este: " + statistics.getAverage());

        List<String> videoGameNames = videoGames
                .stream()
                .filter(videoGame -> videoGame.getPlatform().equals(Platform.PC))
                .map(VideoGame::getName)
                .collect(Collectors.toList());

        for (String videoGameName : videoGameNames) {
            System.out.println("Nume joc PC: " + videoGameNames);
        }
        
        videoGameNames = videoGames
                .stream()
                .filter(videoGame -> videoGame.getPlatform().equals(Platform.MOBILE))
                .map(VideoGame::getName)
                .collect(Collectors.toList());

        for (String videoGameName: videoGameNames) {
            System.out.println("Nume joc MOBILE: " + videoGameNames);
        }
    }
}
