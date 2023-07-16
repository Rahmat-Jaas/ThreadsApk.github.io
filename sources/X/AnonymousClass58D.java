package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.redex.IDxObjectShape308S0100000_2_I2;
import com.facebook.redex.IDxObserverShape99S0200000_2_I2;
import com.facebook.redex.IDxSCallbackShape852S0100000_2_I2;
import com.fbpay.auth.models.PttPayload;
import com.fbpay.util.boundresources.IDxBResourceShape1S1200000_2_I2;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.58D  reason: invalid class name */
public final class AnonymousClass58D extends C62793ak {
    public static final Set A0B;
    public Bundle A00;
    public C120967Dk A01;
    public C120967Dk A02;
    public String A03;
    public final Context A04;
    public final C880756q A05;
    public final C880756q A06 = C880756q.A01();
    public final C880756q A07;
    public final C880856r A08;
    public final C880856r A09;
    public final C121157Ek A0A;

    public static boolean A00(AnonymousClass58D r2) {
        if ("CONFIRM_PIN".equalsIgnoreCase(AnonymousClass7Hq.A02(r2.A00)) || "CONFIRM_PIN".equalsIgnoreCase(AnonymousClass7Hq.A01(r2.A00))) {
            return true;
        }
        return false;
    }

    public final void A02(Bundle bundle, C120967Dk r10) {
        this.A00 = bundle;
        this.A02 = r10;
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
        C880856r r1 = this.A08;
        if (C18240wQ.A1T(A062, "BUNDLE_KEY_PAYMENT_TYPE") || C18240wQ.A1T(A062, "BUNDLE_KEY_PRIMARY_FLOW_TYPE")) {
            throw C18190wL.A0a("The payment type and the primary flow type should not be null.");
        }
        r1.A0H(new C104616c4(A062));
    }

    public final void A03(String str) {
        this.A03 = str;
        this.A07.A0G((Object) null);
        if (!A04() && !TextUtils.isEmpty(str) && str.length() == 4) {
            A01();
        }
    }

    public final boolean A04() {
        if ("RECOVER_PIN".equalsIgnoreCase(AnonymousClass7Hq.A01(this.A00)) || "RECOVER_PIN".equalsIgnoreCase(AnonymousClass7Hq.A02(this.A00))) {
            return true;
        }
        return false;
    }

    public final boolean A05() {
        if (TextUtils.isEmpty(AnonymousClass7Hq.A01(this.A00))) {
            String A022 = AnonymousClass7Hq.A02(this.A00);
            A022.getClass();
            if (!"VERIFY_PIN".equalsIgnoreCase(A022)) {
                return false;
            }
            return true;
        }
        return false;
    }

    static {
        HashSet A0u = C18200wM.A0u();
        A0u.add("CREATE_PIN");
        A0u.add("CONFIRM_PIN");
        A0u.add("VERIFY_PIN");
        A0B = A0u;
    }

    public AnonymousClass58D(Context context, C121157Ek r8) {
        C880756q A012 = C880756q.A01();
        this.A07 = A012;
        C880756q A013 = C880756q.A01();
        this.A05 = A013;
        this.A08 = C880856r.A03();
        C880856r A032 = C880856r.A03();
        this.A09 = A032;
        this.A0A = r8;
        this.A04 = context;
        M5J A022 = C30821GXg.A02(A032, new IDxObjectShape308S0100000_2_I2((Object) this, 8));
        C880856r.A05(A022, A013, this, 198);
        A022.A0E(new IDxObserverShape99S0200000_2_I2(A022, (C143158gC) C86114wI.A0Q(this, 199), 27));
        C880856r.A05(A022, A012, this, 200);
    }

    public final void A01() {
        C120967Dk[] r0;
        HashSet A0u;
        String str;
        C880756q r3;
        Object r1;
        if (!A04()) {
            if (A00(this)) {
                String str2 = this.A03;
                str2.getClass();
                if (!str2.equals(C18190wL.A0j(this.A00, "AUTH_FLOW_UTIL_PIN_ENTERED"))) {
                    r3 = this.A07;
                    r1 = C18190wL.A0a("Pin did not match");
                }
            } else if ("CREATE_PIN".equalsIgnoreCase(AnonymousClass7Hq.A01(this.A00)) || "CREATE_PIN".equalsIgnoreCase(AnonymousClass7Hq.A02(this.A00))) {
                Bundle A062 = C18180wK.A06();
                String str3 = this.A03;
                str3.getClass();
                A062.putString("AUTH_FLOW_UTIL_PIN_ENTERED", str3);
                r3 = this.A06;
                r1 = new AnonymousClass7JD(AnonymousClass7Kx.A0A(new AnonymousClass79P((Object) null, A062)));
            } else if (!"VERIFY_PIN".equalsIgnoreCase(AnonymousClass7Hq.A02(this.A00))) {
                return;
            }
            try {
                C120967Dk A052 = AnonymousClass76O.A00().A05("PIN", AnonymousClass7BO.A01(this.A00));
                String A002 = C1198677j.A00();
                String packageName = this.A04.getPackageName();
                String str4 = this.A03;
                str4.getClass();
                PttPayload byPin = PttPayload.byPin(A002, packageName, str4, A052.A07, AnonymousClass7BO.A01(this.A00));
                C880856r r32 = this.A09;
                AnonymousClass7HL A003 = AnonymousClass76O.A00();
                String A004 = AnonymousClass7BO.A00(this.A00);
                C120967Dk r02 = this.A02;
                if (r02 != null) {
                    r0 = new C120967Dk[]{A052, r02};
                    A0u = C18200wM.A0u();
                } else {
                    r0 = new C120967Dk[]{A052};
                    A0u = C18200wM.A0u();
                }
                Collections.addAll(A0u, r0);
                Bundle bundle = this.A00;
                if (bundle != null) {
                    str = bundle.getString("PAYMENT_ACCOUNT_ID");
                } else {
                    str = null;
                }
                r32.A0G(C120977Dl.A00(new IDxSCallbackShape852S0100000_2_I2(A003, 1), byPin, A004, str, (String) null, (String) null, (String) null, C121257Ff.A00(this.A00), A0u));
                this.A01 = A052;
                return;
            } catch (IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException e) {
                this.A07.A0G(e);
                return;
            }
        } else if (TextUtils.isEmpty(this.A03)) {
            r3 = this.A07;
            r1 = C18190wL.A0a("Field can not be empty");
        } else {
            C121157Ek r2 = this.A0A;
            String str5 = this.A03;
            this.A00.getString("PAYMENT_TYPE").getClass();
            M5J A032 = new IDxBResourceShape1S1200000_2_I2(r2.A01, r2, C121257Ff.A00(this.A00), str5, 2).A03();
            this.A06.A0K(A032, C86164wN.A0O(A032, this, 18));
            return;
        }
        r3.A0G(r1);
    }
}
