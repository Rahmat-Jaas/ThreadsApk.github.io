package kotlin.jvm.internal;

import X.AnonymousClass06E;
import X.AnonymousClass0YC;
import X.AnonymousClass0YP;
import X.AnonymousClass56U;
import X.AnonymousClass56Y;
import X.AnonymousClass5I9;
import X.AnonymousClass7GN;
import X.AnonymousClass7W3;
import X.C02220Ah;
import X.C10300i6;
import X.C117626yz;
import X.C121327Fm;
import X.C147188nY;
import X.C147368pE;
import X.C86104wH;
import X.C86164wN;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape22S0301000_I2 extends C02220Ah implements AnonymousClass0YC {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape22S0301000_I2(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(4);
        this.A04 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
        this.A03 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5 = obj3;
        Object obj6 = obj4;
        if (this.A04 != 0) {
            C147188nY A0H = C86104wH.A0H(obj5, obj6);
            AnonymousClass06E r7 = (AnonymousClass06E) this.A01;
            C147368pE r5 = AnonymousClass5I9.A05.A03;
            KtLambdaShape152S0100000_I2_7 A0t = C86164wN.A0t(this.A03, 19);
            Object obj7 = this.A02;
            boolean A0y = C147188nY.A0y(A0H, obj7);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) A0H;
            Object A13 = r2.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = AnonymousClass7W3.A0D(r2, obj7, 20);
            }
            C117626yz.A01(A0H, r5, Modifier.A05(Modifier.A00), r7, (AnonymousClass56Y) null, A0t, AnonymousClass7W3.A0A(r2, A13, false), 24632, 32);
        } else {
            C121327Fm.A03(C86104wH.A0H(obj5, obj6), (AnonymousClass56U) null, (C10300i6) this.A03, C86164wN.A0z(this.A01, 0), (AnonymousClass0YP) this.A02, ((this.A00 >> 12) & 112) | 8, 8);
        }
        return Unit.A00;
    }
}
