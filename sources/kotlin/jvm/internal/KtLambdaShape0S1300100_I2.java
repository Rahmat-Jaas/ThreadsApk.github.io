package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass5D4;
import X.AnonymousClass7Hr;
import X.AnonymousClass7Kr;
import X.C02220Ah;
import X.C18180wK;
import X.C40307LcE;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import X.C86164wN;
import X.C89355Dh;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.fbpay.logging.LoggingContext;
import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

public class KtLambdaShape0S1300100_I2 extends C02220Ah implements AnonymousClass0YY {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S1300100_I2(Object obj, Object obj2, Object obj3, String str, int i, long j) {
        super(1);
        this.A05 = i;
        this.A03 = obj;
        this.A00 = j;
        this.A01 = obj2;
        this.A04 = str;
        this.A02 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (2 - this.A05 != 0) {
            USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = (USLEBaseShape0S0000000) obj;
            AnonymousClass5D4 r4 = new AnonymousClass5D4();
            LoggingContext loggingContext = (LoggingContext) this.A03;
            C86104wH.A1K(r4, loggingContext);
            C89355Dh r2 = new C89355Dh();
            C86164wN.A1D(r2, this.A00);
            C86164wN.A1B(AnonymousClass7Kr.A03((C40307LcE) this.A01), r2);
            r4.A0B("credential_container", C18180wK.A0n(r2));
            AnonymousClass7Hr.A03(r4, loggingContext);
            C86124wJ.A1K(r4, this.A04);
            C86114wI.A1C(uSLEBaseShape0S0000000, r4);
            C86114wI.A1G(uSLEBaseShape0S0000000, this.A02);
            return uSLEBaseShape0S0000000;
        }
        ((IGTigonQuickPerformanceLogger) this.A03).logger.markerPoint(AnonymousClass0wJ.A04(obj), this.A01.hashCode(), this.A04, this.A00, (TimeUnit) this.A02);
        return Unit.A00;
    }
}
