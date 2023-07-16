package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass69J;
import X.AnonymousClass6FI;
import X.AnonymousClass6ZJ;
import X.AnonymousClass6a5;
import X.AnonymousClass7GN;
import X.AnonymousClass7KE;
import X.AnonymousClass7W3;
import X.AnonymousClass7WN;
import X.AnonymousClass7XX;
import X.AnonymousClass8Ik;
import X.C02220Ah;
import X.C04220Ms;
import X.C114506tP;
import X.C115666vi;
import X.C115836vz;
import X.C122847Ub;
import X.C123327Wm;
import X.C142708fS;
import X.C146058lZ;
import X.C147188nY;
import X.C83224qz;
import X.C86104wH;
import X.C86134wK;
import X.C967266l;
import X.C967466n;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.ui.Modifier;

public class IDxLambdaShape2S0120000_2_I2 extends C02220Ah implements AnonymousClass0YM {
    public Object A00;
    public boolean A01;
    public boolean A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLambdaShape2S0120000_2_I2(Object obj, int i, boolean z, boolean z2) {
        super(3);
        this.A03 = i;
        this.A02 = z;
        this.A00 = obj;
        this.A01 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C967266l r9;
        Modifier modifier;
        Object obj4 = obj;
        Object obj5 = obj2;
        Object obj6 = obj3;
        if (this.A03 != 0) {
            Modifier modifier2 = (Modifier) obj4;
            C147188nY A0H = C86104wH.A0H(obj5, obj6);
            C04220Ms.A0B(modifier2, 0);
            A0H.Cvb(-1538687176);
            long j = ((C114506tP) A0H.AEA(AnonymousClass6ZJ.A01)).A01;
            C123327Wm r7 = Modifier.A00;
            AnonymousClass7KE A0I = C86134wK.A0I(j);
            int i = 0;
            boolean z = this.A02;
            Boolean valueOf = Boolean.valueOf(z);
            C967466n r10 = (C967466n) this.A00;
            boolean z2 = this.A01;
            Object[] A13 = C147188nY.A13(A0H, A0I, valueOf, r10, Boolean.valueOf(z2));
            boolean z3 = false;
            do {
                z3 = C147188nY.A12(A0H, A13[i], z3);
                i++;
            } while (i < 4);
            AnonymousClass7W3 r5 = (AnonymousClass7W3) A0H;
            Object A132 = r5.A13();
            if (z3 || A132 == AnonymousClass7GN.A00) {
                A132 = new AnonymousClass8Ik(r10, j, z, z2);
                r5.A14(A132);
            }
            Modifier Cx6 = modifier2.Cx6(C115836vz.A01(r7, AnonymousClass7W3.A0B(r5, A132, false)));
            AnonymousClass7W3.A0w(r5, false);
            return Cx6;
        }
        C147188nY A0H2 = C86104wH.A0H(obj5, obj6);
        A0H2.Cvb(1478351300);
        C146058lZ A002 = C115666vi.A00(A0H2);
        A0H2.Cvb(773894976);
        AnonymousClass7W3 A0Y = C147188nY.A0Y(A0H2);
        Object A133 = A0Y.A13();
        C83224qz A003 = AnonymousClass7WN.A00(A0Y, C86104wH.A0b(A0H2, A0Y, A133, AnonymousClass7GN.A00, A133));
        C123327Wm r12 = Modifier.A00;
        boolean z4 = this.A02;
        boolean z5 = this.A01;
        C122847Ub r102 = (C122847Ub) this.A00;
        Modifier A004 = AnonymousClass6FI.A00(r12, new KtLambdaShape0S0230000_I2(r102, A003, 1, z5, z4), false);
        if (z4) {
            r9 = C967266l.Vertical;
        } else {
            r9 = C967266l.Horizontal;
        }
        Object A0n = C147188nY.A0n(A0H2);
        C04220Ms.A0B(A0n, 0);
        C04220Ms.A0B(r9, 1);
        boolean z6 = true;
        if (A0n == AnonymousClass69J.Rtl && r9 != C967266l.Vertical) {
            z6 = false;
        }
        Modifier A005 = ScrollableKt.A00(A002, (C142708fS) null, r9, r102, r102.A02, r12, z5, z6);
        AnonymousClass7XX r52 = new AnonymousClass7XX(r102, z4);
        C04220Ms.A0B(A004, 0);
        C04220Ms.A0B(r9, 1);
        if (r9 == C967266l.Vertical) {
            modifier = AnonymousClass6a5.A02;
        } else {
            modifier = AnonymousClass6a5.A01;
        }
        Modifier Cx62 = A004.Cx6(modifier);
        C04220Ms.A0B(Cx62, 0);
        C04220Ms.A0B(A002, 1);
        Modifier Cx63 = Modifier.A07(Cx62, A002.Aep(), A005).Cx6(r52);
        AnonymousClass7W3.A0w(A0Y, false);
        return Cx63;
    }
}
