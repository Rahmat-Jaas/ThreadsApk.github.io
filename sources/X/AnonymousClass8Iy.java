package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.fbpay.logging.LoggingContext;
import java.util.Map;

/* renamed from: X.8Iy  reason: invalid class name */
public final class AnonymousClass8Iy extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ LoggingContext A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Iy(LoggingContext loggingContext, String str, String str2, Map map, boolean z) {
        super(1);
        this.A00 = loggingContext;
        this.A02 = str;
        this.A04 = z;
        this.A01 = str2;
        this.A03 = map;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = (USLEBaseShape0S0000000) obj;
        AnonymousClass5Cn r2 = new AnonymousClass5Cn();
        C86104wH.A1K(r2, this.A00);
        String str = this.A02;
        if (str == null) {
            str = "";
        }
        r2.A0A("receiver_id", str);
        r2.A07("is_ecp_available", Boolean.valueOf(this.A04));
        C86124wJ.A1K(r2, "checkout_setup_mutation");
        String str2 = this.A01;
        if (str2 != null) {
            r2.A09("order_id", AnonymousClass4n2.A02(str2));
        }
        C86114wI.A1C(uSLEBaseShape0S0000000, r2);
        uSLEBaseShape0S0000000.A1g(this.A03);
        return uSLEBaseShape0S0000000;
    }
}
