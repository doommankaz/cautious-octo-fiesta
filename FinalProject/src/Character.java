import java.sql.*;

public class Character {
    public int id;
    public String name;
    public int hp;
    public int mana;
    public int weapon_id;
    public int dungeon_id;
    int health = 1000;
    int attackDamage = 100;
    int numHealthPotions = 3;
    int healthPotionHealAmount = 300;
    int critDamage = 200;
    int critRate = 50;

    public Character(){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public int getWeapon_id() {
        return weapon_id;
    }

    public int getDungeon_id() {
        return dungeon_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setWeapon_id(int weapon_id) {
        this.weapon_id = weapon_id;
    }

    public void setDungeon_id(int dungeon_id) {
        this.dungeon_id = dungeon_id;
    }


}
