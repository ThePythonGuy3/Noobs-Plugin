package noobs;

import arc.*;
import arc.util.*;
import mindustry.game.EventType;
import mindustry.mod.Plugin;


public class NoobsPlugin extends Plugin{

    //register event handlers and create variables in the constructor
    public NoobsPlugin(){
        Events.on(EventType.BlockBuildEndEvent.class, event -> {
            if (!event.breaking) {
                if (event.tile.block().name.equals("router")){
                    if (event.tile.getNearby(1, 0).block().name.equals("router")) {
                        event.tile.getNearby(1, 0).bc().kill();
                    }
                    if (event.tile.getNearby(-1, 0).block().name.equals("router")) {
                        event.tile.getNearby(-1, 0).bc().kill();
                    }
                    if (event.tile.getNearby(0, 1).block().name.equals("router")) {
                        event.tile.getNearby(0, 1).bc().kill();
                    }
                    if (event.tile.getNearby(0, -1).block().name.equals("router")) {
                        event.tile.getNearby(0, -1).bc().kill();
                    }
                }
            }
        });
    }

    //register commands that run on the server
    @Override
    public void registerServerCommands(CommandHandler handler){
        //h
    }

    //register commands that player can invoke in-game
    @Override
    public void registerClientCommands(CommandHandler handler){
        //h
    }
}
