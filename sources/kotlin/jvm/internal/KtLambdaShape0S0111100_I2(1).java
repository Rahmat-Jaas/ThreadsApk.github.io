package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass6aT;
import X.AnonymousClass7GX;
import X.AnonymousClass7JR;
import X.AnonymousClass8YU;
import X.C02220Ah;
import X.C111216my;
import X.C115646vg;
import X.C115796vv;
import X.C122747Tr;
import X.C147188nY;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S0111100_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public long A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        if (this.A04 != 0) {
            C147188nY r7 = (C147188nY) obj3;
            if ((AnonymousClass0wJ.A04(obj4) & 11) != 2 || !r7.BCM()) {
                Boolean valueOf = Boolean.valueOf(this.A03);
                C122747Tr A002 = C122747Tr.A00(AnonymousClass6aT.A00, 2, 100, 0);
                long j = this.A01;
                int i = this.A00;
                C115646vg.A01(A002, r7, (Modifier) null, valueOf, "Arrow crossfade", AnonymousClass7JR.A00(r7, new AnonymousClass8YU((C111216my) this.A02, i, j), -829002348), (i & 14) | 28032, 2);
            } else {
                r7.CuJ();
            }
        } else {
            AnonymousClass7GX.A02(C86104wH.A0H(obj, obj4), (AnonymousClass0ZU) this.A02, C115796vv.A00(this.A00), this.A01, this.A03);
        }
        return Unit.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0111100_I2(Object obj, int i, int i2, long j, boolean z) {
        super(2);
        this.A04 = i2;
        this.A01 = j;
        this.A02 = obj;
        this.A03 = z;
        this.A00 = i;
    }
}
