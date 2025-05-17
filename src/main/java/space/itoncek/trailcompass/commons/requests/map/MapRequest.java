package space.itoncek.trailcompass.commons.requests.map;

import space.itoncek.trailcompass.commons.exchange.Authorized;
import space.itoncek.trailcompass.commons.objects.Token;

import java.io.Serializable;

public record MapRequest(Token token) implements Serializable, Authorized {
}
