package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_PlayerData;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH, blockHostConsole = true)
@CommandParameters(description = "Warns a player.", usage = "/<command> <player> <reason>")
public class Command_warn extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (args.length < 2)
        {
            return false;
        }

        Player player = getPlayer(args[0]);

        if (player == null)
        {
            playerMsg(PLAYER_NOT_FOUND);
            return true;
        }

        if (sender instanceof Player)
        {
            if (player.equals(sender_p))
            {
                playerMsg(ChatColor.RED + "Please, don't try to warn yourself.");
                return true;
            }
        }

        if (TFM_AdminList.isSuperAdmin(player))
        {
            playerMsg(ChatColor.RED + "You can not warn admins.");
            return true;
        }

        String warnReason = StringUtils.join(ArrayUtils.subarray(args, 1, args.length), " ");
        
        TFM_Util.bcastMsg(ChatColor.RED + sender.getName() + " - Warning " + player.getName());
        player.sendMessage(ChatColor.RED + "[WARNING] " + warnReason + "\n Warned by " + sender.getName());
        playerMsg(ChatColor.GREEN + "You have successfully warned " + player.getName());

        TFM_PlayerData.getPlayerData(player).incrementWarnings();

        return true;
    }
}
