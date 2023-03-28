import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.MovieManager;

public class MovieManagerTest {
    @Test
    public void testAdd() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли");
        manager.addMovie("Номер один");
        manager.addMovie("Операция Фортуна");
        manager.addMovie("Моя пиратская свадьба");
        manager.addMovie("Тайна Келлс");
        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-неведимка", "Тролли", "Номер один", "Операция Фортуна", "Моя пиратская свадьба", "Тайна Келлс"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testAdd2() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        String[] expected = {"Бладшот", "Вперед", "Отель Белград"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли");
        manager.addMovie("Номер один");
        manager.addMovie("Операция Фортуна");
        manager.addMovie("Моя пиратская свадьба");
        manager.addMovie("Тайна Келлс");
        manager.findLast();
        String[] expected = {"Тайна Келлс", "Моя пиратская свадьба", "Операция Фортуна", "Номер один", "Тролли", "Человек-неведимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindOverLimit() {
        MovieManager manager = new MovieManager(15);
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        String[] expected = {"Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLessLimit() {
        MovieManager manager = new MovieManager(4);
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        String[] expected = {"Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLessLimit2() {
        MovieManager manager = new MovieManager(2);
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        String[] expected = {"Джентельмены", "Отель Белград"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}