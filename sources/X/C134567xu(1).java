package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.7xu  reason: invalid class name and case insensitive filesystem */
public final class C134567xu implements C39818L1p {
    public final Boolean A00;

    public final String Ad9(Context context) {
        C04220Ms.A0B(context, 0);
        return AnonymousClass0wJ.A0k(context, 2131831952);
    }

    public final String BLx(Context context) {
        C04220Ms.A0B(context, 0);
        return AnonymousClass0wJ.A0k(context, 2131831951);
    }

    public final boolean BWH() {
        return false;
    }

    public final boolean Csh(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        Boolean bool = this.A00;
        if (bool != null) {
            return bool.booleanValue();
        }
        return C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36311092334494074L);
    }

    public C134567xu(Boolean bool) {
        this.A00 = bool;
    }

    public final int B2j(UserSession userSession) {
        return C63803iN.A01(C18180wK.A0J(userSession), userSession, 36592567311401463L);
    }

    public final int B7Y(UserSession userSession) {
        return C63803iN.A01(C18180wK.A0J(userSession), userSession, 36595500774131719L);
    }

    public final boolean CsC(UserSession userSession) {
        AnonymousClass0TJ A0J = C18180wK.A0J(userSession);
        if ((C63803iN.A0E(A0J, userSession, 36311092334428537L) || C63803iN.A0E(A0J, userSession, 36314025797093141L) || C63803iN.A0E(A0J, userSession, 36314025797224214L)) && C18190wL.A07() >= C18180wK.A05(C28161tl.A04(userSession), I17.A00(48))) {
            return true;
        }
        return false;
    }

    public final boolean Csg(UserSession userSession) {
        return C63803iN.A0E(C18180wK.A0J(userSession), userSession, 36311092334625147L);
    }
}
