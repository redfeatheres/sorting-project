package astonteam.sorting.source;

import astonteam.sorting.collection.CarArrayList;
import astonteam.sorting.ui.ConsoleInput;

public class ManualCarSource implements CarSource {

    private final ConsoleInput input;

    /**
     * Создаёт источник ручного ввода.
     * Использует общий компонент консольного ввода приложения.
     *
     * @param input компонент консольного ввода
     * @throws NullPointerException если input равен null
     */
    public ManualCarSource(ConsoleInput input) {
        // TODO: добавить проверку input на null
        this.input = input;
    }

    /**
     * Последовательно запрашивает данные size автомобилей.
     * Использует последовательный Stream API.

     * При некорректном поле сообщает причину
     * и повторно запрашивает это поле.
     * Не создаёт собственный Scanner и не закрывает System.in.

     * @param size требуемое количество автомобилей, от 1 до 10 000
     * @return новая заполненная коллекция
     * @throws IllegalArgumentException если size вне допустимого диапазона
     * @throws IllegalStateException если консольный ввод завершился
     *         до заполнения коллекции
     */
    @Override
    public CarArrayList load(int size) {
        throw new UnsupportedOperationException("Пока не реализовано");
    }
}