package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0u6  reason: invalid class name and case insensitive filesystem */
public abstract class C16980u6 {
    public final C16350su A00;
    public final C16250sj A01;
    public final C16240si A02;
    public final Integer A03;

    public abstract Intent A08(Context context, Intent intent, String str);

    public abstract Intent A09(Context context, Intent intent, String str);

    public abstract Intent A0A(Context context, Intent intent, String str);

    public abstract Integer A0B();

    public abstract List A0D(Context context, Intent intent, String str);

    public abstract boolean A0G(Context context, PackageInfo packageInfo);

    public C16980u6(C16350su r2, C16250sj r3, C16240si r4) {
        Integer num = AnonymousClass006.A01;
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = num;
    }

    public static String A03(Intent intent) {
        if (intent == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("intent(");
        sb.append("action = ");
        sb.append(intent.getAction());
        sb.append(", data= ");
        sb.append(intent.getData());
        sb.append(", type= ");
        sb.append(intent.getType());
        if (intent.getComponent() != null) {
            sb.append(", component = ");
            sb.append(intent.getComponent());
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            sb.append(", extras = [");
            for (String next : extras.keySet()) {
                sb.append(next);
                sb.append(" = ");
                sb.append(extras.get(next));
                sb.append(", ");
            }
            sb.append("]");
        }
        sb.append(")");
        return sb.toString();
    }

    public final boolean A0E() {
        Integer num;
        C16350su r1 = this.A00;
        synchronized (r1) {
            num = r1.A00;
        }
        if (num == AnonymousClass006.A0N) {
            return true;
        }
        return false;
    }

    public final boolean A0F() {
        Integer num;
        C16350su r1 = this.A00;
        synchronized (r1) {
            num = r1.A00;
        }
        if (num == AnonymousClass006.A00) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.content.Intent[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent A02(java.util.List r5) {
        /*
            int r0 = r5.size()
            int r0 = r0 + -1
            android.content.Intent[] r4 = new android.content.Intent[r0]
            r3 = 0
            r2 = 0
        L_0x000a:
            int r0 = r5.size()
            int r0 = r0 + -1
            if (r2 >= r0) goto L_0x001c
            int r1 = r2 + 1
            java.lang.Object r0 = r5.get(r1)
            r4[r2] = r0
            r2 = r1
            goto L_0x000a
        L_0x001c:
            java.lang.Object r1 = r5.get(r3)
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.String r0 = "Choose an app to launch."
            android.content.Intent r1 = android.content.Intent.createChooser(r1, r0)
            java.lang.String r0 = "android.intent.extra.INITIAL_INTENTS"
            r1.putExtra(r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16980u6.A02(java.util.List):android.content.Intent");
    }

    public static List A04(Context context, Intent intent, int i) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, i);
        if (queryIntentActivities == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(1);
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!(activityInfo == null || activityInfo.applicationInfo == null)) {
                arrayList.add(activityInfo);
            }
        }
        return arrayList;
    }

    public static List A05(Context context, Intent intent, int i) {
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, i);
        if (queryIntentServices == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(1);
        for (ResolveInfo resolveInfo : queryIntentServices) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (!(serviceInfo == null || serviceInfo.applicationInfo == null)) {
                arrayList.add(serviceInfo);
            }
        }
        return arrayList;
    }

    public static List A06(Intent intent, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ComponentInfo componentInfo = (ComponentInfo) it.next();
            Intent intent2 = new Intent(intent);
            intent2.setComponent(new ComponentName(componentInfo.packageName, componentInfo.name));
            intent2.setPackage(componentInfo.packageName);
            arrayList.add(intent2);
        }
        return arrayList;
    }

    public static boolean A07(Context context, Intent intent) {
        if (intent.getComponent() == null || !intent.getComponent().getPackageName().equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    public final List A0C(Context context, Intent intent) {
        ArrayList<PackageInfo> arrayList;
        List<PackageInfo> list;
        String str = intent.getPackage();
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                str = packageName;
            }
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                if (packageInfo != null) {
                    list = Collections.singletonList(packageInfo);
                } else {
                    list = Collections.emptyList();
                }
            } else {
                list = context.getPackageManager().getInstalledPackages(64);
            }
            arrayList = new ArrayList<>(list.size());
            for (PackageInfo next : list) {
                if (A0G(context, next)) {
                    arrayList.add(next);
                }
            }
        } catch (PackageManager.NameNotFoundException | RuntimeException e) {
            this.A02.Ccw("BaseIntentScope", "Error querying PackageManager.", e);
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (PackageInfo packageInfo2 : arrayList) {
            Intent intent2 = new Intent(intent);
            intent2.setPackage(packageInfo2.packageName);
            arrayList2.add(intent2);
        }
        return arrayList2;
    }
}
