package org.example.PosterManager;


import org.example.PosterManager.PosterManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void test() {

        String newPoster1 = "Poster1";
        String newPoster2 = "Poster2";
        String newPoster3 = "Poster3";


        PosterManager posters = new PosterManager();
        posters.addPoster(newPoster1);
        posters.addPoster(newPoster2);
        posters.addPoster(newPoster3);

        String[] expected = {newPoster1, newPoster2, newPoster3};
        String[] actual = posters.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReversedIfLimitEqualLenght() {

        String newPoster1 = "Poster1";
        String newPoster2 = "Poster2";
        String newPoster3 = "Poster3";




        PosterManager posters = new PosterManager(3);
        posters.addPoster(newPoster1);
        posters.addPoster(newPoster2);
        posters.addPoster(newPoster3);

        String[] expected = {newPoster3, newPoster2, newPoster1};
        String[] actual = posters.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReversedIfLimitLessLenght() {

        String newPoster1 = "Poster1";
        String newPoster2 = "Poster2";
        String newPoster3 = "Poster3";




        PosterManager posters = new PosterManager(2);
        posters.addPoster(newPoster1);
        posters.addPoster(newPoster2);
        posters.addPoster(newPoster3);

        String[] expected = {newPoster3, newPoster2};
        String[] actual = posters.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReversedIfLimitMoreLenght() {

        String newPoster1 = "Poster1";
        String newPoster2 = "Poster2";
        String newPoster3 = "Poster3";




        PosterManager posters = new PosterManager(11);
        posters.addPoster(newPoster1);
        posters.addPoster(newPoster2);
        posters.addPoster(newPoster3);

        String[] expected = {newPoster3, newPoster2, newPoster1};
        String[] actual = posters.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}




