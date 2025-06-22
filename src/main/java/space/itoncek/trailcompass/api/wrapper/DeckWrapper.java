package space.itoncek.trailcompass.api.wrapper;

import java.util.List;
import java.util.UUID;

import space.itoncek.trailcompass.api.ExchangeHandler;
import space.itoncek.trailcompass.commons.objects.Card;
import space.itoncek.trailcompass.commons.objects.CardCastRequirement;
import space.itoncek.trailcompass.commons.objects.Token;
import space.itoncek.trailcompass.commons.requests.deck.CastCardWithFreeQuestionRequest;
import space.itoncek.trailcompass.commons.requests.deck.CastCardWithOtherCardRequest;
import space.itoncek.trailcompass.commons.requests.deck.CastCardWithOtherPowerupCardRequest;
import space.itoncek.trailcompass.commons.requests.deck.CastCardWithOtherTimeBonusRequest;
import space.itoncek.trailcompass.commons.requests.deck.CastCardWithTextRequest;
import space.itoncek.trailcompass.commons.requests.deck.CastCardWithTwoOtherCardsRequest;
import space.itoncek.trailcompass.commons.requests.deck.CastCardWithVoidRequest;
import space.itoncek.trailcompass.commons.requests.deck.DrawCardRequest;
import space.itoncek.trailcompass.commons.requests.deck.FetchCardCastRequirementsRequest;
import space.itoncek.trailcompass.commons.requests.deck.FetchCardMetadataRequest;
import space.itoncek.trailcompass.commons.requests.deck.FetchCurseMetadataRequest;
import space.itoncek.trailcompass.commons.requests.deck.ListCardsRequest;
import space.itoncek.trailcompass.commons.responses.deck.CurseMetadataResponse;
import space.itoncek.trailcompass.commons.utils.BackendException;

public class DeckWrapper {
    private final ExchangeHandler eh;
    private final Token token;

    public DeckWrapper(ExchangeHandler eh, Token token) {
        this.eh = eh;
        this.token = token;
    }

    public List<Card> listCards() throws BackendException {
        return eh.deck().listCards(new ListCardsRequest(token)).cards();
    }

    public UUID drawCard() throws BackendException {
        return eh.deck().drawCard(new DrawCardRequest(token)).cardUuid();
    }

    public CardCastRequirement getCardCastRequirements(UUID uuid) throws BackendException {
        return eh.deck().getCardCastRequirements(new FetchCardCastRequirementsRequest(token, uuid)).requirement();
    }

    public Card getCardMetadata(UUID uuid) throws BackendException {
        return eh.deck().getCardMetadata(new FetchCardMetadataRequest(token, uuid)).type();
    }

    public CurseMetadataResponse getCurseMetadata(UUID uuid) throws BackendException {
        return eh.deck().getCurseMetadata(new FetchCurseMetadataRequest(token, uuid));
    }

    public void castCardWithVoid(UUID card_id) throws BackendException {
        eh.deck().castCardWithVoid(new CastCardWithVoidRequest(token, card_id));
    }

    public void castCardWithText(UUID card_id, String text) throws BackendException {
        eh.deck().castCardWithText(new CastCardWithTextRequest(token, card_id, text));
    }

    public void castCardWithFreeQuestion(UUID card_id) throws BackendException {
        eh.deck().castCardWithFreeQuestion(new CastCardWithFreeQuestionRequest(token, card_id));
    }

    public void castCardWithOtherCard(UUID card_id, UUID other_card_id) throws BackendException {
        eh.deck().castCardWithOtherCard(new CastCardWithOtherCardRequest(token, card_id, other_card_id));
    }

    public void castCardWithTwoOtherCards(UUID card_id, UUID otherCard1, UUID otherCard2) throws BackendException {
        eh.deck().castCardWithTwoOtherCards(new CastCardWithTwoOtherCardsRequest(token, card_id, otherCard1, otherCard2));
    }

    public void castCardWithOtherTimeBonus(UUID card_id, UUID time_bonus_id) throws BackendException {
        eh.deck().castCardWithOtherTimeBonus(new CastCardWithOtherTimeBonusRequest(token, card_id, time_bonus_id));
    }

    public void castCardWithOtherPowerupCard(UUID card_id, UUID powerup_id) throws BackendException {
        eh.deck().castCardWithOtherPowerupCard(new CastCardWithOtherPowerupCardRequest(token, card_id, powerup_id));
    }

    public int getHandSize() {
        //TODO)) Implement on server!
        return 0;
    }
}
