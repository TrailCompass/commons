package space.itoncek.trailcompass.commons.objects;

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

import space.itoncek.trailcompass.commons.Constants;

import java.io.Serial;
import java.io.Serializable;

import static space.itoncek.trailcompass.commons.objects.CardCastRequirement.*;
import static space.itoncek.trailcompass.commons.objects.CardClass.*;

public enum CardType  implements Serializable {
	TimeBonusRed(Time, Nothing),
	TimeBonusOrange(Time, Nothing),
	TimeBonusYellow(Time, Nothing),
	TimeBonusGreen(Time, Nothing),
	TimeBonusBlue(Time, Nothing),
	Randomize(Powerup, Request),
	Veto(Powerup, Request),
	Duplicate(Powerup, OtherCard),
	Move(Powerup, NotEndgame),
	Discard1(Powerup, OtherCard),
	Discard2(Powerup, TwoOtherCards),
	Draw1Expand(Powerup, Nothing),
	//Curses
	Curse_Zoologist(Curse, Image),
	Curse_UnguidedTourist(Curse, Nothing),
	Curse_EndlessTumble(Curse, DiceRoll),
	Curse_HiddenHangman(Curse, TwoOtherCards),
	Curse_OverflowingChalice(Curse, OtherCard),
	Curse_MediocreTravelAgent(Curse,Nothing),
	Curse_LuxuryCard(Curse, Image),
	Curse_UTurn(Curse, Nothing),
	Curse_BridgeTroll(Curse,Nothing),
	Curse_WaterWeight(Curse, Nothing),
	Curse_JammmedDoor(Curse, TwoOtherCards),
	Curse_Cairn(Curse, Text),
	Curse_Urbex(Curse, TwoOtherCards),
	Curse_ImpressionableConsumer(Curse,FreeQuestion),
	Curse_EggPartner(Curse, TwoOtherCards),
	Curse_DistantCuisine(Curse,Nothing),
	Curse_RightTurn(Curse,OtherCard),
	Curse_Labyrinth(Curse, Image),
	Curse_BirdGuide(Curse,Text),
	Curse_SpottyMemory(Curse, OtherTimeBonusCard),
	Curse_LemonPhylactery(Curse,OtherPowerupCard),
	Curse_DrainedBrain(Curse,Nothing),
	Curse_RansomNote(Curse, Image),
	Curse_GamblersFeet(Curse, DiceRoll);
	// TODO)) When changed, please update commons version (more info in Constants.java)
	@Serial
	private static final long serialVersionUID = Constants.versionID;

	public final CardClass cardClass;
	public final CardCastRequirement requirement;

	CardType(CardClass cardClass, CardCastRequirement requirement) {
		this.cardClass = cardClass;
		this.requirement = requirement;
	}
}
