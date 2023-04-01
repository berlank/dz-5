public class Main {
    public static void main(String[] args){
        int a = 3;
        int b = 938;
        int c = 232;
        int d = 33232;

        int sum1 = a + b;
        int sum2 = c+d;
        boolean firstSumIsBigger = sum1 < sum2;
        System.out.println("Чи більше sum1? " + firstSumIsBigger);

        sum1++;
        sum2 -=2;

        boolean firstSumIsBigger1 = sum1 > sum2;
        System.out.println("Чи більше sum1? " + firstSumIsBigger1);

        boolean isSumDivines2 = sum1 % 2 == 0 || sum2 % 2 == 0;
        System.out.println("Чи є сума кратна 2? " + isSumDivines2);
    }
}
