public class MetalElement extends Element{
    public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Symbol: ").append(getSymbol()).append(" Atomic Number: ").append(getAtomicNumber())
                .append(" Atomic Weight: ").append(getAtomicWeight()).append("u\n")
                .append("A metal is a material that conducts electricity and heat relatively well. \\m/");
        System.out.println(stringBuilder.toString());
    }
}
