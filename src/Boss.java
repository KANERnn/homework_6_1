public class Boss extends GameEntity{
    public Boss(int hp, int damage, String superAbility) {
        super(hp, damage, superAbility);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon weapon = new Weapon();
    public String info(){
        return getHp() + " " + getDamage() + getSuperAbility() + weapon.getMachine();
    }
}
