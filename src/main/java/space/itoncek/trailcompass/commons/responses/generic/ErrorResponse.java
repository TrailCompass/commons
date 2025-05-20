package space.itoncek.trailcompass.commons.responses.generic;

import space.itoncek.trailcompass.commons.Constants;

import java.io.Serial;
import java.io.Serializable;

public record ErrorResponse(String exception) implements Serializable {
	@Serial
	private static final long serialVersionUID = Constants.serialVersionUID;
}