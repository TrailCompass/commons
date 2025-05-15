package space.itoncek.trailcompass.commons.exchange;

import space.itoncek.trailcompass.commons.requests.auth.LoginRequest;
import space.itoncek.trailcompass.commons.requests.auth.ProfileOtherRequest;
import space.itoncek.trailcompass.commons.requests.auth.ProfileRequest;
import space.itoncek.trailcompass.commons.requests.auth.RegisterRequest;
import space.itoncek.trailcompass.commons.responses.auth.LoginResponse;
import space.itoncek.trailcompass.commons.responses.auth.ProfileResponse;
import space.itoncek.trailcompass.commons.responses.generic.OkResponse;

public interface IAuthExchange {
	LoginResponse login(LoginRequest request);
	OkResponse register(RegisterRequest request);
	ProfileResponse getProfile(ProfileRequest request);
	ProfileResponse getOtherProfile(ProfileOtherRequest request);
}
