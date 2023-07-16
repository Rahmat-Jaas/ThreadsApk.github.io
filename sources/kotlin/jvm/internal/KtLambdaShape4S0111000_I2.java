package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass7JQ;
import X.C02220Ah;
import X.C115796vv;
import X.C117736zA;
import X.C121827Ii;
import X.C147188nY;
import X.C86104wH;
import kotlin.Unit;

public class KtLambdaShape4S0111000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape4S0111000_I2(Object obj, int i, int i2, boolean z) {
        super(2);
        this.A03 = i2;
        this.A01 = obj;
        this.A02 = z;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A03;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        Object obj3 = this.A01;
        if (i != 0) {
            C117736zA.A01(A0H, (AnonymousClass0ZU) obj3, C115796vv.A00(this.A00), this.A02);
        } else {
            AnonymousClass7JQ.A05((C121827Ii) obj3, A0H, C115796vv.A00(this.A00), this.A02);
        }
        return Unit.A00;
    }
}
