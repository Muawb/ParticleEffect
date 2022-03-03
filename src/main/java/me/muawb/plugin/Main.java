package me.muawb.plugin;

import me.muawb.plugin.commands.CommandEffect;
import org.bukkit.Particle;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){

        File config = new File(getDataFolder() + File.separator + "config.yml" );
        if(!config.exists()){
            getConfig().options().copyDefaults(true);
            System.out.println("Config create");
            saveDefaultConfig();
            System.out.println("Load config");
        }

        getCommand("pe").setExecutor(new CommandEffect(this));
        System.out.println("Load plugin");
        System.out.println("Complete");


    }

}
