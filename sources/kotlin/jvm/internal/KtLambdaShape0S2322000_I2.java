package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass671;
import X.AnonymousClass688;
import X.AnonymousClass7KY;
import X.C02220Ah;
import X.C101176Qe;
import X.C115796vv;
import X.C147188nY;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S2322000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final int A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S2322000_I2(Object obj, Object obj2, Object obj3, String str, String str2, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A09 = i3;
        this.A06 = str;
        this.A02 = obj;
        this.A04 = obj2;
        this.A05 = str2;
        this.A07 = z;
        this.A08 = z2;
        this.A03 = obj3;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A09;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        if (i != 0) {
            C101176Qe.A00(A0H, (Modifier) this.A02, (AnonymousClass671) this.A04, this.A06, this.A05, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01, this.A07, this.A08);
        } else {
            AnonymousClass688 r3 = (AnonymousClass688) this.A04;
            String str = this.A05;
            String str2 = this.A06;
            boolean z = this.A07;
            AnonymousClass7KY.A09(A0H, (Modifier) this.A02, r3, str, str2, (AnonymousClass0YY) this.A03, C115796vv.A00(this.A00), this.A01, z, this.A08);
        }
        return Unit.A00;
    }
}
