package com.github.legendsdev.legends.library.event;

import com.github.legendsdev.legends.library.lplayer.LPlayer;

/**
 * @author YoshiGenius
 */
public class PlayerEvent extends LegendsEvent {
    private final LPlayer player;
    
    public PlayerEvent(LPlayer player) {
        this.player = player;
    }
    
    public LPlayer getPlayer() {
        return this.player;
    }

}
