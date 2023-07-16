package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1sh  reason: invalid class name and case insensitive filesystem */
public final class C27551sh extends AnonymousClass44V implements C11630kW, C82844qM {
    public static final HashMap A02 = AnonymousClass0wJ.A0y();
    public static final String __redex_internal_original_name = "OnboardingControllerBusinessLogic";
    public final Context A00;
    public final C10300i6 A01;

    public final String getModuleName() {
        return "nux_controller_business_logic";
    }

    public static synchronized C27551sh A00(Context context, C10300i6 r3, C67073yp r4, C82834qL r5) {
        C27551sh A012;
        synchronized (C27551sh.class) {
            A012 = A01(context, r3, r4, r5, AnonymousClass006.A00);
        }
        return A012;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized X.C27551sh A01(android.content.Context r3, X.C10300i6 r4, X.C67073yp r5, X.C82834qL r6, java.lang.Integer r7) {
        /*
            java.lang.Class<X.1sh> r2 = X.C27551sh.class
            monitor-enter(r2)
            if (r5 == 0) goto L_0x0006
            goto L_0x0008
        L_0x0006:
            r0 = 0
            goto L_0x0010
        L_0x0008:
            com.instagram.service.session.UserSession r0 = r5.A00     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0006
            java.lang.String r0 = r0.getUserId()     // Catch:{ all -> 0x001d }
        L_0x0010:
            X.1sh r1 = A02(r3, r4, r5, r7, r0)     // Catch:{ all -> 0x001d }
            if (r6 == 0) goto L_0x001b
            java.util.Set r0 = r1.A03     // Catch:{ all -> 0x001d }
            r0.add(r6)     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r2)
            return r1
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27551sh.A01(android.content.Context, X.0i6, X.3yp, X.4qL, java.lang.Integer):X.1sh");
    }

    public static C27551sh A02(Context context, C10300i6 r6, C67073yp r7, Integer num, String str) {
        String str2;
        HashMap hashMap = A02;
        C27551sh r3 = (C27551sh) hashMap.get(str);
        if (r3 == null) {
            if (str != null) {
                r3 = A02(context, r6, r7, num, (String) null);
                ((C67073yp) r3.A02).A00 = r7.A00;
                hashMap.remove((Object) null);
            } else {
                r3 = new C27551sh(context, r6, r7, new C27591so(context, r7));
            }
        }
        UserSession userSession = r7.A00;
        if (userSession != null) {
            str2 = userSession.getUserId();
        } else {
            str2 = null;
        }
        hashMap.put(str2, r3);
        return r3;
    }

    public static synchronized C27551sh A03(String str) {
        C27551sh r0;
        synchronized (C27551sh.class) {
            r0 = (C27551sh) A02.get(str);
        }
        return r0;
    }

    public C27551sh(Context context, C10300i6 r3, C67073yp r4, C58723Gw r5) {
        super(r5, r4);
        this.A01 = r3;
        this.A00 = context.getApplicationContext();
    }

    public final void Ben(int i) {
        List<AnonymousClass3IX> A0v;
        super.Ben(i);
        C67073yp r3 = (C67073yp) this.A02;
        UserSession userSession = r3.A00;
        if (userSession != null) {
            C566938e r5 = new C566938e(userSession);
            C58723Gw r0 = this.A01;
            int i2 = r0.A00;
            if (i2 <= 0) {
                i2 = 0;
            }
            List list = r0.A01;
            if (i2 < list.size()) {
                A0v = list.subList(i2, list.size());
            } else {
                A0v = AnonymousClass0wJ.A0v();
            }
            C313625r r6 = r3.A01;
            if (A0v == null || A0v.isEmpty() || r6 == null) {
                C18180wK.A0v(C28161tl.A02(r5.A00), "remaining_nux_steps", (String) null);
                return;
            }
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            for (AnonymousClass3IX r02 : A0v) {
                A0v2.add(new C61343Sv((AnonymousClass2AQ) ((Enum) r02.A00), r02.A01));
            }
            AnonymousClass3T5 r1 = new AnonymousClass3T5(r6, A0v2);
            try {
                C28161tl r03 = r5.A00;
                C18180wK.A0v(C28161tl.A02(r03), "remaining_nux_steps", C60023Ni.A00(r1));
            } catch (IOException e) {
                C10450iM.A07("Onboarding Persistence Failure", e);
                C18180wK.A0v(C28161tl.A02(r5.A00), "remaining_nux_steps", (String) null);
            }
        }
    }
}
