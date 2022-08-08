public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        int i = 0;
        while (i<10){
            i++;
            System.out.println(i);
        }

     for (int f = 10; f >=1; f--){
         System.out.println(f);
     }
    }

    public static void task2() {
        for (int d = 5; d <= 31; d = d+7){
            System.out.println("Сегодня пятница, " + d + " число. Необходимо подготовить отчет.");
        }

    }

    public static void task3() {
        for (int k = 1822; k <= 2122; k++ ){
            if (k % 79 == 0) {
                System.out.println(k);
            }

        }
    }
}