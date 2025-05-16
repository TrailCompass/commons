package space.itoncek.trailcompass.commons.objects;

import java.io.Serializable;

public record Player(int id, String nickname, byte[] passwordHash, boolean admin) implements Serializable {
}
