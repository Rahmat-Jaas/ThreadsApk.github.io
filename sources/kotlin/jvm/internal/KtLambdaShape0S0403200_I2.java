package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass6M3;
import X.AnonymousClass72V;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S0403200_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public final int A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0403200_I2(Modifier modifier, AnonymousClass0YP r3, AnonymousClass0YP r4, AnonymousClass0YM r5, int i, int i2, int i3, int i4, long j, long j2) {
        super(2);
        this.A09 = i4;
        this.A02 = i;
        this.A07 = modifier;
        this.A03 = j;
        this.A04 = j2;
        this.A06 = r5;
        this.A05 = r3;
        this.A08 = r4;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A09 != 0) {
            C147188nY A0H = C86104wH.A0H(obj, obj2);
            int i = this.A02;
            long j = this.A03;
            long j2 = this.A04;
            AnonymousClass6M3.A00(A0H, (Modifier) this.A07, (AnonymousClass0YP) this.A05, (AnonymousClass0YP) this.A08, (AnonymousClass0YM) this.A06, i, C115796vv.A00(this.A00), this.A01, j, j2);
        } else {
            C147188nY A0H2 = C86104wH.A0H(obj, obj2);
            int i2 = this.A02;
            long j3 = this.A03;
            long j4 = this.A04;
            AnonymousClass72V.A00(A0H2, (Modifier) this.A07, (AnonymousClass0YP) this.A05, (AnonymousClass0YP) this.A08, (AnonymousClass0YM) this.A06, i2, C115796vv.A00(this.A00), this.A01, j3, j4);
        }
        return Unit.A00;
    }
}
