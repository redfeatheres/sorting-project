package astonteam.sorting.service;

import astonteam.sorting.collection.CarArrayList;
import astonteam.sorting.model.Car;

import java.util.concurrent.ExecutionException;

public class CarCounter {

    /**
     * Подсчитывает количество автомобилей, равных target по equals.
     * Предварительная сортировка не требуется.

     * Для двух и более элементов использует ExecutorService
     * с двумя задачами, обрабатывающими непересекающиеся диапазоны.
     * Для одного элемента достаточно одной задачи.
     * Для пустой коллекции возвращает 0.

     * Метод ожидает завершения подсчёта.
     * Вызывающий код не должен изменять коллекцию во время подсчёта.
     * Созданный ExecutorService обязательно завершает работу.

     * @param data коллекция автомобилей
     * @param target искомый автомобиль
     * @return количество совпадений
     * @throws NullPointerException если data или target равен null
     * @throws InterruptedException если ожидание было прервано
     * @throws ExecutionException если задача подсчёта завершилась с ошибкой
     */
    public long count(CarArrayList data, Car target)
            throws InterruptedException, ExecutionException {
        throw new UnsupportedOperationException("Пока не реализовано");
    }
}