public class day14_Factory {
    interface Notification {
        void send(String to, String message);
    }

    class EmailNotification implements Notification {
        @Override
        public void send(String to, String message) {
            System.out.println("sending Email:" + message + ", to" + to);
        }
    }

    class WhatsappNotification implements Notification {
        @Override
        public void send(String to, String message) {
            System.out.println("sending Whatsapp: " + message + ", to" + to);
        }
    }

    static Notification getNotification(day14_Factory factory, String type) {
        return switch (type) {
            case "Email" -> factory.new EmailNotification();
            case "Whatsapp" -> factory.new WhatsappNotification();
            default -> throw new IllegalArgumentException("Invalid notification type: " + type);
        };
    }

        static void main () {
            day14_Factory factory = new day14_Factory();

            String type = "Whatsapp";
            getNotification(factory, type).send("6375546637", "Hello");
        }

    }
