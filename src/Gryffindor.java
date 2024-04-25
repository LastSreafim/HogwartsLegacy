public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;




    public Gryffindor(String fullName, int nobility, int honor, int bravery, int magicPower, int transgressionDistance) {
        super(fullName,magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public void printDescribe() {
        super.printDescribe();
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + bravery);
    }

    public static void compareGryffindorStud(Gryffindor student1, Gryffindor student2) {
        if (student1.griffindorsTotalPoints() > student2.griffindorsTotalPoints()) {
            System.out.println(student1.getFullName() + " лучший гриффиндорец, чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучший гриффиндорец, чем " + student1.getFullName());
        }
    }

        public int griffindorsTotalPoints() {
        return nobility + honor + bravery;
    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }



    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
