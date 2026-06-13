import java.util.Date;
import java.util.concurrent.Callable;

public class day7 {
    /*
    static class Notification{
        private String to;
        Notification(String to){
            this.to = to;        }
        void send(){        }    }
    static class AudioNotification extends Notification {
        AudioNotification(String to){
            super(to);        }
        void sendAudioNotification(){
            System.out.println("Sending audio notification...");
        }    }    static class TextNotification extends Notification {
        TextNotification(String to){
            super(to);        }
        void sendTextNotification(){
            System.out.println("Sending text notification...");
        }    }
    public static void main(String[] args){
        AudioNotification audioNotification = new AudioNotification("   arvaindg@gmsail.com    ");
        audioNotification.sendAudioNotification();
        TextNotification textNotification = new TextNotification("   1234567890    ");
        textNotification.sendTextNotification();
    }
}
/*

    static class Request {
        String name;
        String Date;
        String reason;

        Request(String name, String Date, String reason) {
            this.name = name;
            this.Date = Date;
            this.reason = reason;
        }

        void approve() {
            System.out.println("Approving Request");
        }

        void reject() {
            System.out.println("Rejecting Request");
        }
    }

    static class LeaveRequest extends Request {
        LeaveRequest(String name, String Date, String reason) {
            super(name, Date, reason);
        }

        void approveLeaveRequest() {
            System.out.println("Approving leave request");
        }

        void rejectLeaveRequest() {
            System.out.println("Reject leave request");
        }
    }
        static class onDutyRequest extends Request {
            onDutyRequest(String name, String Date, String reason) {
                super(name, Date, reason);
            }

            void approveOnDutyRequest() {
                System.out.println("Approving on duty request");
            }

            void rejectOnDutyRequest() {
                System.out.println("Reject on duty request");
            }
        }

        static void main() {
            LeaveRequest leaveRequest = new LeaveRequest("mithra", "14-04-2008", "Fever");
            leaveRequest.approveLeaveRequest();
            onDutyRequest onDutyRequest = new onDutyRequest("mithra", "14-04-2008", "Culturals");
            onDutyRequest.rejectOnDutyRequest();
        }
    }

    */
    /*
    static class Payment {
        String amount;

        Payment(String amount) {
            this.amount = amount;
        }

        void Transfer() {
            System.out.println("payment is transfer");
        }
    }

    static class upiPayment extends Payment {
        upiPayment(String amount) {
            super(amount);
        }

        void TransferupiPayment() {
            System.out.println("upipayment Transfer");
        }
    }
        static class cardPayment extends Payment {
            cardPayment(String amount) {
                super(amount);
            }

            void TransfercardPayment() {
                System.out.println("cardPayment Transfer");
            }
        }
            static class NBPayment extends Payment {
                NBPayment(String amount) {
                    super(amount);
                }

                void TransferNBPayment() {
                    System.out.println("NBPayment Transfer");
                }
            }

            static void main() {
                upiPayment UpiPayment = new upiPayment("5000");
                UpiPayment.TransferupiPayment();
                cardPayment CardPayment = new cardPayment("8000");
                CardPayment.TransfercardPayment();
                NBPayment nbPayment = new NBPayment("10000");
                nbPayment.TransferNBPayment();
                }
                }
     */
