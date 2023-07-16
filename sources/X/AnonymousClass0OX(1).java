package X;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0OX  reason: invalid class name */
public final class AnonymousClass0OX {
    public final Context A00;
    public final AnonymousClass0P7 A01 = AnonymousClass0P7.A00;
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();

    public final C09740gb A00(Class cls, String str) {
        Object obj;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i < 3) {
                ConcurrentHashMap concurrentHashMap = this.A02;
                obj = concurrentHashMap.get(cls);
                if (obj != null) {
                    break;
                }
                try {
                    obj = this.A00.getSystemService(str);
                    if (obj != null && cls.isInstance(obj)) {
                        concurrentHashMap.putIfAbsent(cls, obj);
                        break;
                    }
                } catch (Exception unused) {
                }
                i = i2;
            } else {
                AnonymousClass0LU.A0O("SystemServiceManager", "Cannot get system service after MAX_RETRIES: %s", cls.getName());
                return C12730mO.A00;
            }
        }
        return new C12760mR(obj);
    }

    public AnonymousClass0OX(Context context) {
        this.A00 = context;
    }
}
