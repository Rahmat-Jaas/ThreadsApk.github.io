package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.service.session.UserSession;

/* renamed from: X.5xk  reason: invalid class name and case insensitive filesystem */
public final class C94865xk extends AnonymousClass7Dz {
    public AnonymousClass7Dz A00;

    public final Intent getInstantExperiencesIntent(Context context, String str, UserSession userSession, String str2, String str3, C171209wF r14, String str4) {
        AnonymousClass7Dz r0 = this.A00;
        if (r0 != null) {
            return r0.getInstantExperiencesIntent(context, str, userSession, str2, str3, r14, str4);
        }
        return null;
    }

    public C94865xk() {
        try {
            this.A00 = (AnonymousClass7Dz) Class.forName("com.instagram.business.instantexperiences.InstantExperiencesLibImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            C10450iM.A06("InstantExperiencesWrapper", StringFormatUtil.formatStrLocaleSafe("Failed to initialize IXLib"), e);
        }
    }
}
