package ru.netology;
import org.junit.jupiter.api.Test;
import ru.netology.manager.MovieManager;
import ru.netology.poster.PurchaseItem;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {
    @Test
    public void shouldAdd() {
        MovieManager manager = new MovieManager(10);
        PurchaseItem first = new PurchaseItem(1, "1", "Бладшот", "боевик");
        PurchaseItem second = new PurchaseItem(2, "2", "Вперед",  "мультфильм");
        PurchaseItem third = new PurchaseItem(3, "3", "Отель /Белград/'",  "комедия");

        manager.add(first);
        manager.add(second);
        manager.add(third);

        PurchaseItem[] actual = manager.getFindAll();
        PurchaseItem[] expected = new PurchaseItem[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetEmpty() {
        MovieManager manager = new MovieManager(10);
        PurchaseItem[] actual = manager.getFindAll();
        PurchaseItem[] expected = new PurchaseItem[]{};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldGetMovieQuantity() {

        MovieManager manager = new MovieManager(7);
        PurchaseItem first = new PurchaseItem(1, "1", "Бладшот", "боевик");
        PurchaseItem second = new PurchaseItem(2, "2", "Вперед",  "мультфильм");
        PurchaseItem third = new PurchaseItem(3, "3", "Отель '/Белград/'",  "комедия");
        PurchaseItem fourth = new PurchaseItem(4, "4", "Джентельмены", "боевик");
        PurchaseItem fifth = new PurchaseItem(5, "5", "Человек-невидимка", "ужасы");
        PurchaseItem sixth = new PurchaseItem(6, "6", "Тролли", "мультфильм");
        PurchaseItem seventh = new PurchaseItem(7, "7", "Номер один", "комедия");
        PurchaseItem eighth = new PurchaseItem(8, "8", "Один дома", "комедия");
        PurchaseItem ninth = new PurchaseItem(9, "9", "Узник", "боевик");
        PurchaseItem tenth = new PurchaseItem(10, "10", "Выжившая", "боевик");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        PurchaseItem[] actual = manager.getFindLast();
        PurchaseItem[] expected = new PurchaseItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNoMovie() {
        MovieManager manager = new MovieManager(10);
        PurchaseItem[] actual = manager.getFindLast();
        PurchaseItem[] expected = new PurchaseItem[]{};
        assertArrayEquals(expected, actual);
    }
}