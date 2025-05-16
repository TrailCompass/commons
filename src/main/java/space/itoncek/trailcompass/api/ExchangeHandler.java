package space.itoncek.trailcompass.api;

import space.itoncek.trailcompass.api.utils.HttpUtils;
import space.itoncek.trailcompass.commons.exchange.IAuthExchange;
import space.itoncek.trailcompass.commons.exchange.IExchange;
import space.itoncek.trailcompass.commons.exchange.ISystemExchange;

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
}
