package X;

import android.content.Context;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.6Oy  reason: invalid class name and case insensitive filesystem */
public final class C100866Oy {
    public static final Object A00(AnonymousClass601 r8, C63893iY r9) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r9, r8);
        C127397h3 A03 = C63893iY.A03(r9, 0);
        Context requireContext = C63913ic.A01(r8).requireContext();
        C10300i6 A0F = C63913ic.A0F(r8);
        C18200wM.A1R(A0F);
        UserSession userSession = (UserSession) A0F;
        Object A0B = C63893iY.A0B(r9, A1Z ? 1 : 0);
        A0B.getClass();
        C18240wQ.A1I(A0B);
        String str = (String) A0B;
        String A0B2 = C127397h3.A0B(A03);
        if (A0B2 != null) {
            String A0o = C18220wO.A0o(A03);
            if (A0o != null) {
                String A0C = C127397h3.A0C(A03);
                List A0R = A03.A0R(36);
                if (A0R != null) {
                    ArrayList A0w = AnonymousClass0wJ.A0w(A0R);
                    Iterator it = A0R.iterator();
                    while (it.hasNext()) {
                        String A0k = C18180wK.A0k(it);
                        Locale locale = Locale.US;
                        C04220Ms.A08(locale);
                        AdsAPIInstagramPosition adsAPIInstagramPosition = (AdsAPIInstagramPosition) AdsAPIInstagramPosition.A01.get(C18220wO.A0u(locale, A0k));
                        if (adsAPIInstagramPosition == null) {
                            adsAPIInstagramPosition = AdsAPIInstagramPosition.UNRECOGNIZED;
                        }
                        A0w.add(adsAPIInstagramPosition);
                    }
                    C37319JpM.A01(requireContext, userSession, str, A0B2, A0o, A0C, A0w);
                    return null;
                }
                throw C18180wK.A0a("instagram_positions cannot be null");
            }
            throw C18180wK.A0a("cta_type cannot be null");
        }
        throw C18180wK.A0a("media_id cannot be null");
    }
}
