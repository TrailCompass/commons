package space.itoncek.trailcompass.proto.exchange;

/*
 *
 * ████████╗██████╗  █████╗ ██╗██╗      ██████╗ ██████╗ ███╗   ███╗██████╗  █████╗ ███████╗███████╗
 * ╚══██╔══╝██╔══██╗██╔══██╗██║██║     ██╔════╝██╔═══██╗████╗ ████║██╔══██╗██╔══██╗██╔════╝██╔════╝
 *    ██║   ██████╔╝███████║██║██║     ██║     ██║   ██║██╔████╔██║██████╔╝███████║███████╗███████╗
 *    ██║   ██╔══██╗██╔══██║██║██║     ██║     ██║   ██║██║╚██╔╝██║██╔═══╝ ██╔══██║╚════██║╚════██║
 *    ██║   ██║  ██║██║  ██║██║███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║██║     ██║  ██║███████║███████║
 *    ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚═╝     ╚═╝  ╚═╝╚══════╝╚══════╝
 *
 *                                    Copyright (c) 2025.
 */

import space.itoncek.trailcompass.proto.requests.deck.*;
import space.itoncek.trailcompass.proto.responses.deck.*;
import space.itoncek.trailcompass.proto.responses.generic.OkResponse;
import space.itoncek.trailcompass.proto.utils.BackendException;

public interface IDeckExchange {
	CardListResponse listCards(ListCardsRequest req) throws BackendException;

	CardResponse drawCard(DrawCardRequest req) throws BackendException;

	CardCastRequirementsResponse getCardCastRequirements(FetchCardCastRequirementsRequest req) throws BackendException;

	CardMetadataResponse getCardMetadata(FetchCardMetadataRequest req) throws BackendException;

	CurseMetadataResponse getCurseMetadata(FetchCurseMetadataRequest req) throws BackendException;

	OkResponse castCardWithVoid(CastCardWithVoidRequest req) throws BackendException;

	OkResponse castCardWithText(CastCardWithTextRequest req) throws BackendException;

	OkResponse castCardWithFreeQuestion(CastCardWithFreeQuestionRequest req) throws BackendException;

	OkResponse castCardWithOtherCard(CastCardWithOtherCardRequest req) throws BackendException;

	OkResponse castCardWithTwoOtherCards(CastCardWithTwoOtherCardsRequest req) throws BackendException;

	OkResponse castCardWithOtherTimeBonus(CastCardWithOtherTimeBonusRequest req) throws BackendException;

	OkResponse castCardWithOtherPowerupCard(CastCardWithOtherPowerupCardRequest req) throws BackendException;
}
