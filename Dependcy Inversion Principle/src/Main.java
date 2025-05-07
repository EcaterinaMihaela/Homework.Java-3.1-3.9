public class Main {
    public static void main(String[] args) {
        // Creăm instanța corectă a serviciului de notificare
        NotificationService emailService = new EmailService();
        NotificationManager notificationManager = new NotificationManager(emailService);
        notificationManager.notifyUser("Hello via email!");

        // Putem schimba cu ușurință serviciul de notificare
        NotificationService smsService = new SmsService();
        notificationManager = new NotificationManager(smsService);
        notificationManager.notifyUser("Hello via SMS!");
    }
}