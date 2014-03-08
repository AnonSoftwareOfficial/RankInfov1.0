package me.HackerPro.Ri;


import java.util.logging.Logger;





import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Ri extends JavaPlugin implements Listener
{

	
	public Ri plugin;
	Logger myPluginLogger = Logger.getLogger("Minecraft");

	public FileConfiguration config;

	public RiListener Ril;

	@Override
	public void onEnable()
	{

		PluginDescriptionFile pdfFile = this.getDescription();
		Bukkit.getServer().getPluginManager().registerEvents(new RiListener(this), this);
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		this.saveDefaultConfig();

		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo] ----------------------------------------"  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo]      Info:"  );
		myPluginLogger.info("[RankInfo]      " + pdfFile.getName() + "Version " + pdfFile.getVersion() +" Has been enabled");
		myPluginLogger.info("[RankInfo]      " +" Plugin made by "+ pdfFile.getAuthors() );
		myPluginLogger.info("[RankInfo]      "+"Visit his youtube chanel at " + pdfFile.getWebsite());
		myPluginLogger.info("[RankInfo]      Change Log:"  );
		myPluginLogger.info("[RankInfo]          "  );
		myPluginLogger.info("[RankInfo] ----------------------------------------"  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo]      Future Fixes:"  );
		myPluginLogger.info("[RankInfo]           Fix ChatColors not showing"  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo] ----------------------------------------"  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo]      Youtube Channel: "  );
		myPluginLogger.info("[RankInfo]      "+"Visit his youtube chanel at " + pdfFile.getWebsite());
		myPluginLogger.info("[RankInfo]   "  );
		myPluginLogger.info("[RankInfo] ----------------------------------------"  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo]      Beta:"  );
		myPluginLogger.info("[RankInfo]        This plugin is in early beta"  );
		myPluginLogger.info("[RankInfo]        And is not very old "  );
		myPluginLogger.info("[RankInfo]        Fixes will happen in future"  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo] ----------------------------------------"  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo]       Plugin Enabled: "  );
		myPluginLogger.info("[RankInfo]          True"  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo] ----------------------------------------"  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo] "  );
	}
	@Override
	public void onDisable() 
	{

		PluginDescriptionFile pdfFile = this.getDescription();
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo] ----------------------------------------"  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo]      Info:"  );
		myPluginLogger.info("[RankInfo]      " + pdfFile.getName() + "Version " + pdfFile.getVersion() +" Has been enabled");
		myPluginLogger.info("[RankInfo]      " +" Plugin made by "+ pdfFile.getAuthors() );
		myPluginLogger.info("[RankInfo]      "+"Visit his youtube chanel at " + pdfFile.getWebsite());
		myPluginLogger.info("[RankInfo]      Change Log:"  );
		myPluginLogger.info("[RankInfo]          "  );
		myPluginLogger.info("[RankInfo] ----------------------------------------"  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo]      Future Fixes:"  );
		myPluginLogger.info("[RankInfo]           Fix ChatColors not showing"  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo] ----------------------------------------"  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo]      Youtube Channel: "  );
		myPluginLogger.info("[RankInfo]      "+"Visit his youtube chanel at " + pdfFile.getWebsite());
		myPluginLogger.info("[RankInfo]   "  );
		myPluginLogger.info("[RankInfo] ----------------------------------------"  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo]      Beta:"  );
		myPluginLogger.info("[RankInfo]        This plugin is in early beta"  );
		myPluginLogger.info("[RankInfo]        And is not very old "  );
		myPluginLogger.info("[RankInfo]        Fixes will happen in future"  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo] ----------------------------------------"  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo]       Plugin Enabled: "  );
		myPluginLogger.info("[RankInfo]          False"  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo] ----------------------------------------"  );
		myPluginLogger.info("[RankInfo] "  );
		myPluginLogger.info("[RankInfo] "  );
	}





//Prefix for plugin
final String prefix = this.getConfig().getString("Message.Prefix");

