package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass70S;
import X.C02220Ah;
import X.C100126Mb;
import X.C100406Ne;
import X.C115286uo;
import X.C115796vv;
import X.C142508ey;
import X.C147188nY;
import X.C86104wH;
import X.C883157o;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S2312000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public String A06;
    public boolean A07;
    public final int A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S2312000_I2(Object obj, Object obj2, Object obj3, String str, String str2, int i, int i2, int i3, boolean z) {
        super(2);
        this.A08 = i3;
        this.A05 = str;
        this.A04 = obj;
        this.A07 = z;
        this.A06 = str2;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A08;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        switch (i) {
            case 0:
                String str = this.A05;
                String str2 = this.A06;
                boolean z = this.A07;
                C100126Mb.A00(A0H, (Modifier) this.A02, (C883157o) this.A04, str, str2, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01, z);
                break;
            case 1:
                String str3 = this.A05;
                String str4 = this.A06;
                boolean z2 = this.A07;
                C100406Ne.A00(A0H, (Modifier) this.A02, str3, str4, (AnonymousClass0ZU) this.A04, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01, z2);
                break;
            default:
                String str5 = this.A05;
                boolean z3 = this.A07;
                AnonymousClass70S.A00(A0H, (Modifier) this.A04, (C115286uo) this.A03, (C142508ey) this.A02, str5, this.A06, C115796vv.A00(this.A00), this.A01, z3);
                break;
        }
        return Unit.A00;
    }
}
