package astonteam.sorting.sort;

import astonteam.sorting.collection.CarArrayList;
import astonteam.sorting.model.Car;

import java.util.Comparator;

/**
 * Стратегия сортировки автомобилей методом вставок.

 * Реализация должна последовательно вставлять каждый элемент
 * в подходящую позицию уже отсортированной части коллекции.
 * При сравнении используется переданный компаратор.
 * Равные элементы сохраняют исходный порядок.

 * Алгоритм реализуется самостоятельно, без готовых сортировок.
 */
public class InsertionSort implements SortStrategy {

    /**
     * {@inheritDoc}
     */
    @Override
    public void sort(CarArrayList data, Comparator<Car> comparator) {
        throw new UnsupportedOperationException("Пока не реализовано");
    }
}