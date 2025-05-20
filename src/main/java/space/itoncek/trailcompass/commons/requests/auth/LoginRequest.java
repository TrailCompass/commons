package space.itoncek.trailcompass.commons.requests.auth;

import space.itoncek.trailcompass.commons.Constants;

import java.io.Serial;
import java.io.Serializable;

public record LoginRequest(String username, byte[] passwordHash) implements Serializable {
	@Serial
	private static final long serialVersionUID = Constants.serialVersionUID;
}
