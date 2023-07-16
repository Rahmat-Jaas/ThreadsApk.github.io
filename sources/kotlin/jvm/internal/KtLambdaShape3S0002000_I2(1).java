package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C04220Ms;
import X.C101306Qr;
import X.C146498mL;
import X.C147188nY;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape3S0002000_I2 extends C02220Ah implements AnonymousClass0YM {
    public int A00;
    public int A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S0002000_I2(int i, int i2, int i3) {
        super(3);
        this.A02 = i3;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.A02 != 0) {
            C147188nY r6 = (C147188nY) obj2;
            if ((AnonymousClass0wJ.A04(obj3) & 81) != 16 || !r6.BCM()) {
                int i = this.A01;
                if (i > 0) {
                    C101306Qr.A00(i, (Modifier) null, r6, (this.A00 >> 6) & 112, 1);
                }
            } else {
                r6.CuJ();
            }
        } else {
            C146498mL r5 = (C146498mL) obj;
            C04220Ms.A0B(r5, 0);
            r5.CbJ(this.A01, this.A00);
        }
        return Unit.A00;
    }
}
