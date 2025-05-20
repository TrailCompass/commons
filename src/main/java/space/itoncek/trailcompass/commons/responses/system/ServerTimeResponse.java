package space.itoncek.trailcompass.commons.responses.system;

import space.itoncek.trailcompass.commons.Constants;

import java.io.Serial;
import java.io.Serializable;

public record ServerTimeResponse(long start, long mid) implements Serializable {
	@Serial
	private static final long serialVersionUID = Constants.serialVersionUID;
}
