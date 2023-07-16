package kotlin.jvm.internal;

import X.AP0;
import X.AnonymousClass0YY;
import X.AnonymousClass7WY;
import X.B5b;
import X.BKU;
import X.C02220Ah;
import X.C04220Ms;
import X.C145078jn;
import X.C1526490u;
import X.C154799Dw;
import X.C18108AZy;
import X.C19556AyH;
import X.C20066BMj;
import X.C21697Byi;
import X.C28291u0;
import X.C79414k0;
import X.C86104wH;
import X.C86124wJ;
import X.C86154wM;
import android.graphics.drawable.Drawable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.instagram.barcelona.R;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape12S0401000_I2 extends C02220Ah implements AnonymousClass0YY {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape12S0401000_I2(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        super(1);
        this.A05 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A02 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A05) {
            case 0:
                AP0 ap0 = (AP0) obj;
                C04220Ms.A0B(ap0, 0);
                int action = ap0.A00.getAction();
                if (action == 0) {
                    ((Drawable) this.A01).setTint(this.A00);
                } else if (action == 1) {
                    ((Drawable) this.A01).setTint(C19556AyH.A02((B5b) this.A03, R.color.fds_transparent));
                    C154799Dw r0 = (C154799Dw) this.A04;
                    r0.A00.A00((C28291u0) this.A02, r0.A01);
                }
                return true;
            case 1:
                return new C18108AZy(C86154wM.A0A(obj), (C21697Byi) this.A01, (C1526490u) this.A02, (BKU) this.A03, (C20066BMj) this.A04, this.A00);
            default:
                C145078jn A0M = C86124wJ.A0M(obj);
                List list = (List) ((KtCSuperShape0S0210000_I2) C86104wH.A0f(this.A03)).A01;
                Object obj2 = this.A04;
                Object obj3 = this.A01;
                int i = this.A00;
                Object obj4 = this.A02;
                C79414k0 r1 = C79414k0.A00;
                A0M.Ba5((AnonymousClass0YY) null, new KtLambdaShape45S0200000_I2_6(list, (AnonymousClass0YY) r1, 24), AnonymousClass7WY.A01(new KtLambdaShape13S0401000_I2(obj3, obj2, list, obj4, i, 1), -632812321, true), list.size());
                return Unit.A00;
        }
    }
}
