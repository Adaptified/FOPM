package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Use this command to toggle features that help administrate!", usage = "/<command> [on | off]", aliases = "am")
public class Command_admintools extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
    Player player = (Player) sender;
    
          player.chat("/ci");
          player.chat("/i stick 1 name:&cLogstick");
          player.chat("/i wood 1 name:&cLogblock");
          player.chat("/i clownfish 1 name:&2Ultra_Clownfish");
          player.chat("/creative");
          player.sendMessage(ChatColor.GREEN + "You have been setup!");
          return true;
    }
}
    
