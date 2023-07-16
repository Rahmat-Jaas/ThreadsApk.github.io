package X;

import android.os.SystemClock;
import com.fbpay.logging.FBPayLoggerData;
import java.util.HashMap;

/* renamed from: X.7ku  reason: invalid class name and case insensitive filesystem */
public final class C129037ku implements C143718hC {
    public final /* synthetic */ FBPayLoggerData A00;
    public final /* synthetic */ AnonymousClass786 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public C129037ku(FBPayLoggerData fBPayLoggerData, AnonymousClass786 r2, String str, boolean z) {
        this.A01 = r2;
        this.A03 = z;
        this.A02 = str;
        this.A00 = fBPayLoggerData;
    }

    public final /* bridge */ /* synthetic */ void CRe(Object obj) {
        String str;
        AnonymousClass786 r6 = this.A01;
        Throwable th = ((AnonymousClass7EC) obj).A02;
        boolean A1U = C18220wO.A1U(th);
        boolean z = this.A03;
        String str2 = this.A02;
        FBPayLoggerData fBPayLoggerData = this.A00;
        long elapsedRealtime = SystemClock.elapsedRealtime() - r6.A00;
        if (A1U) {
            if (z) {
                str = "fetch_auth_flows_cached_content_success";
            } else {
                str = "fetch_auth_flows_content_success";
            }
        } else if (z) {
            str = "fetch_auth_flows_cached_content_fail";
        } else {
            str = "fetch_auth_flows_content_fail";
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("logger_data", fBPayLoggerData);
        if (th != null) {
            A0y.put("throwable", th);
        }
        if (elapsedRealtime != 0) {
            A0y.put("data_fetch_duration", Long.valueOf(elapsedRealtime));
        }
        A0y.put("product", str2);
        r6.A01.Bb8(str, A0y);
    }
}
