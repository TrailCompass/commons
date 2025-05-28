package space.itoncek.trailcompass.commons.exchange;

import space.itoncek.trailcompass.commons.requests.gamemgr.*;
import space.itoncek.trailcompass.commons.responses.gamemgr.CurrentHiderResponse;
import space.itoncek.trailcompass.commons.responses.gamemgr.GameStateResponse;
import space.itoncek.trailcompass.commons.responses.gamemgr.SeekerLocationResponse;
import space.itoncek.trailcompass.commons.responses.gamemgr.StartingTimeResponse;
import space.itoncek.trailcompass.commons.responses.generic.OkResponse;
import space.itoncek.trailcompass.commons.utils.BackendException;

public interface IGameManagerExchange {
	GameStateResponse getGameState(GameStateRequest request) throws BackendException;

	CurrentHiderResponse getCurrentHider(CurrentHiderRequest request) throws BackendException;

	StartingTimeResponse getStartingTime(StartingTimeRequest request) throws BackendException;

	SeekerLocationResponse getSeekerLocation(SeekerLocationRequest request) throws BackendException;
}
