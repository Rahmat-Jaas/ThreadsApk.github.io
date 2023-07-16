package X;

import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.graphql.UpdateAutoCrossPostingSettingMutationResponseImpl;

/* renamed from: X.4L3  reason: invalid class name */
public final class AnonymousClass4L3 implements C83834s4 {
    public final /* synthetic */ C695949f A00;
    public final /* synthetic */ AnonymousClass0ZU A01;
    public final /* synthetic */ AnonymousClass0ZU A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass4L3(C695949f r1, AnonymousClass0ZU r2, AnonymousClass0ZU r3, boolean z) {
        this.A02 = r2;
        this.A00 = r1;
        this.A03 = z;
        this.A01 = r3;
    }

    public final void Bxq() {
        this.A01.invoke();
        C695949f r0 = this.A00;
        AnonymousClass3WY.A02(r0.A01, "server_setting_updated_failed", (String) null, C18190wL.A1X(r0.A02.A04, "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED"), this.A03);
    }

    public final void CNE(UpdateAutoCrossPostingSettingMutationResponseImpl updateAutoCrossPostingSettingMutationResponseImpl) {
        String str;
        this.A02.invoke();
        C695949f r0 = this.A00;
        UserSession userSession = r0.A01;
        boolean A1X = C18190wL.A1X(r0.A02.A04, "PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED");
        if (updateAutoCrossPostingSettingMutationResponseImpl == null || !this.A03) {
            str = "OFF";
        } else {
            str = "ON";
        }
        AnonymousClass3WY.A02(userSession, "server_setting_updated_success", str, A1X, this.A03);
    }
}
