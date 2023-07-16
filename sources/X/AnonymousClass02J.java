package X;

/* renamed from: X.02J  reason: invalid class name */
public final class AnonymousClass02J extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass02J(int i) {
        super(1);
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((Number) obj).intValue();
        throw new IndexOutOfBoundsException(AnonymousClass00U.A0E("Collection doesn't contain element at index ", '.', this.A00));
    }
}
