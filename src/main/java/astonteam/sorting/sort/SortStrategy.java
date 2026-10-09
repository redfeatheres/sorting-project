package astonteam.sorting.sort;

import astonteam.sorting.collection.CarArrayList;
import astonteam.sorting.model.Car;

import java.util.Comparator;

public interface SortStrategy {
    /**
     * Сортирует переданную коллекцию на месте.
     * Порядок определяется компаратором.
     * Пустая коллекция допустима.
     * Порядок равных элементов сохраняется.
     *
     * @param data коллекция автомобилей
     * @param comparator правило сравнения автомобилей
     * @throws NullPointerException если data или comparator равен null
     */
    void sort(CarArrayList data, Comparator<Car> comparator);
}
