package X;

import com.instagram.feed.media.ReelCTA;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.3Y0  reason: invalid class name */
public final class AnonymousClass3Y0 {
    public final UserSession A00;

    public AnonymousClass3Y0(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final void A01(boolean z, String str, String str2) {
        String str3 = str;
        if (str.length() != 0 && !str.equals("0")) {
            String str4 = str2;
            if (str2.length() != 0) {
                try {
                    AnonymousClass32U r0 = new AnonymousClass32U(ITF.A00());
                    r0.A00.insertInstallReferrerEvent(str3, z ? 1 : 0, str4, C18180wK.A04(), 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    private final void A00(AndroidLink androidLink) {
        String str;
        Boolean bool;
        String str2 = androidLink.A07;
        if (str2 != null && (str = androidLink.A0I) != null && (bool = androidLink.A02) != null && bool.booleanValue()) {
            A01(false, str2, str);
        }
    }

    public final void A02(BKU bku) {
        if (C63803iN.A0E(AnonymousClass0TJ.A05, this.A00, 36327048138205033L)) {
            List A3G = bku.A3G();
            C04220Ms.A06(A3G);
            if (!A3G.isEmpty()) {
                for (AndroidLink androidLink : bku.A3G()) {
                    C04220Ms.A04(androidLink);
                    A00(androidLink);
                }
                return;
            }
            BKN bkn = bku.A0f;
            List list = bkn.A5d;
            if (list == null || !C18190wL.A1a(list)) {
                List A3I = bku.A3I();
                if (A3I != null && C18190wL.A1a(A3I)) {
                    List<BKU> A3I2 = bku.A3I();
                    if (A3I2 == null) {
                        A3I2 = AnonymousClass0wJ.A0v();
                    }
                    for (BKU A3G2 : A3I2) {
                        for (AndroidLink androidLink2 : A3G2.A3G()) {
                            C04220Ms.A04(androidLink2);
                            A00(androidLink2);
                        }
                    }
                    return;
                }
                return;
            }
            List<ReelCTA> list2 = bkn.A5d;
            if (list2 == null) {
                list2 = AnonymousClass0wJ.A0v();
            }
            for (ReelCTA reelCTA : list2) {
                List<AndroidLink> list3 = reelCTA.A0D;
                if (list3 == null) {
                    list3 = AnonymousClass0wJ.A0v();
                }
                for (AndroidLink A002 : list3) {
                    A00(A002);
                }
            }
        }
    }
}
