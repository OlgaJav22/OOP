public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand==null){
            this.brand = "default";
        } else
            this.brand = brand;
        if (model==null){
            this.model = "default";
        } else
            this.model = model;
        if (engineVolume<=0.0){
            this.engineVolume = 1.5;
        } else
            this.engineVolume = engineVolume;

        if (color==null){
            this.color = "Белый";
        } else
            this.color = color;

        if (year<=0){
            this.year = 2000;
        } else
            this.year = year;
        if (country==null){
            this.country = "default";
        } else
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
