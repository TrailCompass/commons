package space.itoncek.trailcompass.commons.exchange;

import space.itoncek.trailcompass.commons.requests.auth.*;
import space.itoncek.trailcompass.commons.responses.auth.LoginResponse;
import space.itoncek.trailcompass.commons.responses.auth.ProfileListResponse;
import space.itoncek.trailcompass.commons.responses.auth.ProfileResponse;
import space.itoncek.trailcompass.commons.responses.generic.OkResponse;
import space.itoncek.trailcompass.commons.utils.BackendException;

public interface IAuthExchange {
	LoginResponse login(LoginRequest request) throws BackendException;
	OkResponse register(RegisterRequest request) throws BackendException;
	ProfileResponse getProfile(ProfileRequest request) throws BackendException;
	ProfileResponse getOtherProfile(ProfileOtherRequest request) throws BackendException;
	ProfileListResponse listPlayers(ListPlayersRequest request) throws BackendException;
}
