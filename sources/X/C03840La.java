package X;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: X.0La  reason: invalid class name and case insensitive filesystem */
public final class C03840La extends C020509n {
    public final /* synthetic */ AnonymousClass0PI A00;

    public C03840La(AnonymousClass0PI r1) {
        this.A00 = r1;
    }

    public final void BxA(Object obj, String str, Method method, Object[] objArr, long j) {
        AnonymousClass0PH r1;
        if (str.equals("activity")) {
            try {
                if (method.getName().equals("getContentProvider") && obj != null) {
                    AnonymousClass0PI r5 = this.A00;
                    boolean z = AnonymousClass0PI.A05;
                    char c = 4;
                    if (z) {
                        c = 3;
                    }
                    if (objArr[c].booleanValue()) {
                        char c2 = 2;
                        if (z) {
                            c2 = 1;
                        }
                        String str2 = objArr[c2];
                        C03460Im r12 = r5.A00;
                        IBinder iBinder = (IBinder) r12.A00(obj, "connection");
                        IInterface iInterface = (IInterface) r12.A00(obj, "provider");
                        if (iBinder != null && iInterface != null) {
                            Map map = r5.A02;
                            if (!map.containsKey(iBinder)) {
                                map.put(iBinder, new AnonymousClass0PH(iBinder, iInterface.asBinder(), r5, str2));
                            }
                        }
                    }
                } else if (method.getName().equals("removeContentProvider")) {
                    AnonymousClass0PI r0 = this.A00;
                    Object obj2 = objArr[0];
                    if (obj2 != null && (r1 = (AnonymousClass0PH) r0.A02.remove(obj2)) != null) {
                        r1.A00.unlinkToDeath(r1, 0);
                    }
                }
            } catch (Throwable unused) {
                C04790Pd.A00();
            }
        }
    }
}
