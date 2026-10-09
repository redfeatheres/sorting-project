package astonteam.sorting.sort;

import astonteam.sorting.collection.CarArrayList;
import astonteam.sorting.model.Car;

import java.util.Comparator;

/**
 * Стратегия сортировки автомобилей методом слияния.

 * Реализация должна разделять коллекцию на части,
 * сортировать их и объединять в порядке,
 * определяемом переданным компаратором.

 * При равенстве элементов первым выбирается элемент левой части,
 * чтобы сохранить исходный порядок равных элементов.
 * Допускается использование вспомогательного массива.
 * Итоговый результат записывается в исходную коллекцию.

 * Алгоритм реализуется самостоятельно, без готовых сортировок.
 */
public class MergeSort implements SortStrategy {

    /**
     * {@inheritDoc}
     */
    @Override
    public void sort(CarArrayList data, Comparator<Car> comparator) {
        throw new UnsupportedOperationException("Пока не реализовано");
    }
}