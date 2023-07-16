package X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import com.instagram.service.session.UserSession;

/* renamed from: X.1iZ  reason: invalid class name */
public class AnonymousClass1iZ extends C63873iU {
    public final UserSession A00;

    public void A01(UserSession userSession) {
        int A03;
        int i;
        String str;
        if (this instanceof AnonymousClass1UP) {
            A03 = C14030oh.A03(31266151);
            String str2 = ((AnonymousClass1UP) this).A01;
            DLogTag dLogTag = DLogTag.DIRECT_HTTP;
            Object[] objArr = new Object[1];
            if (str2 != null) {
                objArr[0] = str2;
                str = "fetchThread id=%s";
            } else {
                objArr[0] = null;
                str = "fetchByRecipients id=%s";
            }
            DLog.d(dLogTag, str, objArr);
            i = -1942835817;
        } else {
            A03 = C14030oh.A03(-1502244552);
            i = 26011619;
        }
        C14030oh.A0A(i, A03);
    }

    public AnonymousClass1iZ(UserSession userSession) {
        AnonymousClass7Ko.A07(userSession, "user session cannot be null.");
        this.A00 = userSession;
    }

    public void A00(AnonymousClass3XX r3, UserSession userSession) {
        C14030oh.A0A(1640917500, C14030oh.A03(-2049301301));
    }

    public void A02(UserSession userSession, Object obj) {
        C14030oh.A0A(-266117560, C14030oh.A03(1521542639));
    }

    public void A03(UserSession userSession, Object obj) {
        C14030oh.A0A(2054005783, C14030oh.A03(-1851399540));
    }

    public final void onFail(AnonymousClass3XX r4) {
        int i;
        int A03 = C14030oh.A03(1735827270);
        UserSession userSession = this.A00;
        if (userSession.hasEnded()) {
            i = -1683262470;
        } else {
            A00(r4, userSession);
            i = 1754153590;
        }
        C14030oh.A0A(i, A03);
    }

    public final void onFailInBackground(C26743EUq eUq) {
        int i;
        int A03 = C14030oh.A03(230608111);
        if (this.A00.hasEnded()) {
            i = -1167013464;
        } else {
            C14030oh.A0A(974637811, C14030oh.A03(2123625284));
            i = 624962118;
        }
        C14030oh.A0A(i, A03);
    }

    public final void onFinish() {
        int i;
        int A03 = C14030oh.A03(2005090589);
        if (this.A00.hasEnded()) {
            i = -984666500;
        } else {
            C14030oh.A0A(-246156207, C14030oh.A03(-1118807268));
            i = 300026860;
        }
        C14030oh.A0A(i, A03);
    }

    public final void onStart() {
        int i;
        int A03 = C14030oh.A03(302650433);
        UserSession userSession = this.A00;
        if (userSession.hasEnded()) {
            i = 1498363507;
        } else {
            A01(userSession);
            i = 137713425;
        }
        C14030oh.A0A(i, A03);
    }

    public final void onSuccess(Object obj) {
        int i;
        int A03 = C14030oh.A03(-1026555058);
        UserSession userSession = this.A00;
        if (userSession.hasEnded()) {
            i = 277279523;
        } else {
            A02(userSession, obj);
            i = -1767048004;
        }
        C14030oh.A0A(i, A03);
    }

    public final void onSuccessInBackground(Object obj) {
        int i;
        int A03 = C14030oh.A03(945073946);
        UserSession userSession = this.A00;
        if (userSession.hasEnded()) {
            i = 507181731;
        } else {
            A03(userSession, obj);
            i = -361366864;
        }
        C14030oh.A0A(i, A03);
    }
}
