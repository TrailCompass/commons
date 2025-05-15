package space.itoncek.trailcompass.commons.responses.auth;

import java.io.Serializable;

public record LoginResponse(String token) implements Serializable {
}
