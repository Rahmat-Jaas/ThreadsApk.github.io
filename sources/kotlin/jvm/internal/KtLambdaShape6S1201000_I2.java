package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass5D9;
import X.AnonymousClass7Hr;
import X.C02220Ah;
import X.C18230wP;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import X.C89135Cb;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.fbpay.logging.LoggingContext;
import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;
import kotlin.Unit;

public class KtLambdaShape6S1201000_I2 extends C02220Ah implements AnonymousClass0YY {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape6S1201000_I2(Object obj, Object obj2, String str, int i, int i2) {
        super(1);
        this.A04 = i2;
        this.A02 = obj;
        this.A03 = str;
        this.A00 = i;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A04 != 0) {
            ((IGTigonQuickPerformanceLogger) this.A02).logger.markerAnnotate(AnonymousClass0wJ.A04(obj), this.A01.hashCode(), this.A03, this.A00);
            return Unit.A00;
        }
        USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = (USLEBaseShape0S0000000) obj;
        AnonymousClass5D9 r3 = new AnonymousClass5D9();
        LoggingContext loggingContext = (LoggingContext) this.A02;
        C86104wH.A1K(r3, loggingContext);
        C86124wJ.A1K(r3, this.A03);
        r3.A09("num_suggestions", C18230wP.A0f(this.A00));
        C89135Cb A002 = AnonymousClass7Hr.A00(loggingContext);
        if (A002 != null) {
            r3.A06(A002, "logging_policy");
        }
        C86114wI.A1C(uSLEBaseShape0S0000000, r3);
        C86114wI.A1G(uSLEBaseShape0S0000000, this.A01);
        return uSLEBaseShape0S0000000;
    }
}
