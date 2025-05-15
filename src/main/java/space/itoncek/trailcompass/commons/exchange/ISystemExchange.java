package space.itoncek.trailcompass.commons.exchange;

import space.itoncek.trailcompass.commons.requests.system.ServerTimeRequest;
import space.itoncek.trailcompass.commons.requests.system.ServerVersionRequest;
import space.itoncek.trailcompass.commons.responses.system.ServerTimeResponse;
import space.itoncek.trailcompass.commons.responses.system.ServerVersionResponse;

public interface ISystemExchange {
	ServerTimeResponse time(ServerTimeRequest request);
	ServerVersionResponse version(ServerVersionRequest request);
}
