package space.itoncek.trailcompass.commons.exchange;

import space.itoncek.trailcompass.commons.requests.deck.*;
import space.itoncek.trailcompass.commons.responses.deck.*;
import space.itoncek.trailcompass.commons.utils.BackendException;

public interface IDeckExchange {
	CardListResponse listCards(ListCardsRequest req) throws BackendException;
	CardResponse drawCard(DrawCardRequest req) throws BackendException;
	CardCastRequirementsResponse getCardCastRequirements(FetchCardCastRequirementsRequest req) throws BackendException;
	CardMetadataResponse getCardMetadata(FetchCardMetadataRequest req) throws BackendException;
	CurseMetadataResponse getCurseMetadata(FetchCurseMetadataRequest req) throws BackendException;
}
