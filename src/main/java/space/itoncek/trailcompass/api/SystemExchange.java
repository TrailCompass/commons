package space.itoncek.trailcompass.api;

import space.itoncek.trailcompass.commons.exchange.ISystemExchange;
import space.itoncek.trailcompass.commons.requests.system.ServerTimeRequest;
import space.itoncek.trailcompass.commons.requests.system.ServerVersionRequest;
import space.itoncek.trailcompass.commons.responses.system.ServerTimeResponse;
import space.itoncek.trailcompass.commons.responses.system.ServerVersionResponse;
import space.itoncek.trailcompass.commons.utils.BackendException;

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
