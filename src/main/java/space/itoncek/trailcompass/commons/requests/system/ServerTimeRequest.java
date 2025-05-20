package space.itoncek.trailcompass.commons.requests.system;

import space.itoncek.trailcompass.commons.Constants;

import java.io.Serial;
import java.io.Serializable;

public record ServerTimeRequest(long start) implements Serializable {
	@Serial
	private static final long serialVersionUID = Constants.serialVersionUID;
}
