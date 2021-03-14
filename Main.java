public class Main {
    public static int bonus(int price) {
        int bonusUnit = 20;
        int bonusMiles = price / bonusUnit;
        return bonusMiles;
    }
    public static void main(String[] args) {
        System.out.println("Поздравляем! Вам начисленно " + bonus(17365) + " бонусных миль");
    }
}
