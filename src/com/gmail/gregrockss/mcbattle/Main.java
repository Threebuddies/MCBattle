package com.gmail.gregrockss.mcbattle;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.WorldBorder;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private Commands commands = new Commands();
    
	@Override
    public void onEnable() {
		if(cmd.getName().equalsIgnoreCase(mcbattle)) {
			if(args.length == 0) {	
				WorldBorder b = Bukkit.getWorld("world").getWorldBorder();
				b.setCenter(new Location(Bukkit.getWorld("world"), 0, 64, 0));				
				this.getServer().getScheduler().scheduleAsyncRepeatingTask(this, new Runnable(), 2, 2)
				public void run(){
					
				}				
			}

		}
	}
    }
   
    @Override
    public void onDisable() {
    	
    }
    public boolean onCommand(CommandSender sender,
            Command command,
            String label,
            String[] args) {
        if (command.getName().equalsIgnoreCase("mcbattle")) {
            sender.sendMessage("Command mcbattle has been run!");
            return true;
        }
        return false;
    }
}