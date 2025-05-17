package space.itoncek.trailcompass.commons.requests.gamemgr;

import space.itoncek.trailcompass.commons.exchange.Authorized;
import space.itoncek.trailcompass.commons.objects.Token;

import java.io.Serializable;
import java.util.UUID;

public record ChangeCurrentHiderRequest(Token token, UUID newHider) implements Serializable , Authorized {
}
