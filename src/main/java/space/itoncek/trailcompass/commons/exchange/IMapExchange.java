package space.itoncek.trailcompass.commons.exchange;

import space.itoncek.trailcompass.commons.requests.map.MapHashRequest;
import space.itoncek.trailcompass.commons.requests.map.MapRequest;
import space.itoncek.trailcompass.commons.responses.map.MapHashResponse;
import space.itoncek.trailcompass.commons.responses.map.MapResponse;
import space.itoncek.trailcompass.commons.utils.BackendException;

public interface IMapExchange {
	MapHashResponse getMapHash(MapHashRequest request) throws BackendException;
	MapResponse getMap(MapRequest request) throws BackendException;
}
