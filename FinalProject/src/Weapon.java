public class Weapon {
    public int weapon_id;
    public String weapon_name;
    public String weapon_type;
    public int damage;
    public float criticalDamage;
    public float criticalRate;

    public Weapon(int weapon_id, String weapon_name, String weapon_type, int weapon_damage, float weapon_criticaldamage, float weapon_criticalrate) {
        this.weapon_id = weapon_id;
        this.weapon_name = weapon_name;
        this.weapon_type = weapon_type;
        this.damage = weapon_damage;
        this.criticalDamage = weapon_criticaldamage;
        this.criticalRate = weapon_criticalrate;
    }
}
