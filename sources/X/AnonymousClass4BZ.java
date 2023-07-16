package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;
import java.io.Serializable;

/* renamed from: X.4BZ  reason: invalid class name */
public final class AnonymousClass4BZ implements C82484pm {
    public final Bundle A00;
    public final UserSession A01;

    public final boolean BVr() {
        UserSession userSession = this.A01;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (!C63803iN.A0E(r2, userSession, 36320008692307579L) && C63803iN.A01(r2, userSession, 36601483667967688L) != 0 && !C28161tl.A04(userSession).getBoolean("channel_creator_nux_variant", false)) {
            Bundle bundle = this.A00;
            AnonymousClass24S r22 = AnonymousClass24S.OMNIPICKER;
            Serializable serializable = bundle.getSerializable("social_channel_creation_source");
            C04220Ms.A0C(serializable, "null cannot be cast to non-null type com.instagram.direct.channels.analytics.ChannelCreationSource");
            if (serializable != r22) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass4BZ(Bundle bundle, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = bundle;
    }
}
