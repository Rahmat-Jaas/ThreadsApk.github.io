package com.instagram.debug.devoptions.refresh;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18230wP;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public final class AppRestartUtil {
    public static final AppRestartUtil INSTANCE = new AppRestartUtil();

    public static final void restartApp(Context context) {
        ComponentName component;
        Intent makeRestartActivityTask;
        C04220Ms.A0B(context, 0);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null || (component = launchIntentForPackage.getComponent()) == null || (makeRestartActivityTask = Intent.makeRestartActivityTask(component)) == null) {
            throw AnonymousClass0wJ.A0b();
        }
        C18230wP.A0O().A09(context, makeRestartActivityTask);
    }

    public static final void restartAppHard(Context context) {
        ComponentName component;
        Intent makeRestartActivityTask;
        C04220Ms.A0B(context, 0);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null || (component = launchIntentForPackage.getComponent()) == null || (makeRestartActivityTask = Intent.makeRestartActivityTask(component)) == null) {
            throw AnonymousClass0wJ.A0b();
        }
        C18230wP.A0O().A09(context, makeRestartActivityTask);
        Runtime.getRuntime().exit(0);
    }
}
