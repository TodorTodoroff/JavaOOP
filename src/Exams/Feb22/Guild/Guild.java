package Exams.Feb22.Guild;

import java.util.*;


public class Guild {
    private String name;
    private int capacity;
    private Map<String, Player> rooster;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.rooster = new LinkedHashMap<>();

    }

    public void addPlayer(Player player) {
        if (capacity > rooster.size()) {
            this.rooster.put(player.getName(), player);
        }
    }

    public Boolean removePlayer(String name) {
        return this.rooster.remove(name) != null;
    }

    public void promotePlayer(String name) {
        Player player = this.rooster.get(name);
        if (player != null) {
            player.setRank("Member");
        }
    }

    public void demotePlayer(String name) {
        this.rooster.get(name).setRank("Trial");
    }

    public Player[] kickPlayersByClass(String clazz) {

        List<String> names = new ArrayList<>();

        for (var entry : rooster.entrySet()) {
            Player player = entry.getValue();
            if (player.getClazz().equals(clazz)){
                names.add(entry.getKey());
            }
        }
        Player[] removedPlayers = new Player[names.size()];

        for (int i = 0; i < names.size(); i++) {
            Player player = this.rooster.remove(names.get(i));
            removedPlayers[i] = player;
        }
        return removedPlayers;
    }

    public int count() {
        return this.rooster.size();
    }
    public String report(){
        StringBuilder out = new StringBuilder("Players in the guild: " + name + ":").append("\n");
        for (Player value : rooster.values()) {
            out.append(value).append(System.lineSeparator());
        }
        return out.toString().trim();
    }

}
