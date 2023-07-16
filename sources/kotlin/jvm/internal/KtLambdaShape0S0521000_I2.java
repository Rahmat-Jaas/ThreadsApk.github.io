package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass6E1;
import X.AnonymousClass74X;
import X.AnonymousClass799;
import X.AnonymousClass7C8;
import X.AnonymousClass7FI;
import X.AnonymousClass7GN;
import X.AnonymousClass7J3;
import X.AnonymousClass7JP;
import X.AnonymousClass7JR;
import X.AnonymousClass7K4;
import X.AnonymousClass7KP;
import X.AnonymousClass7KU;
import X.AnonymousClass7KV;
import X.AnonymousClass7V3;
import X.AnonymousClass7V5;
import X.AnonymousClass7W3;
import X.AnonymousClass8cm;
import X.AnonymousClass8s2;
import X.C02220Ah;
import X.C04220Ms;
import X.C120767Cj;
import X.C122777Tu;
import X.C123327Wm;
import X.C141758cu;
import X.C142668fO;
import X.C142878fk;
import X.C145068jm;
import X.C146088lc;
import X.C146288ly;
import X.C147188nY;
import X.C147218oz;
import X.C147258p3;
import X.C147268p4;
import X.C81784oM;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import X.C86134wK;
import X.C98056Dz;
import X.C98236Es;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Unit;

public class KtLambdaShape0S0521000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public boolean A07;
    public final int A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0521000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A08 = i2;
        this.A05 = obj;
        this.A03 = obj2;
        this.A06 = z;
        this.A04 = obj3;
        this.A00 = i;
        this.A01 = obj4;
        this.A02 = obj5;
        this.A07 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY r0;
        boolean z;
        AnonymousClass7W3 r1;
        Object obj3 = obj;
        if (this.A08 != 0) {
            r0 = (C147188nY) obj3;
            if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r0.BCM()) {
                C123327Wm r12 = Modifier.A00;
                Modifier A032 = AnonymousClass7FI.A03(r12);
                PagerState pagerState = (PagerState) this.A05;
                C81784oM r9 = (C81784oM) this.A03;
                boolean z2 = this.A06;
                Object obj4 = this.A04;
                int i = this.A00;
                Object obj5 = this.A01;
                Object obj6 = this.A02;
                boolean z3 = this.A07;
                Alignment A002 = AnonymousClass7KV.A00(r0);
                z = false;
                C146288ly A003 = C120767Cj.A00(r0, A002, false);
                Object A0p = C147188nY.A0p(r0);
                Object A0n = C147188nY.A0n(r0);
                Object A0m = C147188nY.A0m(r0);
                AnonymousClass0ZU r7 = AnonymousClass74X.A00;
                AnonymousClass0YM A004 = C98236Es.A00(A032);
                r1 = (AnonymousClass7W3) r0;
                C147188nY.A0w(r0, r1, r7);
                AnonymousClass7W3.A0a(r0, r1, A003, A0p);
                AnonymousClass7KP.A07(r0, A0n, A0m, A004);
                AnonymousClass7V3 r11 = AnonymousClass7V3.A00;
                int size = ((AnonymousClass8s2) ((KtCSuperShape0S0101000_I2) C147188nY.A0u(r0, r9, 2089451929)).A01).size();
                Modifier A052 = Modifier.A05(r12);
                SnapFlingBehavior A005 = C98056Dz.A00(new C122777Tu((Object) null, 1.0f, 50.0f), pagerState, r0, 26);
                boolean A1X = C86134wK.A1X(((AnonymousClass8s2) ((KtCSuperShape0S0101000_I2) r9.getValue()).A01).size(), 1);
                boolean A0y = C147188nY.A0y(r0, r9);
                Object A13 = r1.A13();
                if (A0y || A13 == AnonymousClass7GN.A00) {
                    A13 = AnonymousClass7W3.A0C(r1, r9, 28);
                }
                AnonymousClass7C8.A01(A005, (C145068jm) null, (AnonymousClass8cm) null, pagerState, r0, (C141758cu) null, A052, (C146088lc) null, AnonymousClass7W3.A0A(r1, A13, false), AnonymousClass7JR.A00(r0, new IDxLambdaShape0S0520000_2_I2(r9, pagerState, obj6, obj4, obj5, 1, z3, z2), -567240680), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, size, 0, 48, 3072, 5368, A1X, false);
                boolean z4 = !z2;
                Modifier A033 = AnonymousClass7FI.A03(r11.A86(A002, r12));
                float f = (float) 16;
                float f2 = (float) 0;
                AnonymousClass7JP.A06(AnonymousClass7KU.A01((C147218oz) null, 3), AnonymousClass7KU.A06((C147218oz) null, 3), r0, AnonymousClass7K4.A05(A033, f, f, f2, f2), (String) null, AnonymousClass7JR.A00(r0, new KtLambdaShape25S0101000_I2(obj4, i, 3), -972737087), 200064, 16, z4);
                AnonymousClass7W3.A0w(r1, false);
            }
            r0.CuJ();
            return Unit.A00;
        }
        r0 = (C147188nY) obj3;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r0.BCM()) {
            boolean z5 = this.A07;
            Modifier A006 = AnonymousClass6E1.A00((C142668fO) this.A05, (C147258p3) this.A02, (Modifier) this.A03, AnonymousClass799.A00(4), (AnonymousClass0ZU) this.A04, z5, this.A06);
            z = false;
            C04220Ms.A0B(A006, 0);
            Modifier A042 = Modifier.A04(A006);
            C142878fk r4 = AnonymousClass7KV.A00;
            C147268p4 r3 = AnonymousClass7J3.A02;
            int i2 = ((this.A00 >> 12) & 7168) | 432;
            C146288ly A0f = C147188nY.A0f(r3, r0, r4);
            Object A0p2 = C147188nY.A0p(r0);
            Object A0n2 = C147188nY.A0n(r0);
            Object A0m2 = C147188nY.A0m(r0);
            AnonymousClass0ZU r5 = AnonymousClass74X.A00;
            AnonymousClass0YM A007 = C98236Es.A00(A042);
            int A012 = C86114wI.A01((i2 << 3) & 112);
            r1 = (AnonymousClass7W3) r0;
            C147188nY.A0w(r0, r1, r5);
            AnonymousClass7W3.A0a(r0, r1, A0f, A0p2);
            AnonymousClass7KP.A08(r0, A0n2, A0m2, A007, A012);
            C86104wH.A1R(AnonymousClass7V5.A00, r0, (AnonymousClass0YM) this.A01, C86124wJ.A05(i2));
        }
        r0.CuJ();
        return Unit.A00;
        AnonymousClass7W3.A0w(r1, z);
        AnonymousClass7W3.A0e(r1);
        return Unit.A00;
    }
}
