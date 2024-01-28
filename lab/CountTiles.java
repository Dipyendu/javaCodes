class Room {
    int w;
    int l;
    int h;

    Room(int w, int l, int h) {
        this.w = w;
        this.l = l;
        this.h = h;
    }

    public int calculateRoomArea() {
        int a1 = l * w;
        int a2 = 2 * h * l;
        int a3 = 2 * h * w;
        return a1 + a2 + a3;
    }
}

class Tile {
    int w;
    int l;

    Tile(int w, int l) {
        this.w = w;
        this.l = l;
    }

    public int calculateTileArea() {
        return l * w;
    }
}

public class CountTiles {
    public static void main(String[] args) {
        Room room = new Room(7, 8, 9);
        Tile tile = new Tile(5, 5);

        System.out.println("Area of Room: " + room.calculateRoomArea());
        System.out.println("Area of Tile: " + tile.calculateTileArea());
        System.out.println("Number of tiles required: " + room.calculateRoomArea() / tile.calculateTileArea());
    }
}
