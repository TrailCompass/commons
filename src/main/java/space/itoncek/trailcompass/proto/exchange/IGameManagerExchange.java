package space.itoncek.trailcompass.proto.exchange;

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

import space.itoncek.trailcompass.proto.requests.gamemgr.*;
import space.itoncek.trailcompass.proto.responses.gamemgr.CurrentHiderResponse;
import space.itoncek.trailcompass.proto.responses.gamemgr.GameStateResponse;
import space.itoncek.trailcompass.proto.responses.gamemgr.SeekerLocationResponse;
import space.itoncek.trailcompass.proto.responses.gamemgr.TimeResponse;
import space.itoncek.trailcompass.proto.utils.BackendException;

public interface IGameManagerExchange {
	GameStateResponse getGameState(GameStateRequest request) throws BackendException;
	CurrentHiderResponse getCurrentHider(CurrentHiderRequest request) throws BackendException;
	TimeResponse getStartingTime(StartingTimeRequest request) throws BackendException;
	TimeResponse getEndingTime(EndingTimeRequest request) throws BackendException;
	SeekerLocationResponse getSeekerLocation(SeekerLocationRequest request) throws BackendException;
}
