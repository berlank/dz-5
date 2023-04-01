public class Main {
    public static void main(String[] args){
        //1. Надає значення 4 полям типу int
        int a = 3;
        int b = 938;
        int c = 232;
        int d = 33232;

        //2. Сумує їх попарно.
        int sum1 = a + b;
        int sum2 = c+d;

        //3. Виводить результат порівняння сум (true, якщо перша сума більша).
        boolean firstSumIsBigger = sum1 < sum2;
        System.out.println("Чи більше sum1? " + firstSumIsBigger);

        //4. Збільшує першу суму на 1.
        //5. Другу суму зменшує на 2.
        sum1++;
        sum2 -=2;

        //6. Виводить результат порівняння (true якщо перша сума більша).
        boolean firstSumIsBigger1 = sum1 > sum2;
        System.out.println("Чи більше sum1? " + firstSumIsBigger1);

        //7. Виводить true якщо хоча б одна сума кратна 2, інакше - false.
        boolean isSumDivines2 = sum1 % 2 == 0 || sum2 % 2 == 0;
        System.out.println("Чи є сума кратна 2? " + isSumDivines2);
    }
}
