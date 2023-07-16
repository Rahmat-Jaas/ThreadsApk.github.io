package X;

import kotlin.Unit;

/* renamed from: X.8RV  reason: invalid class name */
public final class AnonymousClass8RV extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass540 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ AnonymousClass0YC A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8RV(AnonymousClass540 r2, String str, AnonymousClass0YC r4, float f, float f2, int i) {
        super(2);
        this.A03 = r2;
        this.A04 = str;
        this.A01 = f;
        this.A00 = f2;
        this.A05 = r4;
        this.A02 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        this.A03.A04(A0H, this.A04, this.A05, this.A01, this.A00, C115796vv.A00(this.A02));
        return Unit.A00;
    }
}
