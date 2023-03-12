public class Reder{
    public void showInfo(Object o) {
        if (o instanceof HasHealthPoint hasHealthPoint) {
            //String color = Color.GREEN.getColor();
            //System.out.println(color);
            System.out.println(hasHealthPoint.percentHealth());
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