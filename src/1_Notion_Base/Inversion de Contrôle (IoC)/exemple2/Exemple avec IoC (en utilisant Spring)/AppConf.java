


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Configuration du conteneur Spring :



/*
L'annotation @Configuration indique que la classe AppConfig est une classe de configuration qui peut
définir des beans pour le conteneur Spring.
Elle joue un rôle similaire à un fichier de configuration XML
 */
/*
L'annotation @ComponentScan indique à Spring où chercher les classes annotées avec des annotations telles que:
 @Component, @Service, @Repository, et @Controller.
 */
@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
}

public class NotificationApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        NotificationService notificationService = context.getBean(NotificationService.class);

        notificationService.sendEmail("example@example.com", "Hello Email");
        notificationService.sendSms("1234567890", "Hello SMS");
    }
}
