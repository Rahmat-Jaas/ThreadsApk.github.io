package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3rD  reason: invalid class name and case insensitive filesystem */
public final class C64613rD implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ BKU A02;
    public final /* synthetic */ UserSession A03;

    public C64613rD(FragmentActivity fragmentActivity, BKU bku, UserSession userSession, int i) {
        this.A01 = fragmentActivity;
        this.A03 = userSession;
        this.A02 = bku;
        this.A00 = i;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1255668585);
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A03;
        String str = this.A02.A0f.A4Y;
        C04220Ms.A06(str);
        C34640IcN A002 = C25529DnJ.A02.A01().A00(str, this.A00, 0, 0);
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(fragmentActivity, userSession);
        A0Q.A03 = A002;
        A0Q.A05();
        C14030oh.A0C(715964954, A05);
    }
}
