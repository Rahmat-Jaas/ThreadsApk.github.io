package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.Unit;

/* renamed from: X.8ah  reason: invalid class name and case insensitive filesystem */
public final class C141328ah extends C02220Ah implements AnonymousClass0YC {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C146088lc A02;
    public final /* synthetic */ AnonymousClass0YM A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C141328ah(C146088lc r2, AnonymousClass0YM r3, float f, int i, boolean z) {
        super(4);
        this.A04 = z;
        this.A00 = f;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Modifier A0A;
        int A042 = AnonymousClass0wJ.A04(obj2);
        C147188nY r15 = (C147188nY) obj3;
        int A043 = AnonymousClass0wJ.A04(obj4);
        if ((A043 & 112) == 0) {
            A043 |= C147188nY.A04(r15, A042);
        }
        if ((A043 & 721) != 144 || !r15.BCM()) {
            boolean z = this.A04;
            C123327Wm r1 = Modifier.A00;
            float f = this.A00;
            if (z) {
                A0A = AnonymousClass7Kq.A08(r1, f);
            } else {
                A0A = AnonymousClass7Kq.A0A(r1, f);
            }
            C04220Ms.A0B(A0A, 0);
            Modifier A002 = C98186En.A00(A0A, this.A02, (NestedScrollDispatcher) null);
            Alignment alignment = AnonymousClass7KV.A09;
            AnonymousClass0YM r7 = this.A03;
            int i = this.A01;
            C146288ly A0h = C147188nY.A0h(r15, alignment);
            Object A0p = C147188nY.A0p(r15);
            Object A0n = C147188nY.A0n(r15);
            Object A0m = C147188nY.A0m(r15);
            AnonymousClass0ZU r12 = AnonymousClass74X.A00;
            AnonymousClass0YM A003 = C98236Es.A00(A002);
            AnonymousClass7W3 r3 = (AnonymousClass7W3) r15;
            C147188nY.A0w(r15, r3, r12);
            AnonymousClass7W3.A0a(r15, r3, A0h, A0p);
            AnonymousClass7KP.A07(r15, A0n, A0m, A003);
            C86104wH.A1R(Integer.valueOf(A042), r15, r7, ((A043 >> 3) & 14) | ((i >> 12) & 112));
            AnonymousClass7W3.A0d(r3);
            AnonymousClass7W3.A0w(r3, false);
        } else {
            r15.CuJ();
        }
        return Unit.A00;
    }
}
