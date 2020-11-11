package ZaDAnie_2;

public interface AbstractChairFactory{
    VictorianChair createVictorianChair();
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}