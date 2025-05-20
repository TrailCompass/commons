package space.itoncek.trailcompass.commons.responses.map;

import space.itoncek.trailcompass.commons.Constants;

import java.io.Serial;
import java.io.Serializable;

public record MapResponse(byte[] mapfile) implements Serializable {
	@Serial
	private static final long serialVersionUID = Constants.serialVersionUID;

}
