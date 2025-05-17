package space.itoncek.trailcompass.api;

import space.itoncek.trailcompass.commons.exchange.IMapExchange;
import space.itoncek.trailcompass.commons.requests.map.MapHashRequest;
import space.itoncek.trailcompass.commons.requests.map.MapRequest;
import space.itoncek.trailcompass.commons.responses.map.MapHashResponse;
import space.itoncek.trailcompass.commons.responses.map.MapResponse;
import space.itoncek.trailcompass.commons.utils.BackendException;

import java.io.IOException;

public class MapExchange implements IMapExchange {
	private final ExchangeHandler ex;

	public MapExchange(ExchangeHandler ex) {
		this.ex = ex;
	}

	@Override
	public MapHashResponse getMapHash(MapHashRequest request) throws BackendException {
		try {
			return (MapHashResponse) ex.http.executeRequest(request);
		} catch (IOException | ClassNotFoundException e) {
			throw new BackendException(e);
		}
	}

	@Override
	public MapResponse getMap(MapRequest request) throws BackendException {
		try {
			return (MapResponse) ex.http.executeRequest(request);
		} catch (IOException | ClassNotFoundException e) {
			throw new BackendException(e);
		}
	}
}
