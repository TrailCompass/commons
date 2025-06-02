package space.itoncek.trailcompass.commons.responses.deck;

import space.itoncek.trailcompass.commons.Constants;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

public record CardResponse(UUID cardUuid) implements Serializable {
	// TODO)) When changed, please update commons version (more info in Constants.java)
	@Serial
	private static final long serialVersionUID = Constants.versionID;
}
