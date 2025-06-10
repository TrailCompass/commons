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
import space.itoncek.trailcompass.commons.objects.Token;

public class WrappedExchange{
    private final ExchangeHandler eh;
    private final Token token;

    public WrappedExchange(ExchangeHandler eh, Token token) {
        this.eh = eh;
        this.token = token;
    }

    public AuthWrapper auth() {
        return new AuthWrapper(eh, token);
    }

    public DeckWrapper deck() {
        return new DeckWrapper(eh, token);
    }

    public SystemWrapper system() {
        return new SystemWrapper(eh, token);
    }

    public MapWrapper map() {
        return new MapWrapper(eh, token);
    }

    public GameManagerWrapper gameMgr() {
        return new GameManagerWrapper(eh, token);
    }
}
