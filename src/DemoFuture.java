import java.util.concurrent.CompletableFuture;

public class DemoFuture {


    public static void main(String[] args) throws InterruptedException {
        CompletableFuture
                .supplyAsync(DemoFuture::longProcess)
                .thenAccept(System.out::println);

        Thread.sleep(4000);
        System.out.println("Done");
    }

    private static int longProcess() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 1;
    }

}
