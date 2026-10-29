package software.ulpgc.katas.aplication.usecases;

import software.ulpgc.katas.aplication.UseCase;
import software.ulpgc.katas.aplication.domain.FibonacciSeries;
import software.ulpgc.katas.aplication.ports.SeriesSerializer;

public class FibonacciCalculationUseCase implements UseCase {
    private final SeriesSerializer serializer;

    public FibonacciCalculationUseCase(SeriesSerializer serializer) {
        this.serializer = serializer;
    }

    @Override
    public String execute(String value) {
        return serializer.serialize(FibonacciSeries.calculate(deserialize(value)));
    }

    private int deserialize(String value) {
        return Integer.parseInt(value);
    }
}
