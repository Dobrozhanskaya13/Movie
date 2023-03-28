package org.example;

public class MovieManager {
    String[] title = new String[0];
    private int limit;

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public MovieManager() {
        this.limit = 10;
    }

    public void addMovie(String movieTitle) {
        String[] tmp = new String[title.length + 1];
        for (int i = 0; i < title.length; i++) {
            tmp[i] = title[i];
        }
        tmp[tmp.length - 1] = movieTitle;
        title = tmp;
    }

    public String[] findAll() {
        return title;

    }

    public String[] findLast() {
        int resultLength;
        if (title.length < limit) {
            resultLength = title.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = title[title.length - 1 - i];
        }
        return tmp;
    }

}
