import java.util.Arrays;

public class FirstClass {

    //1 метод
    public void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    //2 метод
    public void checkSumSign() {
        int a = 5;
        int b = 7;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //3 метод
    public void printColor() {
        int value = 215;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    //4 метод
    public void compareNumbers() {
        int a = 0;
        int b = 4;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //5 метод
    public boolean checkDiapason(int a, int b) {
        boolean flag = (a + b >= 10 && a + b <= 20);
        return flag;
    }

    //6 метод
    public void positiveNegative() {
        int a = 9;
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //7 метод
    public boolean numberPositive(int num) {
        boolean NumberPositive = (num >= 0);
        return NumberPositive;
    }

    //8 метод
    public void repeatWord(int a, String s) {
        for (int i = 0; i < a; i++) {
            System.out.print(s);
        }
        System.out.println();
    }

    //9 метод
    public boolean leapYear() {
        int year = 2004;
        boolean flag = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        return flag;
    }

    // 10 метод
    public void toggleArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //11 Метод
    public void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    //12 метод
    public void multiplyArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //13 метод
    public void fillDoubleArray() {
        int[][] a = new int[6][6];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j || i + j == a.length - 1) {
                    a[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }

    //14 метод
    public int[] initArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}


