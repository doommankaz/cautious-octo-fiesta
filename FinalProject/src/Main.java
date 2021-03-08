import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection;
        Statement st;

        ConnectDB object_ConnectDB = new ConnectDB();
        connection = object_ConnectDB.get_connection();

        try {
            st = connection.createStatement();

//            String queryCreate1 = "CREATE TABLE " +
//                    "Weapon(weapon_id SERIAL PRIMARY KEY, " +
//                    "weapon_name varchar(255), " +
//                    "weapon_type varchar(255), " +
//                    "weapon_damage integer, " +
//                    "weapon_criticalDamage float, " +
//                    "weapon_criticalRate float)";
//            st.executeUpdate(queryCreate1);
//
//            String queryCreate4 = "CREATE TABLE " +
//                    "Dungeon(dungeon_id SERIAL PRIMARY KEY, " +
//                    "dungeon_name varchar(255), " +
//                    "room_number integer)";
//            st.executeUpdate(queryCreate4);
//
//            String queryCreate2 = "CREATE TABLE " +
//                    "Mob(mob_id SERIAL PRIMARY KEY, " +
//                    "mob_name varchar(255), " +
//                    "mob_hp integer, " +
//                    "mob_damage integer)";
//            st.executeUpdate(queryCreate2);
//
//            String queryCreate3 = "CREATE TABLE " +
//                    "Boss(boss_id SERIAL PRIMARY KEY, " +
//                    "boss_name varchar(255), " +
//                    "boss_hp integer, " +
//                    "boss_damage integer)";
//            st.executeUpdate(queryCreate3);
//
//              String queryCreate5 = "CREATE TABLE " +
//                    "Character(character_id SERIAL PRIMARY KEY, " +
//                    "character_name varchar(255), " +
//                    "character_hp integer, " +
//                    "character_mana integer, " +
//                      "weapon_id integer," +
//                    "FOREIGN KEY(weapon_id) REFERENCES Weapon(weapon_id))";
//              st.executeUpdate(queryCreate5);
//
//            String queryInsert = "INSERT INTO Weapon VALUES" +
//                    "(1, 'Frostfang', 'Sword', 30, 1.2, 0.3)," +
//                    "(2, 'Kudzu', 'Bow', 25, 1.1, 0.4)," +
//                    "(3, 'The Minstrel', 'Sword', 40, 1.9, 0.1)," +
//                    "(4, 'Sunrise', 'Axe', 30, 1.4, 0.4)," +
//                    "(5, 'Eternity', 'Bow', 35, 1.5, 0.5)," +
//                    "(6, 'The Predator', 'Scepter', 50, 1.2, 0.2)," +
//                    "(7, 'Crystalis', 'Sword', 35, 1.7, 0.8)," +
//                    "(8, 'Umbra', 'Scepter', 55, 1.2, 0.1)," +
//                    "(9, 'Ragnell', 'Bow', 35, 1.3, 0.6)," +
//                    "(10, 'Forblaze', 'Axe', 40, 1.4, 0.4)";
//            st.executeUpdate(queryInsert);
//            String queryInsert1 = "INSERT INTO Mob VALUES" +
//                    "(1, 'Undead', 100, 30)," +
//                    "(2, 'Troll', 60, 30)," +
//                    "(3, 'Bandit', 120, 30)," +
//                    "(4, 'Goblin', 50, 35)," +
//                    "(5, 'Ogre',  140, 25)," +
//                    "(6, 'Cultist', 60, 40)," +
//                    "(7, 'Murloc', 40, 20)," +
//                    "(8, 'Skeleton', 50, 30)," +
//                    "(9, 'Spider', 30, 25)," +
//                    "(10, 'Creeper', 30, 60)";
//            st.executeUpdate(queryInsert1);
//            String queryInsert2 = "INSERT INTO Boss VALUES" +
//                    "(1, 'Alma', 200, 90)," +
//                    "(2, 'Mike Tyson', 180, 70)," +
//                    "(3, 'C’Thun', 170, 80)," +
//                    "(4, 'Senator Armstrong', 150, 95)," +
//                    "(5, 'Orphan Of Kos',  190, 85)," +
//                    "(6, 'The Nameless King', 160, 75)," +
//                    "(7, 'Skolas', 140, 90)," +
//                    "(8, 'Bowser', 150, 100)," +
//                    "(9, 'Goro', 190, 65)," +
//                    "(10, 'Sephiroth', 170, 60)";
//            st.executeUpdate(queryInsert2);
//
//            String queryInsert4 = "INSERT INTO Dungeon VALUES" +
//                    "(1, 'Crypt of the White Occult', 10)," +
//                    "(2, 'The Gloomy Pits', 6)," +
//                    "(3, 'The Dry Chambers', 7)," +
//                    "(4, 'The Turbulent Cells', 8)," +
//                    "(5, 'Dungeon of the Ruthless Spider', 9)";
//            st.executeUpdate(queryInsert4);

            System.out.println("Finished");
//            st.close();
//            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        st = connection.createStatement();
        //System objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //Object Creation
        ResultSet rs = st.executeQuery("SELECT * FROM Weapon;");
        ArrayList<Weapon> weaponList = new ArrayList<>();
        while (rs.next()) {
            Weapon weapon = new Weapon(rs.getInt("weapon_id"), rs.getString("weapon_name"), rs.getString("weapon_type"), rs.getInt("weapon_damage"), rs.getFloat("weapon_criticaldamage"), rs.getFloat("weapon_criticalrate"));
            weaponList.add(weapon);
        }

        ResultSet rs1 = st.executeQuery("SELECT * FROM Mob;");
        ArrayList<Mob> Mobs = new ArrayList<>();
        while (rs1.next()) {
            Mob mob = new Mob(rs1.getInt("mob_id"), rs1.getString("mob_name"), rs1.getInt("mob_hp"), rs1.getInt("mob_damage"));
            Mobs.add(mob);
        }

//        ResultSet rst = st.executeQuery("SELECT * FROM Dungeon;");
//        ArrayList<Dungeon> DungeonList = new ArrayList<>();
//        while (rst.next()) {
//            Dungeon dungeon = new Dungeon(rst.getInt("dungeon_id"), rs1.getString("dungeon_name"), rs1.getInt("room_number"));
//            DungeonList.add(dungeon);
//        }
//        System.out.println("You are entering " + (DungeonList.get(rand.nextInt(DungeonList.size()))).getDungeon_name());

        Character hero = new Character();
        Character enemy = new Character();
        boolean running = true;
        GAME:
        // loop to make game running
        while (true) {
            System.out.println("---------------------------------------------------");
            System.out.println("\t1.Create a character");
            System.out.println("\t2.See all the weapons");
            System.out.println("\t3.See all the mobs");
            System.out.println("\t4.See all the bosses");
            System.out.println("\t5.Start the Game");
            System.out.println("\t6.Exit");
            String input = in.nextLine();

            switch (input) {
                case "1" -> {
                    System.out.println("\t>Name of your character: ");
                    String name = in.nextLine();
                    hero.setName(name);
                    System.out.println("\t>Health of your character: ");
                    int hp = in.nextInt();
                    hero.setHp(hp);
                    System.out.println("\t>Write the ID of the weapon you want to take(1-10): ");
                    int weapon_id = in.nextInt();
                    hero.setWeapon_id(weapon_id);
                    st.executeUpdate("INSERT INTO Character(character_name, character_hp, weapon_id) VALUES" + "('" + name + "'," + hp + "," + weapon_id + ")");
                    System.out.println("\t>You have created a character!");
                }
                case "2" -> {
                    ResultSet rs6 = st.executeQuery("SELECT * FROM Weapon;");
                    System.out.println("\t>Available weapons: ");
                    while (rs6.next()) {
                        System.out.println("---------------------------------------------------");
                        System.out.println("\t>Weapon ID: ");
                        System.out.println("\t>" + rs6.getInt("weapon_id"));
                        System.out.println("\t>Weapon Name: ");
                        System.out.println("\t>" + rs6.getString("weapon_name"));
                        System.out.println("\t>Weapon Type: ");
                        System.out.println("\t>" + rs6.getString("weapon_type"));
                        System.out.println("\t>Weapon Damage: ");
                        System.out.println("\t>" + rs6.getInt("weapon_damage"));
                        System.out.println("\t>Weapon Critical Damage: ");
                        System.out.println("\t>" + rs6.getFloat("weapon_criticalDamage") * 100 + "%");
                        System.out.println("\t>Weapon Critical Rate: ");
                        System.out.println("\t>" + rs6.getFloat("weapon_criticalRate") * 100 + "%");
                    }
                }
                case "3" -> {
                    System.out.println("\t>Available mobs(enemies): ");
                    ResultSet rs5 = st.executeQuery("SELECT * FROM Mob;");
                    while (rs5.next()) {
                        System.out.println("---------------------------------------------------");
                        System.out.println("\t>Mob ID: ");
                        System.out.println("\t>" + rs5.getInt("mob_id"));
                        System.out.println("\t>Mob Name: ");
                        System.out.println("\t>" + rs5.getString("mob_name"));
                        System.out.println("\t>Mob Health: ");
                        System.out.println("\t>" + rs5.getInt("mob_hp"));
                        System.out.println("\t>Mob Damage: ");
                        System.out.println("\t>" + rs5.getInt("mob_damage"));
                    }
                }
                case "4" -> {
                    ResultSet rs2 = st.executeQuery("SELECT * FROM Boss;");
                    System.out.println("\t>Available bosses: ");
                    while (rs2.next()) {
                        System.out.println("---------------------------------------------------");
                        System.out.println("\t>Mob ID: ");
                        System.out.println("\t>" + rs2.getInt("boss_id"));
                        System.out.println("\t>Mob Name: ");
                        System.out.println("\t>" + rs2.getString("boss_name"));
                        System.out.println("\t>Mob Health: ");
                        System.out.println("\t>" + rs2.getInt("boss_hp"));
                        System.out.println("\t>Mob Damage: ");
                        System.out.println("\t>" + rs2.getInt("boss_damage"));
                    }
                }
                case "5" -> {
                    ResultSet rs3 = st.executeQuery("SELECT * FROM Character;");
                    boolean running_game = true;
                    while (true) {
                        System.out.println("---------------------------------------------------");
                        while (hero.health > 0) {
                            int critHit;
                            System.out.println("\tYour HP:" + hero.health);
                            System.out.println("\tEnemy's HP:" + enemy.health);
                            System.out.println("\n\tWhat would you like to do?");
                            System.out.println("\t1.Attack");
                            System.out.println("\t2.Drink health potion");
                            input = in.nextLine();

                            if (input.equals("1")) {
                                int damageDealt = hero.attackDamage;
                                int damageTaken = enemy.attackDamage;

                                enemy.health -= damageDealt;
                                hero.health -= damageTaken;

                                System.out.println("\t> You strike the enemy for " + damageDealt + " damage");
                                System.out.println("\t> You receive " + damageTaken + " damage");

                                if (rand.nextInt(100) < hero.critRate) {
                                    critHit = rand.nextInt(hero.critDamage);
                                    enemy.health -= critHit;
                                    System.out.println("\t> You additionally damaged an enemy warrior for " + critHit + " damage!");
                                }

                                if (rand.nextInt(100) < enemy.critRate) {
                                    critHit = rand.nextInt(enemy.critDamage);
                                    hero.health -= critHit;
                                    System.out.println("\t> Enemy additionally damaged you for " + critHit + " damage!");
                                }


                                if (hero.health < 1) {
                                    System.out.println("\t> You have died");
                                    break GAME;
                                }
                            }

                            //If player choose to heal user Warrior
                            else if (input.equals("2")) {
                                if (hero.numHealthPotions > 0) {
                                    hero.health += hero.healthPotionHealAmount;
                                    hero.numHealthPotions--;
                                    System.out.println("\t> You drink a health potion, healing yourself for " + hero.healthPotionHealAmount + "."
                                            + "\n\t> You now have " + hero.health + "HP."
                                            + "\n\t> You have " + hero.numHealthPotions + " health potions left.\n");
                                } else {
                                    System.out.println("\t> You have no have potions left, defeat enemies to get some!");
                                }
                            } else {
                                System.out.println("\t> Invalid command!");
                            }

                        }
                        //escaping the loop
                        System.out.println("\t> You have defeated the enemy!");
                        break GAME;
                    }
                }
                case "6" -> {
                    break GAME;
                }
            }
        }

    }
}
