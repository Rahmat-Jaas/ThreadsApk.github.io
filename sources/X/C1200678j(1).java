package X;

import android.net.Uri;
import android.os.Looper;
import com.facebook.android.instantexperiences.jscall.InstantExperienceGenericErrorResult;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.78j  reason: invalid class name and case insensitive filesystem */
public abstract class C1200678j {
    public final C91225fq A00;
    public final AnonymousClass7H6 A01;

    public static void A00(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall, C1200678j r7) {
        String str = instantExperiencesJSBridgeCall.A02;
        C91225fq r5 = r7.A00;
        String url = r5.getUrl();
        if (!AnonymousClass7CU.A00(str) && !AnonymousClass7CU.A00(url)) {
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(url);
            if (parse != null && parse2 != null && !AnonymousClass7CU.A00(parse.getScheme()) && parse.getScheme().equals(parse2.getScheme()) && parse.getPort() == parse2.getPort() && !AnonymousClass7CU.A00(parse.getAuthority()) && parse.getAuthority().equals(parse2.getAuthority())) {
                InstantExperiencesCallResult instantExperiencesCallResult = instantExperiencesJSBridgeCall.A00;
                if (AnonymousClass7CU.A00(instantExperiencesCallResult.A01)) {
                    throw C18250wR.A0V("Invalid state: Missing or invalid callback handler name");
                } else if (!AnonymousClass7CU.A00(instantExperiencesCallResult.A00)) {
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s", instantExperiencesCallResult.A03.toArray());
                    String A002 = new C112646px(instantExperiencesCallResult.A01, instantExperiencesCallResult.A00, formatStrLocaleSafe, C18220wO.A1U(instantExperiencesCallResult.A02)).A00();
                    if (!AnonymousClass7CU.A00(A002)) {
                        r5.A00(A002);
                        return;
                    }
                    throw C18250wR.A0V("Could not construct JS callback string");
                } else {
                    throw C18250wR.A0V("Invalid state: Missing callback id");
                }
            }
        }
    }

    public void A01(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        if (instantExperiencesJSBridgeCall.A00 == null) {
            instantExperiencesJSBridgeCall.A03(new InstantExperienceGenericErrorResult(C972168k.INTERNAL_ERROR));
            AnonymousClass0LU.A0P("InstantExperiencesJSBridgeCallHandler", "Result missing for call id: %s", instantExperiencesJSBridgeCall.A01());
        }
        this.A01.A04(instantExperiencesJSBridgeCall, new AnonymousClass89W(instantExperiencesJSBridgeCall.A00.A02, this));
        if (Looper.myLooper() == Looper.getMainLooper()) {
            A00(instantExperiencesJSBridgeCall, this);
        } else {
            AnonymousClass0wJ.A0F().post(new AnonymousClass80R(instantExperiencesJSBridgeCall, this));
        }
    }

    public void A02(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        AnonymousClass7H6 r1 = this.A01;
        AnonymousClass32J A002 = AnonymousClass7H6.A00(instantExperiencesJSBridgeCall.A01);
        synchronized (A002) {
        }
        synchronized (A002) {
        }
        synchronized (r1.A00) {
        }
        instantExperiencesJSBridgeCall.A02();
    }

    public C1200678j(C91225fq r1, AnonymousClass7H6 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
