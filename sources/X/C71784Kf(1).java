package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;

/* renamed from: X.4Kf  reason: invalid class name and case insensitive filesystem */
public final class C71784Kf implements C83784rz {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void A00(String str) {
        boolean A0E;
        boolean A0E2;
        C04620Ok r3 = C06810aP.A01;
        UserSession userSession = this.A01;
        AnonymousClass266 A0b = C18200wM.A0b(userSession, r3);
        C04220Ms.A0B(userSession, 0);
        if (!r3.A01(userSession).A3a()) {
            A0E = false;
        } else {
            A0E = C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36313007889843459L);
        }
        if (!r3.A01(userSession).A3a()) {
            A0E2 = false;
        } else {
            A0E2 = C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36313007889908996L);
        }
        boolean A0H = C67363zQ.A0H(userSession);
        C60233Of.A01(userSession, new DirectMessagesInteropOptionsViewModel((DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null), this, A0b, str, A0E, A0E2, A0H);
    }

    public final void Bgw() {
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(this.A00, this.A01);
        C18190wL.A10();
        A0Q.A03 = new AnonymousClass1Z6();
        A0Q.A05();
    }

    public final void Bh5(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, Integer num, String str, DirectMessageInteropReachabilityOptions[] directMessageInteropReachabilityOptionsArr, int i, boolean z) {
        C60233Of.A00((Bundle) null, this.A00, this.A01, directMessagesInteropOptionsViewModel, num, str, directMessageInteropReachabilityOptionsArr, i, z);
    }

    public C71784Kf(FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass0wJ.A1O(fragmentActivity, userSession);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
