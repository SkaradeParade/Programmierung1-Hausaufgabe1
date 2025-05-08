public class Programmieraufgabe3 {
    public static void main(String[] args) {
        for(int linesprinted = 0; linesprinted < 4; linesprinted++) {
            for(int charsprinted = 0; charsprinted <= 7; charsprinted++) {
                if(linesprinted % 2 == 1){
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