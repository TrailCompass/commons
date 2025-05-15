package space.itoncek.trailcompass.commons.exchange;

import space.itoncek.trailcompass.commons.requests.system.ServerTimeRequest;
import space.itoncek.trailcompass.commons.requests.system.ServerVersionRequest;
import space.itoncek.trailcompass.commons.responses.system.ServerTimeResponse;
import space.itoncek.trailcompass.commons.responses.system.ServerVersionResponse;
import space.itoncek.trailcompass.commons.utils.BackendException;

import java.io.IOException;

public interface ISystemExchange {
	ServerTimeResponse time(ServerTimeRequest request) throws BackendException;
	ServerVersionResponse version(ServerVersionRequest request) throws BackendException;
}
