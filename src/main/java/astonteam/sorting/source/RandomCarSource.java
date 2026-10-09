package astonteam.sorting.source;

import astonteam.sorting.collection.CarArrayList;

public class RandomCarSource implements CarSource {

    /**
     * Генерирует size автомобилей с помощью последовательного Stream API.

     * Модели выбираются из заранее заданного набора.
     * Мощность и год выбираются из согласованных диапазонов,
     * соответствующих правилам валидации Car.
     * Повторяющиеся автомобили допускаются.

     * @param size требуемое количество автомобилей, от 1 до 10 000
     * @return новая заполненная коллекция
     * @throws IllegalArgumentException если size вне допустимого диапазона
     */
    @Override
    public CarArrayList load(int size) {
        throw new UnsupportedOperationException("Пока не реализовано");
    }
}