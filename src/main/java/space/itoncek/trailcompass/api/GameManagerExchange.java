package space.itoncek.trailcompass.api;

/*
 *
 * ████████╗██████╗  █████╗ ██╗██╗      ██████╗ ██████╗ ███╗   ███╗██████╗  █████╗ ███████╗███████╗
 * ╚══██╔══╝██╔══██╗██╔══██╗██║██║     ██╔════╝██╔═══██╗████╗ ████║██╔══██╗██╔══██╗██╔════╝██╔════╝
 *    ██║   ██████╔╝███████║██║██║     ██║     ██║   ██║██╔████╔██║██████╔╝███████║███████╗███████╗
 *    ██║   ██╔══██╗██╔══██║██║██║     ██║     ██║   ██║██║╚██╔╝██║██╔═══╝ ██╔══██║╚════██║╚════██║
 *    ██║   ██║  ██║██║  ██║██║███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║██║     ██║  ██║███████║███████║
 *    ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚═╝     ╚═╝  ╚═╝╚══════╝╚══════╝
 *
 *                                    Copyright (c) 2025.
 */

import space.itoncek.trailcompass.commons.exchange.IGameManagerExchange;
import space.itoncek.trailcompass.commons.requests.gamemgr.*;
import space.itoncek.trailcompass.commons.responses.gamemgr.CurrentHiderResponse;
import space.itoncek.trailcompass.commons.responses.gamemgr.GameStateResponse;
import space.itoncek.trailcompass.commons.responses.gamemgr.SeekerLocationResponse;
import space.itoncek.trailcompass.commons.responses.gamemgr.TimeResponse;
import space.itoncek.trailcompass.commons.utils.BackendException;

import java.io.IOException;

public class GameManagerExchange implements IGameManagerExchange {
	private final ExchangeHandler ex;

	public GameManagerExchange(ExchangeHandler ex) {
		this.ex = ex;
	}

	@Override
	public GameStateResponse getGameState(GameStateRequest request) throws BackendException {
		try {
			return (GameStateResponse) ex.http.executeRequest(request);
		} catch (IOException | ClassNotFoundException e) {
			throw new BackendException(e);
		}
	}

	@Override
	public CurrentHiderResponse getCurrentHider(CurrentHiderRequest request) throws BackendException {
		try {
			return (CurrentHiderResponse) ex.http.executeRequest(request);
		} catch (IOException | ClassNotFoundException e) {
			throw new BackendException(e);
		}
	}

	@Override
	public TimeResponse getStartingTime(StartingTimeRequest request) throws BackendException {
		try {
			return (TimeResponse) ex.http.executeRequest(request);
		} catch (IOException | ClassNotFoundException e) {
			throw new BackendException(e);
		}
	}

	@Override
	public TimeResponse getEndingTime(EndingTimeRequest request) throws BackendException {
		try {
			return (TimeResponse) ex.http.executeRequest(request);
		} catch (IOException | ClassNotFoundException e) {
			throw new BackendException(e);
		}
	}

	@Override
	public SeekerLocationResponse getSeekerLocation(SeekerLocationRequest request) throws BackendException {
		try {
			return (SeekerLocationResponse) ex.http.executeRequest(request);
		} catch (IOException | ClassNotFoundException e) {
			throw new BackendException(e);
		}
	}
}
