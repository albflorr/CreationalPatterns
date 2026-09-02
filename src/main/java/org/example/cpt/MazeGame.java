package org.example.cpt;

public abstract class MazeGame {
    public static MagicMazeGame createMaze(){
        Room r1 = makeRoom();
        return new MagicMazeGame(r1);
    }

    public static Room makeRoom(){
        return new Room();
    }
}
