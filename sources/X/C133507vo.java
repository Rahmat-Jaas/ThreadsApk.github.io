package X;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.7vo  reason: invalid class name and case insensitive filesystem */
public final class C133507vo implements C3K {
    public final Fragment A00;
    public final C21839C2o A01;
    public final UserSession A02;

    public final void BpW(ClickableSpan clickableSpan, View view, String str) {
        C25786Drz A0Q = C18180wK.A0Q(this.A00.getActivity(), this.A02);
        A0Q.A03 = C18456Afn.A01.A00().A01(C19274Atd.A00(str), this.A01.getModuleName(), "guide");
        A0Q.A05();
    }

    public final void Bpe(ClickableSpan clickableSpan, View view, String str) {
        C60113Ns.A01(this.A00.getActivity(), this.A02);
        throw null;
    }

    public C133507vo(Fragment fragment, C21839C2o c2o, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = c2o;
        this.A02 = userSession;
    }
}
