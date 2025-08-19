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

import java.io.*;
import java.util.Base64;

public class Base64Utils {
	public static String serializeToBase64(Serializable obj) throws IOException {
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
			 ObjectOutputStream oos = new ObjectOutputStream(baos)) {
			oos.writeObject(obj);
			return Base64.getEncoder().encodeToString(baos.toByteArray());
		}
	}

	public static Serializable deserializeFromBase64(String input) throws ClassNotFoundException, IOException {
		byte[] decode = Base64.getDecoder().decode(input);
		try (ByteArrayInputStream bais = new ByteArrayInputStream(decode);
			 ObjectInputStream ois = new ObjectInputStream(bais)) {
			return (Serializable) ois.readObject();
		}
	}
}
