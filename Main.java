public class Main {
    public static int bonus (int price){
        int BonusUnit = 20;
        int BonusMiles = price / BonusUnit;
        return BonusMiles;
    }
    public static void main (String[] args){
        System.out.println("Поздравляем! Вам начисленно " + bonus(17365) + " бонусных миль");
    }
}

