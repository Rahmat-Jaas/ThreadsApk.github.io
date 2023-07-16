package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass8bI;
import X.C02220Ah;
import X.C04220Ms;
import X.C147598pb;
import X.C147618pd;

public class KtLambdaShape0S0102100_I2 extends C02220Ah implements AnonymousClass0YM {
    public int A00;
    public int A01;
    public long A02;
    public Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0102100_I2(C147598pb r2, int i, int i2, long j) {
        super(3);
        this.A03 = r2;
        this.A02 = j;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int A04 = AnonymousClass0wJ.A04(obj);
        int A042 = AnonymousClass0wJ.A04(obj2);
        AnonymousClass0YY r9 = (AnonymousClass0YY) obj3;
        C04220Ms.A0B(r9, 2);
        long j = this.A02;
        return C147618pd.A00((C147618pd) this.A03, r9, AnonymousClass8bI.A04(j, A04 + this.A00), AnonymousClass8bI.A03(j, A042 + this.A01));
    }
}
