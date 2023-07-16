package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass6NQ;
import X.AnonymousClass70S;
import X.AnonymousClass7In;
import X.AnonymousClass7KY;
import X.C02220Ah;
import X.C100586Nw;
import X.C115786vu;
import X.C115796vv;
import X.C117676z4;
import X.C121827Ii;
import X.C121917Iu;
import X.C142318ef;
import X.C142508ey;
import X.C147188nY;
import X.C86104wH;
import X.C967466n;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape1S0211000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S0211000_I2(Object obj, Object obj2, int i, int i2, boolean z) {
        super(2);
        this.A04 = i2;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = obj2;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A04;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        switch (i) {
            case 0:
                boolean z = this.A03;
                C115786vu.A00((C121827Ii) this.A02, A0H, (C967466n) this.A01, C115796vv.A00(this.A00), z);
                break;
            case 1:
                C117676z4.A01(A0H, (Modifier) this.A02, (C142318ef) this.A01, C115796vv.A00(this.A00), this.A03);
                break;
            case 2:
                boolean z2 = this.A03;
                AnonymousClass7In.A04(A0H, (Modifier) this.A01, (AnonymousClass0ZU) this.A02, C115796vv.A00(this.A00), z2);
                break;
            case 3:
                boolean z3 = this.A03;
                AnonymousClass6NQ.A00(A0H, (Modifier) this.A01, (AnonymousClass0YY) this.A02, C115796vv.A00(this.A00), z3);
                break;
            case 4:
                AnonymousClass7KY.A0B(A0H, (Modifier) this.A01, (AnonymousClass0YY) this.A02, C115796vv.A00(this.A00), this.A03);
                break;
            case 5:
                C100586Nw.A00(A0H, (AnonymousClass0ZU) this.A02, (AnonymousClass0ZU) this.A01, C115796vv.A00(this.A00), this.A03);
                break;
            case 6:
                AnonymousClass70S.A01(A0H, (Modifier) this.A02, (C142508ey) this.A01, C115796vv.A00(this.A00), this.A03);
                break;
            default:
                C121917Iu.A05(A0H, (Modifier) this.A01, (AnonymousClass0ZU) this.A02, C115796vv.A00(this.A00), this.A03);
                break;
        }
        return Unit.A00;
    }
}
