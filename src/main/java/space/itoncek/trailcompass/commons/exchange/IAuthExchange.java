package space.itoncek.trailcompass.commons.exchange;

import space.itoncek.trailcompass.commons.requests.auth.LoginRequest;
import space.itoncek.trailcompass.commons.requests.auth.ProfileOtherRequest;
import space.itoncek.trailcompass.commons.requests.auth.ProfileRequest;
import space.itoncek.trailcompass.commons.requests.auth.RegisterRequest;
import space.itoncek.trailcompass.commons.responses.auth.LoginResponse;
import space.itoncek.trailcompass.commons.responses.auth.ProfileResponse;
import space.itoncek.trailcompass.commons.responses.generic.OkResponse;
import space.itoncek.trailcompass.commons.utils.BackendException;

import java.io.IOException;

public interface IAuthExchange {
	LoginResponse login(LoginRequest request) throws BackendException;
	OkResponse register(RegisterRequest request) throws BackendException;
	ProfileResponse getProfile(ProfileRequest request) throws BackendException;
	ProfileResponse getOtherProfile(ProfileOtherRequest request) throws BackendException;
}
