package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass7Hy;
import X.AnonymousClass7JP;
import X.C02220Ah;
import X.C115796vv;
import X.C1203679w;
import X.C1203779x;
import X.C147188nY;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape0S1412000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public boolean A07;
    public final int A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S1412000_I2(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2, int i3, boolean z) {
        super(2);
        this.A08 = i3;
        this.A05 = obj;
        this.A06 = str;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
        this.A07 = z;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A08 != 0) {
            String str = this.A06;
            List list = (List) this.A03;
            Integer num = (Integer) this.A02;
            AnonymousClass7Hy.A01(C86104wH.A0H(obj, obj2), (Modifier) this.A04, num, str, list, (AnonymousClass0ZU) this.A05, C115796vv.A00(this.A00), this.A01, this.A07);
        } else {
            C147188nY A0H = C86104wH.A0H(obj, obj2);
            boolean z = this.A07;
            AnonymousClass7JP.A06((C1203679w) this.A03, (C1203779x) this.A04, A0H, (Modifier) this.A05, this.A06, (AnonymousClass0YM) this.A02, this.A00 | 1, this.A01, z);
        }
        return Unit.A00;
    }
}
