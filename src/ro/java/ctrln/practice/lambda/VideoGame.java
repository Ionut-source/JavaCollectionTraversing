package ro.java.ctrln.practice.lambda;

import java.util.Objects;

public class VideoGame {
    
    private String name;
    private Double rating;
    private Platform platform;


    public VideoGame(String name, Double rating, Platform platform) {
        this.name = name;
        this.rating = rating;
        this.platform = platform;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoGame videoGame = (VideoGame) o;
        return name.equals(videoGame.name) && rating.equals(videoGame.rating) && platform == videoGame.platform;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating, platform);
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", platform=" + platform +
                '}';
    }
}
