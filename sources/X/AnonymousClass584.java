package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.redex.IDxObjectShape308S0100000_2_I2;
import com.facebook.redex.IDxObserverShape99S0200000_2_I2;
import com.facebook.redex.IDxSCallbackShape852S0100000_2_I2;
import com.fbpay.auth.models.PttPayload;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.584  reason: invalid class name */
public final class AnonymousClass584 extends C62793ak {
    public Bundle A00;
    public C120967Dk A01;
    public String A02;
    public final Context A03;
    public final C880756q A04;
    public final C880756q A05 = C880756q.A01();
    public final C880756q A06;
    public final C880856r A07;
    public final C121157Ek A08;
    public final C880856r A09;

    public final void A01() {
        if (!TextUtils.isEmpty(this.A02)) {
            int length = this.A02.length();
            int i = 3;
            if (this.A00.getString("CARD_INFO", "").toLowerCase(Locale.US).contains("american express")) {
                i = 4;
            }
            if (length == i) {
                A00(this);
            }
        }
    }

    public final void A02(Bundle bundle) {
        this.A00 = bundle;
        Bundle A062 = C18180wK.A06();
        A062.putString("BUNDLE_KEY_PAYMENT_TYPE", C18190wL.A0j(this.A00, "PAYMENT_TYPE"));
        String A002 = AnonymousClass7Hq.A00(this.A00);
        A002.getClass();
        A062.putString("BUNDLE_KEY_PRIMARY_FLOW_TYPE", A002);
        String A022 = AnonymousClass7Hq.A02(this.A00);
        A022.getClass();
        A062.putString("BUNDLE_KEY_PRIMARY_FLOW_STEP_TYPE", A022);
        if (!C18240wQ.A1T(this.A00, AnonymousClass00U.A0R("AUTH_FLOW_UTIL_AUTH_FLOW", "#", 2)) && !TextUtils.isEmpty(AnonymousClass7Hq.A01(this.A00))) {
            A062.putString("BUNDLE_KEY_SECONDARY_FLOW_TYPE", this.A00.getString(AnonymousClass00U.A0R("AUTH_FLOW_UTIL_AUTH_FLOW", "#", 2)));
            A062.putString("BUNDLE_KEY_SECONDARY_FLOW_STEP_TYPE", AnonymousClass7Hq.A01(this.A00));
        }
        C880856r r1 = this.A07;
        if (C18240wQ.A1T(A062, "BUNDLE_KEY_PAYMENT_TYPE") || C18240wQ.A1T(A062, "BUNDLE_KEY_PRIMARY_FLOW_TYPE")) {
            throw C18190wL.A0a("The payment type and the primary flow type should not be null.");
        }
        r1.A0H(new C104616c4(A062));
    }

    public final boolean A03() {
        Bundle bundle = this.A00;
        bundle.getClass();
        return "PAYPAL_ACCESS_TOKEN".equalsIgnoreCase(C18190wL.A0j(bundle, "AUTH_METHOD_TYPE"));
    }

    public AnonymousClass584(Context context, C121157Ek r8) {
        C880756q A012 = C880756q.A01();
        this.A06 = A012;
        C880756q A013 = C880756q.A01();
        this.A04 = A013;
        this.A07 = C880856r.A03();
        C880856r A032 = C880856r.A03();
        this.A09 = A032;
        this.A08 = r8;
        this.A03 = context;
        M5J A022 = C30821GXg.A02(A032, new IDxObjectShape308S0100000_2_I2((Object) this, 7));
        C880856r.A05(A022, A013, this, 191);
        A022.A0E(new IDxObserverShape99S0200000_2_I2(A022, (C143158gC) C86114wI.A0Q(this, 192), 27));
        C880856r.A05(A022, A012, this, 193);
    }

    public static void A00(AnonymousClass584 r15) {
        String str;
        PttPayload pttPayload;
        String str2;
        String str3;
        String str4;
        try {
            AnonymousClass7HL A002 = AnonymousClass76O.A00();
            if (r15.A03()) {
                str = "PAYPAL_ACCESS_TOKEN";
            } else {
                str = "CSC";
            }
            C120967Dk A052 = A002.A05(str, AnonymousClass7BO.A01(r15.A00));
            C880856r r2 = r15.A09;
            AnonymousClass7HL A003 = AnonymousClass76O.A00();
            String A004 = AnonymousClass7BO.A00(r15.A00);
            boolean A032 = r15.A03();
            String A005 = C1198677j.A00();
            String packageName = r15.A03.getPackageName();
            String str5 = r15.A02;
            str5.getClass();
            Bundle bundle = r15.A00;
            if (A032) {
                if (bundle != null) {
                    str4 = bundle.getString("CREDENTIAL_ID");
                } else {
                    str4 = null;
                }
                pttPayload = PttPayload.byPayPal(A005, packageName, str5, str4, A052.A07, AnonymousClass7BO.A01(r15.A00));
            } else {
                if (bundle != null) {
                    str3 = bundle.getString("CREDENTIAL_ID");
                } else {
                    str3 = null;
                }
                str3.getClass();
                pttPayload = PttPayload.byCsc(A005, packageName, str5, str3, A052.A07, AnonymousClass7BO.A01(r15.A00));
            }
            HashSet A0u = C18200wM.A0u();
            Collections.addAll(A0u, new C120967Dk[]{A052});
            Bundle bundle2 = r15.A00;
            if (bundle2 != null) {
                str2 = bundle2.getString("PAYMENT_ACCOUNT_ID");
            } else {
                str2 = null;
            }
            r2.A0H(C120977Dl.A00(new IDxSCallbackShape852S0100000_2_I2(A003, 1), pttPayload, A004, str2, (String) null, (String) null, (String) null, C121257Ff.A00(r15.A00), A0u));
            r15.A01 = A052;
        } catch (IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException e) {
            r15.A06.A0H(e);
        }
    }
}
