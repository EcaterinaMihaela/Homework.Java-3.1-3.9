// Class 3
// Helper Class
// Extending Geo_objects to fit sphere dimension
class Sphere_2 extends Geo_objects {

    // To store radius of a sphere
    public double radius;

    // Overrided function to calculate
    // the volume of a sphere

    //@Override
    public double get_volume()
    {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}
