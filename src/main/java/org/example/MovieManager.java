package org.example;
//Менеджер должен уметь выполнять следующие операции:

// 1.Добавление нового фильма.
// 2.Вывод всех фильмов в порядке добавления (findAll).
// 3. Вывод максимального лимита* последних добавленных фильмов в обратном от добавления порядке (findLast).
public class MovieManager {
    String[] title = new String[0];
    private int limit;

    /*Сделайте так, чтобы по умолчанию выводилось последние 10 добавленных фильмов,
    но при создании менеджера можно было указать другое число, чтобы, например,
    выдавать 5, а не 10. То есть у менеджера должно быть два конструктора:
    один без параметров, выставляющий лимит менеджера в 10,
    а другой с параметром, берущий значение лимита для менеджера из параметра конструктора.

     */
    public MovieManager(int limit) {
        this.limit = limit;
    }

    public MovieManager() {
        this.limit = 10;
    }
    // 1.Добавление нового фильма.
    public void addMovie(String movieTitle) {
        String[] tmpMovie = new String[title.length + 1];
        for (int i = 0; i < title.length; i++) {
            tmpMovie[i] = title[i];
        }
        tmpMovie[tmpMovie.length - 1] = movieTitle;
        title = tmpMovie;
    }
    // 2.Вывод всех фильмов в порядке добавления (findAll).
    public String[] findAll() {
        return title;

    }
    // 3. Вывод максимального лимита* последних добавленных фильмов в обратном от добавления порядке (findLast).
    public String[] findLast() {
        int resultsLength;
        if (title.length < limit) {
            resultsLength = title.length;
        }
        else {
            resultsLength = limit;
        }
        String[] tmpMovie = new String[resultsLength];
        for (int i = 0; i < tmpMovie.length; i++) {
            tmpMovie[i] = title[title.length - 1 - i];
        }
        return tmpMovie;
    }

}
