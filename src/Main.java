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
        WeaponType skeleton1 = WeaponType.MACHINE_GUN;
        Weapon weapon2 = new Weapon(WeaponType.MACHINE, "Лук ");
        Skeleton skeleton2 = new Skeleton(150, 10,weapon2, 15);
        System.out.println(skeleton2.info());

    }
}