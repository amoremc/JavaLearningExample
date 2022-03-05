package peng.amoremc;

public class PC {
    //by using Composition, we can extend multiple class at the same time, but
    //inheritance can only extend one class at a time;
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerup(){
        //getTheCase().pressPowerButton();
        theCase.pressPowerButton();//we do not need getter function in this way;
        drawLogo();
    }

    private void drawLogo(){
        //Fancy graphics;
        //getMonitor().drawPixelAt(1200, 50, "Yellow");
        monitor.drawPixelAt(1200, 50, "Yellow");
    }

    //public Case getTheCase() {
    private Case getTheCase() {
        return theCase;
    }

    //public Monitor getMonitor() {
    private Monitor getMonitor() {
        return monitor;
    }

    //public Motherboard getMotherboard() {
    private Motherboard getMotherboard() {
        return motherboard;
    }
}

