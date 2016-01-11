package me.StevenLawson.TotalFreedomMod.Commands;

import java.util.Random;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Retreive the tools to administrate!", usage = "/<command>")
public class Command_admintools extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player player, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
    ItemStack LOGSTICK = new ItemStack(Material.STICK, 1);
    ItemMeta stick = LOGSTICK.getItemMeta();
    stick.setDisplayName(ChatColor.BLUE + "The LogStick!");
    return true;
}
}
//This will be updated if we need another admin tool added
