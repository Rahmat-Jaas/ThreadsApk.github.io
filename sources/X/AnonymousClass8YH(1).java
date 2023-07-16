package X;

import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.KtLambdaShape23S0101000_I2;

/* renamed from: X.8YH  reason: invalid class name */
public final class AnonymousClass8YH extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ float A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YH(float f) {
        super(3);
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C147618pd r8 = (C147618pd) obj;
        C147578pZ r9 = (C147578pZ) obj2;
        long j = ((Constraints) obj3).A00;
        AnonymousClass0wJ.A1N(r8, r9);
        int CfL = r8.CfL(this.A00);
        int A03 = Constraints.A03(j) + CfL;
        int A01 = Constraints.A01(j);
        int i = 0;
        if (A01 != Integer.MAX_VALUE) {
            i = CfL;
        }
        C123657Xy Bg4 = r9.Bg4(Constraints.A05(Constraints.A04(j), Constraints.A02(j), A03, A01 + i));
        return C147618pd.A00(r8, new KtLambdaShape23S0101000_I2(CfL, 8, Bg4), Bg4.A01, Bg4.A00 - CfL);
    }
}
