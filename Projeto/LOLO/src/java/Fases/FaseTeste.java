package Fases;



public class FaseTeste extends Fase{
    
    public FaseTeste(int vidas){
      
        super(vidas);
        setHearts(1);
        positionMuro();
        setFaseID(-2);
        positionHud();
        positionHeart(1,8);
        positionChest(1,11);
        setExit(0,6);
        setLolo(2,6);
        getLolo().setVida(vidas);
        getLolo().setShots(5);
    }
    
    public Fase nextPhase() {
        return new TelaInicial(5);
    }

    public Fase restart() {
        return new FaseTeste(vidas);
    }
    
}
