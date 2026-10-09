package astonteam.sorting.model;

import java.util.Objects;

/**
 * Автомобиль с моделью, годом производства и мощностью.

 * Поля задаются при создании и не имеют методов изменения.
 * Равенство автомобилей определяется по всем трём полям.
 * При сравнении моделей учитывается регистр символов.

 * В текущем каркасе проверка и нормализация данных не реализованы.
 */
public class Car {

    private final String model;
    private final int productionYear;
    private final int power;

    /**
     * Создаёт автомобиль с переданными характеристиками.
     * В текущем каркасе значения сохраняются без проверки.
     *
     * @param model модель автомобиля
     * @param productionYear год производства
     * @param power мощность в лошадиных силах
     */
    public Car(String model, int productionYear, int power) {
        this.model = model;
        this.productionYear = productionYear;
        this.power = power;
    }

    /**
     * Возвращает модель автомобиля.
     * @return модель автомобиля
     */
    public String getModel() {
        return model;
    }

    /**
     * Возвращает год производства.
     * @return год производства автомобиля
     */
    public int getProductionYear() {
        return productionYear;
    }

    /**
     * Возвращает мощность автомобиля.
     * @return мощность в лошадиных силах
     */
    public int getPower() {
        return power;
    }

    /**
     * Сравнивает автомобили по модели, году производства и мощности.
     * Модель сравнивается с учётом регистра.
     * Объекты разных классов не считаются равными.

     * @param o объект для сравнения
     * @return true, если классы и все три поля совпадают
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return productionYear == car.productionYear
                && power == car.power
                && Objects.equals(model, car.model);
    }

    /**
     * Вычисляет хеш-код по всем трём полям.
     * Равные автомобили имеют одинаковый хеш-код.

     * @return хеш-код автомобиля
     */
    @Override
    public int hashCode() {
        return Objects.hash(model, productionYear, power);
    }

    /**
     * Возвращает текстовое представление для вывода в консоль.
     * Формат сохранения в файл определяется отдельно в CarFileWriter.

     * @return строка с моделью, годом производства и мощностью
     */
    @Override
    public String toString() {
        return "| " +
                "MODEL: '" + model + '\'' +
                ", YEAR: " + productionYear +
                ", POWER: " + power + " |";
    }
}