package space.itoncek.trailcompass.commons.responses.system;

import java.io.Serializable;

public record ServerTimeResponse(long start, long mid) implements Serializable {
}
