import java.util.Scanner;

public class TimerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("⏳ Enter countdown time in seconds:");
        int timeInSeconds = scanner.nextInt();

        System.out.println("🔔 Timer started for " + timeInSeconds + " seconds...");

        try {
            for (int i = timeInSeconds; i >= 0; i--) {
                System.out.print("\r⏰ Time left: " + i + " seconds ");
                Thread.sleep(1000);
            }
            System.out.println("\n✅ Time's up!");
        } catch (InterruptedException e) {
            System.out.println("\n❌ Timer interrupted.");
        } finally {
            scanner.close();
        }
    }
}
