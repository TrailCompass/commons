package space.itoncek.trailcompass.api;

import space.itoncek.trailcompass.commons.exchange.IDeckExchange;
import space.itoncek.trailcompass.commons.requests.deck.*;
import space.itoncek.trailcompass.commons.responses.deck.*;
import space.itoncek.trailcompass.commons.utils.BackendException;

import java.io.IOException;

public class DeckExchange implements IDeckExchange {
	private final ExchangeHandler ex;

	public DeckExchange(ExchangeHandler eh) {
		this.ex = eh;
	}

	@Override
	public CardListResponse listCards(ListCardsRequest req) throws BackendException {
		try {
			return (CardListResponse) ex.http.executeRequest(req);
		} catch (IOException | ClassNotFoundException e) {
			throw new BackendException(e);
		}
	}

	@Override
	public CardResponse drawCard(DrawCardRequest req) throws BackendException {
		try {
			return (CardResponse) ex.http.executeRequest(req);
		} catch (IOException | ClassNotFoundException e) {
			throw new BackendException(e);
		}
	}

	@Override
	public CardCastRequirementsResponse getCardCastRequirements(FetchCardCastRequirementsRequest req) throws BackendException {
		try {
			return (CardCastRequirementsResponse) ex.http.executeRequest(req);
		} catch (IOException | ClassNotFoundException e) {
			throw new BackendException(e);
		}
	}

	@Override
	public CardMetadataResponse getCardMetadata(FetchCardMetadataRequest req) throws BackendException {
		try {
			return (CardMetadataResponse) ex.http.executeRequest(req);
		} catch (IOException | ClassNotFoundException e) {
			throw new BackendException(e);
		}
	}

	@Override
	public CurseMetadataResponse getCurseMetadata(FetchCurseMetadataRequest req) throws BackendException {
		try {
			return (CurseMetadataResponse) ex.http.executeRequest(req);
		} catch (IOException | ClassNotFoundException e) {
			throw new BackendException(e);
		}
	}
}
