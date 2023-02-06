public class Box5 {

    private final float length = 39.5f;
    private final float width = 27.5f;
    private final float height = 23f;

    public boolean validate(float length , float width , float height){
        return length<=this.length && width<=this.width && height <= this.height;
    }

}
