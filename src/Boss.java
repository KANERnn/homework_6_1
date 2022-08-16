public class Boss extends GameEntity{
    private Weapon weapon;

    public Boss(int hp, int damage, Weapon weapon) {
        super(hp, damage);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String info () {
        return getHp() + " " + getDamage() + " " + weapon.getWeaponType() + " " + weapon.getGun();
    }
}

