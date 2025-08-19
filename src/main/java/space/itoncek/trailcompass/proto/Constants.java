package space.itoncek.trailcompass.proto;

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
import space.itoncek.trailcompass.commons.BuildMeta;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Constants {
	public static final long versionID = versionID();

	//-------------------------------------------------------------------------------
	// TODO)) Updating version when "API" has changed
	//   When changing anything inside commons.requests or commons.responses,
	//   you should update the build version to reflect such change. This tells
	//   the serialization & deserialization processes the version of said object
	//   and prevents deserializing something in a wrong way.
	//-------------------------------------------------------------------------------
	// TODO)) Major/minor/patch version changes
	//  - preferrably in a clean commit with no changes except for build.gradle
	//  - api version should be set to zero
	//    - eg. Project update from 1.0.0 to 1.0.1:
	//    	- Commons last version: 1.0.0.13
	//    	- Commons next version: 1.0.1.0
	//-------------------------------------------------------------------------------
	// TODO)) API version changes
	//  - Development usage only!
	//  - Used when developing new features/versions
	//  - ALWAYS 0 IN RELEASE VERSIONS
	//  - Could be more than zero on main branch
	//  - Attempt to keep backend & app projects up to date
	//-------------------------------------------------------------------------------
	private static long versionID() {
		final String regex = "v([0-9]+)\\.([0-9]+)\\.([0-9]+)\\.([0-9]+)";

		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(BuildMeta.APP_VERSION);

		if (!matcher.find()) {
			return -1;
		}

		int major = Integer.parseInt(matcher.group(1));
		int minor = Integer.parseInt(matcher.group(2));
		int patch = Integer.parseInt(matcher.group(3));
		int api = Integer.parseInt(matcher.group(4));

		return major * 1_000_000_000L + minor * 1_000_000L + patch * 1_000L + api;
	}
}
