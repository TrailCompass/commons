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

import space.itoncek.trailcompass.proto.exchange.ISystemExchange;
import space.itoncek.trailcompass.proto.requests.system.ServerTimeRequest;
import space.itoncek.trailcompass.proto.requests.system.ServerVersionRequest;
import space.itoncek.trailcompass.proto.responses.system.ServerTimeResponse;
import space.itoncek.trailcompass.proto.responses.system.ServerVersionResponse;
import space.itoncek.trailcompass.proto.utils.BackendException;

import java.io.IOException;

public class SystemExchange implements ISystemExchange {
	private final ExchangeHandler ex;

	public SystemExchange(ExchangeHandler ex) {
		this.ex = ex;
	}

	@Override
	public ServerTimeResponse time(ServerTimeRequest request) throws BackendException {
		try {
			return (ServerTimeResponse) ex.http.executeRequest(request);
		} catch (IOException | ClassNotFoundException e) {
			throw new BackendException(e);
		}
	}

	@Override
	public ServerVersionResponse version(ServerVersionRequest request) throws BackendException {
		try {
			return (ServerVersionResponse) ex.http.executeRequest(request);
		} catch (IOException | ClassNotFoundException e) {
			throw new BackendException(e);
		}
	}
}
