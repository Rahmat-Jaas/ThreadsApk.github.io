package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4DU  reason: invalid class name */
public final class AnonymousClass4DU implements C27689Erf, C27691Erh {
    public static final AnonymousClass4DU A00 = new AnonymousClass4DU();

    public final Fragment Ajk(Object obj) {
        C04220Ms.A0B(obj, 0);
        C23029CkT ckT = (C23029CkT) obj;
        String str = ckT.A01;
        UserSession userSession = ckT.A00;
        C28161tl A01 = AnonymousClass3WS.A01(userSession);
        Bundle A002 = C98316Fa.A00(C18180wK.A0p("settingType", "feed"), C18180wK.A0p("enableGeoGating", Boolean.valueOf(A01.A0R("feed"))), C18180wK.A0p("selectedRegions", C18200wM.A0s(A01.A0H("feed"))), C18180wK.A0p("IgReactFragment.ARGUMENT_SHOULD_INSET_ACTION_BAR_HEIGHT", true));
        C63343hJ.getInstance().getFragmentFactory();
        C63343hJ.getInstance();
        C71494Ja r0 = new C71494Ja(userSession, "IgMediaGeoGatingSettingsApp");
        r0.A07 = str;
        r0.Cod(A002);
        Bundle ABD = r0.ABD();
        C34611Ibh ibh = new C34611Ibh();
        ibh.setArguments(ABD);
        return ibh;
    }

    public final String getName() {
        return "limit_location";
    }
}
