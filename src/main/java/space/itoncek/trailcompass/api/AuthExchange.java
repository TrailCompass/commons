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

import space.itoncek.trailcompass.proto.exchange.IAuthExchange;
import space.itoncek.trailcompass.proto.requests.auth.*;
import space.itoncek.trailcompass.proto.responses.auth.LoginResponse;
import space.itoncek.trailcompass.proto.responses.auth.ProfileListResponse;
import space.itoncek.trailcompass.proto.responses.auth.ProfileResponse;
import space.itoncek.trailcompass.proto.responses.generic.OkResponse;
import space.itoncek.trailcompass.proto.utils.BackendException;

import java.io.IOException;

public class AuthExchange implements IAuthExchange {
	private final ExchangeHandler ex;

	public AuthExchange(ExchangeHandler ex) {
		this.ex = ex;
	}

	@Override
	public LoginResponse login(LoginRequest request) throws BackendException {
		try {
			return (LoginResponse) ex.http.executeRequest(request);
		} catch (IOException | ClassNotFoundException e) {
			throw new BackendException(e);
		}
	}

	@Override
	public OkResponse register(RegisterRequest request) throws BackendException {
		try {
			return (OkResponse) ex.http.executeRequest(request);
		} catch (IOException | ClassNotFoundException e) {
			throw new BackendException(e);
		}
	}

	@Override
	public ProfileResponse getProfile(ProfileRequest request) throws BackendException {
		try {
			return (ProfileResponse) ex.http.executeRequest(request);
		} catch (IOException | ClassNotFoundException e) {
			throw new BackendException(e);
		}
	}

	@Override
	public ProfileResponse getOtherProfile(ProfileOtherRequest request) throws BackendException {
		try {
			return (ProfileResponse) ex.http.executeRequest(request);
		} catch (IOException | ClassNotFoundException e) {
			throw new BackendException(e);
		}
	}

	@Override
	public ProfileListResponse listPlayers(ListPlayersRequest request) throws BackendException {
		try {
			return (ProfileListResponse) ex.http.executeRequest(request);
		} catch (IOException | ClassNotFoundException e) {
			throw new BackendException(e);
		}
	}
}
