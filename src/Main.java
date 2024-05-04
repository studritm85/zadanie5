public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        double weight = 90; // вес в кг
        double height = 1.74; // рост в метрах

        int bmiIndex = bmiService.calculate(weight, height);

        System.out.println("BMI индекс: " + bmiIndex);
    }
}



