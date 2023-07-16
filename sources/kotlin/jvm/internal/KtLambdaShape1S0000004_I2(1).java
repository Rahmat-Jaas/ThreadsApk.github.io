package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass75O;
import X.C02220Ah;
import X.C134847yT;
import X.C1371586i;
import kotlin.Unit;

public class KtLambdaShape1S0000004_I2 extends C02220Ah implements AnonymousClass0YY {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S0000004_I2(float f, float f2, float f3, float f4, int i) {
        super(1);
        this.A04 = i;
        if (i != 0) {
            this.A03 = f;
            this.A02 = f2;
        } else {
            this.A02 = f;
            this.A03 = f2;
        }
        this.A01 = f3;
        this.A00 = f4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C134847yT A002;
        String str;
        int i = this.A04;
        C1371586i A003 = AnonymousClass75O.A00(obj);
        if (i != 0) {
            A003.A01("minWidth", C134847yT.A00(this.A03));
            A003.A01("minHeight", C134847yT.A00(this.A02));
            A003.A01("maxWidth", C134847yT.A00(this.A01));
            A002 = C134847yT.A00(this.A00);
            str = "maxHeight";
        } else {
            A003.A01("start", C134847yT.A00(this.A02));
            A003.A01("top", C134847yT.A00(this.A03));
            A003.A01("end", C134847yT.A00(this.A01));
            A002 = C134847yT.A00(this.A00);
            str = "bottom";
        }
        A003.A01(str, A002);
        return Unit.A00;
    }
}
