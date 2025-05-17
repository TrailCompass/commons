package space.itoncek.trailcompass.commons.objects;

import java.io.Serializable;
import java.util.UUID;

public record Player(UUID id, String nickname, byte[] passwordHash, boolean admin) implements Serializable {
}
