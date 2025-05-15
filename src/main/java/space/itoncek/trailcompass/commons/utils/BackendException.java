package space.itoncek.trailcompass.commons.utils;

public class BackendException extends Throwable {
	public BackendException(String formatted) {
		super(formatted);
	}

	public BackendException(Exception e) {
		super(e);
	}
}
