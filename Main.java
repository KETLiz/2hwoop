public class Main {
    public static void main(String[] args) {
        Person p = new Person(100.0, 20.3, 100.0, 30.0);
        Building b = new Building(200.0, 150.4);
        Reder r = new Reder();
        r.showInfo(p);
        r.showInfo(b);
    }
}
