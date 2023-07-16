package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass7Bl;
import X.C02220Ah;
import X.C115286uo;
import X.C115796vv;
import X.C147188nY;
import X.C86104wH;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.Unit;

public class KtLambdaShape0S0212003_I2 extends C02220Ah implements AnonymousClass0YP {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public Object A05;
    public Object A06;
    public boolean A07;
    public final int A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0212003_I2(Object obj, Object obj2, float f, float f2, float f3, int i, int i2, int i3, boolean z) {
        super(2);
        this.A08 = i3;
        this.A02 = f;
        this.A05 = obj;
        this.A06 = obj2;
        this.A01 = f2;
        this.A00 = f3;
        this.A07 = z;
        this.A03 = i;
        this.A04 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A08;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        float f = this.A02;
        Object obj3 = this.A05;
        if (i != 0) {
            AnonymousClass7Bl.A01(A0H, (C115286uo) obj3, (C115286uo) this.A06, f, this.A01, this.A00, C115796vv.A00(this.A03), this.A04, this.A07);
        } else {
            AnonymousClass7Bl.A02(A0H, (ImageUrl) obj3, (ImageUrl) this.A06, f, this.A01, this.A00, C115796vv.A00(this.A03), this.A04, this.A07);
        }
        return Unit.A00;
    }
}
