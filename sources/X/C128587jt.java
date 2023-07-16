package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.fbpay.logging.FBPayLoggerData;
import com.fbpay.logging.LoggingContext;

/* renamed from: X.7jt  reason: invalid class name and case insensitive filesystem */
public final class C128587jt implements C145868lF {
    public final AnonymousClass57F A00;

    public final C120967Dk ArH() {
        throw C18180wK.A0a("Should not be called");
    }

    public final void BzY(Bundle bundle, C120967Dk r4) {
        AnonymousClass7JD.A03(this.A00.A02, new AnonymousClass79P(r4, bundle));
    }

    public final void BzZ(Throwable th) {
        AnonymousClass7JD.A03(this.A00.A01, th);
    }

    public C128587jt(Bundle bundle, AnonymousClass57F r12) {
        String A002;
        String str;
        this.A00 = r12;
        LoggingContext loggingContext = (LoggingContext) bundle.getParcelable("logging_context");
        if (loggingContext != null) {
            A002 = loggingContext.A02;
        } else {
            A002 = ((FBPayLoggerData) C18240wQ.A0D(bundle, "logger_data")).A00();
            A002.getClass();
        }
        LoggingContext loggingContext2 = (LoggingContext) bundle.getParcelable("logging_context");
        if (loggingContext2 != null) {
            str = String.valueOf(loggingContext2.A00);
        } else {
            str = ((FBPayLoggerData) C18240wQ.A0D(bundle, "logger_data")).A02;
        }
        String userId = AnonymousClass7Kz.A0E().A01.getUserId();
        AnonymousClass7Kz.A0E();
        String A0j = C18190wL.A0j(bundle, "THREE_DS_URL");
        String A0j2 = C18190wL.A0j(bundle, "NONCE");
        String A0h = AnonymousClass00U.A0h("{'user_id':'", userId, "','universe':'", "instagram", "'}");
        StringBuilder A0s = C18190wL.A0s("nonce=");
        A0s.append(A0j2);
        A0s.append("&return_method=");
        A0s.append("app_url");
        A0s.append("&app_url=");
        A0s.append(Base64.encodeToString("https://www.ecpthreeds.com".getBytes(), 2).replaceAll("=", ""));
        A0s.append("&session_id=");
        A0s.append(A002);
        A0s.append("&payment_type=");
        A0s.append("ecp");
        A0s.append("&context=");
        A0s.append(Base64.encodeToString(A0h.getBytes(), 2).replaceAll("=", ""));
        if (!TextUtils.isEmpty(str)) {
            A0s.append("&product_id=");
            A0s.append(str);
        }
        String obj = A0s.toString();
        bundle.putString("WEB_VIEW_URL", !TextUtils.isEmpty(obj) ? AnonymousClass00U.A0V(A0j, "?", obj) : A0j);
        bundle.putStringArray("WEB_VIEW_ALLOWED_INTERCEPT_URLS", new String[]{"https://www.ecpthreeds.com"});
        AnonymousClass7JD.A03(r12.A00, new AnonymousClass79P("AUTH_THREE_DS", new Bundle(bundle)));
    }
}
