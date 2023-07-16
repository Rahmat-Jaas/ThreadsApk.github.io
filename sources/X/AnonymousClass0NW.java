package X;

import com.facebook.errorreporting.lacrima.common.IDxLProviderShape25S0000000_I2;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0NW  reason: invalid class name */
public final class AnonymousClass0NW {
    public static void A00(String str, String str2, String str3, String str4, String str5, String str6, Throwable th, Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        AnonymousClass0NV.A02(AnonymousClass0MU.A4c, AnonymousClass0MN.A01(th), hashMap);
        AnonymousClass0NV.A03(str, str2, str3, str4, hashMap);
        AnonymousClass0NV.A04(str5, str6, hashMap);
        AnonymousClass0NV.A00().A05("android_large_soft_error", hashMap);
    }

    public static void A01(String str, String str2, String str3, String str4, Throwable th, Map map) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        AnonymousClass0NV.A03(str, str2, str3, str4, hashMap);
        AnonymousClass0NV.A02(AnonymousClass0MU.A45, "j", hashMap);
        if (th != null) {
            AnonymousClass0NV.A02(AnonymousClass0MU.A5k, AnonymousClass0MN.A01(th), hashMap);
        }
        AnonymousClass0NV.A00().A05("android_critical_java", hashMap);
        AnonymousClass0ON r2 = AnonymousClass0MU.A6E;
        IDxLProviderShape25S0000000_I2 iDxLProviderShape25S0000000_I2 = new IDxLProviderShape25S0000000_I2(0);
        synchronized (AnonymousClass0NV.A0D) {
            AnonymousClass0NV.A02(r2, (String) iDxLProviderShape25S0000000_I2.get(), hashMap);
        }
        AnonymousClass0NV.A00().A05("android_large_java", hashMap);
    }
}
