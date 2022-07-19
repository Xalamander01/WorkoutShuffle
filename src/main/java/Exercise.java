public class Exercise {
    private String name;
    private String movementType;
    private String lightOrHeavy;
    private boolean compound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public String getLightOrHeavy() {
        return lightOrHeavy;
    }

    public void setLightOrHeavy(String lightOrHeavy) {
        this.lightOrHeavy = lightOrHeavy;
    }

    public boolean isCompound() {
        return compound;
    }

    public void setCompound(boolean compound) {
        this.compound = compound;
    }

    public void getAllCharacteristics() {
        if (this.isCompound()) {
            System.out.printf("The %s is a compound exercise that primarily trains the %s movement pattern, usually done with %s weight.", name, movementType, lightOrHeavy);
        } else {
            System.out.printf("The %s is an exercise that is more focused on the %s movement pattern, usually done with %s weight.", name, movementType, lightOrHeavy);
        }
    }
}
