class UtilityCar extends Car {
    protected boolean rearCoolingVents;
    
    public UtilityCar(long id, String name, boolean rearCoolingVents) {
        super(id, name);
        this.rearCoolingVents = rearCoolingVents;
    }
    
    @Override
    public double calculateDriveCost(double km) {
        return Math.round(km * 18);
    }
}