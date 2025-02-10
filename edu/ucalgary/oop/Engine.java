public class Engine {
    private String engineType;

    public Engine(string engineType) {
        this.engineType = engineType;
    }

    public Engine(Engine other) {
        this.engineType = other.engineType;
    }

    public String getEngineType() {
        return engineType;
    }
}
