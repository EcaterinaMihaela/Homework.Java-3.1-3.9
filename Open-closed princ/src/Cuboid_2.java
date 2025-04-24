// Class 2
// Helper Class
// Extending the Geo_objects to fit cuboid dimensions
class Cuboid_2 extends Geo_objects {

    // used to store length, breadth and height of a cuboid
    public double length;
    public double breadth;
    public double height;

    // overrided function to calculate
    // the volume of a cuboid
    //@Override
    public double get_volume()
    {
        return length * breadth * height;
    }
}
