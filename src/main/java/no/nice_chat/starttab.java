package no.nice_chat;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class starttab implements TabCompleter {
    List<String> arguments = new ArrayList<String>();

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (arguments.isEmpty()) {
            arguments.add("red"); arguments.add("blue"); arguments.add("green"); arguments.add("yellow"); arguments.add("white"); arguments.add("gray"); arguments.add("black"); arguments.add("aqua"); arguments.add("gold"); arguments.add("light_purple"); arguments.add("dark_red"); arguments.add("dark_blue"); arguments.add("dark_green"); arguments.add("dark_aqua"); arguments.add("dark_gray"); arguments.add("dark_purple"); arguments.add("");
            arguments.add("random"); arguments.add("r");
        }

        List<String> result = new ArrayList<String>();
        if (args.length == 1) {
            for (String a : arguments) {
                if (a.toLowerCase().startsWith(args[0].toLowerCase()))
                    result.add(a);
            }
            return result;
        }

        return null;
    }
}
