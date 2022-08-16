public class GameEntity {
    private int hp;
    private int damage;
    private String superAbility;

    public GameEntity(int hp, int damage, String superAbility) {
        this.hp = hp;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }
}
