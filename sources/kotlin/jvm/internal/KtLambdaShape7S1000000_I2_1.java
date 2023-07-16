package kotlin.jvm.internal;

import X.AnonymousClass00U;
import X.AnonymousClass0YY;
import X.C02220Ah;
import X.C18210wN;

public class KtLambdaShape7S1000000_I2_1 extends C02220Ah implements AnonymousClass0YY {
    public String A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape7S1000000_I2_1(String str, int i) {
        super(1);
        this.A01 = i;
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A01 == 0) {
            return this.A00;
        }
        return AnonymousClass00U.A0L(this.A00, C18210wN.A0f(obj));
    }
}
