public class Main {
    public static void main(String[] args) {

        Prelungitor prelungitor = new Prelungitor();

        new Computer(prelungitor);
        new Incarcator(prelungitor);
        new Toaster(prelungitor);

        System.out.println("Change to off");
        prelungitor.setStare(false);
        System.out.println("Change to on");
        prelungitor.setStare(true);

    }
}
