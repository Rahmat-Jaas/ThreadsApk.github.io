package X;

import android.content.Context;
import com.instagram.debug.quickexperiment.QuickExperimentHelper;
import com.instagram.debug.quickexperiment.QuickExperimentHelper$$ExternalSyntheticLambda7;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreManager;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Ue  reason: invalid class name */
public final class AnonymousClass3Ue {
    public final QuickExperimentDebugStore A00;
    public final UserSession A01;
    public final List A02 = QuickExperimentHelper.getAllExperiments();

    public AnonymousClass3Ue(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = QuickExperimentDebugStoreManager.getOverrideStore(userSession);
    }

    public final void A01(Context context, boolean z) {
        C04220Ms.A0B(context, 0);
        QuickExperimentHelper.forceUserQESync(context, C61823Vx.A01, this.A01, new QuickExperimentHelper$$ExternalSyntheticLambda7(context, Boolean.valueOf(z)));
    }

    public static final C07950cU A00(AnonymousClass3Ue r3, String str, String str2) {
        Object obj;
        Iterator it = r3.A02.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C07950cU r1 = (C07950cU) obj;
            if (C04220Ms.A0I(r1.mUniverseName, str) && C04220Ms.A0I(r1.mName, str2)) {
                break;
            }
        }
        return (C07950cU) obj;
    }
}
