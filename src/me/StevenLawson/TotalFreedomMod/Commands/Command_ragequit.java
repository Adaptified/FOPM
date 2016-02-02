package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "You done with life?", usage = "/<command>", aliases = "imdone")
public class Command_ragequit extends TFM_Command
{
  
    @Override
    public boolean run(CommandSender sender, Player player, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        TFM_Util.bcastMsg(ChatColor.RED + player.getName() + " IS RAGEQUITING!");
        player.chat("I am so done! I quit!");
        player.kickPlayer(ChatColor.RED + "RAGEQUIT");
        
   return true; 
}
}