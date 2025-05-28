package space.itoncek.trailcompass.api.wrapper;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

import space.itoncek.trailcompass.api.ExchangeHandler;
import space.itoncek.trailcompass.commons.objects.GameState;
import space.itoncek.trailcompass.commons.objects.Location;
import space.itoncek.trailcompass.commons.objects.Token;
import space.itoncek.trailcompass.commons.requests.gamemgr.*;
import space.itoncek.trailcompass.commons.responses.generic.OkResponse;
import space.itoncek.trailcompass.commons.utils.BackendException;

public class GameManagerWrapper {
    private final ExchangeHandler eh;
    private final Token token;

    public GameManagerWrapper(ExchangeHandler eh, Token token) {
        this.eh = eh;
        this.token = token;
    }
    public GameState getGameState() throws BackendException {
        return eh.gameMgr().getGameState(new GameStateRequest(token)).state();
    }
    public UUID getCurrentHider() throws BackendException {
        return eh.gameMgr().getCurrentHider(new CurrentHiderRequest(token)).id();
    }
    public ZonedDateTime getStartingTime() throws BackendException {
        return eh.gameMgr().getStartingTime(new StartingTimeRequest(token)).dateTime();
    }

    public List<Location> getSeekerLocation() throws BackendException {
        return eh.gameMgr().getSeekerLocation(new SeekerLocationRequest(token)).locations();
    }
}
