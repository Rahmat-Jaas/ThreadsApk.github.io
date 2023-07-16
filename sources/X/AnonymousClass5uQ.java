package X;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.instagram.direct.appwidget.DirectWidgetProvider;

/* renamed from: X.5uQ  reason: invalid class name */
public final class AnonymousClass5uQ extends AnonymousClass4TI {
    public final Context A00;

    public AnonymousClass5uQ(Context context) {
        C04220Ms.A0B(context, 1);
        this.A00 = context;
    }

    public final void A03() {
        Context context = this.A00;
        ComponentName componentName = new ComponentName(context, DirectWidgetProvider.class);
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        if (instance != null) {
            int[] appWidgetIds = instance.getAppWidgetIds(componentName);
            C04220Ms.A06(appWidgetIds);
            if (appWidgetIds.length <= 0) {
                boolean A05 = C63173fJ.A05(AnonymousClass0TJ.A05, 18306207177513044L);
                PackageManager packageManager = context.getApplicationContext().getPackageManager();
                if (packageManager != null) {
                    packageManager.setComponentEnabledSetting(componentName, C86164wN.A04(A05 ? 1 : 0), 1);
                }
            }
        }
    }
}
