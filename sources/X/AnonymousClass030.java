package X;

/* renamed from: X.030  reason: invalid class name */
public final class AnonymousClass030 extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ C08390dI A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass030(C08390dI r2, String str, String str2) {
        super(0);
        this.A00 = r2;
        this.A02 = str;
        this.A01 = str2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String string = this.A00.A0C().getString(this.A02, this.A01);
        C04220Ms.A06(string);
        return string;
    }
}
