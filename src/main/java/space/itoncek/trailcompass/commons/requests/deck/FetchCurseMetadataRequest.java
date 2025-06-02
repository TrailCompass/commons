package space.itoncek.trailcompass.commons.requests.deck;

import space.itoncek.trailcompass.commons.Constants;
import space.itoncek.trailcompass.commons.exchange.Authorized;
import space.itoncek.trailcompass.commons.objects.Token;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

public record FetchCurseMetadataRequest(Token token, UUID cardUUID) implements Serializable, Authorized {
	// TODO)) When changed, please update commons version (more info in Constants.java)
	@Serial
	private static final long serialVersionUID = Constants.versionID;
}
