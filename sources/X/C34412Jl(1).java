package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Jl  reason: invalid class name and case insensitive filesystem */
public final class C34412Jl {
    public static Fragment A00(Context context, AnonymousClass25S r6, UserSession userSession, String str, String str2, String str3, boolean z, boolean z2) {
        Fragment r0;
        C18180wK.A1S(r6, context, userSession);
        Bundle A06 = C18180wK.A06();
        A06.putString("ARG_RAGESHAKE_BOTTOM_SHEET_AD_ID", str);
        A06.putBoolean("ARG_RAGESHAKE_BOTTOM_SHEET_MANUAL_REPORT_FROM_HELP_SETTING", z);
        A06.putBoolean("ARG_RAGESHAKE_BOTTOM_SHEET_REPORT_FROM_LONG_PRESS", false);
        A06.putBoolean("ARG_RAGESHAKE_DISMISSED_PREVIOUS_VIEWS", z2);
        A06.putString("ARG_SCREEN_FROM", str2);
        A06.putString("ARG_NAV_CHAIN", str3);
        A06.putSerializable("ARG_BOTTOM_SHEET_BUG_REPORT_SOURCE", r6);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36321889882217551L)) {
            long A062 = C18230wP.A06();
            long j = AnonymousClass0Jc.A00(context).A00;
            new AnonymousClass3EX(userSession).A00(C319229m.FALLBACK_ELIGIBILITY_CHECK);
            if (C61433Tk.A00(j, A062) != AnonymousClass006.A00) {
                r0 = new C23641ev();
                r0.setArguments(A06);
                return r0;
            }
        }
        r0 = new AnonymousClass1wA();
        r0.setArguments(A06);
        return r0;
    }
}
