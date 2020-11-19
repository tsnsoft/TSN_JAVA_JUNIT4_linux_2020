package tsn_junit;

public class TSN_JUNIT {

    // Наша функция деления двух чисел
    // Будет принудительно возвращать сбой, если будет деление на 0
    public static double myDiv(double a, double b) throws Exception  {
        double c;
        c = a / b;
        System.out.println(c);
        if (!(Double.isNaN(c)) && (!Double.isInfinite(c))) {
            return c;

        } else {
            throw new Exception();
        }
    }

    // Основная часть программы
    public static void main(String[] args) throws Exception {
        System.out.println(myDiv(7,4)); // 1.75
    }

}
