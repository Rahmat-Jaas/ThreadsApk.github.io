package X;

import android.content.Context;
import android.content.pm.ComponentInfo;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.0Tt  reason: invalid class name and case insensitive filesystem */
public final class C05440Tt {
    public static List A00(Context context, ComponentInfo[] componentInfoArr) {
        LinkedList linkedList = new LinkedList();
        if (componentInfoArr != null) {
            String A0V = AnonymousClass00U.A0V(context.getPackageName(), ":", "nodex");
            for (ComponentInfo componentInfo : componentInfoArr) {
                boolean z = componentInfo.metaData != null ? componentInfo.metaData.getBoolean("crash.loop.exclude", false) : false;
                if (!A0V.equals(componentInfo.processName) && !z) {
                    linkedList.add(componentInfo);
                }
            }
        }
        return linkedList;
    }
}
