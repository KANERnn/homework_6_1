public class Skeleton extends Boss {
    public Skeleton(int hp, int damage, Weapon weapon, int strela) {
        super(hp, damage, weapon);
        this.strela = strela;
    }

    public int getStrela() {
        return strela;
    }

    public void setStrela(int strela) {
        this.strela = strela;
    }

    private int strela;

    @Override
    public String info() {
        return super.info() + getStrela();

    }
}

