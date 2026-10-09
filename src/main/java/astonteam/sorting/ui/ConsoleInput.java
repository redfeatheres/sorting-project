package astonteam.sorting.ui;

import astonteam.sorting.model.Car;

import java.util.Scanner;

public class ConsoleInput {

    private final Scanner scanner;

    /**
     * Создаёт компонент консольного ввода.
     * Все операции чтения используют переданный Scanner.
     * Компонент не закрывает Scanner и System.in.
     *
     * @param scanner общий Scanner приложения
     * @throws NullPointerException если scanner равен null
     */
    public ConsoleInput(Scanner scanner) {
        // TODO: добавить проверку scanner на null
        this.scanner = scanner;
    }

    /**
     * Показывает приглашение и читает непустую строку.
     * Удаляет пробелы в начале и конце.
     * При пустой строке сообщает об ошибке и повторяет запрос.
     *
     * @param prompt приглашение к вводу
     * @return непустая строка без крайних пробелов
     * @throws NullPointerException если prompt равен null
     * @throws IllegalStateException если ввод завершился
     */
    public String readString(String prompt) {
        throw new UnsupportedOperationException("Пока не реализовано");
    }

    /**
     * Показывает приглашение и читает целое число
     * в диапазоне от min до max включительно.

     * При нечисловом вводе или выходе за диапазон
     * сообщает об ошибке и повторяет запрос.

     * @param prompt приглашение к вводу
     * @param min минимальное допустимое значение
     * @param max максимальное допустимое значение
     * @return введённое число
     * @throws NullPointerException если prompt равен null
     * @throws IllegalArgumentException если min больше max
     * @throws IllegalStateException если ввод завершился
     */
    public int readInt(String prompt, int min, int max) {
        throw new UnsupportedOperationException("Пока не реализовано");
    }

    /**
     * Запрашивает модель, год производства и мощность автомобиля.
     * Проверяет поля по согласованным правилам Car.
     * При ошибке повторно запрашивает некорректное поле.
     * Создаёт автомобиль через CarBuilder.

     * @return автомобиль с корректными данными
     * @throws IllegalStateException если ввод завершился
     */
    public Car readCar() {
        throw new UnsupportedOperationException("Пока не реализовано");
    }
}