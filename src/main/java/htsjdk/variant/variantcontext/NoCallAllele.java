package htsjdk.variant.variantcontext;

final class NoCallAllele extends AbstractAllele {

    static final Allele INSTANCE = new NoCallAllele();

    private NoCallAllele() {
    }

    @Override
    public boolean isNoCall() {
        return true;
    }

    @Override
    public String encodeAsString() {
        return Allele.NO_CALL_STRING;
    }

    @Override
    public boolean equals(final Allele other, boolean ignoreRefState) {
        return other == this || (other instanceof NoCallAllele);
    }

    @Override
    public boolean equals(final Object other) {
        return other == this || (other instanceof NoCallAllele);
    }

    @Override
    public int hashCode() {
        return Allele.NO_CALL_STRING.hashCode();
    }

    @Override
    public String getBaseString() {
        return "";
    }
}