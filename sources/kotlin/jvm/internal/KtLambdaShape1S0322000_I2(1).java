package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0wJ;
import X.AnonymousClass7GN;
import X.AnonymousClass7W3;
import X.AnonymousClass8s2;
import X.C02220Ah;
import X.C117756zC;
import X.C117766zD;
import X.C146628mY;
import X.C147068nL;
import X.C147188nY;
import X.C81784oM;
import X.C86104wH;
import X.C86164wN;
import X.C970267q;
import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4440000_I2;
import com.instagram.api.schemas.LineType;
import kotlin.Unit;

public class KtLambdaShape1S0322000_I2 extends C02220Ah implements AnonymousClass0YM {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public final int A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S0322000_I2(Object obj, Object obj2, Object obj3, int i, int i2, int i3, boolean z, boolean z2) {
        super(3);
        this.A07 = i3;
        this.A04 = obj;
        this.A06 = z;
        this.A02 = obj2;
        this.A00 = i;
        this.A05 = z2;
        this.A01 = i2;
        this.A03 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.A07;
        C147188nY r8 = (C147188nY) obj2;
        int A042 = AnonymousClass0wJ.A04(obj3) & 81;
        if (i != 0) {
            if (A042 != 16 || !r8.BCM()) {
                String str = (String) C86104wH.A0f(this.A03);
                C146628mY r1 = (C146628mY) this.A04;
                C970267q BIh = r1.BIh();
                KtCSuperShape0S4440000_I2 ktCSuperShape0S4440000_I2 = (KtCSuperShape0S4440000_I2) r1;
                C147068nL r12 = (C147068nL) ktCSuperShape0S4440000_I2.A01;
                boolean z = ktCSuperShape0S4440000_I2.A0A;
                LineType lineType = (LineType) ktCSuperShape0S4440000_I2.A02;
                boolean z2 = this.A06;
                Object obj4 = this.A02;
                boolean A0y = C147188nY.A0y(r8, obj4);
                AnonymousClass7W3 r2 = (AnonymousClass7W3) r8;
                Object A13 = r2.A13();
                if (A0y || A13 == AnonymousClass7GN.A00) {
                    A13 = C86164wN.A0w(obj4, 29);
                    r2.A14(A13);
                }
                AnonymousClass7W3.A0w(r2, false);
                boolean z3 = z2;
                boolean z4 = z;
                C117766zD.A00(r8, (Modifier) null, lineType, BIh, r12, str, (AnonymousClass0YM) A13, (458752 & (this.A00 << 6)) | (234881024 & (this.A01 << 24)), 128, z4, z3, this.A05);
            }
            r8.CuJ();
        } else {
            if (A042 != 16 || !r8.BCM()) {
                C81784oM r7 = (C81784oM) this.A03;
                String A0e = C86164wN.A0e(r7);
                C146628mY r13 = (C146628mY) this.A04;
                C970267q BIh2 = r13.BIh();
                KtCSuperShape0S4440000_I2 ktCSuperShape0S4440000_I22 = (KtCSuperShape0S4440000_I2) r13;
                AnonymousClass8s2 r14 = (AnonymousClass8s2) ktCSuperShape0S4440000_I22.A01;
                boolean z5 = ktCSuperShape0S4440000_I22.A0A;
                LineType lineType2 = (LineType) ktCSuperShape0S4440000_I22.A02;
                boolean z6 = this.A06;
                Object obj5 = this.A02;
                boolean A10 = C147188nY.A10(r8, obj5, r7, 511388516);
                AnonymousClass7W3 r5 = (AnonymousClass7W3) r8;
                Object A132 = r5.A13();
                if (A10 || A132 == AnonymousClass7GN.A00) {
                    A132 = AnonymousClass7W3.A0L(r5, r7, obj5, 36);
                }
                boolean z7 = z6;
                boolean z8 = z5;
                C117756zC.A00(r8, (Modifier) null, lineType2, BIh2, A0e, AnonymousClass7W3.A0A(r5, A132, false), r14, (458752 & (this.A00 << 6)) | (234881024 & (this.A01 << 24)), 128, z8, z7, this.A05);
            }
            r8.CuJ();
        }
        return Unit.A00;
    }
}
