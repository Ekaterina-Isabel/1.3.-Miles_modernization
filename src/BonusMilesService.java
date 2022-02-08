public class BonusMilesService {   // создали объект Бонус

    public int calculate (int cost) {   // метод calculate, int - тип результата, int cost - параметр (тип, имя)
        int costOf1Mile = 2_000;
        int numberOfMiles = 0;   // стоимость 1 мили

        if (cost >= 0) {
            numberOfMiles = cost / costOf1Mile;
        }

        return numberOfMiles;   // возвращаемое значение
    }
}
