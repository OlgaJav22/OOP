import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

    //ДЗ часть 1.

        Human maksim = new Human("Максим", 1988, "Ижевск", "бренд-менеджером");
        Human anna = new Human("Аня", 1993, "Москва", "методистом образовательных программ");
        Human katya = new Human("Катя", -1992, "Калининград", "продакт-менеджером");
        Human artem = new Human("Артем", -1995, "Москв", "Диретором по развитию бизнеса");

        System.out.println(maksim);
        System.out.println(anna);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println("\n Задание №3 \n");

        Car lada = new Car("Lada", "Granta", 1.7, "желтого", 2015, "России");
        Car audi = new Car("Audi", "A8 50L TDI quattro", 3.0, "черного", 2020, "Германии");
        Car bmw = new Car("BMW", "Z8", 3.0, "черного", 2021, "Германии");
        Car kia = new Car("Kia", "Sportage", 2.4, "красного", 2018, "Южной Корее");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевого", 2016, "Южной Корее");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);


    }
}