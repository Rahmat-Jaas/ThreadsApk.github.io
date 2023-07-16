package X;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0sv  reason: invalid class name and case insensitive filesystem */
public final class C16360sv {
    public static void A00(Intent intent, C16240si r8, boolean z) {
        Object[] objArr;
        String str;
        if (intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            Set<String> keySet = extras.keySet();
            ArrayList arrayList = new ArrayList();
            for (String next : keySet) {
                Object obj = extras.get(next);
                if (obj != null && AnonymousClass058.class.getClassLoader().equals(obj.getClass().getClassLoader())) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!z) {
                    intent.removeExtra(str2);
                    objArr = new Object[]{str2, extras.get(str2)};
                    str = "Removed an internal class in a different-key intent: %s => %s";
                } else {
                    objArr = new Object[]{str2, extras.get(str2)};
                    str = "Found an internal class in a different-key intent but not removing: %s => %s";
                }
                r8.Ccw("ExternalIntentSanitization", String.format(str, objArr), (Throwable) null);
            }
        }
    }
}
