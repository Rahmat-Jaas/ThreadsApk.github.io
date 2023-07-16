package kotlin.jvm.internal;

import X.AnonymousClass00U;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass69P;
import X.AnonymousClass6B7;
import X.AnonymousClass6BI;
import X.AnonymousClass799;
import X.AnonymousClass7Aq;
import X.AnonymousClass7Hr;
import X.C02220Ah;
import X.C04220Ms;
import X.C103976b2;
import X.C103986b3;
import X.C146828mv;
import X.C18170wI;
import X.C18190wL;
import X.C18230wP;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import X.C86154wM;
import X.C89255Cx;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.fbpay.logging.LoggingContext;
import java.util.ArrayList;
import kotlin.Unit;

public class KtLambdaShape0S2310000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S2310000_I2(Object obj, Object obj2, Object obj3, String str, String str2, int i, boolean z) {
        super(1);
        this.A06 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = obj2;
        this.A04 = str2;
        this.A05 = z;
        this.A00 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6B7 r1;
        AnonymousClass6BI r0;
        if (this.A06 != 0) {
            USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = (USLEBaseShape0S0000000) obj;
            C89255Cx r2 = new C89255Cx();
            LoggingContext loggingContext = (LoggingContext) this.A02;
            C86104wH.A1K(r2, loggingContext);
            Iterable<AnonymousClass69P> iterable = (Iterable) this.A00;
            ArrayList A0w = AnonymousClass0wJ.A0w(iterable);
            for (AnonymousClass69P r12 : iterable) {
                switch (C18230wP.A04(r12, 0)) {
                    case 5:
                        r0 = AnonymousClass6BI.CONTACT_INFORMATION;
                        break;
                    case 11:
                        r0 = AnonymousClass6BI.ITEM_LIST;
                        break;
                    case 16:
                        r0 = AnonymousClass6BI.PAYMENT_METHOD;
                        break;
                    case LangUtils.HASH_SEED /*17*/:
                        r0 = AnonymousClass6BI.PAYMENT_RECEIVER;
                        break;
                    case 18:
                        r0 = AnonymousClass6BI.PAY_BUTTON;
                        break;
                    case 20:
                        r0 = AnonymousClass6BI.PRICE_TABLE;
                        break;
                    case 21:
                        r0 = AnonymousClass6BI.PROMO_CODE;
                        break;
                    case 23:
                        r0 = AnonymousClass6BI.SHIPPING_ADDRESS;
                        break;
                    case 24:
                        r0 = AnonymousClass6BI.SHIPPING_OPTIONS;
                        break;
                    case 27:
                        r0 = AnonymousClass6BI.TERMS;
                        break;
                    default:
                        throw C18190wL.A0a(AnonymousClass0wJ.A0t("Invalid component type: ", r12));
                }
                A0w.add(r0);
            }
            r2.A0B(C18170wI.A00(157), A0w);
            r2.A07("is_prewarm", Boolean.valueOf(this.A05));
            String str = this.A03;
            C04220Ms.A0B(str, 0);
            int hashCode = str.hashCode();
            if (hashCode == -2086110754) {
                if (str.equals("PRE_FETCH")) {
                    r1 = AnonymousClass6B7.PRE_FETCH;
                }
                throw C18190wL.A0a(AnonymousClass00U.A0L("Invalid component fetch type: ", str));
            } else if (hashCode != -482433343) {
                if (hashCode == 1804446588 && str.equals("REGULAR")) {
                    r1 = AnonymousClass6B7.REGULAR;
                }
                throw C18190wL.A0a(AnonymousClass00U.A0L("Invalid component fetch type: ", str));
            } else {
                if (str.equals("PRE_WARM")) {
                    r1 = AnonymousClass6B7.PRE_WARM;
                }
                throw C18190wL.A0a(AnonymousClass00U.A0L("Invalid component fetch type: ", str));
            }
            r2.A04(r1, "fetch_type");
            AnonymousClass7Hr.A03(r2, loggingContext);
            C86124wJ.A1K(r2, this.A04);
            C86114wI.A1C(uSLEBaseShape0S0000000, r2);
            C86114wI.A1G(uSLEBaseShape0S0000000, this.A01);
            return uSLEBaseShape0S0000000;
        }
        C146828mv A0Q = C86124wJ.A0Q(obj);
        AnonymousClass799 r02 = (AnonymousClass799) this.A02;
        if (r02 != null) {
            AnonymousClass7Aq.A01(A0Q, r02.A00);
        }
        C146828mv.A00(C103976b2.A07, A0Q, this.A03, C86154wM.A12(this.A00, 5));
        Object obj2 = this.A01;
        if (obj2 != null) {
            C146828mv.A00(C103976b2.A08, A0Q, this.A04, C86154wM.A12(obj2, 6));
        }
        if (!this.A05) {
            A0Q.ChN(C103986b3.A03, Unit.A00);
        }
        return Unit.A00;
    }
}
