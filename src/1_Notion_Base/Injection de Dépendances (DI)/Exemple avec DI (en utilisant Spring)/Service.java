import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// Déclarez les composants (beans)

@Component
public class Service {
    private Repository repository;

    @Autowired
    public Service(Repository repository) {
        this.repository = repository;
    }

    public void performAction() {
        repository.doSomething();
    }
}

@Component
public class Repository {
    public void doSomething() {
        System.out.println("Repository action.");
    }
}
