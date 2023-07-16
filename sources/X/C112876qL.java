package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.instagram.service.session.UserSession;

/* renamed from: X.6qL  reason: invalid class name and case insensitive filesystem */
public final class C112876qL {
    public C25918DvM A00;
    public E73 A01;
    public final Activity A02;
    public final C11630kW A03;
    public final UserSession A04;

    public final void A00(String str, String str2, String str3, String str4) {
        if (str3 != null || str4 != null) {
            Activity activity = this.A02;
            PackageManager packageManager = activity.getPackageManager();
            if (!TextUtils.isEmpty(str4)) {
                UserSession userSession = this.A04;
                C11630kW r1 = this.A03;
                AnonymousClass6UI.A00(r1, userSession, str, str2, "link");
                Uri A012 = C15430rJ.A01(str4);
                if (!C62513aA.A01(activity, userSession, str4, r1.getModuleName())) {
                    AnonymousClass3RZ.A00();
                    if (!C10650ih.A0A(activity, new Intent("android.intent.action.VIEW", A012))) {
                        C10650ih.A06(activity, A012);
                        return;
                    }
                    return;
                }
                return;
            }
            str3.getClass();
            boolean A09 = C09650fs.A09(packageManager, str3);
            UserSession userSession2 = this.A04;
            C11630kW r12 = this.A03;
            if (A09) {
                AnonymousClass6UI.A00(r12, userSession2, str, str2, "app");
                C10650ih.A01(activity, packageManager.getLaunchIntentForPackage(str3));
                return;
            }
            AnonymousClass6UI.A00(r12, userSession2, str, str2, "store");
            C09650fs.A01(activity, str3, "app_attribution");
        }
    }

    public C112876qL(Context context, C11630kW r2, UserSession userSession) {
        this.A02 = (Activity) context;
        this.A04 = userSession;
        this.A03 = r2;
    }
}
