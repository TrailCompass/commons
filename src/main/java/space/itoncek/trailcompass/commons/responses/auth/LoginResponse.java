package space.itoncek.trailcompass.commons.responses.auth;

import space.itoncek.trailcompass.commons.Constants;

import java.io.Serial;
import java.io.Serializable;

public record LoginResponse(String token) implements Serializable {
	@Serial
	private static final long serialVersionUID = Constants.serialVersionUID;
}
