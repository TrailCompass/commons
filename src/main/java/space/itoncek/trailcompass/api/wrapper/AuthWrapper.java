package space.itoncek.trailcompass.api.wrapper;

import java.util.List;
import java.util.UUID;

import space.itoncek.trailcompass.api.ExchangeHandler;
import space.itoncek.trailcompass.commons.objects.Player;
import space.itoncek.trailcompass.commons.objects.Token;
import space.itoncek.trailcompass.commons.requests.auth.ListPlayersRequest;
import space.itoncek.trailcompass.commons.requests.auth.LoginRequest;
import space.itoncek.trailcompass.commons.requests.auth.ProfileOtherRequest;
import space.itoncek.trailcompass.commons.requests.auth.ProfileRequest;
import space.itoncek.trailcompass.commons.requests.auth.RegisterRequest;
import space.itoncek.trailcompass.commons.responses.auth.LoginResponse;
import space.itoncek.trailcompass.commons.responses.generic.OkResponse;
import space.itoncek.trailcompass.commons.utils.BackendException;

public class AuthWrapper  {
    private final ExchangeHandler eh;
    private final Token token;

    public AuthWrapper(ExchangeHandler eh, Token token) {
        this.eh = eh;
        this.token = token;
    }

    public LoginResponse login(String username, byte[] passwordHash) throws BackendException {
        return eh.auth().login(new LoginRequest(username,passwordHash));
    }

    public OkResponse register(Player p) throws BackendException {
        return eh.auth().register(new RegisterRequest(token, p));
    }

    public Player getProfile() throws BackendException {
        return eh.auth().getProfile(new ProfileRequest(token)).p();
    }

    public Player getOtherProfile(UUID id) throws BackendException {
        return eh.auth().getOtherProfile(new ProfileOtherRequest(token, id)).p();
    }

    public List<Player> listPlayers() throws BackendException {
        return eh.auth().listPlayers(new ListPlayersRequest(token)).players();
    }
}
