package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass8s2;
import X.C02220Ah;
import X.C115796vv;
import X.C117756zC;
import X.C117766zD;
import X.C147068nL;
import X.C147188nY;
import X.C86104wH;
import X.C970267q;
import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import kotlin.Unit;

public class KtLambdaShape0S1532000_I2 extends C02220Ah implements AnonymousClass0YP {
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
    public boolean A0A;
    public final int A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S1532000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A0B = i3;
        this.A07 = str;
        this.A06 = obj;
        this.A05 = obj2;
        this.A02 = obj3;
        this.A08 = z;
        this.A0A = z2;
        this.A04 = obj4;
        this.A03 = obj5;
        this.A09 = z3;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A0B;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        if (i != 0) {
            String str = this.A07;
            LineType lineType = (LineType) this.A05;
            boolean z = this.A08;
            boolean z2 = this.A0A;
            C117766zD.A00(A0H, (Modifier) this.A03, lineType, (C970267q) this.A06, (C147068nL) this.A02, str, (AnonymousClass0YM) this.A04, C115796vv.A00(this.A01), this.A00, z, z2, this.A09);
        } else {
            String str2 = this.A07;
            LineType lineType2 = (LineType) this.A05;
            boolean z3 = this.A08;
            boolean z4 = this.A0A;
            AnonymousClass0YY r6 = (AnonymousClass0YY) this.A04;
            C117756zC.A00(A0H, (Modifier) this.A03, lineType2, (C970267q) this.A06, str2, r6, (AnonymousClass8s2) this.A02, C115796vv.A00(this.A01), this.A00, z3, z4, this.A09);
        }
        return Unit.A00;
    }
}
