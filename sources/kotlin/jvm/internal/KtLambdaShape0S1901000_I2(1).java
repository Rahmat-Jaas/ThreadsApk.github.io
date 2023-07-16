package kotlin.jvm.internal;

import X.AnonymousClass06E;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass59F;
import X.C02220Ah;
import X.C10300i6;
import X.C115796vv;
import X.C117786zF;
import X.C147188nY;
import X.C147368pE;
import X.C86104wH;
import X.C884958x;
import kotlin.Unit;

public class KtLambdaShape0S1901000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public String A0A;
    public final int A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S1901000_I2(C147368pE r2, AnonymousClass06E r3, C884958x r4, AnonymousClass59F r5, C10300i6 r6, String str, AnonymousClass0ZU r8, AnonymousClass0YY r9, AnonymousClass0YY r10, AnonymousClass0YP r11, int i, int i2) {
        super(2);
        this.A0B = i2;
        this.A03 = r4;
        this.A01 = r5;
        this.A08 = r6;
        this.A02 = r3;
        this.A09 = r2;
        this.A06 = r11;
        this.A04 = r9;
        this.A05 = r10;
        this.A07 = r8;
        this.A0A = str;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        if (this.A0B != 0) {
            C147188nY r3 = (C147188nY) obj3;
            if ((AnonymousClass0wJ.A04(obj4) & 11) != 2 || !r3.BCM()) {
                AnonymousClass06E r5 = (AnonymousClass06E) this.A02;
                C147368pE r4 = (C147368pE) this.A09;
                AnonymousClass0YY r11 = (AnonymousClass0YY) this.A04;
                AnonymousClass0YY r12 = (AnonymousClass0YY) this.A05;
                AnonymousClass0ZU r10 = (AnonymousClass0ZU) this.A07;
                String str = this.A0A;
                int i = this.A00;
                int i2 = i << 3;
                C117786zF.A01(r3, r4, r5, (C884958x) this.A03, (AnonymousClass59F) this.A01, (C10300i6) this.A08, str, r10, r11, r12, (AnonymousClass0YP) this.A06, 4680 | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (29360128 & i2) | (234881024 & i2) | (1879048192 & i));
            } else {
                r3.CuJ();
            }
        } else {
            AnonymousClass06E r32 = (AnonymousClass06E) this.A02;
            C147368pE r2 = (C147368pE) this.A09;
            AnonymousClass0YY r9 = (AnonymousClass0YY) this.A04;
            AnonymousClass0YY r102 = (AnonymousClass0YY) this.A05;
            AnonymousClass0ZU r8 = (AnonymousClass0ZU) this.A07;
            C117786zF.A01(C86104wH.A0H(obj3, obj4), r2, r32, (C884958x) this.A03, (AnonymousClass59F) this.A01, (C10300i6) this.A08, this.A0A, r8, r9, r102, (AnonymousClass0YP) this.A06, C115796vv.A00(this.A00));
        }
        return Unit.A00;
    }
}
