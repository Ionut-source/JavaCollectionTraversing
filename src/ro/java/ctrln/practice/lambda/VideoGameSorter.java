package ro.java.ctrln.practice.lambda;

import ro.java.ctrln.practice.PracticeUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class VideoGameSorter {

    public static void main(String[] args) {

        ArrayList<VideoGame> videoGames = PracticeUtils.getVideoGames();

        //COMPARATORUL CA O EXPRESIE LAMBDA
        videoGames.sort((gameOne, gameTwo) -> Double.compare(gameOne.getRating(), gameTwo.getRating()));

        System.out.println("Jocurile sortate");
        for (VideoGame videoGame : videoGames) {
            System.out.println(videoGame);
        }

        Collections.shuffle(videoGames);
        System.out.println("Jocurile amestecate" + videoGames);

        // SORTAREA CU COMPARATORUL CA REFERINTA CATRE METODA getRating
        videoGames.sort(Comparator.comparingDouble(VideoGame::getRating));

        videoGames.sort(Comparator.comparing(VideoGame::getName));

        System.out.println("Jocurile sortate");
        for (VideoGame videoGame : videoGames) {
            System.out.println(videoGame);
        }

        Collections.shuffle(videoGames);
        System.out.println("Jocurile amestecate" + videoGames);

        List<VideoGame> videoGameSorted = videoGames
                .stream()
                .sorted(Comparator.comparing(VideoGame::getName))
                .collect(Collectors.toList());

        for (VideoGame videoGame : videoGameSorted) {
            System.out.println(videoGame);
        }
    }
}
