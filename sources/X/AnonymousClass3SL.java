package X;

import android.content.Context;
import com.facebook.redex.IDxFunctionShape362S0100000_2_I2;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.3SL  reason: invalid class name */
public final class AnonymousClass3SL {
    public final Context A00;
    public final String A01;

    public static AnonymousClass7M8 A00(Context context, String str) {
        AnonymousClass7M8 r1;
        AnonymousClass3SL r12 = new AnonymousClass3SL(context, str);
        String str2 = r12.A01;
        IDxFunctionShape362S0100000_2_I2 iDxFunctionShape362S0100000_2_I2 = new IDxFunctionShape362S0100000_2_I2(r12, 4);
        Map map = AnonymousClass7M8.A09;
        synchronized (map) {
            WeakReference weakReference = (WeakReference) map.get(str2);
            if (weakReference == null || (r1 = (AnonymousClass7M8) weakReference.get()) == null) {
                r1 = (AnonymousClass7M8) iDxFunctionShape362S0100000_2_I2.apply(str2);
                r1.getClass();
                map.put(str2, new WeakReference(r1));
            }
        }
        return r1;
    }

    public AnonymousClass3SL(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
    }
}
