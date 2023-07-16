package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape33S0200000_I2_17;

/* renamed from: X.3Un  reason: invalid class name and case insensitive filesystem */
public final class C61613Un {
    public final PackageManager A00;
    public final C10340iB A01;
    public final Context A02;
    public final boolean A03;

    public final void A01() {
        if (this.A03) {
            Context context = this.A02;
            ComponentName componentName = new ComponentName(context, "com.instagram.android.InternalLauncher");
            ComponentName componentName2 = new ComponentName(context, "com.instagram.android.activity.MainTabActivity");
            PackageManager packageManager = this.A00;
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            int componentEnabledSetting2 = packageManager.getComponentEnabledSetting(componentName2);
            C10340iB r1 = this.A01;
            if ((r1 == C10340iB.ALPHA || r1 == C10340iB.BETA) && componentEnabledSetting != 1) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
                packageManager.setComponentEnabledSetting(componentName2, 2, 1);
            } else if (r1 == C10340iB.PROD && componentEnabledSetting2 == 2) {
                packageManager.setComponentEnabledSetting(componentName2, 1, 1);
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
            }
        }
    }

    public C61613Un(Context context, PackageManager packageManager, C10340iB r3, boolean z) {
        this.A02 = context;
        this.A03 = z;
        this.A00 = packageManager;
        this.A01 = r3;
    }

    public static final C61613Un A00(Context context, UserSession userSession) {
        AnonymousClass0wJ.A1N(userSession, context);
        return (C61613Un) userSession.A01(C61613Un.class, new KtLambdaShape33S0200000_I2_17(11, context.getApplicationContext(), userSession));
    }
}
