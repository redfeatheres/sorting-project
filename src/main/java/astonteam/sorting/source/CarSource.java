package astonteam.sorting.source;

import astonteam.sorting.collection.CarArrayList;

import java.io.IOException;

public interface CarSource {

    /**
     * Создаёт и заполняет новую коллекцию заданного размера.
     * Заполнение выполняется с использованием последовательного Stream API.

     * При успешном выполнении коллекция содержит ровно size автомобилей.
     * Все автомобили должны соответствовать правилам валидации Car.
     * Частично заполненная коллекция при ошибке не возвращается.
     *
     * @param size требуемое количество автомобилей, от 1 до 10 000
     * @return новая заполненная коллекция
     * @throws IllegalArgumentException если size вне допустимого диапазона
     *         или исходные данные некорректны
     * @throws IOException если произошла ошибка чтения файла
     */
    CarArrayList load(int size) throws IOException;
}