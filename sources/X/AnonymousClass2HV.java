package X;

import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;
import fxcache.model.FxCalAccountWithSwitcherInfo;
import java.util.Iterator;

/* renamed from: X.2HV  reason: invalid class name */
public final class AnonymousClass2HV {
    public static final Object A00(AnonymousClass601 r6, C63893iY r7) {
        int i;
        boolean A1Y = AnonymousClass0wJ.A1Y(r7, r6);
        C10300i6 A0F = C63913ic.A0F(r6);
        C18200wM.A1R(A0F);
        UserSession userSession = (UserSession) A0F;
        String A0D = C63893iY.A0D(r7, A1Y ? 1 : 0);
        SharedPreferences A01 = AnonymousClass3Zs.A03(userSession).A01(D2R.A15);
        Iterator it = C35692Ol.A00(userSession).A00(C67313zL.A00).iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 0;
                break;
            }
            FxCalAccountWithSwitcherInfo fxCalAccountWithSwitcherInfo = (FxCalAccountWithSwitcherInfo) it.next();
            if (fxCalAccountWithSwitcherInfo.A01.equals(A0D)) {
                i = fxCalAccountWithSwitcherInfo.A00;
                break;
            }
        }
        String A0p = C18220wO.A0p(new C208016e(i, System.currentTimeMillis()));
        SharedPreferences.Editor edit = A01.edit();
        C04220Ms.A0B(A0D, A1Y);
        C18180wK.A0v(edit, AnonymousClass00U.A0L("switcher_tapped_badge_count_", A0D), A0p);
        C38040KHr.A01.CWx(new AnonymousClass459());
        AnonymousClass3NS.A01(userSession).A03(AnonymousClass2AP.A0Q);
        return null;
    }
}
