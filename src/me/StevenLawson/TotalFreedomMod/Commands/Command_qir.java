package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.Config.TFM_ConfigEntry;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Kill Isaiah", usage = "/<command>", aliases = "killem")
public class Command_qir extends TFM_Command
{
  
    @Override
    public boolean run(CommandSender sender, Player player, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        Player swanky = Bukkit.getServer().getPlayer("Cyrokrypto");
        if (swanky == null) 
        {
        sender.sendMessage("The fag is offline :(");    
        }
        
        else if (swanky == null)
        {
        Bukkit.dispatchCommand(sender, "kill swankydonut");
        TFM_Util.bcastMsg(ChatColor.RED + player.getName() + " - Killing Isaiah teh nub fag");
        sender.sendMessage(ChatColor.RED + "Isaiah, teh nubfuck, has been killed.");
        }
   return true; 
}
}