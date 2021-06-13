package sample.schemes;

public interface SchemeBuilder {

    void buildOper();
    void buildSol();
    void buildBegin();
    void buildEnd();
    void buildArrow();
    Scheme getScheme();
}
