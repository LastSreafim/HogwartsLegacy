public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wise;
    private int wit;
    private int creativity;


    public Ravenclaw(String fullName, int magicPower, int transgressionDistance, int intelligence, int wise, int wit, int creativity) {
        super(fullName,magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wise = wise;
        this.wit = wit;
        this.creativity = creativity;

    }

    @Override
    public void printDescribe() {
        super.printDescribe();
        System.out.println("Ум: " + intelligence);
        System.out.println("Мудрость: " + wise);
        System.out.println("Остроумие: " + wit);
        System.out.println("Творчество: " + creativity);
    }

    public static void compareRavenclawStud(Ravenclaw student1, Ravenclaw student2) {
            if (student1.ravenclawsTotalPoints() > student2.ravenclawsTotalPoints()) {
                System.out.println(student1.getFullName() + " лучший когтевранец, чем " + student2.getFullName());
            } else {
                System.out.println(student2.getFullName() + " лучший когтевранец, чем " + student1.getFullName());
            }
        }


    public int ravenclawsTotalPoints() {
        return intelligence + wise + wit + creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }



    @Override
    public String toString() {
        return "Ravenclaw{" +
                "intelligence=" + intelligence +
                ", wise=" + wise +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }
}
