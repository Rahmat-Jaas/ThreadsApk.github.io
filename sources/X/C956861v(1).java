package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;

/* renamed from: X.61v  reason: invalid class name and case insensitive filesystem */
public final class C956861v extends AnonymousClass779 {
    public AnonymousClass779 A00;

    public final C95345zw createGooglePlayLocationSettingsController(Activity activity, UserSession userSession, AnonymousClass8f3 r9, String str, String str2) {
        AnonymousClass779 r0 = this.A00;
        if (r0 != null) {
            return r0.createGooglePlayLocationSettingsController(activity, userSession, r9, str, str2);
        }
        return null;
    }

    public C956861v(UserSession userSession) {
        try {
            this.A00 = (AnonymousClass779) Class.forName("com.instagram.gpslocation.impl.GPSLocationLibraryImpl").getConstructor(new Class[]{String.class}).newInstance(new Object[]{userSession.token});
        } catch (Throwable th) {
            C10450iM.A06("GPSLocationLibraryWrapper", "Failed to initialize GPSLocationLibrary", th);
        }
    }
}
