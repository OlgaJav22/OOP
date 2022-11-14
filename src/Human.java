public class Human {
    private String name;
    private int yearOfBirth;
    private String town;
    private String jobTitle;

    public  Human (String name, int yearOfBirth, String town, String jobTitle) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.jobTitle = jobTitle;
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

    public  String getJobTitle () {
        return this.jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + getName() + ". Я из города " + getTown() + ". Я родился " + getYearOfBirth() + " в году. Я работаю на должности: " + getJobTitle() + ". Будем знакомы!";
    }

}
