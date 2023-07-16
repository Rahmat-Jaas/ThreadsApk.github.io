package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.clips.viewer.insights.ClipsInsightsBloksHelper$openClipsInsights$2;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6oY  reason: invalid class name and case insensitive filesystem */
public final class C111866oY {
    public final UserSession A00;

    public C111866oY(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(Fragment fragment, FragmentActivity fragmentActivity, Map map) {
        String A002 = AnonymousClass000.A00(832);
        AnonymousClass01V.A0p.markerStart(39137013);
        AnonymousClass01V.A0p.markerAnnotate(39137013, I17.A00(567), A002);
        AnonymousClass0wJ.A0F().postDelayed(new C135627zn(this), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
        HashMap A0y = AnonymousClass0wJ.A0y();
        Object obj = map.get("media_id");
        if (obj != null) {
            A0y.put("target_id", obj);
        }
        UserSession userSession = this.A00;
        C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, userSession);
        C63743iE A02 = C63743iE.A02(A002, A0y);
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
        A0N.A0S = fragment.getString(2131823544);
        A0N.A04 = new ClipsInsightsBloksHelper$openClipsInsights$2();
        A0Q.A03 = C62853b1.A02(A0N, A02);
        A0Q.A07();
    }
}
