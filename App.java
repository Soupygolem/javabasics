public class App {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.println(i);
            int number = i;
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
              } else {
                System.out.println(number + " is odd.");
              }
        }
    }
}
