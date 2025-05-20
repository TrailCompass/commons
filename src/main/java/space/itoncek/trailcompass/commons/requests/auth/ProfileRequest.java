package space.itoncek.trailcompass.commons.requests.auth;

import space.itoncek.trailcompass.commons.Constants;
import space.itoncek.trailcompass.commons.exchange.Authorized;
import space.itoncek.trailcompass.commons.objects.Token;

import java.io.Serial;
import java.io.Serializable;

public record ProfileRequest(Token token) implements Serializable, Authorized {
	@Serial
	private static final long serialVersionUID = Constants.serialVersionUID;
}
