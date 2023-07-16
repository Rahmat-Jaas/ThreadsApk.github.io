package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Rv  reason: invalid class name and case insensitive filesystem */
public final class C73294Rv implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C697049r A01;

    public C73294Rv(Activity activity, C697049r r2) {
        this.A01 = r2;
        this.A00 = activity;
    }

    public final void run() {
        Bundle A02;
        Fragment r2;
        C697049r r4 = this.A01;
        Activity activity = this.A00;
        if (r4 instanceof AnonymousClass1v4) {
            AnonymousClass1v4 r0 = (AnonymousClass1v4) r4;
            UserSession userSession = r0.A08;
            boolean A002 = C61453Tm.A00(userSession);
            boolean A003 = C62183Xq.A00(userSession);
            boolean z = r0.A09;
            AnonymousClass2AC A03 = r0.A03();
            boolean z2 = r0.A08;
            int A07 = r0.A07();
            A02 = C18180wK.A06();
            A02.putBoolean("args_is_story_enabled", A002);
            A02.putBoolean("args_is_post_enabled", A003);
            A02.putBoolean("args_is_showing_from_story", z);
            A02.putString("args_entrypoint", A03.toString());
            A02.putBoolean("args_is_first_wave", z2);
            A02.putInt("args_num_of_views", A07);
            UserSession A072 = AnonymousClass0RA.A0C.A07(A02);
            if (A072 != null) {
                userSession = A072;
            }
            r2 = new AnonymousClass1v5(A02, userSession);
        } else {
            UserSession userSession2 = r4.A08;
            A02 = r4.A02();
            UserSession A073 = AnonymousClass0RA.A0C.A07(A02);
            if (A073 != null) {
                userSession2 = A073;
            }
            r2 = new AnonymousClass1v6(A02, userSession2);
        }
        r2.setArguments(A02);
        C37032Jj9 A0L = C18210wN.A0L(r4.A08);
        A0L.A0M = C18180wK.A0X();
        C18250wR.A1A(A0L, r4, 7);
        C18200wM.A16(activity, r2, A0L);
    }
}
