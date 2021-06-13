package sample;

import sample.schemes.Scheme;
import sample.schemes.SchemeBuilder;

public class Director {

    public Scheme construct(SchemeBuilder schemeBuilder){

        schemeBuilder.buildBegin();
        schemeBuilder.buildOper();
        schemeBuilder.buildSol();
        schemeBuilder.buildEnd();
        schemeBuilder.buildArrow();
        return schemeBuilder.getScheme();
    }
}
