package astonteam.sorting.source;

import astonteam.sorting.collection.CarArrayList;

import java.io.IOException;
import java.nio.file.Path;

public class FileCarSource implements CarSource {

    private final Path path;

    /**
     * Создаёт источник данных из файла.
     * Сам файл читается при вызове load.
     *
     * @param path путь к файлу
     * @throws NullPointerException если path равен null
     */
    public FileCarSource(Path path) {
        // TODO: добавить проверку path на null
        this.path = path;
    }

    /**
     * Загружает первые size строк текстового файла UTF-8.
     * Формат строки: power;model;productionYear, без заголовка.

     * Файл обрабатывается через Stream API.
     * Строки после первых size не обрабатываются.
     * Ресурс чтения обязательно закрывается.

     * Если строк недостаточно или среди выбранных строк есть
     * пустая либо некорректная, загрузка отклоняется полностью.
     * Для некорректной строки ошибка содержит её номер и причину.
     *
     * @param size требуемое количество автомобилей, от 1 до 10 000
     * @return новая заполненная коллекция
     * @throws IllegalArgumentException если size вне допустимого диапазона,
     *         строк недостаточно или данные некорректны
     * @throws IOException если не удалось открыть или прочитать файл
     */
    @Override
    public CarArrayList load(int size) throws IOException {
        throw new UnsupportedOperationException("Пока не реализовано");
    }
}