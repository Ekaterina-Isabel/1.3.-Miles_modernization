public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();   // создаем объект из класса
        int cost = 10_000;  // цена билета
        int miles = service.calculate(cost);   // вызываем метод calculate, передаем price
        System.out.println("Количество начисленных миль за купленный билет: " + miles);  // печатаем значение переменной miles
    }
}