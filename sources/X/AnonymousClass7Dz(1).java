package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.service.session.UserSession;

/* renamed from: X.7Dz  reason: invalid class name */
public abstract class AnonymousClass7Dz {
    public static AnonymousClass7Dz A00;

    public abstract Intent getInstantExperiencesIntent(Context context, String str, UserSession userSession, String str2, String str3, C171209wF r6, String str4);

    public static AnonymousClass7Dz getInstance(Context context) {
        AnonymousClass7Dz r0 = A00;
        if (r0 != null) {
            return r0;
        }
        C94865xk r02 = new C94865xk();
        A00 = r02;
        return r02;
    }

    public static void setInstance(AnonymousClass7Dz r0) {
        A00 = r0;
    }
}
