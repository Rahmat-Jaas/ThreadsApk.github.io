package kotlin.jvm.internal;

import X.AYA;
import X.AnonymousClass0YY;
import X.AnonymousClass5D9;
import X.AnonymousClass7Hr;
import X.AnonymousClass9Mq;
import X.C02220Ah;
import X.C04220Ms;
import X.C145638kp;
import X.C1532493d;
import X.C15680ri;
import X.C18230wP;
import X.C21767Bzs;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import X.C86134wK;
import X.C89135Cb;
import android.view.View;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.fbpay.logging.LoggingContext;
import com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo;
import com.instagram.model.shopping.productfeed.ShoppingRankingLoggingInfo;
import kotlin.Unit;

public class KtLambdaShape1S1202000_I2 extends C02220Ah implements AnonymousClass0YY {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S1202000_I2(Object obj, Object obj2, String str, int i, int i2, int i3) {
        super(1);
        this.A05 = i3;
        this.A03 = obj;
        this.A04 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        switch (this.A05) {
            case 0:
                USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = (USLEBaseShape0S0000000) obj2;
                AnonymousClass5D9 r4 = new AnonymousClass5D9();
                LoggingContext loggingContext = (LoggingContext) this.A03;
                C86104wH.A1K(r4, loggingContext);
                C86134wK.A1G(r4, this.A04);
                r4.A09("user_input_len", C18230wP.A0f(this.A01));
                r4.A09("selected_option", C18230wP.A0f(this.A00));
                C89135Cb A002 = AnonymousClass7Hr.A00(loggingContext);
                if (A002 != null) {
                    r4.A06(A002, "logging_policy");
                }
                C86114wI.A1C(uSLEBaseShape0S0000000, r4);
                C86114wI.A1G(uSLEBaseShape0S0000000, this.A02);
                return uSLEBaseShape0S0000000;
            case 1:
                View view = (View) obj2;
                C04220Ms.A0B(view, 0);
                int i = this.A01;
                int i2 = this.A00;
                ((C21767Bzs) this.A02).Bjh(view, new C1532493d((C15680ri) null, (ShoppingModuleLoggingInfo) null, (ShoppingRankingLoggingInfo) null, false, 0, this.A04, (String) null, (String) null, (String) null), (AYA) this.A03, i, i2);
                break;
            case 2:
                ((C145638kp) this.A02).CaR(C86124wJ.A0L(obj2), (AnonymousClass9Mq) this.A03, this.A04, this.A01, this.A00);
                break;
            default:
                ((C145638kp) this.A02).CKT((AnonymousClass9Mq) this.A03, this.A04, this.A01, this.A00);
                break;
        }
        return Unit.A00;
    }
}
