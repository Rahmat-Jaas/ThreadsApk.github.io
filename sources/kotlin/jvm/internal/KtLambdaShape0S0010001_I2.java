package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass75O;
import X.C02220Ah;
import X.C1371586i;
import X.C86144wL;
import kotlin.Unit;

public class KtLambdaShape0S0010001_I2 extends C02220Ah implements AnonymousClass0YY {
    public float A00;
    public boolean A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0010001_I2(int i, float f, boolean z) {
        super(1);
        this.A02 = i;
        this.A00 = f;
        this.A01 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1371586i A002;
        Boolean valueOf;
        String str;
        if (this.A02 != 0) {
            AnonymousClass75O A0K = C86144wL.A0K(obj);
            Float valueOf2 = Float.valueOf(this.A00);
            A0K.A00 = valueOf2;
            A002 = A0K.A01;
            A002.A01("weight", valueOf2);
            valueOf = Boolean.valueOf(this.A01);
            str = "fill";
        } else {
            A002 = AnonymousClass75O.A00(obj);
            A002.A01("ratio", Float.valueOf(this.A00));
            valueOf = Boolean.valueOf(this.A01);
            str = "matchHeightConstraintsFirst";
        }
        A002.A01(str, valueOf);
        return Unit.A00;
    }
}
