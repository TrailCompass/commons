package space.itoncek.trailcompass.commons.exchange;

public interface IExchange {
	IAuthExchange auth();
	ISystemExchange system();
	IMapExchange map();
	IGameManagerExchange gameMgr();
	IDeckExchange deck();
}
