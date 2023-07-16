package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Ui  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C73824Ui implements AnonymousClass0YP {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    public /* synthetic */ C73824Ui(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public final Object invoke(Object obj, Object obj2) {
        Context context = this.A00;
        UserSession userSession = this.A01;
        String str = (String) obj2;
        AnonymousClass141 r2 = new AnonymousClass141();
        if (obj != null) {
            r2.A02.put("show_caa_flows", obj);
        }
        if (!(str == null || str.length() == 0)) {
            r2.A02.put("entrypoint", str);
        }
        r2.A00();
        throw C63203gz.A02(userSession, context, r2.A02);
    }
}
