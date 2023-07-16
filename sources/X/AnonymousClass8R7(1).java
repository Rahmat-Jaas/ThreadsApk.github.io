package X;

import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape4S1101000_I2;

/* renamed from: X.8R7  reason: invalid class name */
public final class AnonymousClass8R7 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C146348m5 A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8R7(C146348m5 r2, String str, int i, long j) {
        super(2);
        this.A01 = j;
        this.A02 = r2;
        this.A03 = str;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY r8 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r8.BCM()) {
            AnonymousClass7JR.A05(r8, new KtLambdaShape4S1101000_I2(this.A02, this.A03, this.A00, 10), AnonymousClass7DS.A01(AnonymousClass6YR.A00, Float.valueOf(AnonymousClass7KE.A00(this.A01)), true), 1909046869);
        } else {
            r8.CuJ();
        }
        return Unit.A00;
    }
}
