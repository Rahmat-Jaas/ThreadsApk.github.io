package kotlin.jvm.internal;

import X.AnonymousClass0MJ;
import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass7GF;
import X.AnonymousClass7GN;
import X.AnonymousClass7J9;
import X.AnonymousClass7JR;
import X.AnonymousClass7KB;
import X.AnonymousClass7W3;
import X.AnonymousClass8DJ;
import X.C02220Ah;
import X.C04220Ms;
import X.C1191773v;
import X.C121117Ee;
import X.C121807If;
import X.C134817yQ;
import X.C147188nY;
import X.C148858sI;
import X.C170649vL;
import X.C171199wE;
import X.C17653AIj;
import X.C81784oM;
import X.C86104wH;
import X.C86124wJ;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape5S1101000_I2 extends C02220Ah implements AnonymousClass0YM {
    public int A00;
    public Object A01;
    public String A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape5S1101000_I2(Object obj, String str, int i, int i2) {
        super(3);
        this.A03 = i2;
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4 = obj;
        Object obj5 = obj2;
        Object obj6 = obj3;
        switch (this.A03) {
            case 0:
                AnonymousClass0YP r2 = (AnonymousClass0YP) obj4;
                C147188nY r14 = (C147188nY) obj5;
                int A04 = AnonymousClass0wJ.A04(obj6);
                if (C86124wJ.A0G(r2, A04) == 0) {
                    A04 |= C147188nY.A09(r14, r2);
                }
                if ((A04 & 91) == 18 && r14.BCM()) {
                    r14.CuJ();
                    break;
                } else {
                    C147188nY r10 = r14;
                    AnonymousClass7GF.A01(r10, AnonymousClass7J9.A02(r14).A01(new C121807If((C134817yQ) null, (C121117Ee) null, 262142, AnonymousClass7KB.A03(r14), 0, 0)), this.A02, r2, ((this.A00 >> 3) & 896) | ((A04 << 9) & 7168), C86104wH.A1X((C81784oM) this.A01));
                    break;
                }
            case 1:
                C147188nY A0H = C86104wH.A0H(obj5, obj6);
                AnonymousClass0MJ r5 = (AnonymousClass0MJ) this.A01;
                C148858sI A002 = AnonymousClass7JR.A00(A0H, new KtLambdaShape1S1001000_I2(this.A02, this.A00, 7), -2056831246);
                A0H.Cvb(1178250579);
                Context context = (Context) C147188nY.A0o(A0H);
                AnonymousClass7W3 A0Y = C147188nY.A0Y(A0H);
                Object A13 = A0Y.A13();
                if (A13 == AnonymousClass7GN.A00) {
                    A13 = new ComposeView(context, (AttributeSet) null, 0);
                    A0Y.A14(A13);
                }
                AnonymousClass7W3.A0w(A0Y, false);
                ComposeView composeView = (ComposeView) A13;
                C1191773v.A00(A0H, (Modifier) null, new KtLambdaShape31S0201000_I2(6, 5, composeView, A002), (AnonymousClass0YY) null, 0, 6);
                AnonymousClass8DJ r0 = new AnonymousClass8DJ(composeView);
                AnonymousClass7W3.A0w(A0Y, false);
                r5.A00 = r0;
                break;
            default:
                int A042 = AnonymousClass0wJ.A04(obj4);
                List list = (List) obj5;
                C04220Ms.A0B(list, 1);
                return C17653AIj.A00((C170649vL) null, (C171199wE) this.A01, this.A02, list, this.A00 + A042, false);
        }
        return Unit.A00;
    }
}