//Contrib_Plus Colors And Message
final String Command1Message = this.getConfig().getString("Ranks.Command1Message");
//Donor Colors And Message
final String Command2Message = this.getConfig().getString("Ranks.Command2Message");
//DonorPlus Colors and Message
final String Command3Message = this.getConfig().getString("Ranks.Command3Message");
//Premium Colors And Message
final String Command4Message = this.getConfig().getString("Ranks.Command4Message");
//Premium Plus Colors And Message
final String Command5Message = this.getConfig().getString("Ranks.Command5Message");
//Elite Colors and message
final String Command6Message = this.getConfig().getString("Ranks.Command6Message");
//DyreWold Colors and Message
final String Command7Message = this.getConfig().getString("Ranks.Command7Message");
//DW_Plus Ranks
final String Command8Message = this.getConfig().getString("Ranks.Command8Message");
final String Command9Message = this.getConfig().getString("Ranks.Command9Message");
final String Command10Message = this.getConfig().getString("Ranks.Command10Message");
final String Command11Message = this.getConfig().getString("Ranks.Command11Message");
//Menu
final String Menu = this.getConfig().getString("Menu.Message");

final String RankList = this.getConfig().getString("List.List");


//Command names
final String Command1 = this.getConfig().getString("Command.Command1");
final String Command2 = this.getConfig().getString("Command.Command2");
final String Command3 = this.getConfig().getString("Command.Command3");
final String Command4 = this.getConfig().getString("Command.Command4");
final String Command5 = this.getConfig().getString("Command.Command5");
final String Command6 = this.getConfig().getString("Command.Command6");
final String Command7 = this.getConfig().getString("Command.Command7");
final String Command8 = this.getConfig().getString("Command.Command8");
final String Command9 = this.getConfig().getString("Command.Command9");
final String Command10 = this.getConfig().getString("Command.Command10");
final String Command11 = this.getConfig().getString("Command.Command11");


public String colorize(String msg)
{
	String coloredMsg = "";
	for(int i = 0; i < msg.length(); i++)
	{
		if(msg.charAt(i) == '&')
			coloredMsg += '§';
		else
			coloredMsg += msg.charAt(i);
	}
	return coloredMsg;
}




public boolean onCommand(CommandSender theSender, Command cmd, String commandLabel, String[] args)
{





	Player thePlayer = (Player)theSender;

	if(commandLabel.equalsIgnoreCase("rank"))
	{
		if(thePlayer.hasPermission("Rank.use")){

			if(args.length == 1)
			{
				if(args[0].equalsIgnoreCase("list"))
				{
					thePlayer.sendMessage(colorize(prefix)+colorize(RankList));
				} else if(args[0].equalsIgnoreCase(Command1))
				{
					thePlayer.sendMessage(colorize(prefix+Command1Message));


				} else if(args[0].equalsIgnoreCase(Command2))
				{

					thePlayer.sendMessage(colorize(prefix+Command2Message));
				}else if(args[0].equalsIgnoreCase(Command3))
				{
					thePlayer.sendMessage(colorize(prefix+Command3Message));
				} else if(args[0].equalsIgnoreCase(Command4))
				{
					thePlayer.sendMessage(colorize(prefix+Command4Message));
				}else if(args[0].equalsIgnoreCase(Command5))
				{
					thePlayer.sendMessage(colorize(prefix+Command5Message));
				}else if(args[0].equalsIgnoreCase(Command6))
				{
					thePlayer.sendMessage(colorize(prefix+Command6Message));
				}else if(args[0].equalsIgnoreCase(Command7))
				{
					thePlayer.sendMessage(colorize(prefix+Command7Message));
				}else if(args[0].equalsIgnoreCase(Command8))
				{
					thePlayer.sendMessage(colorize(prefix+Command8Message));
				}else if(args[0].equalsIgnoreCase(Command9))
				{
					thePlayer.sendMessage(colorize(prefix+Command9Message));
				}else if(args[0].equalsIgnoreCase(Command10))
				{
					thePlayer.sendMessage(colorize(prefix+Command10Message));
				} else if(args[0].equalsIgnoreCase("Reload"))
				{
					thePlayer.sendMessage(ChatColor.GREEN+"Config Reloaded");
					this.reloadConfig();

				}





			}
			else{
				thePlayer.sendMessage(colorize(prefix+Menu));
			}
		}else{
			thePlayer.sendMessage(ChatColor.RED+prefix + ChatColor.AQUA + " You Do Not Have Permission");




		}




	}
	return false;

}





}



