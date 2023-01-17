import java.util.Scanner;

public class Main {

    public static final String PRINT_MESSAGE = "Введите радиус ";

    public static double scanUserInput(){
        double r;
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextDouble();
        return r;
    }
    public static double S(double r, double R){
        return (Math.PI * r * r / 2) + (Math.PI * R * R * 3 / 8) - (Math.PI * r * r * 3 / 8) + (R * R) - (Math.PI * R * R / 4);
    }

    public static void main(String[] args) {

        System.out.print(PRINT_MESSAGE + "малой окружности:");
        double r = scanUserInput();

        System.out.print(PRINT_MESSAGE + "большой окружности:");
        double R = scanUserInput();

        System.out.print("Площадь заштрихованной части фигуры: " + S(r, R));
    }
}