package space.itoncek.trailcompass.commons.responses.auth;

import space.itoncek.trailcompass.commons.objects.Player;

import java.io.Serializable;

public record ProfileResponse(Player p) implements Serializable {
}
