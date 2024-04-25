public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;


    public Hufflepuff(String fullName, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(fullName,magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public void printDescribe() {
        System.out.println("Трудолюбие: " + diligence);
        System.out.println("Верность: " + loyalty);
        System.out.println("Честь " + honesty);
    }

    public static void compareHufflepuffStud(Hufflepuff student1, Hufflepuff student2) {
        if (student1.hufflepuffsTotalPoints() > student2.hufflepuffsTotalPoints()) {
            System.out.println(student1.getFullName() + " лучший пуффендуец, чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучший пуффендуец, чем " + student1.getFullName());
        }
    }
    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }



    public int hufflepuffsTotalPoints() {
        return diligence + loyalty + honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
