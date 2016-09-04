package com.panjaco.doublejump;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class DoubleJump extends JavaPlugin{

	
	//Testing stuffz
	public void onEnable(){
		PluginDescriptionFile descFile = getDescription();
		Logger logger = getLogger();
		logger.info("[Double Jump] Enabled");
		
		//Register listeners
		Bukkit.getPluginManager().registerEvents(new onPlayerMovement(), this);
		
	}
	
	public void onDisable(){
		
		PluginDescriptionFile descFile = getDescription();
		Logger logger = getLogger();
		logger.info("[Double Jump] Disabled");
		
	}
	
}
