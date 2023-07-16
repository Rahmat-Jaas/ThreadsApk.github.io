package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape0S0900000_I2;

/* renamed from: X.61W  reason: invalid class name */
public final class AnonymousClass61W extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61W(C697249u r7) {
        super("zero_day_language_signal_extract", 2118577885, 5, true, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        String str;
        C697249u r0 = this.A00;
        Context context = r0.A05;
        UserSession userSession = r0.A06;
        boolean A1Z = AnonymousClass0wJ.A1Z(context, userSession);
        C1197876x r4 = (C1197876x) userSession.A01(C1197876x.class, new KtLambdaShape0S0900000_I2(context, new C99016Hu(), new C99026Hv(), userSession, C86124wJ.A13(userSession, 5), C86124wJ.A13(C86124wJ.A13(userSession, 2), 7), C86124wJ.A13(C86124wJ.A13(userSession, 3), 4), AnonymousClass0OY.A02(AnonymousClass8GV.A00), C86124wJ.A13(userSession, 6), A1Z ? 1 : 0));
        C07810cE r3 = r4.A04.A00;
        if (r3 != null && r3.ATr(36321615004310469L) == A1Z) {
            String str2 = r4.A07;
            System.currentTimeMillis();
            C104806cP r02 = r4.A03;
            C146758mo r5 = r4.A06;
            QuickPerformanceLogger quickPerformanceLogger = r02.A00;
            quickPerformanceLogger.markerStart(966997352);
            try {
                StringBuilder A0s = C18190wL.A0s("zero_day_language_first_upload_attempt_timestamp_");
                A0s.append(str2);
                A0s.append('_');
                String A0v = C86144wL.A0v(A0s, 0);
                C04220Ms.A0B(A0v, 0);
                ((C128017iD) r5).A00.getLong(A0v, -1);
                String A0S = AnonymousClass00U.A0S("more than ", " days passed since first upload attempt", 0);
                if (A0S != null) {
                    quickPerformanceLogger.markerAnnotate(966997352, "success_reason", A0S);
                }
                quickPerformanceLogger.markerEnd(966997352, 2);
            } catch (Exception e) {
                Throwable cause = e.getCause();
                if (cause == null || (str = cause.getMessage()) == null) {
                    str = e.getMessage();
                }
                quickPerformanceLogger.markerAnnotate(966997352, TraceFieldType.FailureReason, str);
                quickPerformanceLogger.markerEnd(966997352, 3);
            }
        }
    }
}
