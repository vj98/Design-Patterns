/*  
If singleton class is Serializable, you can serialize the singleton instance. Once it is serialized,
you can deserialize it but it will not return the singleton object.
 */

class CarInSerialization implements Serializable {
    // This method is called immediately after an object of this class is deserialized.
    // This method returns the singleton instance.
    protected Object readResolve() {
        return getInstance();
    }
}