package space.itoncek.trailcompass.commons.requests.auth;

import space.itoncek.trailcompass.commons.exchange.Authorized;
import space.itoncek.trailcompass.commons.objects.Token;

import java.io.Serializable;

public record ProfileRequest(Token token) implements Serializable, Authorized {
}
