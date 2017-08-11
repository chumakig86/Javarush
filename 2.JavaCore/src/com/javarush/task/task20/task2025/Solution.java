package com.javarush.task.task20.task2025;

import java.util.*;

/*
Алгоритмы-числа
Число S состоит из M цифр, например, S=370 и M (количество цифр) = 3
Реализовать логику метода getNumbers, который должен среди натуральных чисел меньше N (long)
находить все числа, удовлетворяющие следующему критерию:
число S равно сумме его цифр, возведенных в M степень
getNumbers должен возвращать все такие числа в порядке возрастания.
Пример искомого числа:
370 = 3*3*3 + 7*7*7 + 0*0*0
8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8
На выполнение дается 10 секунд и 50 МБ памяти.
Требования:
1. В классе Solution должен присутствовать метод getNumbers c одним параметром типа long.
2. Метод getNumbers должен быть публичным.
3. Метод getNumbers должен быть статическим.
4. Метод getNumbers должен возвращать массив чисел удовлетворяющих условию задачи.
*/


/*
--- AVedensky:
Валидатор это решение не принимает. Однако судя по форуму, валидатором  были приняты решения которые работают
существенно медленее.
Это решение возвращает от 1, до последнего числа амстронга, которое меньше N.
Решение сделано единым кодом, внутри getNumbers, без разбивки на методы, это дополнительно ускорят расчеты.
Также, таблица степеней генерируется постепенно, по мере расчета. И уже посчитанные степени берутся из этой таблицы,
что ускоряет процесс.
Код отлажен однако требует наведения красоты (рефакторинга).
Можно оптимизировать и дальше, если использовать многопоточность.
Также можно добавить метки переходов из циклов (что весьма усложнит понимание этого кода), но возможно ускорит.
*/
public class Solution {

    private static List<Long> longList;
    private static int[] digitsMultiSet = new int[10];
    private static long[][] power;
    private static int number;
    private static long N;


    public static long[] getNumbers(long N) {
        List list = ArmstrongNumbersMultiSetLongOpt.generate((int) (Math.log10(N)));
        long[] result = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = (long)list.get(i);
        }
        return result;
    }

    private static void search(int digit, int unused, long pow) {
        if (digit == 10) {
            if (check(pow))
                longList.add(pow);
            return;
        }

        if (digit == 9) {
            digitsMultiSet[digit] = unused;
            search(digit + 1, 0, pow + unused * power[digit][number]);
        } else {
            for (int i = 0; i <= unused; i++) {
                digitsMultiSet[digit] = i;
                search(digit + 1, unused - i, pow + i * power[digit][number]);
            }
        }
    }

    private static boolean check(long pow) {
        if (Solution.N <= pow)
            return false;

        int[] testMultiSet = new int[10];

        while (pow > 0) {
            int i = (int) (pow % 10);
            testMultiSet[i]++;
            pow = pow / 10;
        }

        for (int i = 0; i < 10; i++) {
            if (testMultiSet[i] != digitsMultiSet[i])
                return false;
        }

        return true;
    }


    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(Integer.MAX_VALUE)));
        long end = System.currentTimeMillis();
        System.out.println(end - start + " millisecond");
        System.out.println("memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024) + " mb");

    }
}