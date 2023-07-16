package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.4GM  reason: invalid class name */
public final class AnonymousClass4GM implements C82884qQ {
    public Context A00;
    public UserSession A01;

    public final boolean CW4(C58743Gz r4) {
        Context context = this.A00;
        if (!C25787Ds0.isLocationPermitted(context, this.A01, "LOCATION_SERVICE_ENABLED_FILTER") || !C25787Ds0.isLocationEnabled(context)) {
            return false;
        }
        return true;
    }

    public AnonymousClass4GM(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
