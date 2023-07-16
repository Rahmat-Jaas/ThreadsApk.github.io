package X;

import android.content.Context;
import android.os.Bundle;
import android.security.keystore.UserNotAuthenticatedException;
import android.text.TextUtils;
import com.facebook.redex.IDxACallbackShape2S2200000_2_I2;
import com.facebook.redex.IDxFunctionShape326S0100000_2_I2;
import com.facebook.redex.IDxObjectShape133S0200000_2_I2;
import com.fbpay.logging.FBPayLoggerData;
import java.security.GeneralSecurityException;
import java.security.Signature;

/* renamed from: X.583  reason: invalid class name */
public final class AnonymousClass583 extends C62793ak {
    public final Context A00;
    public final C121587Gx A01;
    public final M5J A02;
    public final C880756q A03 = C880756q.A01();
    public final C880756q A04 = C880756q.A01();
    public final C880856r A05 = C880856r.A03();
    public final AnonymousClass7IP A06;
    public final C121157Ek A07;
    public final AnonymousClass7HL A08;
    public final C104996ci A09;

    public static Signature A00(AnonymousClass583 r1, C120967Dk r2) {
        boolean z;
        String message;
        try {
            return AnonymousClass7HL.A01(r1.A08, r2.A01);
        } catch (GeneralSecurityException e) {
            if ((e instanceof UserNotAuthenticatedException) || ((message = e.getMessage()) != null && message.contains("Key user not authenticated"))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            throw e;
        }
    }

    public final void A01() {
        Object obj;
        AnonymousClass7JD r0 = (AnonymousClass7JD) this.A05.A08();
        if (r0 != null && (obj = r0.A01) != null) {
            ((C113936sP) obj).A00();
        }
    }

    public final void A02(C145348kM r8, C107266gT r9, C120967Dk r10, Signature signature) {
        C121597Gy r5;
        Bundle bundle = r9.A01;
        String string = bundle.getString("PAYMENT_TYPE");
        String A002 = AnonymousClass7Hq.A00(bundle);
        int A032 = this.A01.A03(15);
        if (A032 != 0) {
            r8.Bln(new C1373588g(A032));
            return;
        }
        String A022 = AnonymousClass7Hq.A02(bundle);
        if (TextUtils.isEmpty(A022)) {
            A022 = "VERIFY_BIO";
        }
        Bundle A062 = C18180wK.A06();
        string.getClass();
        A062.putString("BUNDLE_KEY_PAYMENT_TYPE", string);
        A002.getClass();
        A062.putString("BUNDLE_KEY_PRIMARY_FLOW_TYPE", A002);
        A062.putString("BUNDLE_KEY_PRIMARY_FLOW_STEP_TYPE", A022);
        if (C18240wQ.A1T(A062, "BUNDLE_KEY_PAYMENT_TYPE") || C18240wQ.A1T(A062, "BUNDLE_KEY_PRIMARY_FLOW_TYPE")) {
            throw C18190wL.A0a("The payment type and the primary flow type should not be null.");
        }
        C104616c4 r6 = new C104616c4(A062);
        if (signature != null) {
            r5 = new C121597Gy(signature);
        } else {
            r5 = null;
        }
        this.A09.A00.A03.execute(new AnonymousClass839(r5, r6, this, r8, r9, r10));
    }

    public final void A03(String str, String str2, Bundle bundle) {
        this.A03.A0G(AnonymousClass7Kx.A09((Object) null));
        Bundle bundle2 = bundle;
        String str3 = str;
        C107266gT A012 = AnonymousClass7BN.A01((FBPayLoggerData) C18240wQ.A0D(bundle2, "logger_data"), str3);
        Bundle bundle3 = A012.A01;
        AnonymousClass7Hq.A03(bundle3, "VERIFY_PIN_TO_DISABLE_PIN_HUB");
        C86154wM.A1C(bundle3, "REVOKE_AUTH_TICKET");
        if (bundle != null) {
            bundle3.putParcelable("logger_data", bundle2.getParcelable("logger_data"));
        }
        AnonymousClass7JD.A03(this.A05, new C113936sP((AnonymousClass6DS) null, (C121597Gy) null, (C109576kE) null, new IDxACallbackShape2S2200000_2_I2(A012, this, str2, str3, 0), A012, this.A09.A00.A03));
    }

    public AnonymousClass583(Context context, AnonymousClass7IP r7, C121157Ek r8, AnonymousClass76O r9, C104996ci r10) {
        int i;
        this.A00 = context;
        this.A07 = r8;
        this.A06 = r7;
        this.A09 = r10;
        this.A01 = new C121587Gx(new C122617Te(context));
        AnonymousClass7HL r4 = r9.A01;
        this.A08 = r4;
        if (!TextUtils.isEmpty("BIO")) {
            i = 46;
        } else if (!TextUtils.isEmpty((CharSequence) null)) {
            throw null;
        } else if (!TextUtils.isEmpty((CharSequence) null)) {
            throw null;
        } else {
            i = 45;
        }
        this.A02 = C86114wI.A0H(C30821GXg.A01(r4.A01.A03(), new IDxObjectShape133S0200000_2_I2(5, new IDxFunctionShape326S0100000_2_I2(r4, i), r4)), this, 5);
    }
}
