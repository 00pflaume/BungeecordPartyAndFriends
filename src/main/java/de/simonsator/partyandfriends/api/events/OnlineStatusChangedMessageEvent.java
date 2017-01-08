package de.simonsator.partyandfriends.api.events;

import de.simonsator.partyandfriends.api.pafplayers.OnlinePAFPlayer;
import de.simonsator.partyandfriends.api.pafplayers.PAFPlayer;
import net.md_5.bungee.api.plugin.Cancellable;
import net.md_5.bungee.api.plugin.Event;

import java.util.List;

/**
 * @author simonbrungs
 * @version 1.0.0 29.12.16
 */
public class OnlineStatusChangedMessageEvent extends Event implements Cancellable {
	private boolean cancelled = false;
	private final OnlinePAFPlayer PLAYER;
	private String message;
	private List<PAFPlayer> friends;

	public OnlineStatusChangedMessageEvent(OnlinePAFPlayer pPlayer, String pMessage, List<PAFPlayer> pFriends) {
		PLAYER = pPlayer;
		message = pMessage;
		friends = pFriends;
	}

	public OnlinePAFPlayer getPlayer() {
		return PLAYER;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<PAFPlayer> getFriends() {
		return friends;
	}

	public void setFriends(List<PAFPlayer> pFriends) {
		this.friends = pFriends;
	}

	@Override
	public boolean isCancelled() {
		return cancelled;
	}

	@Override
	public void setCancelled(boolean b) {
		cancelled = b;
	}
}