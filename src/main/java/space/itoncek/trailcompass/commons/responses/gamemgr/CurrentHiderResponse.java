package space.itoncek.trailcompass.commons.responses.gamemgr;

import space.itoncek.trailcompass.commons.Constants;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

public record CurrentHiderResponse(UUID id) implements Serializable {
	@Serial
	private static final long serialVersionUID = Constants.serialVersionUID;
}
