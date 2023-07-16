package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.6ql  reason: invalid class name and case insensitive filesystem */
public final class C113116ql {
    public AnonymousClass3TR A00;
    public K6u A01;
    public final Context A02;
    public final L3B A03;
    public final L3B A04;
    public final AnonymousClass4x8 A05;
    public final UserSession A06;
    public final C04530Oa A07 = C86104wH.A16(this, 20);
    public final C04530Oa A08 = C86104wH.A16(this, 21);
    public final C04530Oa A09 = C86104wH.A16(this, 22);
    public final C04530Oa A0A = C86104wH.A16(this, 23);

    public C113116ql(Context context, L3B l3b, UserSession userSession) {
        C04220Ms.A0B(userSession, 3);
        this.A02 = context;
        this.A04 = l3b;
        this.A05 = AnonymousClass4x8.A00(context);
        this.A03 = l3b;
        this.A06 = userSession;
    }

    public final boolean A00(long j) {
        return C86124wJ.A1X(((j - C18180wK.A05(C86154wM.A0B(this.A0A), "awareness_prompt_last_time_shown_ms")) > C18190wL.A08(this.A08.getValue()) ? 1 : ((j - C18180wK.A05(C86154wM.A0B(this.A0A), "awareness_prompt_last_time_shown_ms")) == C18190wL.A08(this.A08.getValue()) ? 0 : -1)));
    }
}
