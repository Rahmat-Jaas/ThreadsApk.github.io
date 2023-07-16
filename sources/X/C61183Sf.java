package X;

import com.instagram.service.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.3Sf  reason: invalid class name and case insensitive filesystem */
public final class C61183Sf {
    public WeakReference A00;
    public final C21839C2o A01;
    public final UserSession A02;

    public static final C34653Icf A00(C61183Sf r0) {
        WeakReference weakReference = r0.A00;
        if (weakReference != null) {
            return (C34653Icf) weakReference.get();
        }
        return null;
    }

    public C61183Sf(C21839C2o c2o, C34653Icf icf, UserSession userSession) {
        this.A00 = new WeakReference(icf);
        this.A02 = userSession;
        this.A01 = c2o;
    }
}
