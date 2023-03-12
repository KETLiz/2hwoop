public class Person implements HasHealthPoint, Tiredness {
    private final double maxHealthPoint;
    private double currentHealthPoint;
    private final double maxEnergy;
    private double currentEnergy;

    public Person(double maxHealthPoint, double currentHealthPoint, double maxEnergy, double currentEnergy) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = currentHealthPoint;
        this.maxEnergy = maxEnergy;
        this.currentEnergy = currentEnergy;
    }

    public double getCurrentHealthPoint() {
        return currentHealthPoint;
    }

    public double getMaxHealthPoint() {
        return maxHealthPoint;
    }

    public double getCurrentEnergy() {
        return currentEnergy;
    }

    public double getMaxEnergy() {
        return maxEnergy;
    }

    public double percentHealth() {
        return currentHealthPoint/maxHealthPoint*100;
    }

    public double percentTire() {
        return currentEnergy/maxEnergy*100;
    }
}
