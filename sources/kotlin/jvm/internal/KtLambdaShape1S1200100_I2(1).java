package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass5D6;
import X.C02220Ah;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import X.C86134wK;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.fbpay.logging.LoggingContext;
import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;
import kotlin.Unit;

public class KtLambdaShape1S1200100_I2 extends C02220Ah implements AnonymousClass0YY {
    public long A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S1200100_I2(Object obj, Object obj2, String str, int i, long j) {
        super(1);
        this.A04 = i;
        this.A02 = obj;
        this.A00 = j;
        this.A03 = str;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A04) {
            case 0:
                USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = (USLEBaseShape0S0000000) obj;
                AnonymousClass5D6 r2 = new AnonymousClass5D6();
                C86104wH.A1K(r2, (LoggingContext) this.A02);
                r2.A09("paypal_billing_agreement_id", Long.valueOf(this.A00));
                C86134wK.A1G(r2, this.A03);
                C86114wI.A1C(uSLEBaseShape0S0000000, r2);
                C86114wI.A1G(uSLEBaseShape0S0000000, this.A01);
                return uSLEBaseShape0S0000000;
            case 1:
                USLEBaseShape0S0000000 uSLEBaseShape0S00000002 = (USLEBaseShape0S0000000) obj;
                AnonymousClass5D6 r22 = new AnonymousClass5D6();
                C86104wH.A1K(r22, (LoggingContext) this.A02);
                r22.A09("paypal_billing_agreement_id", Long.valueOf(this.A00));
                C86124wJ.A1K(r22, this.A03);
                C86114wI.A1C(uSLEBaseShape0S00000002, r22);
                C86114wI.A1G(uSLEBaseShape0S00000002, this.A01);
                return uSLEBaseShape0S00000002;
            default:
                ((IGTigonQuickPerformanceLogger) this.A02).logger.markerAnnotate(AnonymousClass0wJ.A04(obj), this.A01.hashCode(), this.A03, this.A00);
                return Unit.A00;
        }
    }
}
