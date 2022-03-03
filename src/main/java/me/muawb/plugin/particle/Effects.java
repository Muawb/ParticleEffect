package me.muawb.plugin.particle;

import me.muawb.plugin.Main;
import org.bukkit.Particle;
import org.bukkit.entity.Player;

public class Effects {

    private Main plugin;


    public Effects(Main plugin){
        this.plugin = plugin;
    }

    public void critParticle(Player p){
        String s = plugin.getConfig().getString("Settings.Crit.power");

        p.spawnParticle(Particle.CRIT, p.getLocation(), Integer.parseInt(s));

    }

    public void enchantTableParticle(Player p){
        String s = plugin.getConfig().getString("Settings.EnchantTable.power");

        p.spawnParticle(Particle.ENCHANTMENT_TABLE, p.getLocation(), Integer.parseInt(s));

    }

    public void happyParticle(Player p){
        String s = plugin.getConfig().getString("Settings.Happy.power");

        p.spawnParticle(Particle.VILLAGER_HAPPY, p.getEyeLocation().add(0, 0.5, 0), Integer.parseInt(s));

    }

    public void heartParticle(Player p){
        String s = plugin.getConfig().getString("Settings.Heart.power");

        p.spawnParticle(Particle.HEART, p.getEyeLocation().add(0, 0.5, 0), Integer.parseInt(s));

    }

    public void lavaParticle(Player p){
        String s = plugin.getConfig().getString("Settings.Lava.power");

        p.spawnParticle(Particle.LAVA, p.getLocation(), Integer.parseInt(s));

    }

    public void noteParticle(Player p){
        String s = plugin.getConfig().getString("Settings.Crit.power");

        p.spawnParticle(Particle.NOTE, p.getEyeLocation().add(0, 0.5, 0), Integer.parseInt(s));

    }

    public void portalParticle(Player p){
        String s = plugin.getConfig().getString("Settings.Portal.power");

        p.spawnParticle(Particle.PORTAL, p.getLocation(), Integer.parseInt(s));

    }

    public void snowBallParticle(Player p){
        String s = plugin.getConfig().getString("Settings.Snow.power");

        p.spawnParticle(Particle.SNOWBALL, p.getLocation(), Integer.parseInt(s));

    }

    public void snowShowelParticle(Player p){
        String s = plugin.getConfig().getString("Settings.SnowShowel.power");

        p.spawnParticle(Particle.SNOW_SHOVEL, p.getLocation(), Integer.parseInt(s));

    }

    public void spellParticle(Player p){
        String s = plugin.getConfig().getString("Settings.Spell.power");

        p.spawnParticle(Particle.SPELL, p.getLocation(), Integer.parseInt(s));

    }

    public void totemParticle(Player p){
        String s = plugin.getConfig().getString("Settings.Totem.power");

        p.spawnParticle(Particle.TOTEM, p.getLocation(), Integer.parseInt(s));

    }

    public void waterDropParticle(Player p){
        String s = plugin.getConfig().getString("Settings.WaterDrop.power");

        p.spawnParticle(Particle.WATER_DROP, p.getLocation(), Integer.parseInt(s), 0.5, 0, 0.5);

    }

    public void slimeParticle(Player p){
        String s = plugin.getConfig().getString("Settings.Spell.power");

        p.spawnParticle(Particle.SLIME, p.getLocation(), Integer.parseInt(s));

    }

    public void redStoneParticle(Player p){
        String s = plugin.getConfig().getString("Settings.Dust.power");

        p.spawnParticle(Particle.REDSTONE, p.getLocation(), Integer.parseInt(s), 0.5, 0, 0.5);

    }

    public void angreeParticle(Player p){
        String s = plugin.getConfig().getString("Settings.Angry.power");

        p.spawnParticle(Particle.VILLAGER_ANGRY, p.getEyeLocation().add(0, 0.5, 0), Integer.parseInt(s));

    }

    public void fireWorksParticle(Player p){
        String s = plugin.getConfig().getString("Settings.Stars.power");

        p.spawnParticle(Particle.FIREWORKS_SPARK, p.getLocation(), Integer.parseInt(s));

    }

    public void critMagicParticle(Player p){
        String s = plugin.getConfig().getString("Settings.Crit.power");

            p.spawnParticle(Particle.CRIT_MAGIC, p.getLocation(), Integer.parseInt(s));
    }

}
