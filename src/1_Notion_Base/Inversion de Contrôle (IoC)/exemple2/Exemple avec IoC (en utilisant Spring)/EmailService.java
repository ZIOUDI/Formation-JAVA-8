import org.springframework.stereotype.Component;



// Déclarez les composants (beans)

@Component
public class EmailService {
    public void sendEmail(String recipient, String message) {
        System.out.println("Sending Email to " + recipient + " with message: " + message);
    }
}

@Component
public class SmsService {
    public void sendSms(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient + " with message: " + message);
    }
}

@Component
public class NotificationService {
    private final EmailService emailService;
    private final SmsService smsService;

    @Autowired
    public NotificationService(EmailService emailService, SmsService smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
    }

    public void sendEmail(String recipient, String message) {
        emailService.sendEmail(recipient, message);
    }

    public void sendSms(String recipient, String message) {
        smsService.sendSms(recipient, message);
    }
}
