package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass6MX;
import X.C02220Ah;
import X.C115796vv;
import X.C122107Kg;
import X.C147188nY;
import X.C304621k;
import X.C86104wH;
import X.C970867w;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape1S0412000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public final int A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S0412000_I2(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3, boolean z) {
        super(2);
        this.A07 = i3;
        this.A05 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
        this.A06 = z;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A07;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        if (i != 0) {
            C304621k r4 = (C304621k) this.A02;
            boolean z = this.A06;
            C970867w r3 = (C970867w) this.A05;
            C122107Kg.A02(A0H, (Modifier) this.A03, r3, r4, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01, z);
        } else {
            AnonymousClass0ZU r42 = (AnonymousClass0ZU) this.A03;
            AnonymousClass6MX.A00(A0H, (Modifier) this.A02, (List) this.A05, r42, (AnonymousClass0YY) this.A04, C115796vv.A00(this.A00), this.A01, this.A06);
        }
        return Unit.A00;
    }
}
