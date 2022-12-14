package me.skully.namechanger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class NameChangerCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Main.getInstance().reloadConfig();
        sender.sendMessage("§aSNameChanger §f| Config reloaded");
        return true;
    }
}
