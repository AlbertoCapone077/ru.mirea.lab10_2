package ZaDAnie_2;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair(){
        return new VictorianChair(120);
    }
    @Override
    public MagicChair createMagicChair(){
        return null;
    }
    @Override
    public FunctionalChair createFunctionalChair(){
        return null;
    }
}


