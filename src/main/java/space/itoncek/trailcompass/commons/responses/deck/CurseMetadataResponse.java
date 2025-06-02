package space.itoncek.trailcompass.commons.responses.deck;

import space.itoncek.trailcompass.commons.Constants;
import space.itoncek.trailcompass.commons.objects.CardClass;

import java.io.Serial;
import java.io.Serializable;

public record CurseMetadataResponse(CardClass cardClass, String title, String description, String castingConst) implements Serializable {
	// TODO)) When changed, please update commons version (more info in Constants.java)
	@Serial
	private static final long serialVersionUID = Constants.versionID;
}
