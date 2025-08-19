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

import space.itoncek.trailcompass.proto.requests.auth.*;
import space.itoncek.trailcompass.proto.responses.auth.LoginResponse;
import space.itoncek.trailcompass.proto.responses.auth.ProfileListResponse;
import space.itoncek.trailcompass.proto.responses.auth.ProfileResponse;
import space.itoncek.trailcompass.proto.responses.generic.OkResponse;
import space.itoncek.trailcompass.proto.utils.BackendException;

public interface IAuthExchange {
	LoginResponse login(LoginRequest request) throws BackendException;
	OkResponse register(RegisterRequest request) throws BackendException;
	ProfileResponse getProfile(ProfileRequest request) throws BackendException;
	ProfileResponse getOtherProfile(ProfileOtherRequest request) throws BackendException;
	ProfileListResponse listPlayers(ListPlayersRequest request) throws BackendException;
}
