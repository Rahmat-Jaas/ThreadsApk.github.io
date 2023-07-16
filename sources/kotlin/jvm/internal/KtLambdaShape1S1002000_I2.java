package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass7I9;
import X.AnonymousClass7J9;
import X.AnonymousClass7KB;
import X.AnonymousClass7W3;
import X.C02220Ah;
import X.C101236Qk;
import X.C114236su;
import X.C115796vv;
import X.C120537Bh;
import X.C121117Ee;
import X.C121807If;
import X.C134817yQ;
import X.C147188nY;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape1S1002000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public String A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S1002000_I2(int i, int i2, String str, int i3) {
        super(2);
        this.A03 = i3;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        long A032;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (this.A03 != 0) {
            C147188nY r3 = (C147188nY) obj3;
            if ((AnonymousClass0wJ.A04(obj4) & 11) != 2 || !r3.BCM()) {
                C121807If A04 = AnonymousClass7J9.A04(r3);
                if (this.A01 == this.A00) {
                    A032 = C120537Bh.A01(r3, -532585015).A0h;
                } else {
                    r3.Cvb(-532584961);
                    A032 = AnonymousClass7KB.A03(r3);
                }
                AnonymousClass7W3.A0z(r3, false);
                AnonymousClass7I9.A02(r3, (Modifier) null, A04, (C114236su) null, (C134817yQ) null, (C121117Ee) null, this.A02, 0, 0, 0, 0, 0, 2042, A032, 0, false);
            } else {
                r3.CuJ();
            }
        } else {
            C101236Qk.A00(C86104wH.A0H(obj3, obj4), this.A02, C115796vv.A00(this.A00), this.A01);
        }
        return Unit.A00;
    }
}
