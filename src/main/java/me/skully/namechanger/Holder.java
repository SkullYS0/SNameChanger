package me.skully.namechanger;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;

public class Holder extends PlaceholderExpansion {

    public String getAuthor() {
        return "skully";
    }

    public String getIdentifier() {
        return "namechanger";
    }

    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public String onPlaceholderRequest(Player p, String identifier) {
        if(Main.getInstance().getConfig().contains("changer." + identifier)) {
         return String.valueOf(Main.getInstance().getConfig().getString("changer." + identifier));
        }else {
            return "ERROR";
        }
    }
}