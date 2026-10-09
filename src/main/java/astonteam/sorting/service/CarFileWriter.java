package astonteam.sorting.service;

import astonteam.sorting.collection.CarArrayList;
import astonteam.sorting.model.Car;

import java.io.IOException;
import java.nio.file.Path;

public class CarFileWriter {

    /**
     * Добавляет автомобили из коллекции в текстовый файл UTF-8.

     * Каждый автомобиль записывается на отдельной строке
     * в формате power;model;productionYear, без заголовка.
     * Порядок автомобилей соответствует порядку в коллекции.

     * Существующее содержимое сохраняется.
     * Если файл отсутствует, он создаётся.
     * Родительские каталоги должны существовать.
     * Новые записи отделяются от существующих переносом строки.
     * Для пустой коллекции файл не создаётся и не изменяется.
     * Коллекция не изменяется.
     *
     * @param path путь к файлу
     * @param data коллекция для сохранения
     * @throws NullPointerException если path или data равен null
     * @throws IOException если не удалось открыть файл или записать данные
     */
    public void writeCars(Path path, CarArrayList data) throws IOException {
        throw new UnsupportedOperationException("Пока не реализовано");
    }

    /**
     * Добавляет результат подсчёта в отдельный текстовый отчёт UTF-8.

     * Запись содержит все три поля искомого автомобиля
     * и количество найденных совпадений.
     * Метод сохраняет переданный результат и не выполняет подсчёт.

     * Существующее содержимое сохраняется.
     * Если файл отсутствует, он создаётся.
     * Родительские каталоги должны существовать.
     * Новые записи отделяются от существующих переносом строки.
     *
     * @param path путь к файлу отчёта
     * @param target автомобиль, для которого выполнялся подсчёт
     * @param count количество совпадений, не меньше 0
     * @throws NullPointerException если path или target равен null
     * @throws IllegalArgumentException если count меньше 0
     * @throws IOException если не удалось открыть файл или записать данные
     */
    public void writeCount(Path path, Car target, long count)
            throws IOException {
        throw new UnsupportedOperationException("Пока не реализовано");
    }
}