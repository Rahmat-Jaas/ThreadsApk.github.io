package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass57M;
import X.AnonymousClass70U;
import X.AnonymousClass799;
import X.AnonymousClass7GN;
import X.AnonymousClass7In;
import X.AnonymousClass7K4;
import X.AnonymousClass7W3;
import X.AnonymousClass8s2;
import X.C02220Ah;
import X.C04220Ms;
import X.C109916kp;
import X.C120847Cu;
import X.C121327Fm;
import X.C147188nY;
import X.C18190wL;
import X.C81784oM;
import X.C86104wH;
import X.C86154wM;
import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape10S0501000_I2 extends C02220Ah implements AnonymousClass0YM {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape10S0501000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        super(3);
        this.A06 = i2;
        this.A05 = obj;
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A02 = obj5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        Object obj4 = obj;
        Object obj5 = obj2;
        Object obj6 = obj3;
        switch (this.A06) {
            case 0:
                C147188nY A0H = C86104wH.A0H(obj5, obj6);
                C04220Ms.A0B(obj4, 0);
                C120847Cu.A00(A0H, AnonymousClass70U.A00(A0H, AnonymousClass7K4.A08(Modifier.A00, 20), (AnonymousClass799) null, new KtLambdaShape19S0200000_I2_3(26, this.A03, this.A04), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 254, true), (AnonymousClass8s2) ((KtCSuperShape0S0410000_I2) C86104wH.A0f(this.A01)).A01, 0);
                if (C86104wH.A1X((C81784oM) this.A02)) {
                    Unit unit = Unit.A00;
                    Object obj7 = this.A05;
                    boolean A0y = C147188nY.A0y(A0H, obj7);
                    AnonymousClass7W3 r2 = (AnonymousClass7W3) A0H;
                    Object A13 = r2.A13();
                    if (A0y || A13 == AnonymousClass7GN.A00) {
                        A13 = AnonymousClass7W3.A07(r2, obj7, 24);
                    }
                    AnonymousClass7W3.A0b(A0H, r2, A13, unit, false);
                }
                return Unit.A00;
            case 1:
                AnonymousClass0ZU r8 = (AnonymousClass0ZU) this.A03;
                Integer num = (Integer) this.A01;
                List list = (List) this.A02;
                Modifier A042 = Modifier.A04(Modifier.A00);
                int i = this.A00;
                C121327Fm.A01(C86104wH.A0H(obj5, obj6), A042, num, list, (AnonymousClass0ZU) this.A05, r8, (AnonymousClass0YY) this.A04, C86154wM.A02(i, 229376 | (i & 14)) | ((i >> 3) & 7168), 0);
                return Unit.A00;
            default:
                C147188nY A0H2 = C86104wH.A0H(obj5, obj6);
                C04220Ms.A0B(obj4, 0);
                C81784oM r6 = (C81784oM) this.A04;
                C109916kp r1 = (C109916kp) ((KtCSuperShape0S0200000_I2) ((KtCSuperShape0S0410000_I2) r6.getValue()).A00).A01;
                if (r1 != null) {
                    z = C18190wL.A1Z(r1.A01, true);
                } else {
                    z = false;
                }
                if (z) {
                    AnonymousClass7In.A05(Modifier.A04(Modifier.A02(A0H2, -932497673)), A0H2, 6, 0);
                    Unit unit2 = Unit.A00;
                    Object obj8 = this.A05;
                    boolean A0z = C147188nY.A0z(A0H2, obj8, 1157296644);
                    AnonymousClass7W3 r22 = (AnonymousClass7W3) A0H2;
                    Object A132 = r22.A13();
                    if (A0z || A132 == AnonymousClass7GN.A00) {
                        A132 = AnonymousClass7W3.A07(r22, obj8, 26);
                    }
                    AnonymousClass7W3.A0b(A0H2, r22, A132, unit2, false);
                    AnonymousClass7W3.A0w(r22, false);
                    return unit2;
                }
                A0H2.Cvb(-932497453);
                AnonymousClass0YY r12 = (AnonymousClass0YY) this.A02;
                AnonymousClass0YY r13 = (AnonymousClass0YY) this.A03;
                AnonymousClass57M r10 = (AnonymousClass57M) this.A05;
                Object obj9 = this.A01;
                boolean A10 = C147188nY.A10(A0H2, r10, obj9, 511388516);
                AnonymousClass7W3 r23 = (AnonymousClass7W3) A0H2;
                Object A133 = r23.A13();
                if (A10 || A133 == AnonymousClass7GN.A00) {
                    A133 = AnonymousClass7W3.A0E(r23, obj9, r10, 40);
                }
                AnonymousClass0ZU A08 = AnonymousClass7W3.A08(r23, A133, false);
                Modifier A043 = Modifier.A04(Modifier.A00);
                int i2 = this.A00;
                int i3 = i2 >> 3;
                AnonymousClass7In.A02(A0H2, A043, (KtCSuperShape0S0410000_I2) r6.getValue(), r10, A08, r12, r13, 200704 | (i3 & 14) | (i3 & 112) | ((i2 >> 6) & 57344), 0);
                Unit unit3 = Unit.A00;
                boolean A0z2 = C147188nY.A0z(A0H2, r10, 1157296644);
                Object A134 = r23.A13();
                if (A0z2 || A134 == AnonymousClass7GN.A00) {
                    A134 = AnonymousClass7W3.A07(r23, r10, 27);
                }
                AnonymousClass7W3.A0b(A0H2, r23, A134, unit3, false);
                AnonymousClass7W3.A0w(r23, false);
                return unit3;
        }
    }
}
