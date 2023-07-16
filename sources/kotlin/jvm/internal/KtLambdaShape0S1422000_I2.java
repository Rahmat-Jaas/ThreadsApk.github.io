package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass67V;
import X.AnonymousClass7Hy;
import X.C02220Ah;
import X.C115286uo;
import X.C115796vv;
import X.C117676z4;
import X.C142318ef;
import X.C147188nY;
import X.C86104wH;
import X.C968967c;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S1422000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final int A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S1422000_I2(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A09 = i3;
        this.A06 = str;
        this.A04 = obj;
        this.A05 = obj2;
        this.A08 = z;
        this.A07 = z2;
        this.A03 = obj3;
        this.A02 = obj4;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A09;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        if (i != 0) {
            C968967c r3 = (C968967c) this.A02;
            AnonymousClass7Hy.A00(A0H, (Modifier) this.A03, r3, this.A06, (AnonymousClass0ZU) this.A05, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01, this.A08, this.A07);
        } else {
            String str = this.A06;
            boolean z = this.A08;
            boolean z2 = this.A07;
            C117676z4.A00(A0H, (Modifier) this.A04, (C115286uo) this.A03, (C142318ef) this.A02, (AnonymousClass67V) this.A05, str, C115796vv.A00(this.A00), this.A01, z, z2);
        }
        return Unit.A00;
    }
}
