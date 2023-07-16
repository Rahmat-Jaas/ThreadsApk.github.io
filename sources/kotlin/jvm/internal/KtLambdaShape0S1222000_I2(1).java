package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.C02220Ah;
import X.C100116Ma;
import X.C115796vv;
import X.C117816zI;
import X.C147188nY;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S1222000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final int A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S1222000_I2(Object obj, Object obj2, String str, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A07 = i3;
        this.A04 = str;
        this.A06 = z;
        this.A05 = z2;
        this.A03 = obj;
        this.A02 = obj2;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A07;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        if (i != 0) {
            String str = this.A04;
            C117816zI.A01(A0H, (Modifier) this.A02, str, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01, this.A05, this.A06);
        } else {
            String str2 = this.A04;
            boolean z = this.A06;
            boolean z2 = this.A05;
            C100116Ma.A00(A0H, (Modifier) this.A02, str2, (AnonymousClass0YY) this.A03, C115796vv.A00(this.A00), this.A01, z, z2);
        }
        return Unit.A00;
    }
}
