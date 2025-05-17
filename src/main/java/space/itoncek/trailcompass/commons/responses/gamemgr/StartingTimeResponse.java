package space.itoncek.trailcompass.commons.responses.gamemgr;

import java.io.Serializable;
import java.time.ZonedDateTime;

public record StartingTimeResponse(ZonedDateTime dateTime) implements Serializable {
}
