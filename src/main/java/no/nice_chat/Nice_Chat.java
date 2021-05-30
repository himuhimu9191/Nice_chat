package no.nice_chat;

import no.nice_chat.Commands.nicechat_cmd;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Nice_Chat extends JavaPlugin implements Listener {

    private static JavaPlugin plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        getServer().getPluginManager().registerEvents(this,this);

        getCommand("nicechat").setExecutor(new nicechat_cmd());
        getCommand("nicechat").setTabCompleter(new starttab());
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "gamerule sendCommandFeedback false");

        super.onEnable();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        super.onDisable();
    }

    public static JavaPlugin getPlugin(){
        return plugin;
    }
}
