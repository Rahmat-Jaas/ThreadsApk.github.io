package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0EJ  reason: invalid class name */
public final class AnonymousClass0EJ extends C16980u6 {
    private boolean A01(Context context, ApplicationInfo applicationInfo, ApplicationInfo applicationInfo2) {
        try {
            return C15980sH.A05(context, applicationInfo.uid, applicationInfo2.uid);
        } catch (SecurityException e) {
            this.A02.Ccw("SameKeyIntentScope", AnonymousClass00U.A0L("Unexpected exception in verifying signature for: ", applicationInfo2.packageName), e);
            return A0F();
        }
    }

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
        C16240si r4 = this.A02;
        AnonymousClass0sB.A02(context, intent, r4, str);
        List A0C = A0C(context, intent);
        if (A0C.isEmpty()) {
            r4.Ccw("SameKeyIntentScope", "No matching same-key packages", (Throwable) null);
        }
        return A0C;
    }

    public AnonymousClass0EJ(C16350su r1, C16250sj r2, C16240si r3) {
        super(r1, r2, r3);
    }

    private Intent A00(Context context, Intent intent, List list) {
        C16830to A00;
        Integer num;
        ArrayList arrayList = new ArrayList(list.size());
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            this.A02.Ccw("SameKeyIntentScope", "Current app info is null.", (Throwable) null);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ComponentInfo componentInfo = (ComponentInfo) it.next();
                ApplicationInfo applicationInfo2 = componentInfo.applicationInfo;
                if (applicationInfo2 == null) {
                    this.A02.Ccw("SameKeyIntentScope", "Target app info is null.", (Throwable) null);
                } else if (A01(context, applicationInfo, applicationInfo2)) {
                    arrayList.add(componentInfo);
                } else {
                    boolean A0F = A0F();
                    C16240si r2 = this.A02;
                    Object[] objArr = {applicationInfo.packageName, applicationInfo2.packageName};
                    if (A0F) {
                        r2.Ccw("SameKeyIntentScope", String.format("Different signature of the component but fail-open: current app=%s, target app=%s.", objArr), (Throwable) null);
                        arrayList.add(componentInfo);
                    } else {
                        r2.Ccw("SameKeyIntentScope", String.format("Different signature component blocked: current app=%s, target app=%s.", objArr), (Throwable) null);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            this.A02.Ccw("SameKeyIntentScope", "No matching same-key components.", (Throwable) null);
            return null;
        }
        Integer num2 = this.A03;
        ComponentInfo componentInfo2 = (ComponentInfo) arrayList.get(0);
        if (arrayList.size() > 1) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ComponentInfo componentInfo3 = (ComponentInfo) it2.next();
                if (!context.getPackageName().equals(componentInfo3.packageName)) {
                    num = AnonymousClass006.A01;
                    continue;
                } else {
                    num = AnonymousClass006.A00;
                    continue;
                }
                if (num2 == num) {
                    componentInfo2 = componentInfo3;
                    break;
                }
            }
        }
        ComponentName componentName = new ComponentName(componentInfo2.packageName, componentInfo2.name);
        intent.setComponent(componentName);
        if (arrayList.size() > 1 && componentName.getPackageName() != context.getPackageName()) {
            C16240si r5 = this.A02;
            String action = intent.getAction();
            if (intent.getData() == null) {
                A00 = null;
            } else {
                A00 = C10730ip.A00(intent.getData(), C16830to.A04);
            }
            r5.Ccw("SameKeyIntentScope", String.format("multiple same-key components and use different package: action %s, uri %s, categories %s, component %s, context package %s", new Object[]{action, A00, intent.getCategories(), componentName.toString(), context.getPackageName()}), (Throwable) null);
        }
        return intent;
    }

    public final Intent A09(Context context, Intent intent, String str) {
        int i;
        boolean z;
        int i2 = context.getApplicationInfo().uid;
        C16050sO A00 = AnonymousClass0sB.A00(context, intent);
        if (A00 == null) {
            i = -1;
        } else {
            i = A00.A00;
        }
        try {
            z = C15980sH.A05(context, i2, i);
        } catch (SecurityException e) {
            this.A02.Ccw("SameKeyIntentScope", AnonymousClass00U.A0J("Unexpected exception in verifying signature for: ", i), e);
            z = A0F();
        }
        if (z) {
            return intent;
        }
        String format = String.format("Access denied. Process %d cannot receive broadcasts from %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)});
        this.A02.Ccw("SameKeyIntentScope", format, (Throwable) null);
        throw new SecurityException(format);
    }

    public final Integer A0B() {
        return AnonymousClass006.A01;
    }

    public final boolean A0G(Context context, PackageInfo packageInfo) {
        return A01(context, context.getApplicationInfo(), packageInfo.applicationInfo);
    }
}
