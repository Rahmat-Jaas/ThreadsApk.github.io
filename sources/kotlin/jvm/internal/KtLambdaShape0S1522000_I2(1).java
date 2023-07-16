package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass6M6;
import X.AnonymousClass70P;
import X.C02220Ah;
import X.C115796vv;
import X.C146348m5;
import X.C146458mH;
import X.C147188nY;
import X.C147258p3;
import X.C86104wH;
import X.C966466d;
import X.C968666z;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S1522000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S1522000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A0A = i3;
        this.A04 = obj;
        this.A07 = str;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A08 = z;
        this.A06 = obj4;
        this.A05 = obj5;
        this.A09 = z2;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A0A;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        AnonymousClass0ZU r7 = (AnonymousClass0ZU) this.A04;
        String str = this.A07;
        Modifier modifier = (Modifier) this.A03;
        C147258p3 r1 = (C147258p3) this.A02;
        boolean z = this.A08;
        Object obj3 = this.A06;
        if (i != 0) {
            AnonymousClass70P.A00(r1, A0H, modifier, (C968666z) this.A05, (C146348m5) obj3, str, r7, C115796vv.A00(this.A00), this.A01, z, this.A09);
        } else {
            AnonymousClass6M6.A00(r1, A0H, modifier, (C966466d) this.A05, (C146458mH) obj3, str, r7, C115796vv.A00(this.A00), this.A01, z, this.A09);
        }
        return Unit.A00;
    }
}
