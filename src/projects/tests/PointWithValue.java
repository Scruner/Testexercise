package projects.tests;

public class PointWithValue<T> extends Point{

    private final T value;

    public PointWithValue(int coordinateX, int coordinateY, T value) {
        super(coordinateX, coordinateY);
        this.value = value;
    }
}
