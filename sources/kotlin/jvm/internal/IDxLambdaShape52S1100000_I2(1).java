package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;
import X.C08390dI;
import java.util.HashSet;

public class IDxLambdaShape52S1100000_I2 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public String A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLambdaShape52S1100000_I2(C08390dI r2, String str, int i) {
        super(0);
        this.A02 = i;
        this.A00 = r2;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = this.A02;
        C08390dI r0 = (C08390dI) this.A00;
        switch (i) {
            case 0:
                return Long.valueOf(r0.A0C().getLong(this.A01, 0));
            case 1:
                return r0.A0C().getString(this.A01, (String) null);
            default:
                return new HashSet(C08390dI.A01(r0.A0C(), this.A01));
        }
    }
}
