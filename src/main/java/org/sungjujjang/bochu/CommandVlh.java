package org.sungjujjang.bochu;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
// import isVilligerHit


public class CommandVlh implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("Usage: /vlh <on|off>");
            return false;
        }
        if (args[0].equals("true")) {
            Bochu.isVilligerHit = true;
            sender.sendMessage("이제 주민을 칠 수 있습니다.");
        } else if (args[0].equals("false")) {
            Bochu.isVilligerHit = false;
            sender.sendMessage("주민 이제 못때림 ㅅㄱ.");
        } else {
            sender.sendMessage("Usage: /vlh <true|false>");
            return false;
        }
        return true;
    }
}
