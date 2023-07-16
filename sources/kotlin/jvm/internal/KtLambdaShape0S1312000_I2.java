package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass67X;
import X.AnonymousClass6NA;
import X.AnonymousClass8s2;
import X.C02220Ah;
import X.C100306Mu;
import X.C100536Nr;
import X.C101156Qc;
import X.C115796vv;
import X.C147188nY;
import X.C86104wH;
import X.C968867b;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S1312000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public boolean A06;
    public final int A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S1312000_I2(Object obj, Object obj2, Object obj3, String str, int i, int i2, int i3, boolean z) {
        super(2);
        this.A07 = i3;
        this.A03 = obj;
        this.A05 = str;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A06 = z;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A07;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        switch (i) {
            case 0:
                String str = this.A05;
                AnonymousClass67X r3 = (AnonymousClass67X) this.A04;
                boolean z = this.A06;
                C100306Mu.A00(A0H, (Modifier) this.A02, r3, str, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01, z);
                break;
            case 1:
                String str2 = this.A05;
                boolean z2 = this.A06;
                AnonymousClass0YY r4 = (AnonymousClass0YY) this.A03;
                AnonymousClass6NA.A00(A0H, (Modifier) this.A02, str2, r4, (AnonymousClass8s2) this.A04, C115796vv.A00(this.A00), this.A01, z2);
                break;
            case 2:
                String str3 = this.A05;
                Integer num = (Integer) this.A02;
                C100536Nr.A00(A0H, (Modifier) this.A03, num, str3, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01, this.A06);
                break;
            default:
                String str4 = this.A05;
                C101156Qc.A00(A0H, (Modifier) this.A02, (C968867b) this.A04, str4, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01, this.A06);
                break;
        }
        return Unit.A00;
    }
}
