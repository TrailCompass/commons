package space.itoncek.trailcompass.commons.responses.gamemgr;

import space.itoncek.trailcompass.commons.Constants;
import space.itoncek.trailcompass.commons.exchange.Authorized;
import space.itoncek.trailcompass.commons.objects.Location;
import space.itoncek.trailcompass.commons.objects.Token;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public record SeekerLocationResponse(List<Location> locations) implements Serializable {
    // TODO)) When changed, please update commons version (more info in Constants.java)
    @Serial
    private static final long serialVersionUID = Constants.versionID;
}
