package space.itoncek.trailcompass.api.utils;

import org.apache.commons.io.IOUtils;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.io.entity.StringEntity;
import space.itoncek.trailcompass.commons.responses.generic.ErrorResponse;
import space.itoncek.trailcompass.commons.utils.Base64Utils;
import space.itoncek.trailcompass.commons.utils.BackendException;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;

public class HttpUtils {
	private final String serverAddress;

	public HttpUtils(String serverAddress) {
		this.serverAddress = serverAddress;
	}

	public Serializable executeRequest(Serializable request) throws IOException, ClassNotFoundException, BackendException {
		try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
			HttpPost post = new HttpPost(serverAddress);

			post.setEntity(new StringEntity(Base64Utils.serializeToBase64(request)));

			String s = httpClient.execute(post, response -> IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8));

			Serializable serializable = Base64Utils.deserializeFromBase64(s);

			if (serializable instanceof ErrorResponse(String exception)) {
				throw new BackendException("Server has thrown the following exception: \n%s".formatted(exception));
			}

			return serializable;
		}
	}
}
