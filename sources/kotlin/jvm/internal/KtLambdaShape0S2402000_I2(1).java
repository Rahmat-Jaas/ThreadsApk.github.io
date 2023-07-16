package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass8s2;
import X.C02220Ah;
import X.C100256Mp;
import X.C10300i6;
import X.C115796vv;
import X.C117796zG;
import X.C147188nY;
import X.C86104wH;
import X.C884958x;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S2402000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public String A07;
    public final int A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S2402000_I2(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i, int i2, int i3) {
        super(2);
        this.A08 = i3;
        this.A04 = obj;
        this.A05 = obj2;
        this.A07 = str;
        this.A03 = obj3;
        this.A06 = str2;
        this.A02 = obj4;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A08;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        if (i != 0) {
            String str = this.A07;
            C117796zG.A01(A0H, (Modifier) this.A03, (C884958x) this.A04, (C10300i6) this.A05, str, this.A06, (AnonymousClass0YY) this.A02, C115796vv.A00(this.A00), this.A01);
        } else {
            AnonymousClass0ZU r5 = (AnonymousClass0ZU) this.A05;
            AnonymousClass0YY r6 = (AnonymousClass0YY) this.A04;
            C100256Mp.A00(A0H, (Modifier) this.A03, this.A07, this.A06, r5, r6, (AnonymousClass8s2) this.A02, C115796vv.A00(this.A00), this.A01);
        }
        return Unit.A00;
    }
}
