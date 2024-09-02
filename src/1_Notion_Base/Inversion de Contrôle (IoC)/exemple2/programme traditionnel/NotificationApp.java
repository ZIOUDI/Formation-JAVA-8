

// Exemple sans IoC :



public class NotificationApp {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        SmsService smsService = new SmsService();
        NotificationService notificationService = new NotificationService(emailService, smsService);

        notificationService.sendEmail("example@example.com", "Hello Email");
        notificationService.sendSms("0612345678", "Hello SMS");
    }
}

class NotificationService {
    private EmailService emailService;
    private SmsService smsService;

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

class EmailService {
    public void sendEmail(String recipient, String message) {
        System.out.println("Sending Email to " + recipient + " with message: " + message);
    }
}

class SmsService {
    public void sendSms(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient + " with message: " + message);
    }
}
