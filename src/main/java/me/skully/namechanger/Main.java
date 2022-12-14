package me.skully.namechanger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main instance;

    Holder holder = new Holder();

    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();

        getServer().getPluginCommand("namechanger").setExecutor(new NameChangerCommand());

        System.out.println("§aSNameChanger §f| Has enabled");
        if(Bukkit.getPluginManager().isPluginEnabled("PlaceholderAPI")) {
            holder.register();
        }
    }

    @Override
    public void onDisable() {
        instance = null;

        holder.unregister();

        System.out.println("§aSNameChanger §f| Has disabled");
    }

    public static Main getInstance() {
        return instance;
    }
}
