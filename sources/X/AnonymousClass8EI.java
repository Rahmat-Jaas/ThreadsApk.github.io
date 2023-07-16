package X;

import kotlin.Unit;

/* renamed from: X.8EI  reason: invalid class name */
public final class AnonymousClass8EI extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C21726BzD A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8EI(C21726BzD bzD, String str, String str2, String str3, int i, int i2) {
        super(0);
        this.A02 = bzD;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C21726BzD bzD = this.A02;
        if (bzD != null) {
            bzD.Bok(this.A01, this.A05, this.A04, this.A00, this.A03);
        }
        return Unit.A00;
    }
}
