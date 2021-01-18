import java.util.*;
public class TestPoint3D {
    public static void main(String[] args){

        Point3D p=new Point3D(1.0f,2.0f,3.0f);
        System.out.println("z: " +p.getZ()); // Test getters
        p.setZ(4.0f);
        System.out.println("point3d:"+p.toString());

        p.setXYZ(4.0f,5.0f,6.0f);
        System.out.println("xyz:"+Arrays.toString(p.getXYZ()));

        System.out.println("point3d: " +p.toString()); // Test getters

    }
}
