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
import space.itoncek.trailcompass.proto.objects.Token;
import space.itoncek.trailcompass.proto.requests.system.ServerTimeRequest;
import space.itoncek.trailcompass.proto.requests.system.ServerVersionRequest;
import space.itoncek.trailcompass.proto.responses.system.ServerTimeResponse;
import space.itoncek.trailcompass.proto.responses.system.ServerVersionResponse;
import space.itoncek.trailcompass.proto.utils.BackendException;

public class SystemWrapper {
    private final ExchangeHandler eh;

    public SystemWrapper(ExchangeHandler eh, Token token) {
        this.eh = eh;
    }

    public ServerTimeResponse time(long start) throws BackendException {
        return eh.system().time(new ServerTimeRequest(start));
    }
    public ServerVersionResponse version() throws BackendException {
        return eh.system().version(new ServerVersionRequest());
    }
}
