public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(500, 50, " Magic ");
        boss.weapon.setMachine(" AKM");
        System.out.println(boss.info());
    }
}