public class Slytherin extends Hogwarts {
    private int cunning;
    private int resolute;
    private int resourcefulness;
    private int ambitiousness;
    private int lustForPower;


    public Slytherin(String fullName, int magicPower, int transgressionDistance, int cunning, int resolute,
                     int resourcefulness, int ambitiousness, int lustForPower) {
        super(fullName,magicPower, transgressionDistance);
        this.cunning = cunning;
        this.resolute = resolute;
        this.resourcefulness = resourcefulness;
        this.ambitiousness = ambitiousness;
        this.lustForPower = lustForPower;

    }

    @Override
    public void printDescribe() {
        super.printDescribe();
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительсность: " + resolute);
        System.out.println("Находчивость: " + resourcefulness);
        System.out.println("Амбициозность: " + ambitiousness);
        System.out.println("Жажда Власти: " + lustForPower);
    }

    public static void compareSlytherinStud(Slytherin student1, Slytherin student2) {
        if (student1.slytherinsTotalPoints() > student2.slytherinsTotalPoints()) {
            System.out.println(student1.getFullName() + " лучший слизеринец, чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучший слизеринец, чем " + student1.getFullName());
        }
    }

    public int slytherinsTotalPoints() {
        return cunning + resolute + resourcefulness + ambitiousness + lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResolute() {
        return resolute;
    }

    public void setResolute(int resolute) {
        this.resolute = resolute;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public void setAmbitiousness(int ambitiousness) {
        this.ambitiousness = ambitiousness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }



    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", resolute=" + resolute +
                ", resourcefulness=" + resourcefulness +
                ", ambitiousness=" + ambitiousness +
                ", lustForPower=" + lustForPower +
                '}';
    }
}
