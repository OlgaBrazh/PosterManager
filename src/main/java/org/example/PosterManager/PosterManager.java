
package org.example.PosterManager;

public class PosterManager {

    private String[] posters = new String[0];
    private int limit;

    public PosterManager() {
        this.limit = 10;
    }


    public PosterManager(int limit) {
        this.limit = limit;
    }


    public void addPoster(String newPoster) {
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = newPoster;
        posters = tmp;
    }

    public String[] findAll() {
        return posters;
    }


    public String[] findLast() {

        int resultLimit;

        if (posters.length < limit) {
            resultLimit = posters.length;
        } else {
            resultLimit = limit;
        }
        String[] reversed = new String[resultLimit];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = posters[posters.length - 1 - i];
        }
        posters = reversed;
        return posters;
    }
}




