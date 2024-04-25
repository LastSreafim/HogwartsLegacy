import java.util.Objects;

public class Hogwarts {
    private int magicPower;
    private int transgressionDistance;
    private String fullName;

    public Hogwarts(String fullName, int magicPower, int transgressionDistance) {
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
        this.fullName = fullName;
    }

    public void printDescribe() {
        System.out.println("Имя: " + fullName);
        System.out.println("Сила магии: " + magicPower);
        System.out.println("Расстояние трансгрессии " + transgressionDistance);
    }

    public static void compareAnyStudent(Hogwarts student1, Hogwarts student2) {

            if (student1.totalPoints() > student2.totalPoints()) {
                System.out.println(student1.getFullName() + " обладает большей мощностью магии, чем " + student2.getFullName());
            } else {
                System.out.println(student2.getFullName() + " обладает большей мощностью магии, чем " + student1.getFullName());

        }
    }

    public int totalPoints() {
        return magicPower + transgressionDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return magicPower == hogwarts.magicPower && transgressionDistance == hogwarts.transgressionDistance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(magicPower, transgressionDistance);
    }

}
