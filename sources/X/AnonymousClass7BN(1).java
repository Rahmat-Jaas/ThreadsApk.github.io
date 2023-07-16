package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.fbpay.logging.FBPayLoggerData;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.7BN  reason: invalid class name */
public final class AnonymousClass7BN {
    public static C107266gT A02(String str, String str2, String str3, String str4, List list) {
        Bundle A06 = C18180wK.A06();
        String str5 = str;
        A06.putString("PAYMENT_TYPE", str);
        String str6 = str2;
        A06.putString("PAYMENT_LOGGING_ID", str2);
        if (!TextUtils.isEmpty((CharSequence) null)) {
            A06.putString("PAYMENT_ACCOUNT_ID", (String) null);
        }
        C86154wM.A1D(A06, list);
        HashSet A0u = C18200wM.A0u();
        C86154wM.A1E(A06, new FBPayLoggerData(str6, str5, str3, str4, str2, (String) null, C86104wH.A13(A0u, A0u)));
        return new C107266gT(A06);
    }

    public static C107266gT A00(Bundle bundle, C115406v0 r4, String str) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString("AUTH_METHOD_TYPE", r4.A00);
        AnonymousClass7Hq.A03(bundle2, str);
        String str2 = r4.A02;
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("CREDENTIAL_ID", str2);
        }
        String str3 = r4.A01;
        if (!TextUtils.isEmpty(str3)) {
            bundle2.putString("PAYPAL_LOGIN_URL", str3);
        }
        String str4 = r4.A03;
        if (!TextUtils.isEmpty(str4)) {
            bundle2.putString("PAYPAL_HIDDEN_EMAIL", str4);
        }
        String str5 = r4.A06;
        if (!TextUtils.isEmpty(str5)) {
            bundle2.putString("CARD_INFO", str5);
        }
        String str6 = r4.A04;
        if (!TextUtils.isEmpty(str6)) {
            bundle2.putString("NONCE", str6);
        }
        String str7 = r4.A05;
        if (!TextUtils.isEmpty(str7)) {
            bundle2.putString("THREE_DS_URL", str7);
        }
        return new C107266gT(bundle2);
    }

    public static C107266gT A01(FBPayLoggerData fBPayLoggerData, String str) {
        Bundle A06 = C18180wK.A06();
        A06.putString("AUTH_METHOD_TYPE", "PIN");
        A06.putString("PAYMENT_TYPE", str);
        C86154wM.A1E(A06, fBPayLoggerData);
        return new C107266gT(A06);
    }
}
