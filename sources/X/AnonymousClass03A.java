package X;

/* renamed from: X.03A  reason: invalid class name */
public final class AnonymousClass03A extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ C08390dI A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass03A(C08390dI r2, String str, boolean z) {
        super(0);
        this.A00 = r2;
        this.A01 = str;
        this.A02 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        return Boolean.valueOf(this.A00.A0C().getBoolean(this.A01, this.A02));
    }
}
