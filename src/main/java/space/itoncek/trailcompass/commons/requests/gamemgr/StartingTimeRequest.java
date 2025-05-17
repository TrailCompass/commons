package space.itoncek.trailcompass.commons.requests.gamemgr;

import space.itoncek.trailcompass.commons.exchange.Authorized;
import space.itoncek.trailcompass.commons.objects.Token;

import java.io.Serializable;

public record StartingTimeRequest(Token token) implements Serializable, Authorized {
}
