package space.itoncek.trailcompass.commons.responses.generic;

import java.io.Serializable;

public record ErrorResponse(String exception) implements Serializable {
}