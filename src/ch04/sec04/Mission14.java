package ch04.sec04;

public class Mission14 {
        public static void main(String[] args) {

            int star = 4;
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= star; j++) {
                    if (j <= star - i) {
                        System.out.print("_");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }

//___*
//__**
//_***
//****

