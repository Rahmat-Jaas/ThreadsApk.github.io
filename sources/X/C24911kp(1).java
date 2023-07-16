package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.service.session.UserSession;

/* renamed from: X.1kp  reason: invalid class name and case insensitive filesystem */
public final class C24911kp extends AnonymousClass1lO {
    public final C84844tx A00;
    public final AnonymousClass4JX A01;

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        this.A01.AAl(this.A00, ((AnonymousClass1lF) mfV).A00, (C202113o) m5o);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C202113o(this.A01.Bhn(layoutInflater, viewGroup));
    }

    public final Class modelClass() {
        return AnonymousClass1lF.class;
    }

    public C24911kp(C11630kW r2, C84844tx r3, UserSession userSession) {
        this.A00 = r3;
        this.A01 = new AnonymousClass4JX(r2, userSession);
    }
}
