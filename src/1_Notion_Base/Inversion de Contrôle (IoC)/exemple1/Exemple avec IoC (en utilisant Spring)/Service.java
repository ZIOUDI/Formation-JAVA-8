import org.springframework.stereotype.Component;



// Déclarez les composants (beans)

@Component
public class Service {
    public void performAction() {
        System.out.println("Action performed.");
    }
}
