package space.itoncek.trailcompass.api.wrapper;

import java.time.ZonedDateTime;
import java.util.UUID;

import space.itoncek.trailcompass.api.ExchangeHandler;
import space.itoncek.trailcompass.commons.objects.GameState;
import space.itoncek.trailcompass.commons.objects.Token;
import space.itoncek.trailcompass.commons.requests.gamemgr.ChangeCurrentHiderRequest;
import space.itoncek.trailcompass.commons.requests.gamemgr.CurrentHiderRequest;
import space.itoncek.trailcompass.commons.requests.gamemgr.FinishSetupRequest;
import space.itoncek.trailcompass.commons.requests.gamemgr.GameStateRequest;
import space.itoncek.trailcompass.commons.requests.gamemgr.StartingTimeRequest;
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
    public OkResponse changeCurrentHider(UUID new_hider) throws BackendException {
        return eh.gameMgr().changeCurrentHider(new ChangeCurrentHiderRequest(token,new_hider));
    }
    public ZonedDateTime getStartingTime() throws BackendException {
        return eh.gameMgr().getStartingTime(new StartingTimeRequest(token)).dateTime();
    }
    public OkResponse finishSetup(FinishSetupRequest request) throws BackendException {
        return eh.gameMgr().finishSetup(new FinishSetupRequest(token));
    }
}
