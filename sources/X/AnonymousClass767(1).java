package X;

import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.767  reason: invalid class name */
public final class AnonymousClass767 {
    public final Fragment A00;
    public final boolean A01;
    public final UserSession A02;

    public static void A00(AnonymousClass767 r2, String str) {
        C25786Drz A0Q = C18180wK.A0Q(r2.A00.requireActivity(), r2.A02);
        IgFragmentFactoryImpl.A00();
        C19504AxR axR = new C19504AxR();
        axR.A04 = str;
        A0Q.A03 = axR.A05();
        A0Q.A05();
    }

    public AnonymousClass767(Fragment fragment, UserSession userSession, boolean z) {
        this.A00 = fragment;
        this.A02 = userSession;
        this.A01 = z;
    }
}
