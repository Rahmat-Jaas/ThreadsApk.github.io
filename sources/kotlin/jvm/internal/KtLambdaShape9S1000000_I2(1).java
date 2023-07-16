package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass7I9;
import X.AnonymousClass7Kx;
import X.C02220Ah;
import X.C114236su;
import X.C121117Ee;
import X.C121807If;
import X.C134817yQ;
import X.C147188nY;
import X.C86104wH;
import X.C86124wJ;
import androidx.compose.ui.Modifier;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import kotlin.Unit;

public class KtLambdaShape9S1000000_I2 extends C02220Ah implements AnonymousClass0YP {
    public String A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape9S1000000_I2(String str, int i) {
        super(2);
        this.A01 = i;
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj;
        if (this.A01 == 0) {
            return C86124wJ.A0f(((PaymentMethod) AnonymousClass7Kx.A0D(C86104wH.A0S(obj3))).Aal(), this.A00);
        }
        C147188nY r3 = (C147188nY) obj3;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r3.BCM()) {
            AnonymousClass7I9.A02(r3, (Modifier) null, (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, this.A00, 0, 0, 0, 0, 0, 4094, 0, 0, false);
        } else {
            r3.CuJ();
        }
        return Unit.A00;
    }
}
