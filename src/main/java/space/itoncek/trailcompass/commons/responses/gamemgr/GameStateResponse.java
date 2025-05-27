package space.itoncek.trailcompass.commons.responses.gamemgr;

import space.itoncek.trailcompass.commons.Constants;
import space.itoncek.trailcompass.commons.objects.GameState;

import java.io.Serial;
import java.io.Serializable;

public record GameStateResponse(GameState state) implements Serializable {
	// TODO)) When changed, please update commons version (more info in Constants.java)
	@Serial
	private static final long serialVersionUID = Constants.versionID;
}
