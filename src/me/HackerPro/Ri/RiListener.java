package me.HackerPro.Ri;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;





public class RiListener implements Listener
{




	Ri plugin;


	public RiListener(Ri p){
		plugin = p;
	}

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


	@EventHandler(priority = EventPriority.HIGHEST)
	public void onCommand(PlayerCommandPreprocessEvent event) {
		Player player = event.getPlayer();
		String args[] = event.getMessage().split(" ");



		for(String ctc : plugin.getConfig().getConfigurationSection("commands").getKeys(false)){





			if(ctc.equalsIgnoreCase(args[0])){
				player.sendMessage(plugin.getConfig().getString("commands."+args[0]+ colorize(".message")));
				event.setCancelled(true);

			}


		}


	}

}