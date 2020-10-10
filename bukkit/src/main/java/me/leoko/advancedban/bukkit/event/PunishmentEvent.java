package me.leoko.advancedban.bukkit.event;

import me.leoko.advancedban.utils.punishment.Punishment;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Event fired when a punishment is created
 */
public class PunishmentEvent extends Event {
	
    private static final HandlerList handlers = new HandlerList();
    
    private final Punishment punishment;

    public PunishmentEvent(Punishment punishment) {
        super(true);
        this.punishment = punishment;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public Punishment getPunishment() {
        return this.punishment;
    }
}