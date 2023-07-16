package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass5HY;
import X.C02220Ah;
import X.C04220Ms;
import X.C121407Fu;

public class KtLambdaShape1S2010000_I2 extends C02220Ah implements AnonymousClass0YY {
    public String A00;
    public String A01;
    public boolean A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S2010000_I2(String str, String str2, int i, boolean z) {
        super(1);
        this.A03 = i;
        this.A01 = str;
        this.A00 = str2;
        this.A02 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i = this.A03;
        AnonymousClass5HY r6 = (AnonymousClass5HY) obj;
        C04220Ms.A0B(r6, 0);
        String str = this.A01;
        String str2 = this.A00;
        boolean z = this.A02;
        if (i != 0) {
            return C121407Fu.A01(r6, str, str2, 9, z);
        }
        return C121407Fu.A01(r6, str, str2, 8, z);
    }
}
