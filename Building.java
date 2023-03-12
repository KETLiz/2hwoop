public class Building implements HasHealthPoint {
    private final double maxHealthPoint;
    private double currentHealthPoint;

    public Building(double maxHealthPoint, double currentHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = currentHealthPoint;
    }

    public double getCurrentHealthPoint() {
        return currentHealthPoint;
    }

    public double getMaxHealthPoint() {
        return maxHealthPoint;
    }

    public double percentHealth() {
        return currentHealthPoint/maxHealthPoint*100;
    }
}
