public class BonusMilesService {
    public int calculate(int cost) {
        int milesForRubles = 20;//стоимость бонусной мили
        int bonusMiles = (cost / milesForRubles);//пересчет кол-ва бонусных миль за стоимость билета (10000/20)

        return bonusMiles;//отображает сумму бонусных миль
    }
}
