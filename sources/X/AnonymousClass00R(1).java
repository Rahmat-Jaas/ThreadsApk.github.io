package X;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry$1;
import com.facebook.common.dextricks.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* renamed from: X.00R  reason: invalid class name */
public abstract class AnonymousClass00R {
    public ArrayList A00 = new ArrayList();
    public Random A01 = new Random();
    public final Bundle A02 = new Bundle();
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();
    public final Map A06 = new HashMap();
    public final transient Map A07 = new HashMap();

    public abstract void A03(AnonymousClass00X r1, C62233Xw r2, Object obj, int i);

    private void A00(String str) {
        Map map = this.A03;
        if (map.get(str) == null) {
            int nextInt = this.A01.nextInt(2147418112);
            while (true) {
                int i = nextInt + Constants.LOAD_RESULT_PGO_ATTEMPTED;
                Map map2 = this.A05;
                Integer valueOf = Integer.valueOf(i);
                if (map2.containsKey(valueOf)) {
                    nextInt = this.A01.nextInt(2147418112);
                } else {
                    map2.put(valueOf, str);
                    map.put(str, valueOf);
                    return;
                }
            }
        }
    }

    public final void A04(String str) {
        Object remove;
        if (!this.A00.contains(str) && (remove = this.A03.remove(str)) != null) {
            this.A05.remove(remove);
        }
        this.A07.remove(str);
        Map map = this.A04;
        if (map.containsKey(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Dropping pending result for request ");
            sb.append(str);
            sb.append(": ");
            sb.append(map.get(str));
            Log.w("ActivityResultRegistry", sb.toString());
            map.remove(str);
        }
        Bundle bundle = this.A02;
        if (bundle.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Dropping pending result for request ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", sb2.toString());
            bundle.remove(str);
        }
        Map map2 = this.A06;
        AnonymousClass00Q r4 = (AnonymousClass00Q) map2.get(str);
        if (r4 != null) {
            ArrayList arrayList = r4.A01;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r4.A00.A08((AnonymousClass065) it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }

    public final boolean A05(Intent intent, int i, int i2) {
        AnonymousClass00M r1;
        String str = (String) this.A05.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        AnonymousClass00P r2 = (AnonymousClass00P) this.A07.get(str);
        if (r2 == null || (r1 = r2.A00) == null || !this.A00.contains(str)) {
            this.A04.remove(str);
            this.A02.putParcelable(str, new ActivityResult(i2, intent));
            return true;
        }
        r1.BjZ(r2.A01.A04(intent, i2));
        this.A00.remove(str);
        return true;
    }

    public final AnonymousClass00O A01(AnonymousClass00M r6, AnonymousClass00X r7, AnonymousClass066 r8, String str) {
        AnonymousClass062 lifecycle = r8.getLifecycle();
        C14340pE r2 = (C14340pE) lifecycle;
        if (!r2.A00.A00(AnonymousClass061.STARTED)) {
            A00(str);
            Map map = this.A06;
            AnonymousClass00Q r22 = (AnonymousClass00Q) map.get(str);
            if (r22 == null) {
                r22 = new AnonymousClass00Q(lifecycle);
            }
            ActivityResultRegistry$1 activityResultRegistry$1 = new ActivityResultRegistry$1(r6, this, r7, str);
            r22.A00.A07(activityResultRegistry$1);
            r22.A01.add(activityResultRegistry$1);
            map.put(str, r22);
            return new C019108x(this, r7);
        }
        StringBuilder sb = new StringBuilder("LifecycleOwner ");
        sb.append(r8);
        sb.append(" is attempting to register while current state is ");
        sb.append(r2.A00);
        sb.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb.toString());
    }

    public final AnonymousClass00O A02(AnonymousClass00M r3, AnonymousClass00X r4, String str) {
        A00(str);
        this.A07.put(str, new AnonymousClass00P(r3, r4));
        Map map = this.A04;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            r3.BjZ(obj);
        }
        Bundle bundle = this.A02;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            r3.BjZ(r4.A04(activityResult.A01, activityResult.A00));
        }
        return new C017308f(this, r4, str);
    }
}
