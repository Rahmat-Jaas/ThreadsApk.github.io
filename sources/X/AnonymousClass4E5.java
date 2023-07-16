package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.4E5  reason: invalid class name */
public final class AnonymousClass4E5 implements C27834Eu3 {
    public int A00 = -1;
    public final UserSession A01;

    public final int Awn() {
        if (this.A00 == -1) {
            UserSession userSession = this.A01;
            int i = AnonymousClass3WS.A01(userSession).A00.getInt("music_duration_for_photo_last_selection", 15);
            C28161tl A012 = AnonymousClass3WS.A01(userSession);
            if (i <= 10) {
                AnonymousClass0wJ.A13(C28161tl.A02(A012), "has_set_updated_default_music_duration_seconds", true);
            } else if (!C18190wL.A1X(A012.A00, "has_set_updated_default_music_duration_seconds") && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36323247092080370L)) {
                this.A00 = 10000;
                AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A01(userSession)), "has_set_updated_default_music_duration_seconds", true);
                AnonymousClass0wJ.A11(C28161tl.A03(userSession), "music_duration_for_photo_last_selection", 10);
            }
            this.A00 = (int) C18220wO.A09(Math.min(i, 15));
        }
        return this.A00;
    }

    public final void CnC(int i) {
        AnonymousClass0wJ.A11(C28161tl.A02(AnonymousClass3WS.A01(this.A01)), "music_duration_for_photo_last_selection", (int) (((long) i) / 1000));
        this.A00 = i;
    }

    public AnonymousClass4E5(UserSession userSession) {
        this.A01 = userSession;
    }
}
