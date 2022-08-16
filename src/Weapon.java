public class Weapon {
    private WeaponType weaponType;
    private String gun;

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public Weapon(WeaponType weaponType, String gun) {
        this.weaponType = weaponType;
        this.gun = gun;
    }
}
