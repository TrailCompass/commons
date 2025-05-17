package space.itoncek.trailcompass.commons.requests.auth;

import space.itoncek.trailcompass.commons.exchange.Authorized;
import space.itoncek.trailcompass.commons.objects.Token;

import java.io.Serializable;
import java.util.UUID;

public record ProfileOtherRequest(Token token, UUID id) implements Serializable, Authorized {
}
