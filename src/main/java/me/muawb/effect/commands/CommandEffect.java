package me.muawb.effect.commands;

import me.muawb.effect.Main;
import me.muawb.effect.particle.*;
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

        if(sender.hasPermission("particle.command")){
            if (args.length == 0) {
                p.sendMessage(ChatColor.LIGHT_PURPLE + "     ParticleEffect");
                p.sendMessage(ChatColor.GOLD + "Commands:");
                p.sendMessage(ChatColor.DARK_GREEN + "/pe " + ChatColor.GRAY + "- info for effect");
                p.sendMessage(ChatColor.DARK_GREEN + "/pe list " + ChatColor.GRAY + "- show all effects");
                p.sendMessage(ChatColor.DARK_GREEN + "/pe reload " + ChatColor.GRAY + "- reloading effect");
                return true;
            }

            if (args[0].equalsIgnoreCase("list")) {
                p.sendMessage(ChatColor.YELLOW + "stars, dust, lavadrop, waterdrop, crit, critmagic,");
                p.sendMessage(ChatColor.YELLOW + "enchant, note, heart, portal, spell,");
                p.sendMessage(ChatColor.YELLOW + "slime, snow, showel, totem, angry, happy.");
                return true;
            }

            if (args[0].equalsIgnoreCase("reload")) {
                plugin.reloadConfig();
                p.sendMessage(ChatColor.GREEN + "Reload complete");
                return true;
            }
        }


        if(sender.hasPermission("particle.stars")) {
            if (args[0].equalsIgnoreCase("stars")) {
                if (taskid != 0) {
                    p.sendMessage(ChatColor.RED + "Вы отключили &fЗвезды");
                    Bukkit.getScheduler().cancelTask(taskid);
                    taskid = 0;
                    p.sendMessage(ChatColor.RED + "Вы отключили " + ChatColor.WHITE + "Звезды");
                    return true;
                }
                taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                    Effects ef = new Effects(this.plugin);
                    ef.fireWorksParticle(p);
                }, 7, 7);
                p.sendMessage(ChatColor.DARK_GREEN + "Вы активировали " + ChatColor.WHITE + "Звезды");
                return true;
            }
        }

        if(sender.hasPermission("particle.dust")) {
            if (args[0].equalsIgnoreCase("dust")) {
                if (taskid != 0) {
                    Bukkit.getScheduler().cancelTask(taskid);
                    taskid = 0;
                    p.sendMessage(ChatColor.RED + "Вы отключили " + ChatColor.YELLOW+ "Цветочная поляна");
                    return true;
                }
                taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                    Effects ef = new Effects(this.plugin);
                    ef.redStoneParticle(p);
                }, 5, 5);
                p.sendMessage(ChatColor.DARK_GREEN + "Вы активировали " + ChatColor.YELLOW + "Цветочная поляна");
                return true;
            }
        }

        if(sender.hasPermission("particle.lavadrop")) {
            if (args[0].equalsIgnoreCase("lavadrop")) {
                if (taskid != 0) {
                    Bukkit.getScheduler().cancelTask(taskid);
                    taskid = 0;
                    p.sendMessage(ChatColor.RED + "Вы отключили " + ChatColor.DARK_RED + "Вулкан");
                    return true;
                }
                taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                    Effects ef = new Effects(this.plugin);
                    ef.lavaParticle(p);
                }, 5, 5);
                p.sendMessage(ChatColor.DARK_GREEN + "Вы активировали " + ChatColor.DARK_RED + "Вулкан");
                return true;
            }
        }

        if(sender.hasPermission("particle.crit")) {
            if (args[0].equalsIgnoreCase("crit")) {
                if (taskid != 0) {
                    Bukkit.getScheduler().cancelTask(taskid);
                    taskid = 0;
                    p.sendMessage(ChatColor.RED + "Вы отключили " + ChatColor.BLUE + "Искры");
                    return true;
                }
                taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                    Effects ef = new Effects(this.plugin);
                    ef.critParticle(p);
                }, 5, 5);
                p.sendMessage(ChatColor.DARK_GREEN + "Вы активировали " + ChatColor.BLUE + "Искры");
                return true;
            }
        }

        if(sender.hasPermission("particle.critmagic")) {
            if (args[0].equalsIgnoreCase("critmagic")) {
                if (taskid != 0) {
                    Bukkit.getScheduler().cancelTask(taskid);
                    taskid = 0;
                    p.sendMessage(ChatColor.RED + "Вы отключили " + ChatColor.DARK_GREEN + "Магия");
                    return true;
                }
                taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                    Effects ef = new Effects(this.plugin);
                    ef.critMagicParticle(p);
                }, 5, 5);
                p.sendMessage(ChatColor.DARK_GREEN + "Вы активировали " + ChatColor.DARK_GREEN + "Магия");
                return true;
            }
        }

        if(sender.hasPermission("particle.waterdrop")) {
            if (args[0].equalsIgnoreCase("waterdrop")) {
                if (taskid != 0) {
                    Bukkit.getScheduler().cancelTask(taskid);
                    taskid = 0;
                    p.sendMessage(ChatColor.RED + "Вы отключили " + ChatColor.AQUA + "Водопад");
                    return true;
                }
                taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                    Effects ef = new Effects(this.plugin);
                    ef.waterDropParticle(p);
                }, 5, 5);
                p.sendMessage(ChatColor.DARK_GREEN + "Вы активировали " + ChatColor.AQUA + "Водопад");
                return true;
            }
        }

        if(sender.hasPermission("particle.enchant")) {
            if (args[0].equalsIgnoreCase("enchant")) {
                if (taskid != 0) {
                    Bukkit.getScheduler().cancelTask(taskid);
                    taskid = 0;
                    p.sendMessage(ChatColor.RED + "Вы отключили " + ChatColor.GRAY + "Зачарования");
                    return true;
                }
                taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                    Effects ef = new Effects(this.plugin);
                    ef.enchantTableParticle(p);
                }, 5, 5);
                p.sendMessage(ChatColor.DARK_GREEN + "Вы активировали " + ChatColor.GRAY + "Зачарования");
                return true;
            }
        }

        if(sender.hasPermission("particle.note")) {
            if (args[0].equalsIgnoreCase("note")) {
                if (taskid != 0) {
                    Bukkit.getScheduler().cancelTask(taskid);
                    taskid = 0;
                    p.sendMessage(ChatColor.RED + "Вы отключили " + ChatColor.YELLOW + "Ноты");
                    return true;
                }
                taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                    Effects ef = new Effects(this.plugin);
                    ef.noteParticle(p);
                }, 5, 5);
                p.sendMessage(ChatColor.DARK_GREEN + "Вы активировали " + ChatColor.YELLOW + "Ноты");
                return true;
            }
        }

        if(sender.hasPermission("particle.heart")) {
            if (args[0].equalsIgnoreCase("heart")) {
                if (taskid != 0) {
                    Bukkit.getScheduler().cancelTask(taskid);
                    taskid = 0;
                    p.sendMessage(ChatColor.RED + "Вы отключили " + ChatColor.RED + "Сердце");
                    return true;
                }
                taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                    Effects ef = new Effects(this.plugin);
                    ef.heartParticle(p);
                }, 5, 5);
                p.sendMessage(ChatColor.DARK_GREEN + "Вы активировали " + ChatColor.RED + "Сердце");
                return true;
            }
        }

        if(sender.hasPermission("particle.portal")) {
            if (args[0].equalsIgnoreCase("portal")) {
                if (taskid != 0) {
                    Bukkit.getScheduler().cancelTask(taskid);
                    taskid = 0;
                    p.sendMessage(ChatColor.RED + "Вы отключили " + ChatColor.DARK_PURPLE + "Эндер");
                    return true;
                }
                taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                    Effects ef = new Effects(this.plugin);
                    ef.portalParticle(p);
                }, 3, 3);
                p.sendMessage(ChatColor.DARK_GREEN + "Вы активировали " + ChatColor.DARK_PURPLE + "Эндер");
                return true;
            }
        }

        if(sender.hasPermission("particle.spell")) {
            if (args[0].equalsIgnoreCase("spell")) {
                if (taskid != 0) {
                    Bukkit.getScheduler().cancelTask(taskid);
                    taskid = 0;
                    p.sendMessage(ChatColor.RED + "Вы отключили " + ChatColor.WHITE + "Облако");
                    return true;
                }
                taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                    Effects ef = new Effects(this.plugin);
                    ef.spellParticle(p);
                }, 3, 3);
                p.sendMessage(ChatColor.DARK_GREEN + "Вы активировали " + ChatColor.WHITE + "Облако");
                return true;
            }
        }

        if(sender.hasPermission("particle.slime")) {
            if (args[0].equalsIgnoreCase("slime")) {
                if (taskid != 0) {
                    Bukkit.getScheduler().cancelTask(taskid);
                    taskid = 0;
                    p.sendMessage(ChatColor.RED + "Вы отключили " + ChatColor.GREEN + "Слайм");
                    return true;
                }
                taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                    Effects ef = new Effects(this.plugin);
                    ef.slimeParticle(p);
                }, 3, 3);
                p.sendMessage(ChatColor.DARK_GREEN + "Вы активировали " + ChatColor.GREEN + "Слайм");
                return true;
            }
        }

        if(sender.hasPermission("particle.snow")) {
            if (args[0].equalsIgnoreCase("snow")) {
                if (taskid != 0) {
                    Bukkit.getScheduler().cancelTask(taskid);
                    taskid = 0;
                    p.sendMessage(ChatColor.RED + "Вы отключили " + ChatColor.WHITE + "Снег");
                    return true;
                }
                taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                    Effects ef = new Effects(this.plugin);
                    ef.snowBallParticle(p);
                }, 3, 3);
                p.sendMessage(ChatColor.DARK_GREEN + "Вы активировали " + ChatColor.WHITE + "Снег");
                return true;
            }
        }

        if(sender.hasPermission("particle.showel")) {
            if (args[0].equalsIgnoreCase("showel")) {
                if (taskid != 0) {
                    Bukkit.getScheduler().cancelTask(taskid);
                    taskid = 0;
                    p.sendMessage(ChatColor.RED + "Вы отключили " + ChatColor.WHITE + "Снежинки");
                    return true;
                }
                taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                    Effects ef = new Effects(this.plugin);
                    ef.snowShowelParticle(p);
                }, 8, 8);
                p.sendMessage(ChatColor.DARK_GREEN + "Вы активировали " + ChatColor.WHITE + "Снежинки");
                return true;
            }
        }

        if(sender.hasPermission("particle.totem")) {
            if (args[0].equalsIgnoreCase("totem")) {
                if (taskid != 0) {
                    Bukkit.getScheduler().cancelTask(taskid);
                    taskid = 0;
                    p.sendMessage(ChatColor.RED + "Вы отключили " + ChatColor.GOLD + "Праздник");
                    return true;
                }
                taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                    Effects ef = new Effects(this.plugin);
                    ef.totemParticle(p);
                }, 7, 7);
                p.sendMessage(ChatColor.DARK_GREEN + "Вы активировали " + ChatColor.GOLD + "Праздник");
                return true;
            }
        }

        if(sender.hasPermission("particle.angry")) {
            if (args[0].equalsIgnoreCase("angry")) {
                if (taskid != 0) {
                    Bukkit.getScheduler().cancelTask(taskid);
                    taskid = 0;
                    p.sendMessage(ChatColor.RED + "Вы отключили " + ChatColor.DARK_BLUE + "Злой житель");
                    return true;
                }
                taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                    Effects ef = new Effects(this.plugin);
                    ef.angreeParticle(p);
                }, 3, 3);
                p.sendMessage(ChatColor.DARK_GREEN + "Вы активировали " + ChatColor.DARK_BLUE + "Злой житель");
                return true;
            }
        }

        if(sender.hasPermission("particle.happy")) {
            if (args[0].equalsIgnoreCase("happy")) {
                if (taskid != 0) {
                    Bukkit.getScheduler().cancelTask(taskid);
                    taskid = 0;
                    p.sendMessage(ChatColor.RED + "Вы отключили " + ChatColor.GREEN + "Изумруд");
                    return true;
                }
                taskid = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, () -> {
                    Effects ef = new Effects(this.plugin);
                    ef.happyParticle(p);
                }, 3, 3);
                p.sendMessage(ChatColor.DARK_GREEN + "Вы активировали " + ChatColor.GREEN + "Изумруд");
                return true;
            }
        }
        return false;
    }
}


