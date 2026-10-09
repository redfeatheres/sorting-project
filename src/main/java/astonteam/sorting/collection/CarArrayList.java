package astonteam.sorting.collection;

import astonteam.sorting.model.Car;

import java.util.Iterator;

/**
 * Коллекция автомобилей на основе расширяемого массива.

 * Сохраняет порядок добавления элементов и допускает дубликаты.
 * Хранение null запрещено.
 * Индексы элементов начинаются с 0.

 * При заполнении внутреннего массива его ёмкость увеличивается.
 * Размер коллекции — количество добавленных элементов,
 * а не длина внутреннего массива.

 * Коллекция не является потокобезопасной.
 */
public class CarArrayList implements Iterable<Car> {

    //начальная ёмкость внутреннего массива
    private static final int INITIAL_CAPACITY = 10;

    private Car[] array = new Car[INITIAL_CAPACITY];
    private int size = 0;

    /**
     * Возвращает автомобиль по указанному индексу.

     * @param index индекс элемента, от 0 до size() - 1
     * @return автомобиль по указанному индексу
     * @throws IndexOutOfBoundsException если index меньше 0
     *         или не меньше size()
     */
    public Car get(int index) {
        throw new UnsupportedOperationException("Пока не реализовано");
    }

    /**
     * Добавляет автомобиль в конец коллекции.
     * При необходимости увеличивает ёмкость внутреннего массива.
     * После успешного добавления размер увеличивается на 1.

     * @param element добавляемый автомобиль
     * @return true при успешном добавлении
     * @throws NullPointerException если element равен null
     */
    public boolean add(Car element) {
        throw new UnsupportedOperationException("Пока не реализовано");
    }

    /**
     * Заменяет автомобиль по указанному индексу.
     * Размер коллекции не изменяется.

     * @param index индекс заменяемого элемента, от 0 до size() - 1
     * @param element новый автомобиль
     * @return автомобиль, находившийся по этому индексу до замены
     * @throws IndexOutOfBoundsException если index меньше 0
     *         или не меньше size()
     * @throws NullPointerException если element равен null
     */
    public Car set(int index, Car element) {
        throw new UnsupportedOperationException("Пока не реализовано");
    }

    /**
     * Возвращает количество элементов в коллекции.
     *
     * @return количество элементов; для пустой коллекции — 0
     */
    public int size() {
        throw new UnsupportedOperationException("Пока не реализовано");
    }

    /**
     * Возвращает новый итератор для обхода коллекции
     * в порядке индексов от 0 до size() - 1.
     * Неиспользуемые ячейки внутреннего массива не обходятся.

     * Метод hasNext() возвращает false после последнего элемента.
     * Вызов next() после окончания обхода выбрасывает
     * java.util.NoSuchElementException.
     * Метод remove() выбрасывает UnsupportedOperationException.

     * Изменение коллекции во время обхода не поддерживается:
     * вызывающий код не должен вызывать add() или set()
     * до завершения обхода. Обнаружение таких изменений
     * итератором не гарантируется.
     *
     * @return новый итератор по автомобилям
     */
    @Override
    public Iterator<Car> iterator() {
        throw new UnsupportedOperationException("Пока не реализовано");
    }

    /**
     * Обеспечивает ёмкость внутреннего массива не меньше minCapacity.

     * Если текущей ёмкости достаточно, ничего не изменяет.
     * Иначе создаёт больший массив и переносит в него элементы,
     * сохраняя их порядок.

     * Размер коллекции size не изменяется.
     *
     * @param minCapacity минимальная требуемая ёмкость
     * @throws IllegalArgumentException если minCapacity меньше 0
     */
    private void ensureCapacity(int minCapacity) {
        throw new UnsupportedOperationException("Пока не реализовано");
    }
}