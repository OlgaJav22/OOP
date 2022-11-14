public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;

    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public double getEngineVolume() {
        return this.engineVolume;
    }

    public String getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public String getCountry() {
        return this.country;
    }

    @Override
    public String toString () {
        return getBrand() + " " + getModel() + ", " + getYear() + " год выпуска, " + "сборка в " + getCountry() + ", " + getColor() + " цвета, объем двигателя: " + getEngineVolume() + "л.";
    }
}
