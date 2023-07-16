package X;

import com.instagram.model.reels.HighlightReelTypeStr;
import com.instagram.service.session.UserSession;

/* renamed from: X.7b2  reason: invalid class name */
public final class AnonymousClass7b2 implements C147138nS {
    public final HighlightReelTypeStr A00;
    public final UserSession A01;

    public AnonymousClass7b2(HighlightReelTypeStr highlightReelTypeStr, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = highlightReelTypeStr;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        return new AnonymousClass57J(this.A00, this.A01);
    }
}
