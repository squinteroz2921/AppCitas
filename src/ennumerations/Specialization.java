
package ennumerations;

public enum Specialization {
    BARBA(1),CORTE(2),BARBA_CORTE(3);
    private final int intEnum;
    Specialization(int intEnum){
        this.intEnum=intEnum;
    }
    public int getIntEnum(){
        return this.intEnum;
    }
}
