package X;

import java.util.List;
import kotlin.Unit;

/* renamed from: X.8ai  reason: invalid class name and case insensitive filesystem */
public final class C141338ai extends C02220Ah implements AnonymousClass0YC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ AnonymousClass0YY A03;
    public final /* synthetic */ AnonymousClass0YY A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C141338ai(List list, AnonymousClass0YY r3, AnonymousClass0YY r4, int i, long j) {
        super(4);
        this.A02 = list;
        this.A01 = j;
        this.A03 = r3;
        this.A04 = r4;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int A042 = AnonymousClass0wJ.A04(obj2);
        C147188nY r4 = (C147188nY) obj3;
        int A043 = AnonymousClass0wJ.A04(obj4);
        if (C86124wJ.A0G(obj, A043) == 0) {
            i = C147188nY.A0F(r4, obj) | A043;
        } else {
            i = A043;
        }
        if ((A043 & 112) == 0) {
            i |= C147188nY.A04(r4, A042);
        }
        if ((i & 731) != 146 || !r4.BCM()) {
            long j = this.A01;
            AnonymousClass0YY r6 = this.A03;
            AnonymousClass0YY r7 = this.A04;
            int i2 = this.A00;
            C121397Ft.A01(r4, (AnonymousClass17I) this.A02.get(A042), r6, r7, (i2 & 112) | 8 | (i2 & 896) | (i2 & 7168), j);
        } else {
            r4.CuJ();
        }
        return Unit.A00;
    }
}
