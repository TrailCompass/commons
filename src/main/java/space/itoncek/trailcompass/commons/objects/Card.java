package space.itoncek.trailcompass.commons.objects;

import space.itoncek.trailcompass.commons.Constants;

import java.io.Serial;
import java.io.Serializable;

public record Card() implements Serializable {
	@Serial
	private static final long serialVersionUID = Constants.serialVersionUID;
}
