package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.C02220Ah;
import X.C104136bI;
import X.C115286uo;
import X.C115796vv;
import X.C117766zD;
import X.C146878n1;
import X.C147188nY;
import X.C86104wH;
import X.C968366w;
import X.C970267q;
import X.C97846Dc;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S1502001_I2 extends C02220Ah implements AnonymousClass0YP {
    public float A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public String A08;
    public final int A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S1502001_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, float f, int i, int i2, int i3) {
        super(2);
        this.A09 = i3;
        this.A07 = obj;
        this.A08 = str;
        this.A06 = obj2;
        this.A03 = obj3;
        this.A05 = obj4;
        this.A00 = f;
        this.A04 = obj5;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A09;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        if (i != 0) {
            String str = this.A08;
            float f = this.A00;
            C968366w r4 = (C968366w) this.A07;
            C970267q r3 = (C970267q) this.A06;
            C117766zD.A01(A0H, (Modifier) this.A04, r3, r4, str, (AnonymousClass0ZU) this.A05, (AnonymousClass0YP) this.A03, f, C115796vv.A00(this.A01), this.A02);
        } else {
            String str2 = this.A08;
            Modifier modifier = (Modifier) this.A06;
            Alignment alignment = (Alignment) this.A03;
            float f2 = this.A00;
            C97846Dc.A00(A0H, alignment, modifier, (C104136bI) this.A04, (C115286uo) this.A07, (C146878n1) this.A05, str2, f2, C115796vv.A00(this.A01), this.A02);
        }
        return Unit.A00;
    }
}
