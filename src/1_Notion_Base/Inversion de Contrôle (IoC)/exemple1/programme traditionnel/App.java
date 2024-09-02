

// Exemple sans IoC :



public class App {
    public static void main(String[] args) {
        Service service = new Service();
        service.performAction();
    }
}

class Service {
    public void performAction() {
        System.out.println("Action performed.");
    }
}
