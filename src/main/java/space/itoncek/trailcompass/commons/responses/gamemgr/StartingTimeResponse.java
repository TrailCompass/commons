package space.itoncek.trailcompass.commons.responses.gamemgr;

import space.itoncek.trailcompass.commons.Constants;

import java.io.Serial;
import java.io.Serializable;
import java.time.ZonedDateTime;

public record StartingTimeResponse(ZonedDateTime dateTime) implements Serializable {
	// TODO)) When changed, please update commons version (more info in Constants.java)
	@Serial
	private static final long serialVersionUID = Constants.versionID;
}
