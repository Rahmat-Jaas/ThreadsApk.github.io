package X;

import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebookpay.expresscheckout.models.AuthScreenStyle;
import com.facebookpay.expresscheckout.models.EcpNuxLearnMoreScreenStyle;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.ItemDetails;

/* renamed from: X.69R  reason: invalid class name */
public enum AnonymousClass69R {
    A0C("ECP_DEFAULT_PUX", 0, 2131826638, 0, 2131826488, 1534, false, false, false),
    A0A("ECP_DEFAULT_NUX", 1, 0, 0, 2131826488, 1535, false, false, false),
    A0D("ECP_DEFAULT_PUX_TO_NUX", 2, 0, 2131826385, 2131826488, 1515, false, false, false),
    A0E("ECP_DEFAULT_SELECTION", 3, 0, 2131826385, 0, 2027, false, false, false),
    A09("ECP_DEFAULT_FORM", 4, 0, 2131826385, 0, 2027, false, false, false),
    A0F("ECP_DEFAULT_TERMS", 5, 0, 0, 0, 2047, false, false, false),
    A0B("ECP_DEFAULT_PROMO", 6, 0, 2131826385, 0, 2027, false, false, false),
    A0Z("ECP_URL_LOADING", 7, 0, 2131826385, 0, 2027, false, false, false),
    A0G("ECP_FB_OFFSITE_FBPAY", 8, 2131826512, 2131826541, 2131826488, 490, false, false, true),
    A0I("ECP_FB_OFFSITE_METAPAY", 9, 0, 0, 2131826488, 509, false, false, true),
    A0J("ECP_FB_OFFSITE_METAPAY_CANCEL_CHECKOUT_REWORD", 10, 0, 0, 2131826359, 509, false, false, true),
    A0T("ECP_IG_OFFSITE_FBPAY", 11, 2131826512, 2131826385, 0, 1002, false, false, true),
    A0V("ECP_IG_OFFSITE_METAPAY", 12, 0, 2131826385, 0, 1001, false, false, true),
    A0H("ECP_FB_OFFSITE_METACHECKOUT", 13, 2131826453, 0, 2131826488, 510, false, false, true),
    A0K("ECP_FB_OFFSITE_NUX_TO_PUX", 14, 2131826453, 2131826385, 2131826488, 490, false, false, true),
    A0U("ECP_IG_OFFSITE_METACHECKOUT", 15, 2131826453, 2131826385, 0, 1002, false, false, true),
    A0Q("ECP_IG_DEFAULT", 16, 2131826638, 2131826385, 0, 1002, false, false, true),
    A0R("ECP_IG_DEFAULT_NUX", 17, 2131826542, 2131826385, 0, 1002, false, false, true),
    A0W("ECP_IG_PUX_TO_NUX", 18, 0, 2131826385, 0, 1003, false, false, true),
    A0X("ECP_IG_SELECTION", 19, 0, 2131826385, 0, 1003, false, false, true),
    A0S("ECP_IG_FORM", 20, 0, 2131826385, 0, 1003, false, false, true),
    A0Y("ECP_IG_URL_LOADING", 21, 2131826638, 2131826385, 0, 1002, false, false, true),
    A0N("ECP_IAP_NUX", 22, 2131826453, 0, 2131826488, 1526, true, false, false),
    A0O("ECP_IAP_PUX", 23, 2131826453, 0, 2131826488, 1526, true, false, false),
    A0P("ECP_IAP_PUX_TO_NUX", 24, 2131826453, 2131826385, 0, 1898, false, true, false),
    A0M("ECP_IAP_INTERSTITIAL", 25, 0, 0, 2131826488, HttpStatus.SC_NOT_IMPLEMENTED, true, false, true),
    A0L("ECP_IAP_ALTERNATIVE_CHECKOUT", 26, 0, 2131826385, 0, 1003, false, false, true);
    
    public AnonymousClass697 A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass697 A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public static EcpUIConfiguration A00() {
        AnonymousClass69R r2 = A0Q;
        return new EcpUIConfiguration((AuthScreenStyle) null, r2, r2, A0W, A0X, A0S, A0Z, A0C, (EcpNuxLearnMoreScreenStyle) null, new ItemDetails(AnonymousClass006.A00, (String) null));
    }
}
