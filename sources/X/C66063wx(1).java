package X;

import com.instagram.dogfoodingassistant.viewmodel.DogfoodingAssistantViewModel;
import com.instagram.service.session.UserSession;

/* renamed from: X.3wx  reason: invalid class name and case insensitive filesystem */
public final class C66063wx implements C147138nS {
    public final UserSession A00;

    public C66063wx(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C98376Fg.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        return new DogfoodingAssistantViewModel(this.A00);
    }
}
