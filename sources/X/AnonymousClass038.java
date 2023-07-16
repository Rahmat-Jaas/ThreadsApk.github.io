package X;

/* renamed from: X.038  reason: invalid class name */
public final class AnonymousClass038 extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C08390dI A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass038(C08390dI r2, String str, int i) {
        super(0);
        this.A01 = r2;
        this.A02 = str;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf(this.A01.A0C().getInt(this.A02, this.A00));
    }
}
