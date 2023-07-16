package X;

import android.net.Uri;
import com.instagram.service.session.UserSession;

/* renamed from: X.6UA  reason: invalid class name */
public final class AnonymousClass6UA {
    public static final boolean A00(C146318m2 r6, UserSession userSession) {
        C04220Ms.A0B(r6, 0);
        String url = r6.getUrl();
        Uri uri = null;
        if (!C18180wK.A1W(url.length())) {
            try {
                uri = C15430rJ.A01(url);
            } catch (IllegalArgumentException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
            }
        }
        return uri != null && AnonymousClass7D2.A00(uri) && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36324935014818604L);
    }
}
