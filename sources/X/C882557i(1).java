package X;

import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.otc.models.OtcInput;
import com.fbpay.logging.LoggingContext;
import java.util.Map;

/* renamed from: X.57i  reason: invalid class name and case insensitive filesystem */
public final class C882557i extends C62793ak {
    public ECPHandler A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final C880856r A05 = C880856r.A03();
    public final C880856r A06 = C880856r.A03();
    public final C04530Oa A07 = AnonymousClass0OY.A02(AnonymousClass8GZ.A00);

    public final void A00(LoggingContext loggingContext, Integer num) {
        String str;
        C04220Ms.A0B(num, 0);
        AnonymousClass7JJ.A00().A0H(loggingContext, "url_loading_screen", (Map) null);
        ECPHandler eCPHandler = this.A00;
        if (eCPHandler != null) {
            String str2 = this.A04;
            if (str2 == null) {
                str = "sessionId";
            } else {
                String str3 = this.A02;
                if (str3 == null) {
                    str = "productId";
                } else {
                    String str4 = this.A01;
                    if (str4 == null) {
                        str = "orderId";
                    } else {
                        String str5 = this.A03;
                        if (str5 == null) {
                            str = "receiverId";
                        } else {
                            eCPHandler.BN9(new C110326lV((OtcInput) null, str2, str3, str4, str5), loggingContext, num);
                            return;
                        }
                    }
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
