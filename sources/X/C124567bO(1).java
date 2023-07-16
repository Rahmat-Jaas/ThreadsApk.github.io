package X;

import android.content.Context;
import com.instagram.barcelona.profile.editor.ProfileEditorViewModel;
import com.instagram.service.session.UserSession;

/* renamed from: X.7bO  reason: invalid class name and case insensitive filesystem */
public final class C124567bO implements C147138nS {
    public final Context A00;
    public final C121177En A01;
    public final UserSession A02;

    public C124567bO(Context context, C121177En r3, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = context;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        UserSession userSession = this.A02;
        return new ProfileEditorViewModel(this.A01, new C107856hQ(userSession, this.A00), userSession);
    }
}
