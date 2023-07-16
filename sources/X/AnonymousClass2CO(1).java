package X;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.oxygen.preloads.sdk.firstparty.settings.TosAcceptedFlag;

/* renamed from: X.2CO  reason: invalid class name */
public final class AnonymousClass2CO {
    public static void A00(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.facebook.appmanager", 0);
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            ContentResolver contentResolver = context.getContentResolver();
            ComponentName componentName = new ComponentName(context, TosAcceptedFlag.class);
            if (packageManager.getComponentEnabledSetting(componentName) != 1) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
                C36477JWz jWz = new C36477JWz(context, context.getPackageManager());
                if (z && jWz.A02(2)) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("terms_of_service_accepted", 1);
                    try {
                        int update = contentResolver.update(C18220wO.A0G(packageName), contentValues, (String) null, (String[]) null);
                        if (update != 1) {
                            throw new C32132Ai(AnonymousClass00U.A0J("Expected 1 row changed, actually ", update));
                        }
                    } catch (IllegalArgumentException e) {
                        throw new C32132Ai("Could not resolve content uri for firstparty settings", e);
                    } catch (Throwable th) {
                        throw new C32132Ai("Unexpected failure.", th);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
