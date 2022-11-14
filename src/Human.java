public class Human {
    private String name;
    private int yearOfBirth;
    private String town;

    public  Human (String name, int yearOfBirth, String town) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
    }

    public String getName() {
        return this.name;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public String getTown() {
        return this.town;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + getName() + ". Я из города " + getTown() + ". Я родился " + getYearOfBirth() + " в году. Будем знакомы!";
    }

}
