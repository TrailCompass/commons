package space.itoncek.trailcompass.commons.responses.deck;

import space.itoncek.trailcompass.commons.Constants;
import space.itoncek.trailcompass.commons.objects.CardCastRequirement;

import java.io.Serial;
import java.io.Serializable;

public record CardCastRequirementsResponse(CardCastRequirement requirement) implements Serializable {
	// TODO)) When changed, please update commons version (more info in Constants.java)
	@Serial
	private static final long serialVersionUID = Constants.versionID;
}
