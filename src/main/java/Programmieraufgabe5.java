public class Programmieraufgabe5 {
    public static void main(String[] args) {
        for(int linesprinted = 1; linesprinted <= 5; linesprinted++) {
            for(int charsprinted = 0; charsprinted < linesprinted; charsprinted++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int linesprinted = 4; linesprinted >= 1; linesprinted--) {
            for (int charsprinted = 0; charsprinted < linesprinted; charsprinted++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}