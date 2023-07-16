package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0EK  reason: invalid class name */
public final class AnonymousClass0EK extends C16980u6 {
    public final Intent A08(Context context, Intent intent, String str) {
        AnonymousClass0sB.A02(context, intent, this.A02, str);
        if (!C16980u6.A07(context, intent)) {
            return A00(context, intent, C16980u6.A04(context, intent, 65600));
        }
        return intent;
    }

    public final Intent A0A(Context context, Intent intent, String str) {
        AnonymousClass0sB.A02(context, intent, this.A02, str);
        if (!C16980u6.A07(context, intent)) {
            return A00(context, intent, C16980u6.A05(context, intent, 65600));
        }
        return intent;
    }

    public final List A0D(Context context, Intent intent, String str) {
        AnonymousClass0sB.A02(context, intent, this.A02, str);
        if (!C16980u6.A07(context, intent)) {
            intent.setPackage(context.getPackageName());
        }
        return Collections.singletonList(intent);
    }

    public final boolean A0G(Context context, PackageInfo packageInfo) {
        throw new UnsupportedOperationException();
    }

    public AnonymousClass0EK(C16350su r1, C16250sj r2, C16240si r3) {
        super(r1, r2, r3);
    }

    private Intent A00(Context context, Intent intent, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ComponentInfo componentInfo = (ComponentInfo) it.next();
            ApplicationInfo applicationInfo = componentInfo.applicationInfo;
            if (applicationInfo != null) {
                String str = applicationInfo.packageName;
                if (!str.equals(context.getPackageName())) {
                    if (A0F()) {
                        this.A02.Ccw("InternalIntentScope", AnonymousClass00U.A0L("Detected different package name component but fail open: ", str), (Throwable) null);
                    }
                }
                arrayList.add(componentInfo);
            }
        }
        if (arrayList.isEmpty()) {
            this.A02.Ccw("InternalIntentScope", "No matching internal components", (Throwable) null);
            return null;
        }
        ComponentInfo componentInfo2 = (ComponentInfo) arrayList.get(0);
        intent.setComponent(new ComponentName(componentInfo2.packageName, componentInfo2.name));
        return intent;
    }

    public final Intent A09(Context context, Intent intent, String str) {
        String str2;
        String A01;
        C16050sO A00 = AnonymousClass0sB.A00(context, intent);
        if (A00 != null) {
            str2 = A00.A01();
        } else {
            str2 = null;
        }
        String packageName = context.getPackageName();
        if (!packageName.equals(str2)) {
            if (A00 == null) {
                A01 = "no_app_identity";
            } else if (A00.A01() == null) {
                A01 = "null";
            } else {
                A01 = A00.A01();
            }
            String format = String.format("Access denied. %s cannot receive broadcasts from %s", new Object[]{packageName, A01});
            boolean A0F = A0F();
            C16240si r1 = this.A02;
            if (A0F) {
                r1.Ccw("InternalIntentScope", AnonymousClass00U.A0L("Fail-open: ", format), (Throwable) null);
            } else {
                r1.Ccw("InternalIntentScope", format, new SecurityException(format));
                return null;
            }
        }
        return intent;
    }

    public final Integer A0B() {
        return AnonymousClass006.A00;
    }
}
