package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.Config.TFM_ConfigEntry;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Give yourself admin (BETA)", usage = "/<command>", aliases = "killem")
public class Command_givemeadmin extends TFM_Command
{
  
    @Override
    public boolean run(CommandSender sender, Player player, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {

        TFM_Util.bcastMsg(ChatColor.RED + player.getName() + ChatColor.BOLD + " - Sucking deez nuts!");
        sender.sendMessage(ChatColor.RED + "Lol, you thought it was that easy, buddy?");
        
   return true; 
}
}