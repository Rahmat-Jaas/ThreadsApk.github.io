package X;

import kotlin.Unit;

/* renamed from: X.8JR  reason: invalid class name */
public final class AnonymousClass8JR extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C146088lc A03;
    public final /* synthetic */ AnonymousClass0YY A04;
    public final /* synthetic */ AnonymousClass0YM A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8JR(C146088lc r2, AnonymousClass0YY r3, AnonymousClass0YM r4, float f, int i, int i2, boolean z) {
        super(1);
        this.A02 = i;
        this.A04 = r3;
        this.A06 = z;
        this.A00 = f;
        this.A03 = r2;
        this.A05 = r4;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C145078jn A0M = C86124wJ.A0M(obj);
        int i = this.A02;
        AnonymousClass0YY r2 = this.A04;
        boolean z = this.A06;
        A0M.Ba5(r2, C77704hF.A00, AnonymousClass7WY.A00(new C141328ah(this.A03, this.A05, this.A00, this.A01, z), -901676327), i);
        return Unit.A00;
    }
}
