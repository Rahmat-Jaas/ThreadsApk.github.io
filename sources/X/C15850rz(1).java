package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0rz  reason: invalid class name and case insensitive filesystem */
public final class C15850rz {
    public static C15850rz A01;
    public C16240si A00 = new C16390sy();

    public static List A00(Context context, String str) {
        List emptyList = Collections.emptyList();
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(str, 128).metaData;
            ArrayList arrayList = emptyList;
            if (bundle != null) {
                arrayList = emptyList;
                if (bundle.size() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (String next : bundle.keySet()) {
                        if (next.contains(".fbpermission.")) {
                            arrayList2.add(next);
                        }
                    }
                    arrayList = arrayList2;
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException unused) {
            return Collections.emptyList();
        }
    }
}
