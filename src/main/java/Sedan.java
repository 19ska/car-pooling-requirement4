class Sedan extends Car {
    protected boolean absEnabled;
    protected int bootSpace;
    
    public Sedan(long id, String name, boolean absEnabled, int bootSpace) {
        super(id, name);
        this.absEnabled = absEnabled;
        this.bootSpace = bootSpace;
    }
    
    @Override
    public double calculateDriveCost(double km) {
        if (bootSpace > 600) {
            return Math.round(km * 15 + (km * 15 * 0.20));
        } else {
            return Math.round(km * 15);
        }
    }
}
