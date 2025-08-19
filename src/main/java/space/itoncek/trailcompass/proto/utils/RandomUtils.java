package space.itoncek.trailcompass.proto.utils;

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

import org.apache.commons.lang3.RandomStringUtils;

import java.security.SecureRandom;
import java.util.Random;

public class RandomUtils {
	/**
	 * Generates new random string
	 *
	 * @param char_num new string's length
	 * @param letters  should the new string contain letters
	 * @param numbers  should the new string contain numbers
	 *
	 * @return random string
	 */
	public static String generateRandomString(int char_num, boolean letters, boolean numbers) {
		if (letters && numbers) {
			return RandomStringUtils.secureStrong().nextAlphanumeric(char_num);
		} else if (letters) {
			return RandomStringUtils.secureStrong().nextAlphabetic(char_num);
		} else if (numbers) {
			return RandomStringUtils.secureStrong().nextNumeric(char_num);
		} else {
			throw new SecurityException("There needs to be at least one group of characters!");
		}
	}

	private static final String[] nouns = new String[]{
			"water",
			"food",
			"mother",
			"father",
			"house",
			"car",
			"dog",
			"cat",
			"money",
			"morning",
			"night",
			"afternoon",
			"brother",
			"sister",
			"bed",
			"kitchen",
			"restaurant",
			"bird",
			"tree",
			"flower",
			"animal",
			"phone",
			"sun",
			"moon",
			"sea",
			"river",
			"weather",
			"eyes",
			"ears",
			"hair",
			"shoes",
			"bag",
			"train",
			"bus",
			"knife",
			"fork",
			"spoon",
			"breakfast",
			"dinner",
			"bread",
			"fruit",
			"vegetables",
			"meat",
			"drink",
			"town",
			"village",
			"toilet",
			"weekend",
			"doctor",
			"policeman"
	};

	private static final String[] adjectives = new String[]{
			"good",
			"big",
			"small",
			"bad",
			"hot",
			"cold",
			"happy",
			"beautiful",
			"open",
			"near",
			"closed",
			"new",
			"old",
			"clean",
			"strong",
			"young",
			"expensive",
			"early",
			"fast",
			"dark",
			"delicious",
			"soft",
			"dirty",
			"empty",
			"far",
			"sad",
			"free",
			"full",
			"funny",
			"hard",
			"heavy",
			"hungry",
			"interesting",
			"kind",
			"late",
			"loud",
			"light",
			"quiet",
			"ready",
			"slow",
			"smart",
			"tall",
			"thirsty",
			"ugly",
			"weak",
			"bright",
			"short",
			"serious",
			"stupid",
			"honest"
	};

	public static String pickRandomStrings() {
		SecureRandom rnd = new SecureRandom();
		return adjectives[rnd.nextInt(adjectives.length)] + "-" + nouns[rnd.nextInt(nouns.length)];
	}
}
