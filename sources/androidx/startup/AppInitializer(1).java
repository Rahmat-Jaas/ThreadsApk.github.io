package androidx.startup;

import X.AnonymousClass075;
import X.AnonymousClass078;
import X.AnonymousClass07B;
import X.AnonymousClass07C;
import android.content.Context;
import android.os.Bundle;
import com.instagram.barcelona.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class AppInitializer {
    public static final Object A03 = new Object();
    public static volatile AppInitializer A04;
    public final Context A00;
    public final Map A01 = new HashMap();
    public final Set A02 = new HashSet();

    public static AppInitializer getInstance(Context context) {
        if (A04 == null) {
            synchronized (A03) {
                if (A04 == null) {
                    A04 = new AppInitializer(context);
                }
            }
        }
        return A04;
    }

    public void discoverAndInitialize(Bundle bundle) {
        String string = this.A00.getString(R.string.f0nameremoved);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, (String) null))) {
                        Class<?> cls = Class.forName(str);
                        if (AnonymousClass075.class.isAssignableFrom(cls)) {
                            this.A02.add(cls);
                        }
                    }
                }
                for (Class A002 : this.A02) {
                    A00(this, A002, hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new AnonymousClass078(e);
            }
        }
    }

    public AppInitializer(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public static Object A00(AppInitializer appInitializer, Class cls, Set set) {
        Throwable th;
        Object obj;
        if (AnonymousClass07B.A00()) {
            try {
                AnonymousClass07C.A01(cls.getSimpleName());
            } catch (Throwable th2) {
                AnonymousClass07C.A00();
                throw th2;
            }
        }
        if (!set.contains(cls)) {
            Map map = appInitializer.A01;
            if (!map.containsKey(cls)) {
                set.add(cls);
                AnonymousClass075 r3 = (AnonymousClass075) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> AHd = r3.AHd();
                if (!AHd.isEmpty()) {
                    for (Class cls2 : AHd) {
                        if (!map.containsKey(cls2)) {
                            A00(appInitializer, cls2, set);
                        }
                    }
                }
                obj = r3.AFB(appInitializer.A00);
                set.remove(cls);
                map.put(cls, obj);
            } else {
                obj = map.get(cls);
            }
            AnonymousClass07C.A00();
            return obj;
        }
        th = new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
        throw th;
    }
}
