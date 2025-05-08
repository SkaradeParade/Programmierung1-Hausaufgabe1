public class Programmieraufgabe4 {
    public static void main(String[] args) {
        for(int linesprinted = 0; linesprinted < 7; linesprinted++) {
            for(int charsprinted = 0; charsprinted < 7 - linesprinted; charsprinted++) {
                if(linesprinted == 2) {
                    System.out.print(".");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}