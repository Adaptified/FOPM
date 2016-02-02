package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.Config.TFM_ConfigEntry;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Gives information about how to apply", usage = "/<command>", aliases = "ai")
public class Command_ai extends TFM_Command
{
  
    @Override
    public boolean run(CommandSender sender, Player player, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        player.sendMessage(ChatColor.GOLD + "So you want to apply for admin, eh?");
        player.sendMessage(ChatColor.RED + "Well let me tell you how to apply! First off:");
        player.sendMessage(ChatColor.GREEN + "http://freedomop.my-board.org");
        player.sendMessage(ChatColor.AQUA + "Secondly: Make sure you meet all the requirements before applying!");
        player.sendMessage(ChatColor.AQUA + "When you think you're ready, make sure to follow the template");
        player.sendMessage(ChatColor.RED + "Then apply!");
        player.sendMessage(ChatColor.GOLD + "Hope this helped you, " + sender.getName());
        
   return true; 
}
}