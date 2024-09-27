package W3Resource;

    public class Ej50 {
        public static void main(String[] args) {
            String res35 = "";
            String res3 = "";
            String res5 = "";
            for (int i = 1; i < 1000; i++){
                if(i % 3 == 0 && i % 5 == 0){
                    res35 = res35 + " " + i;
                }else if(i % 3 == 0){
                    res3 = res3 + " " + i;
                }else if(i % 5 == 0){
                    res5 = res5 + " " + i;
                }
            }
            System.out.println("Divisibles entre 3 y 5: ");
            System.out.println(res35);
            System.out.println("Divisibles entre 3: ");
            System.out.println(res3);
            System.out.println("Divisibles entre 5: ");
            System.out.println(res5);
        }
    }