package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Pl  reason: invalid class name and case insensitive filesystem */
public final class C72724Pl implements Runnable {
    public final /* synthetic */ AnonymousClass4JG A00;

    public C72724Pl(AnonymousClass4JG r1) {
        this.A00 = r1;
    }

    public final void run() {
        Bundle A06 = C18180wK.A06();
        C313225m.A00(A06, C313225m.ARGUMENT_EDIT_PROFILE_FLOW);
        AnonymousClass4JG r1 = this.A00;
        FragmentActivity fragmentActivity = r1.A00;
        UserSession userSession = r1.A01;
        C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, userSession);
        A0Q.A0A(A06, C63463hW.A01().A03(userSession));
        A0Q.A05();
    }
}
