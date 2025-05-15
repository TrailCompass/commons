package space.itoncek.trailcompass.commons.requests.auth;

import space.itoncek.trailcompass.commons.objects.Token;

import java.io.Serializable;

public record ProfileOtherRequest(Token token, int id) implements Serializable {
}
