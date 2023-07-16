package com.facebook.redex;

import X.AnonymousClass583;
import X.AnonymousClass58U;
import X.AnonymousClass69R;
import X.AnonymousClass7BD;
import X.AnonymousClass7H3;
import X.AnonymousClass7Hq;
import X.AnonymousClass7I8;
import X.AnonymousClass7Ic;
import X.AnonymousClass7Kx;
import X.AnonymousClass7Kz;
import X.AnonymousClass8XQ;
import X.C04220Ms;
import X.C107266gT;
import X.C116986xw;
import X.C117026y0;
import X.C1203179r;
import X.C120967Dk;
import X.C120977Dl;
import X.C121157Ek;
import X.C121257Ff;
import X.C123967a9;
import X.C143158gC;
import X.C143688h9;
import X.C18180wK;
import X.C18200wM;
import X.C18240wQ;
import X.C86104wH;
import X.C86134wK;
import X.C880756q;
import X.C92885kB;
import X.M5J;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.fbpay.auth.models.PttPayload;
import com.fbpay.logging.FBPayLoggerData;
import com.fbpay.logging.LoggingContext;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class IDxObserverShape24S1200000_2_I2 implements C143158gC {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxObserverShape24S1200000_2_I2(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = str;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C143688h9 r2;
        Map unmodifiableMap;
        String str;
        Object obj2;
        String str2;
        C880756q r4;
        Object obj3 = obj;
        switch (this.A03) {
            case 0:
                AnonymousClass7Kx r22 = (AnonymousClass7Kx) obj3;
                if (AnonymousClass7Kx.A0R(r22)) {
                    r4 = (C880756q) this.A01;
                    if (AnonymousClass7Kx.A0R(C86104wH.A0R(r4))) {
                        C1203179r r5 = (C1203179r) AnonymousClass7Kx.A0D(C86104wH.A0R(r4));
                        List A012 = AnonymousClass7BD.A01(this.A02, r5.A02, AnonymousClass8XQ.A00);
                        List list = r5.A04;
                        List list2 = r5.A03;
                        List list3 = r5.A01;
                        AnonymousClass7Kx.A0I(r4, new C1203179r(r5.A00, (String) null, r5.A06, A012, list, list2, list3, r5.A08, r5.A07));
                    }
                } else if (AnonymousClass7Kx.A0O(r22)) {
                    r4 = (C880756q) this.A01;
                } else {
                    return;
                }
                r4.A0J((M5J) this.A00);
                return;
            case 1:
                AnonymousClass7Kx r23 = (AnonymousClass7Kx) obj3;
                if (AnonymousClass7Kx.A0R(r23) && (obj2 = r23.A01) != null) {
                    C04220Ms.A06(AnonymousClass7Kz.A05().A0H.get());
                    AnonymousClass58U r1 = (AnonymousClass58U) this.A01;
                    ECPPaymentRequest eCPPaymentRequest = r1.A01;
                    if (eCPPaymentRequest == null) {
                        str2 = "ecpPaymentRequest";
                    } else {
                        LoggingContext loggingContext = r1.A02;
                        if (loggingContext == null) {
                            str2 = "loggingContext";
                        } else {
                            String str3 = this.A02;
                            AnonymousClass7H3.A01(AnonymousClass7I8.A01(eCPPaymentRequest, AnonymousClass69R.A0Z, loggingContext, (String) obj2, str3, new String[]{"https://www.instagram.com/payments/paypal_close/"}), (Fragment) this.A00, "ecp_container_fragment", true, false);
                            return;
                        }
                    }
                    C04220Ms.A0E(str2);
                    throw null;
                }
                return;
            case 2:
                AnonymousClass7Kx r24 = (AnonymousClass7Kx) obj3;
                boolean A0R = AnonymousClass7Kx.A0R(r24);
                AnonymousClass583 r42 = (AnonymousClass583) this.A00;
                if (A0R) {
                    String str4 = this.A02;
                    Object obj4 = r24.A01;
                    obj4.getClass();
                    C120967Dk r25 = (C120967Dk) obj4;
                    Bundle bundle = (Bundle) this.A01;
                    Bundle A06 = C18180wK.A06();
                    A06.putString("AUTH_METHOD_TYPE", "BIO");
                    A06.putString("PAYMENT_TYPE", str4);
                    A06.putParcelable("logger_data", (FBPayLoggerData) C18240wQ.A0D(bundle, "logger_data"));
                    C107266gT r11 = new C107266gT(A06);
                    Bundle bundle2 = r11.A01;
                    AnonymousClass7Hq.A03(bundle2, "VERIFY_BIO_TO_DISABLE_BIO_HUB");
                    if (bundle != null) {
                        bundle2.putParcelable("logger_data", bundle.getParcelable("logger_data"));
                    }
                    String str5 = r25.A06;
                    PttPayload deleteBio = PttPayload.deleteBio(str5);
                    AnonymousClass7Kz.A07().A07.Bb8("fbpay_remove_biometric", C121257Ff.A00(bundle2));
                    C121157Ek r6 = r42.A07;
                    HashSet A0u = C18200wM.A0u();
                    Collections.addAll(A0u, new C120967Dk[]{r25});
                    IDxSCallbackShape308S0200000_2_I2 iDxSCallbackShape308S0200000_2_I2 = new IDxSCallbackShape308S0200000_2_I2(0, r42, r11);
                    M5J A04 = r6.A04(new C120977Dl(C116986xw.A00(iDxSCallbackShape308S0200000_2_I2, Collections.unmodifiableSet(A0u)), deleteBio, "REVOKE_AUTH_TICKET", C86134wK.A0n(bundle2), (String) null, (String) null, (String) null, C121257Ff.A00(bundle2), Collections.unmodifiableSet(A0u)), str4, str5);
                    r42.A03.A0K(A04, new C123967a9(bundle, A04, r42, r25, str4));
                    return;
                }
                r42.A03.A0G(AnonymousClass7Kx.A05(r24, C18180wK.A0X()));
                return;
            case 3:
                AnonymousClass7Ic r62 = (AnonymousClass7Ic) this.A00;
                C107266gT r12 = (C107266gT) this.A01;
                String str6 = this.A02;
                AnonymousClass7Kx r26 = (AnonymousClass7Kx) obj3;
                if (!AnonymousClass7Kx.A0P(r26)) {
                    Throwable th = r26.A02;
                    if (!(th instanceof C92885kB)) {
                        Map A013 = C121257Ff.A01(r12.A01);
                        A013.put("DYNAMIC_AUTH_AUTH_TYPES", Collections.unmodifiableList(r62.A05));
                        A013.put("DYNAMIC_AUTH_OPERATION_NAME", str6);
                        if (AnonymousClass7Kx.A0R(r26)) {
                            r2 = AnonymousClass7Kz.A07().A07;
                            unmodifiableMap = Collections.unmodifiableMap(A013);
                            str = "client_load_dynamic_auth_success";
                        } else if (AnonymousClass7Kx.A0O(r26)) {
                            r2 = AnonymousClass7Kz.A07().A07;
                            A013.put("DYNAMIC_AUTH_ERROR_MESSAGE", C117026y0.A01(th));
                            A013.put("DYNAMIC_AUTH_ERROR_CODE", Integer.valueOf(C117026y0.A00(th)));
                            unmodifiableMap = Collections.unmodifiableMap(A013);
                            str = "client_load_dynamic_auth_fail";
                        } else {
                            return;
                        }
                        r2.Bb8(str, unmodifiableMap);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
