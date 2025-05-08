public class Programmieraufgabe6 {
    public static void main(String[] args) {
        for(int lines = 0; lines < 9; lines++) {
            for(int chars = 0; chars <= 8; chars++) {
                if(lines % 2 ==1){
                    if(chars % 2 ==1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(".");
                    }
                } else {
                    if(chars % 2 ==1) {
                        System.out.print(".");
                    }
                    else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}