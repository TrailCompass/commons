package space.itoncek.trailcompass.commons.responses.system;

import space.itoncek.trailcompass.commons.Constants;

import java.io.Serial;
import java.io.Serializable;

public record ServerVersionResponse(String ver, long appVersion) implements Serializable {
	@Serial
	private static final long serialVersionUID = Constants.serialVersionUID;
}
