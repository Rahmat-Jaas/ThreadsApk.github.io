package X;

import kotlin.Unit;

/* renamed from: X.8YV  reason: invalid class name */
public final class AnonymousClass8YV extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YV(String str, String str2, int i) {
        super(3);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass0YP r6 = (AnonymousClass0YP) obj;
        C147188nY r3 = (C147188nY) obj2;
        int A04 = AnonymousClass0wJ.A04(obj3);
        if (C86124wJ.A0G(r6, A04) == 0) {
            A04 |= C147188nY.A09(r3, r6);
        }
        if ((A04 & 91) != 18 || !r3.BCM()) {
            boolean A1X = C18180wK.A1X(this.A02.length());
            C121867Io.A05(r3, AnonymousClass7J9.A02(r3), this.A01, r6, (this.A00 & 7168) | ((A04 << 12) & 57344), AnonymousClass7KB.A03(r3), A1X);
        } else {
            r3.CuJ();
        }
        return Unit.A00;
    }
}
