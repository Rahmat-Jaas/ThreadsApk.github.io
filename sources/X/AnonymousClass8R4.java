package X;

import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape0S1011000_I2;

/* renamed from: X.8R4  reason: invalid class name */
public final class AnonymousClass8R4 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8R4(String str, int i, long j, boolean z) {
        super(2);
        this.A01 = j;
        this.A03 = z;
        this.A02 = str;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY r8 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r8.BCM()) {
            AnonymousClass7DS[] A012 = AnonymousClass7DS.A01(AnonymousClass6YR.A00, Float.valueOf(AnonymousClass7KE.A00(this.A01)), true);
            boolean z = this.A03;
            AnonymousClass7JR.A05(r8, new KtLambdaShape0S1011000_I2(this.A00, 1, this.A02, z), A012, -1077894890);
        } else {
            r8.CuJ();
        }
        return Unit.A00;
    }
}
