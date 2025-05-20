package space.itoncek.trailcompass.commons.responses.auth;

import space.itoncek.trailcompass.commons.Constants;
import space.itoncek.trailcompass.commons.objects.Player;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public record ProfileListResponse(List<Player> players) implements Serializable {
	@Serial
	private static final long serialVersionUID = Constants.serialVersionUID;
}
