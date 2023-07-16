package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0ZU;
import X.C02220Ah;
import X.C121347Fo;
import X.C86104wH;
import X.C86154wM;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape3S0121000_I2 extends C02220Ah implements AnonymousClass0YM {
    public int A00;
    public Object A01;
    public boolean A02;
    public boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S0121000_I2(AnonymousClass0ZU r2, int i, boolean z, boolean z2) {
        super(3);
        this.A01 = r2;
        this.A02 = z;
        this.A03 = z2;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z = this.A02;
        boolean z2 = this.A03;
        Modifier A04 = Modifier.A04(Modifier.A00);
        int i = this.A00;
        C121347Fo.A02(C86104wH.A0H(obj2, obj3), A04, (AnonymousClass0ZU) this.A01, C86154wM.A02(i, (i & 14) | 3072), z, z2);
        return Unit.A00;
    }
}
