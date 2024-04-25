
public class Main {

    public static void main(String[] args) {

        Gryffindor hermione = new Gryffindor("Гермиона", 20, 31, 22, 25, 20);
        Gryffindor ron = new Gryffindor("Рон", 12, 40, 11, 15, 22);
        Gryffindor harry = new Gryffindor("Гарри", 50, 50, 50, 50, 50);
        Slytherin draco = new Slytherin("Драко", 30, 30, 34, 31, 14, 75, 70);
        Slytherin graham = new Slytherin("Грэхем", 21, 20, 15, 34, 14, 18, 20);
        Slytherin gregory = new Slytherin("Грегори", 11, 12, 15, 14, 18, 17, 22);
        Hufflepuff zahariya = new Hufflepuff("Захария", 11, 12, 13, 14, 15);
        Hufflepuff sedrik = new Hufflepuff("Сэдрик", 20, 25, 31, 77, 44);
        Hufflepuff justin = new Hufflepuff("Джастин", 23, 13, 54, 71, 13);
        Ravenclaw chzhou = new Ravenclaw("Чжоу Чжанг", 23, 54, 72, 23, 11, 14);
        Ravenclaw padma = new Ravenclaw("Падма", 12, 77, 31, 54, 88, 99);
        Ravenclaw marcus = new Ravenclaw("Маркус", 46, 15, 79, 23, 55, 23);
        System.out.println("Гарри:");
        harry.printDescribe();
        System.out.println("Драко:");
        draco.printDescribe();
        System.out.println("Седрик:");
        sedrik.printDescribe();
        System.out.println("Маркус:");
        marcus.printDescribe();
        Gryffindor.compareGryffindorStud(ron, harry);
        Slytherin.compareSlytherinStud(graham, gregory);
        Ravenclaw.compareRavenclawStud(chzhou, marcus);
        Hufflepuff.compareHufflepuffStud(zahariya, sedrik);
        Hogwarts.compareAnyStudent(harry,draco);

    }
}