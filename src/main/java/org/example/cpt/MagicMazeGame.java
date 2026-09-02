package org.example.cpt;

public class MagicMazeGame {
    private Room room;

    public MagicMazeGame(Room room) {
        this.room = room;
    }

    public String showRoom(){
        return room.getRoomMessage();
    }
}
