package space.itoncek.trailcompass.commons.objects;

import space.itoncek.trailcompass.commons.Constants;

import java.io.Serial;
import java.io.Serializable;

public enum CardClass implements Serializable {
	Curse,
	Powerup,
	Time;
	// TODO)) When changed, please update commons version (more info in Constants.java)
	@Serial
	private static final long serialVersionUID = Constants.versionID;
}
