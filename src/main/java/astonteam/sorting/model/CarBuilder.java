package astonteam.sorting.model;

/**
 * Строитель для пошагового создания автомобиля.

 * Методы настройки возвращают текущий строитель,
 * позволяя объединять вызовы в цепочку.
 * Метод build() создаёт новый объект Car.
 *
 * В текущем каркасе проверка данных не реализована.
 */
public class CarBuilder {

    private String model;
    private int productionYear;
    private int power;

    /**
     * Устанавливает модель автомобиля.

     * @param model модель автомобиля
     * @return текущий строитель
     */
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * Устанавливает год производства автомобиля.

     * @param productionYear год производства
     * @return текущий строитель
     */
    public CarBuilder setProductionYear(int productionYear) {
        this.productionYear = productionYear;
        return this;
    }

    /**
     * Устанавливает мощность автомобиля.

     * @param power мощность в лошадиных силах
     * @return текущий строитель
     */
    public CarBuilder setPower(int power) {
        this.power = power;
        return this;
    }

    /**
     * Создаёт новый автомобиль с установленными значениями.
     * Состояние строителя после вызова не сбрасывается.

     * В текущем каркасе незаданные поля сохраняют значения
     * по умолчанию: null для модели и 0 для числовых полей.
     * @return новый объект автомобиля
     */
    public Car build() {
        return new Car(model, productionYear, power);
    }
}