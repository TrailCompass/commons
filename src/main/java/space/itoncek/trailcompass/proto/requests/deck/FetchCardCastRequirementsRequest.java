package space.itoncek.trailcompass.proto.requests.deck;

import space.itoncek.trailcompass.proto.Constants;
import space.itoncek.trailcompass.proto.exchange.Authorized;
import space.itoncek.trailcompass.proto.objects.Token;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

public record FetchCardCastRequirementsRequest(Token token, UUID cardUUID) implements Serializable, Authorized {
	// TODO)) When changed, please update commons version (more info in Constants.java)
	@Serial
	private static final long serialVersionUID = Constants.versionID;
}
