package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8YU  reason: invalid class name */
public final class AnonymousClass8YU extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C111216my A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YU(C111216my r2, int i, long j) {
        super(3);
        this.A01 = j;
        this.A00 = i;
        this.A02 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        boolean A1X = AnonymousClass0wJ.A1X(obj);
        C147188nY r15 = (C147188nY) obj2;
        int A04 = AnonymousClass0wJ.A04(obj3);
        if ((A04 & 14) == 0) {
            i = C147188nY.A0L(r15, A1X) | A04;
        } else {
            i = A04;
        }
        if ((i & 91) != 18 || !r15.BCM()) {
            C123327Wm r8 = Modifier.A00;
            Modifier A05 = Modifier.A05(r8);
            Alignment alignment = AnonymousClass7KV.A09;
            long j = this.A01;
            int i2 = this.A00;
            C111216my r6 = this.A02;
            C146288ly A0h = C147188nY.A0h(r15, alignment);
            Object A0p = C147188nY.A0p(r15);
            Object A0n = C147188nY.A0n(r15);
            Object A0m = C147188nY.A0m(r15);
            AnonymousClass0ZU r5 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A05);
            AnonymousClass7W3 r3 = (AnonymousClass7W3) r15;
            C147188nY.A0w(r15, r3, r5);
            AnonymousClass7W3.A0a(r15, r3, A0h, A0p);
            AnonymousClass7KP.A07(r15, A0n, A0m, A002);
            r15.Cvb(457084058);
            float f = AnonymousClass7DB.A00;
            float f2 = AnonymousClass7DB.A03;
            float f3 = (f + f2) * ((float) 2);
            if (A1X) {
                r15.Cvb(1037513318);
                AnonymousClass74U.A00(r15, AnonymousClass7Kq.A09(r8, f3), f2, ((i2 >> 9) & 112) | 390, 0, j);
            } else {
                r15.Cvb(1037513514);
                AnonymousClass7DB.A01(r15, AnonymousClass7Kq.A09(r8, f3), r6, ((i2 >> 9) & 112) | 392, j);
            }
            AnonymousClass7W3.A0w(r3, false);
            AnonymousClass7W3.A0f(r3);
        } else {
            r15.CuJ();
        }
        return Unit.A00;
    }
}
