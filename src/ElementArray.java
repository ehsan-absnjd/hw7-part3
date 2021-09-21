public class ElementArray {
    public static void main(String[] args) {
        Element[] elements = new Element[4];
        elements[0] = new MetalElement("Fe", 26 , 55.84);
        elements[1] = new MetalElement("Ag", 47 , 107.86);
        elements[2] = new NonMetalElement("C" , 6 , 12.01);
        elements[3] = new NonMetalElement("S", 16 , 32.065);
        for(Element element : elements)
            element.describeElement();
    }
}
