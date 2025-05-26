package space.itoncek.trailcompass.api.wrapper;

import space.itoncek.trailcompass.api.ExchangeHandler;
import space.itoncek.trailcompass.commons.objects.Token;
import space.itoncek.trailcompass.commons.requests.map.MapHashRequest;
import space.itoncek.trailcompass.commons.requests.map.MapRequest;
import space.itoncek.trailcompass.commons.utils.BackendException;

public class MapWrapper {
    private final ExchangeHandler eh;
    private final Token token;

    public MapWrapper(ExchangeHandler eh, Token token) {
        this.eh = eh;
        this.token = token;
    }

    public String getMapHash() throws BackendException {
        return eh.map().getMapHash(new MapHashRequest(token)).sha256();
    }

    public byte[] getMap() throws BackendException {
        return eh.map().getMap(new MapRequest(token)).mapfile();
    }
}
