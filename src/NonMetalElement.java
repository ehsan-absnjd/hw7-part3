public class NonMetalElement extends Element{
    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Symbol: ").append(getSymbol()).append(" Atomic Number: ").append(getAtomicNumber())
                .append(" Atomic Weight: ").append(getAtomicWeight()).append("u\n")
                .append("A nonmetal is a chemical element that is mechanically weak in its most stable form, brittle if solid.");
        System.out.println(stringBuilder.toString());
    }
}
