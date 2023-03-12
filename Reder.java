public class Reder{

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLACK = "\u001B[30m";

    public void showInfo(Object o) {
        if (o instanceof HasHealthPoint hasHealthPoint) {
            //String color = Color.GREEN.getColor();
            //System.out.println(color);
            double healthPercent = hasHealthPoint.percentHealth();
            if (healthPercent < 24.0) {
                System.out.println(ANSI_BLACK + healthPercent + ANSI_BLACK);
            } else if (healthPercent > 24.0 && healthPercent < 51.0) {
                System.out.println(ANSI_RED + healthPercent + ANSI_RED);
            } else if (healthPercent > 50 && healthPercent < 101) {
                System.out.println(ANSI_GREEN + healthPercent + ANSI_GREEN);
            }

            // Color c = Color.calculate(per);
            // System.out.println(c);
        }
        if (o instanceof Person p) {
            System.out.println(p.percentTire());
            System.out.println(p.percentHealth());
        }
    }

    public void foo(HasHealthPoint hasHealthPoint) {

    }

}