public class Dungeon {
    public int dungeon_id;
    public String dungeon_name;
    public int room_number;

    public Dungeon(int dungeon_id, String dungeon_name, int room_number) {
        this.dungeon_id = dungeon_id;
        this.dungeon_name = dungeon_name;
        this.room_number = room_number;
    }

    public void setDungeon_id(int dungeon_id) {
        this.dungeon_id = dungeon_id;
    }

    public int getDungeon_id() {
        return dungeon_id;
    }

    public int getRoom_number() {
        return room_number;
    }

    public String getDungeon_name() {
        return dungeon_name;
    }

    public void setDungeon_name(String dungeon_name) {
        this.dungeon_name = dungeon_name;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }
}
