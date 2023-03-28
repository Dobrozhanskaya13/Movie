package org.example;
//Менеджер должен уметь выполнять следующие операции:

// 1.Добавление нового фильма.
// 2.Вывод всех фильмов в порядке добавления (findAll).
// 3. Вывод максимального лимита* последних добавленных фильмов в обратном от добавления порядке (findLast).
public class MovieManager {
    String[] title = new String[0];
    private int limit;

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public MovieManager() {
        this.limit = 10;
    }
    // 1.Добавление нового фильма.
    public void addMovie(String movieTitle) {
        String[] tmp = new String[title.length + 1];
        for (int i = 0; i < title.length; i++) {
            tmp[i] = title[i];
        }
        tmp[tmp.length - 1] = movieTitle;
        title = tmp;
    }
    // 2.Вывод всех фильмов в порядке добавления (findAll).
    public String[] findAll() {
        return title;

    }
// 3. Вывод максимального лимита* последних добавленных фильмов в обратном от добавления порядке (findLast).
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
