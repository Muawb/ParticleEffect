package me.muawb.plugin.commands;

import me.muawb.plugin.Main;
import me.muawb.plugin.particle.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandEffect implements CommandExecutor {

    private Main plugin;
    private int taskid;

    public CommandEffect(Main plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String str, String[] args) {
        Player p = (Player) sender;

        if(args.length == 0){
        p.sendMessage(ChatColor.LIGHT_PURPLE +        "     ParticleEffect");
        p.sendMessage(ChatColor.GOLD +                "Commands:");
        p.sendMessage(ChatColor.DARK_GREEN +          "/pw " + ChatColor.GRAY + "- info for plugin");
        p.sendMessage(ChatColor.DARK_GREEN +          "/pw list " + ChatColor.GRAY + "- show all effects");
        p.sendMessage(ChatColor.DARK_GREEN +          "/pw reload " + ChatColor.GRAY + "- reloading plugin");
        return true;
        }

        if(args[0].equalsIgnoreCase("list")){

            p.sendMessage(ChatColor.YELLOW + "stars, dust, lavadrop, waterdrop, crit, critmagic,");
            p.sendMessage(ChatColor.YELLOW + "enchant, note, heart, portal, spell,");
            p.sendMessage(ChatColor.YELLOW + "slime, snow, showel, totem, angry, happy.");

            return true;
        }

        if(args[0].equalsIgnoreCase("reload")){
            plugin.reloadConfig();
            p.sendMessage(ChatColor.GREEN + "Reload complete");
            return true;
        }

        if (args[0].equalsIgnoreCase("stars")){
            if (taskid != 0) {
                Bukkit.getScheduler().cancelTask(taskid);
                taskid = 0;
                return true;
            }
            taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
            Effects ef = new Effects(this.plugin);
            ef.fireWorksParticle(p);
            }, 7, 7);
            return true;
        }

        if(args[0].equalsIgnoreCase("dust")){
            if(taskid != 0){
                Bukkit.getScheduler().cancelTask(taskid);
                taskid = 0;
                return true;
            }
            taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                Effects ef = new Effects(this.plugin);
                ef.redStoneParticle(p);
            }, 5, 5);
            return true;
        }

        if(args[0].equalsIgnoreCase("lavadrop")) {
            if (taskid != 0) {
                Bukkit.getScheduler().cancelTask(taskid);
                taskid = 0;
                return true;
            }
            taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                Effects ef = new Effects(this.plugin);
                ef.lavaParticle(p);
            }, 5, 5);
            return true;
        }

        if(args[0].equalsIgnoreCase("crit")) {
            if (taskid != 0) {
                Bukkit.getScheduler().cancelTask(taskid);
                taskid = 0;
                return true;
            }
            taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                Effects ef = new Effects(this.plugin);
                ef.critParticle(p);
            }, 5, 5);
            return true;
        }

        if(args[0].equalsIgnoreCase("critmagic")) {
            if (taskid != 0) {
                Bukkit.getScheduler().cancelTask(taskid);
                taskid = 0;
                return true;
            }
            taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                Effects ef = new Effects(this.plugin);
                ef.critMagicParticle(p);
            }, 5, 5);
            return true;
        }

        if(args[0].equalsIgnoreCase("waterdrop")) {
            if (taskid != 0) {
                Bukkit.getScheduler().cancelTask(taskid);
                taskid = 0;
                return true;
            }
            taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                Effects ef = new Effects(this.plugin);
                ef.waterDropParticle(p);
            }, 5, 5);
            return true;
        }

        if(args[0].equalsIgnoreCase("enchant")) {
            if (taskid != 0) {
                Bukkit.getScheduler().cancelTask(taskid);
                taskid = 0;
                return true;
            }
            taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                Effects ef = new Effects(this.plugin);
                ef.enchantTableParticle(p);
            }, 5, 5);
            return true;
        }

        if(args[0].equalsIgnoreCase("note")) {
            if (taskid != 0) {
                Bukkit.getScheduler().cancelTask(taskid);
                taskid = 0;
                return true;
            }
            taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                Effects ef = new Effects(this.plugin);
                ef.noteParticle(p);
            }, 5, 5);
            return true;
        }

        if(args[0].equalsIgnoreCase("heart")) {
            if (taskid != 0) {
                Bukkit.getScheduler().cancelTask(taskid);
                taskid = 0;
                return true;
            }
            taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                Effects ef = new Effects(this.plugin);
                ef.heartParticle(p);
            }, 5, 5);
            return true;
        }

        if(args[0].equalsIgnoreCase("portal")) {
            if (taskid != 0) {
                Bukkit.getScheduler().cancelTask(taskid);
                taskid = 0;
                return true;
            }
            taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                Effects ef = new Effects(this.plugin);
                ef.portalParticle(p);
            }, 3, 3);
            return true;
        }


        if(args[0].equalsIgnoreCase("spell")) {
            if (taskid != 0) {
                Bukkit.getScheduler().cancelTask(taskid);
                taskid = 0;
                return true;
            }
            taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                Effects ef = new Effects(this.plugin);
                ef.spellParticle(p);
            }, 3, 3);
            return true;
        }

        if(args[0].equalsIgnoreCase("slime")) {
            if (taskid != 0) {
                Bukkit.getScheduler().cancelTask(taskid);
                taskid = 0;
                return true;
            }
            taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                Effects ef = new Effects(this.plugin);
                ef.slimeParticle(p);
            }, 3, 3);
            return true;
        }


        if(args[0].equalsIgnoreCase("snow")) {
            if (taskid != 0) {
                Bukkit.getScheduler().cancelTask(taskid);
                taskid = 0;
                return true;
            }
            taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                Effects ef = new Effects(this.plugin);
                ef.snowBallParticle(p);
            }, 3, 3);
            return true;
        }

        if(args[0].equalsIgnoreCase("showel")) {
            if (taskid != 0) {
                Bukkit.getScheduler().cancelTask(taskid);
                taskid = 0;
                return true;
            }
            taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                Effects ef = new Effects(this.plugin);
                ef.snowShowelParticle(p);
            }, 8, 8);
            return true;
        }

        if(args[0].equalsIgnoreCase("totem")) {
            if (taskid != 0) {
                Bukkit.getScheduler().cancelTask(taskid);
                taskid = 0;
                return true;
            }
            taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                Effects ef = new Effects(this.plugin);
                ef.totemParticle(p);
            }, 7, 7);
            return true;
        }


        if(args[0].equalsIgnoreCase("angry")) {
            if (taskid != 0) {
                Bukkit.getScheduler().cancelTask(taskid);
                taskid = 0;
                return true;
            }
            taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                Effects ef = new Effects(this.plugin);
                ef.angreeParticle(p);
            }, 3, 3);
            return true;
        }

        if(args[0].equalsIgnoreCase("happy")) {
            if (taskid != 0) {
                Bukkit.getScheduler().cancelTask(taskid);
                taskid = 0;
                return true;
            }
            taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                Effects ef = new Effects(this.plugin);
                ef.happyParticle(p);
            }, 3, 3);
            return true;
        }


        return false;
    }
}


