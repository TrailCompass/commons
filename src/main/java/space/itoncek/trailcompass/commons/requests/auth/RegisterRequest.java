package space.itoncek.trailcompass.commons.requests.auth;

import space.itoncek.trailcompass.commons.objects.Token;

import java.io.Serializable;

public record RegisterRequest(Token token, String name, byte[] passwordHash, boolean admin) implements Serializable {
}
