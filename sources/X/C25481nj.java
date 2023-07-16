package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.instagram.service.session.UserSession;
import com.instagram.url.InstagramHelpDeeplinkAliasActivity;
import com.instagram.url.InstagramShortenDeeplinkAliasActivity;

/* renamed from: X.1nj  reason: invalid class name and case insensitive filesystem */
public final class C25481nj extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25481nj(C697249u r7) {
        super("CoreXDeeplinkSetup", 1422822022, 3, true, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C697249u r1 = this.A00;
        Context context = r1.A05;
        ComponentName componentName = new ComponentName(context, InstagramShortenDeeplinkAliasActivity.class);
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        UserSession userSession = r1.A06;
        AnonymousClass0TJ r6 = AnonymousClass0TJ.A05;
        int i = 2;
        int i2 = 2;
        if (C63803iN.A0E(r6, userSession, 36326017345856890L)) {
            i2 = 1;
        }
        packageManager.setComponentEnabledSetting(componentName, i2, 1);
        ComponentName componentName2 = new ComponentName(context, InstagramHelpDeeplinkAliasActivity.class);
        PackageManager packageManager2 = context.getPackageManager();
        packageManager2.getClass();
        if (C63803iN.A0E(r6, userSession, 36326017346119038L)) {
            i = 1;
        }
        packageManager2.setComponentEnabledSetting(componentName2, i, 1);
    }
}
