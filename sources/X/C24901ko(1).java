package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1ko  reason: invalid class name and case insensitive filesystem */
public final class C24901ko extends AnonymousClass1lO {
    public final C84844tx A00;
    public final AnonymousClass4JZ A01;

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        this.A01.AAl(this.A00, ((AnonymousClass1lE) mfV).A00, (C201413h) m5o);
    }

    public final Class modelClass() {
        return AnonymousClass1lE.class;
    }

    public C24901ko(C84844tx r2, UserSession userSession) {
        this.A00 = r2;
        this.A01 = new AnonymousClass4JZ(userSession);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C201413h(AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.inline_editing_megaphone));
    }
}
