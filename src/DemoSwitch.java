public class DemoSwitch {

    public static void main(String[] args) {
        switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> System.out.println("A");
            case TUESDAY                -> System.out.println("B");
            case THURSDAY, SATURDAY     -> System.out.println("C");
            case WEDNESDAY              -> System.out.println("D");
        }
    }

}
