package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH, blockHostConsole = true)
@CommandParameters(description = "All server links", usage = "/<command>")
public class Command_links extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
       sender.sendMessage(ChatColor.GREEN + "Website: http://altimaxfreedom.com");
       sender.sendMessage(ChatColor.GREEN + "Github: N/A");
       sender.sendMessage(ChatColor.GREEN + "Forums: http://altimaxfreedom.boards.net");
        return true;
    }
}
