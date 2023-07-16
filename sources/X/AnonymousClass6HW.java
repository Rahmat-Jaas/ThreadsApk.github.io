package X;

import com.facebook.papaya.store.PapayaStore;
import com.instagram.service.session.UserSession;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.6HW  reason: invalid class name */
public final class AnonymousClass6HW {
    public static final PapayaStore A00(UserSession userSession, String str) {
        String str2 = str;
        AnonymousClass0wJ.A1N(userSession, str);
        String absolutePath = AnonymousClass6XJ.A00.A00(userSession).getAbsolutePath();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = AnonymousClass0gE.A00().A00;
        AnonymousClass01V r0 = AnonymousClass01V.A0p;
        C04220Ms.A06(r0);
        return new PapayaStore(absolutePath, str2, scheduledThreadPoolExecutor, (Map) null, (String) null, (Long) null, new C132537u4(r0, str2));
    }
}
