public class Mob {
    public int mob_id;
    public String name;
    public int hp;
    public int damage;

    public Mob(int mob_id, String mob_name, int mob_hp, int mob_damage) {
        this.mob_id = mob_id;
        this.name = mob_name;
        this.hp = mob_hp;
        this.damage = mob_damage;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
