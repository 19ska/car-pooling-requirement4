class HatchBack extends Car {
    protected boolean powerWindowsEnabled;
    protected boolean automaticGear;
    
    public HatchBack(long id, String name, boolean powerWindowsEnabled, boolean automaticGear) {
        super(id, name);
        this.powerWindowsEnabled = powerWindowsEnabled;
        this.automaticGear = automaticGear;
    }
    
    @Override
    public double calculateDriveCost(double km) {
        if (automaticGear) {
            return Math.round(km * 12);
        } else {
            return Math.round(km * 10);
        }
    }
}
