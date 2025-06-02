package space.itoncek.trailcompass.api;

import space.itoncek.trailcompass.api.utils.HttpUtils;
import space.itoncek.trailcompass.api.wrapper.WrappedExchange;
import space.itoncek.trailcompass.commons.exchange.*;
import space.itoncek.trailcompass.commons.objects.Token;

public class ExchangeHandler implements IExchange {
	public final HttpUtils http;

	public ExchangeHandler(String url) {
		http = new HttpUtils(url);
	}

	@Override
	public IAuthExchange auth() {
		return new AuthExchange(this);
	}

	@Override
	public ISystemExchange system() {
		return new SystemExchange(this);
	}

	@Override
	public IMapExchange map() {
		return new MapExchange(this);
	}

	@Override
	public IGameManagerExchange gameMgr() {
		return new GameManagerExchange(this);
	}

	@Override
	public IDeckExchange deck() {
		return new DeckExchange(this);
	}

	public WrappedExchange wrapped(Token token) {
		return new WrappedExchange(this, token);
	}
}
