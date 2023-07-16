package X;

import android.util.Base64;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.service.session.UserSession;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.3Gv  reason: invalid class name and case insensitive filesystem */
public final class C58713Gv {
    public Set A00;
    public final UserSession A01;

    public final boolean A01(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return !C18180wK.A1W(C63803iN.A0C(AnonymousClass0TJ.A06, userSession, 36880239925854410L).length());
    }

    public C58713Gv(UserSession userSession) {
        this.A01 = userSession;
    }

    public final Set A00() {
        HashSet A0u = C18200wM.A0u();
        UserSession userSession = this.A01;
        if (A01(userSession)) {
            try {
                C04220Ms.A0B(userSession, 0);
                byte[] decode = Base64.decode(C63803iN.A0C(AnonymousClass0TJ.A06, userSession, 36880239925854410L), 0);
                C04220Ms.A06(decode);
                for (String str : C18190wL.A1b(new String(decode, AnonymousClass74V.A05), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0)) {
                    int length = str.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        int i2 = length;
                        if (!z) {
                            i2 = i;
                        }
                        boolean A1U = C18230wP.A1U(str.charAt(i2));
                        if (z) {
                            if (!A1U) {
                                break;
                            }
                            length--;
                        } else if (!A1U) {
                            z = true;
                        } else {
                            i++;
                        }
                    }
                    String A0s = C18220wO.A0s(str, length, i);
                    Locale locale = Locale.getDefault();
                    C04220Ms.A06(locale);
                    String A0r = C18190wL.A0r(locale, A0s);
                    if (!C18220wO.A1V("#", 1, A0r)) {
                        A0r = AnonymousClass00U.A0L("#", A0r);
                    }
                    A0u.add(A0r);
                }
            } catch (IllegalArgumentException e) {
                C10450iM.A06("HashtagColorizer", "Error parsing colorized hashtag list", e);
                return A0u;
            }
        }
        return A0u;
    }
}
