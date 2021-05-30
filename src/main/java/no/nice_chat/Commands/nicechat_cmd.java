package no.nice_chat.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class nicechat_cmd implements CommandExecutor {
    @Override

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        int random = (int)(Math.random() * 11);

        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "[用法] : /n color text1 text2\n" + ChatColor.AQUA + "または、 /n random name text");
        } else if (args[0].equalsIgnoreCase("random") || args[0].equalsIgnoreCase("r")) {
            switch (random) {
                default: Bukkit.broadcastMessage(ChatColor.GREEN + "[傍観チャット]" + args[1] + ":" + ChatColor.WHITE + args[2]); break;
                case 1 : Bukkit.broadcastMessage(ChatColor.GREEN + "[人間CO]" + args[1] + ":" + ChatColor.WHITE + args[2]); break;
                case 2 : Bukkit.broadcastMessage(ChatColor.RED + "[TCT]" + ChatColor.WHITE + args[2]); break;
                case 3 : Bukkit.broadcastMessage(ChatColor.WHITE + "[COなし]" + args[1] + ":" + ChatColor.WHITE + args[2]); break;
                case 4 : Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "[お医者さんCO]" + args[1] + ":" + ChatColor.WHITE + args[2]); break;
                case 5 : Bukkit.broadcastMessage(ChatColor.RED + "[ヘイホーCO]" + args[1] + ":" + ChatColor.WHITE + args[2]); break;
                case 6 : Bukkit.broadcastMessage(ChatColor.AQUA + "[tsubayouCO]" + args[1] + ":" + ChatColor.WHITE + args[2]); break;
                case 7 : Bukkit.broadcastMessage(ChatColor.YELLOW + "[ななみ鯖]" + ChatColor.WHITE + args[2]); break;
                case 8 : Bukkit.broadcastMessage(ChatColor.BLUE + "[名探偵CO]" + args[1] + ":" + ChatColor.WHITE + args[2]); break;
                case 9 : Bukkit.broadcastMessage(ChatColor.GOLD + "[化け狐CO]" + args[1] + ":" + ChatColor.WHITE + args[2]); break;
                case 10 : Bukkit.broadcastMessage(ChatColor.GREEN + "[あひゃ]" + ChatColor.WHITE + args[2]); break;
            }
        } else if (args[1].length() != 0 && args[2].length () != 0 && (args[0].equalsIgnoreCase("red") || args[0].equalsIgnoreCase("blue") || args[0].equalsIgnoreCase("green") || args[0].equalsIgnoreCase("white") || args[0].equalsIgnoreCase("yellow") || args[0].equalsIgnoreCase("aqua") || args[0].equalsIgnoreCase("gold") || args[0].equalsIgnoreCase("light_purple") || args[0].equalsIgnoreCase("dark_red") || args[0].equalsIgnoreCase("dark_blue") || args[0].equalsIgnoreCase("black") || args[0].equalsIgnoreCase("dark_gray") || args[0].equalsIgnoreCase("gray") || args[0].equalsIgnoreCase("dark_aqua") || args[0].equalsIgnoreCase("dark_purple") || args[0].equalsIgnoreCase("dark_green"))) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tellraw @a [\"\",{\"text\":\"" + args[1] + "\",\"color\":\"" + args[0] + "\",\"hoverEvent\":{\"action\":\"show_text\",\"value\":\"\\u307b\\u3093\\u3068\\u306f\\u3001" + sender.getName() + "\"}},{\"text\":\"" + args[2] + "\"}]");
        } else {
            sender.sendMessage(ChatColor.RED + "[用法] : /n color text1 text2\n" + ChatColor.AQUA + "または、 /n random name text");
        }
        return true;
    }
}
