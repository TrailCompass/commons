package space.itoncek.trailcompass.api.wrapper;

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

import space.itoncek.trailcompass.api.ExchangeHandler;
import space.itoncek.trailcompass.proto.objects.Player;
import space.itoncek.trailcompass.proto.objects.Token;
import space.itoncek.trailcompass.proto.requests.auth.*;
import space.itoncek.trailcompass.proto.responses.auth.LoginResponse;
import space.itoncek.trailcompass.proto.responses.generic.OkResponse;
import space.itoncek.trailcompass.proto.utils.BackendException;

import java.util.List;
import java.util.UUID;

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
