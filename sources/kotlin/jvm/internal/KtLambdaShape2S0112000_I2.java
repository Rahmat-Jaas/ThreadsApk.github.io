package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass6DO;
import X.C02220Ah;
import X.C115796vv;
import X.C117836zK;
import X.C86104wH;
import kotlin.Unit;

public class KtLambdaShape2S0112000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S0112000_I2(AnonymousClass0ZU r2, int i, int i2, int i3, boolean z) {
        super(2);
        this.A04 = i3;
        this.A03 = z;
        this.A02 = r2;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A04 != 0) {
            C117836zK.A01(C86104wH.A0H(obj, obj2), (AnonymousClass0ZU) this.A02, C115796vv.A00(this.A00), this.A01, this.A03);
        } else {
            AnonymousClass6DO.A00(C86104wH.A0H(obj, obj2), (AnonymousClass0ZU) this.A02, this.A00 | 1, this.A01, this.A03);
        }
        return Unit.A00;
    }
}
