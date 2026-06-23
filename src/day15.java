public class day15 {
    /*
    static void main() throws InterruptedException {
        Runnable chefTask = () -> {
            String[] items = {"parotta", "Briyani", "waffle"};
            for (int i = 0; i < items.length; i++) {
                System.out.println("Cooking Item:" + items[i]);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };
        Thread chefThread = new Thread(chefTask, "chef_thread");
        chefThread.start();
        chefThread.join();

    }
}
*/


    static String[] items = {"bun", "coffee", "tea"};

    private static int nextOrderIndex = 0;

    static void pickOrder() {
        while (nextOrderIndex < items.length) {
            int currentOrderIndex = nextOrderIndex;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            nextOrderIndex++;
            if (nextOrderIndex < items.length) {
                System.out.println(Thread.currentThread().getName() + " is preparing : " + items[currentOrderIndex]);
            }
        }
    }

    static void main() throws InterruptedException {
        Thread chefOne = new Thread(() -> pickOrder(), "chef-one");
        Thread chefTwo = new Thread(() -> pickOrder(), "chef-two");

        chefOne.start();
        chefTwo.start();

        chefOne.join();
        chefTwo.join();
    }

}