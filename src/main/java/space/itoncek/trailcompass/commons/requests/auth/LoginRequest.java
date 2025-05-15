package space.itoncek.trailcompass.commons.requests.auth;

import java.io.Serializable;

public record LoginRequest(String username, byte[] passwordHash) implements Serializable {
}
