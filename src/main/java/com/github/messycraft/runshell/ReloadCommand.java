package com.github.messycraft.runshell;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class ReloadCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        JavaPlugin.getProvidingPlugin(RunShell.class).reloadConfig();
        sender.sendMessage("§e配置文件已成功重载。");
        return true;
    }
}