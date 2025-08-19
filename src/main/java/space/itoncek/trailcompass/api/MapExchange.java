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

import space.itoncek.trailcompass.proto.exchange.IMapExchange;
import space.itoncek.trailcompass.proto.requests.map.MapHashRequest;
import space.itoncek.trailcompass.proto.requests.map.MapRequest;
import space.itoncek.trailcompass.proto.responses.map.MapHashResponse;
import space.itoncek.trailcompass.proto.responses.map.MapResponse;
import space.itoncek.trailcompass.proto.utils.BackendException;

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
