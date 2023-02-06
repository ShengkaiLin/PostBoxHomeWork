public class Box3 {

    private final float length = 23f;
    private final float width = 14f;
    private final float height = 13f;

    public boolean validate(float length , float width , float height){
        return length<=this.length && width<=this.width && height <= this.height;
    }


}
