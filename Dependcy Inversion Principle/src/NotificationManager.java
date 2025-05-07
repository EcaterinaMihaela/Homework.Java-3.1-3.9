class NotificationManager {
    private NotificationService notificationService;

    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;  // Dependență injectată
    }

    public void notifyUser(String message) {
        notificationService.sendNotification(message);
    }
}