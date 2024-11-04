package UR_1;
public class Door {
    private boolean isPrize;

    public Door(boolean isPrize) {
        this.isPrize = isPrize;
    }

    public boolean isPrize() {
        return isPrize;
    }


    @Override
    public String toString() {
        return "Door{" +
                "isPrize=" + isPrize +
                '}';
    }


}