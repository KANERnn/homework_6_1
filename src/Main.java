public class Main {
    public static void main(String[] args) {
        WeaponType weaponType = WeaponType.MACHINE;
        Weapon weapon = new Weapon(weaponType, "Пулемёт ");
        Boss boss = new Boss(500,50, weapon);
        System.out.println(boss.info());
        WeaponType weaponSkelet = WeaponType.STEEL_ARMS;
        Weapon weapon1 = new Weapon(weaponSkelet, "Лук ");
        Skeleton skeleton = new Skeleton(350, 30, weapon1, 10);
        System.out.println(skeleton.info());

    }
}