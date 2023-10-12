
abstract class Car {
    protected long id;
    protected String name;
    
    
    
    public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public abstract double calculateDriveCost(double km);

	}