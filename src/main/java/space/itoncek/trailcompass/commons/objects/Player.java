package space.itoncek.trailcompass.commons.objects;

import space.itoncek.trailcompass.commons.Constants;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

public record Player(UUID id, String nickname, byte[] passwordHash, boolean admin) implements Serializable {
	@Serial
	private static final long serialVersionUID = Constants.serialVersionUID;
}
