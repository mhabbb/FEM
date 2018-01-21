package integral;

public class Integral {
    private final double[] doublePointWages = {1, 1};
    private final double[] doublePointCoords = {-0.577, 0.577};

    private final double[] triplePointWages = {5.0 / 9.0, 8.0 / 9.0, 5.0 / 9.0 };
    private final double[] triplePointCoords = {-0.7745, 0, 0.7745};

    public double doublePointIntegral(){
        double integral = 0;
        for(int i=0; i<doublePointWages.length; ++i){
            for(int j=0; j<doublePointWages.length; ++j){
                integral += Equation.f(doublePointCoords[i], doublePointCoords[j]) * doublePointWages[i] * doublePointWages[j];
            }
        }
        return integral;
    }

    public double triplePointIntegral(){
        double integral = 0;
        for(int i=0; i<triplePointWages.length; ++i){
            for(int j=0; j<triplePointWages.length; ++j){
                integral += Equation.f(triplePointCoords[i], triplePointCoords[j]) * triplePointWages[i] * triplePointWages[j];
            }
        }
        return integral;
    }
}
