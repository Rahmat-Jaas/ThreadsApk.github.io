package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass6QV;
import X.AnonymousClass7KY;
import X.C02220Ah;
import X.C115796vv;
import X.C117706z7;
import X.C120567Bk;
import X.C147188nY;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2;
import kotlin.Unit;

public class KtLambdaShape0S0222000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public boolean A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0222000_I2(Object obj, Object obj2, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A06 = i3;
        this.A03 = obj;
        this.A05 = z;
        this.A02 = obj2;
        this.A04 = z2;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A06;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        switch (i) {
            case 0:
                boolean z = this.A04;
                C117706z7.A01(A0H, (Modifier) this.A02, (AnonymousClass0YY) this.A03, C115796vv.A00(this.A00), this.A01, z, this.A05);
                break;
            case 1:
                boolean z2 = this.A04;
                boolean z3 = this.A05;
                AnonymousClass7KY.A04(A0H, (Modifier) this.A02, (KtCSuperShape0S0302000_I2) this.A03, C115796vv.A00(this.A00), this.A01, z2, z3);
                break;
            case 2:
                boolean z4 = this.A05;
                AnonymousClass6QV.A00(A0H, (Modifier) this.A02, (AnonymousClass0YY) this.A03, C115796vv.A00(this.A00), this.A01, z4, this.A04);
                break;
            default:
                boolean z5 = this.A04;
                C120567Bk.A02(A0H, (Modifier) this.A02, (AnonymousClass0YY) this.A03, C115796vv.A00(this.A00), this.A01, z5, this.A05);
                break;
        }
        return Unit.A00;
    }
}
