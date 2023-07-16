package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass72U;
import X.C02220Ah;
import X.C115286uo;
import X.C115796vv;
import X.C1190173e;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S1202100_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public long A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S1202100_I2(Modifier modifier, C115286uo r3, String str, int i, int i2, int i3, long j) {
        super(2);
        this.A06 = i3;
        this.A04 = r3;
        this.A05 = str;
        this.A03 = modifier;
        this.A02 = j;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A06 != 0) {
            String str = this.A05;
            C1190173e.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A03, (C115286uo) this.A04, str, C115796vv.A00(this.A00), this.A01, this.A02);
        } else {
            String str2 = this.A05;
            AnonymousClass72U.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A03, (C115286uo) this.A04, str2, C115796vv.A00(this.A00), this.A01, this.A02);
        }
        return Unit.A00;
    }
}
