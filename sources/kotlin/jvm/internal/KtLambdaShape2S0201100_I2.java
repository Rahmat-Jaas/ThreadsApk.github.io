package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass67A;
import X.AnonymousClass7Ck;
import X.AnonymousClass7DB;
import X.AnonymousClass7FJ;
import X.C02220Ah;
import X.C111216my;
import X.C115796vv;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape2S0201100_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S0201100_I2(int i, int i2, long j, Object obj, Object obj2) {
        super(2);
        this.A04 = i2;
        this.A01 = j;
        this.A03 = obj;
        this.A02 = obj2;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A04) {
            case 0:
                AnonymousClass7Ck.A01(C86104wH.A0H(obj, obj2), (Modifier) this.A03, (AnonymousClass0YP) this.A02, C115796vv.A00(this.A00), this.A01);
                break;
            case 1:
                AnonymousClass7FJ.A01((AnonymousClass67A) this.A03, C86104wH.A0H(obj, obj2), (AnonymousClass0YP) this.A02, C115796vv.A00(this.A00), this.A01);
                break;
            default:
                long j = this.A01;
                AnonymousClass7DB.A01(C86104wH.A0H(obj, obj2), (Modifier) this.A02, (C111216my) this.A03, C115796vv.A00(this.A00), j);
                break;
        }
        return Unit.A00;
    }
}
