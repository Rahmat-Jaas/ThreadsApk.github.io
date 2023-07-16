package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.ArrayMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.7M8  reason: invalid class name */
public final class AnonymousClass7M8 implements SharedPreferences {
    public static final Map A09 = Collections.synchronizedMap(new ArrayMap());
    public C111896ob A00;
    public C146808mt A01;
    public Map A02 = Collections.synchronizedMap(new ArrayMap());
    public final Context A03;
    public final C145538kf A04;
    public final C146218lq A05;
    public final Object A06 = C86144wL.A0d();
    public final CopyOnWriteArraySet A07 = new CopyOnWriteArraySet();
    public final CountDownLatch A08 = new CountDownLatch(1);

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0057, code lost:
        r9.A05 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0049, code lost:
        if (r1 == null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004f, code lost:
        if (X.AnonymousClass7Cx.A01(r1) == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0051, code lost:
        r0 = X.AnonymousClass7Cx.A00(r10, r1, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0055, code lost:
        if (r0 == null) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnonymousClass7M8(android.content.Context r10, java.lang.String r11) {
        /*
            r9 = this;
            r9.<init>()
            r0 = 1600933330(0x5f6c4dd2, float:1.7027497E19)
            int r4 = X.C14030oh.A03(r0)
            android.util.ArrayMap r0 = new android.util.ArrayMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r9.A02 = r0
            java.lang.Object r0 = X.C86144wL.A0d()
            r9.A06 = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r9.A07 = r0
            r1 = 1
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r0.<init>(r1)
            r9.A08 = r0
            r9.A03 = r10
            r8 = 0
            android.content.SharedPreferences r0 = r10.getSharedPreferences(r11, r8)
            java.lang.String r6 = "transformer_type"
            java.lang.String r7 = X.C18200wM.A0h(r0, r6)
            java.lang.Integer[] r5 = X.C18240wQ.A1Z()
            int r3 = r5.length
            r2 = 0
        L_0x003d:
            if (r2 >= r3) goto L_0x007d
            r1 = r5[r2]
            java.lang.String r0 = X.C101616Ry.A00(r1)
            if (r0 != 0) goto L_0x0073
            if (r7 != 0) goto L_0x007a
        L_0x0049:
            if (r1 == 0) goto L_0x007d
            boolean r0 = X.AnonymousClass7Cx.A01(r1)
            if (r0 == 0) goto L_0x007d
            X.8lq r0 = X.AnonymousClass7Cx.A00(r10, r1, r11)
            if (r0 == 0) goto L_0x007d
            r9.A05 = r0
        L_0x0059:
            X.8kf r0 = X.C31155GhB.A00()
            r9.A04 = r0
            r0 = -1275457106(0xffffffffb3fa11ae, float:-1.1644748E-7)
            X.C14030oh.A0A(r0, r4)
            r0 = 1076532484(0x402a9504, float:2.6653452)
            int r1 = X.C14030oh.A03(r0)
            r0 = 314831134(0x12c3f11e, float:1.236567E-27)
            X.C14030oh.A0A(r0, r1)
            return
        L_0x0073:
            boolean r0 = r0.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x007a
            goto L_0x0049
        L_0x007a:
            int r2 = r2 + 1
            goto L_0x003d
        L_0x007d:
            java.lang.Integer[] r7 = X.AnonymousClass7Cx.A00
            int r5 = r7.length
            r3 = 0
        L_0x0081:
            if (r3 >= r5) goto L_0x00ae
            r1 = r7[r3]
            boolean r0 = X.AnonymousClass7Cx.A01(r1)
            if (r0 == 0) goto L_0x00ab
            X.8lq r2 = X.AnonymousClass7Cx.A00(r10, r1, r11)
            if (r2 == 0) goto L_0x00ab
            java.lang.String r0 = r2.getName()
            android.content.SharedPreferences r0 = r10.getSharedPreferences(r0, r8)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.Integer r0 = r2.BJ1()
            java.lang.String r0 = X.C101616Ry.A00(r0)
            X.C18180wK.A0v(r1, r6, r0)
        L_0x00a8:
            r9.A05 = r2
            goto L_0x0059
        L_0x00ab:
            int r3 = r3 + 1
            goto L_0x0081
        L_0x00ae:
            X.4Bx r2 = new X.4Bx
            r2.<init>(r10, r11)
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7M8.<init>(android.content.Context, java.lang.String):void");
    }

    private Object A00(String str, Object obj) {
        int A032 = C14030oh.A03(-1505933060);
        A01();
        synchronized (this.A06) {
            try {
                Object obj2 = this.A02.get(str);
                if (obj2 != null) {
                    obj = obj2;
                }
            } catch (Throwable th) {
                while (true) {
                    C14030oh.A0A(996442631, A032);
                    throw th;
                }
            }
        }
        C14030oh.A0A(-1939977964, A032);
        return obj;
    }

    private void A01() {
        int A032 = C14030oh.A03(-202323271);
        if (Looper.myLooper() == Looper.getMainLooper() && this.A08.getCount() > 0) {
            C10450iM.A07("EncryptedSharedPrefs_awaitLoaded_onMainThread", new Exception());
        }
        try {
            this.A08.await();
        } catch (InterruptedException e) {
            C10450iM.A07("EncryptedSharedPrefs_awaitLoaded_interrupted", e);
        }
        C14030oh.A0A(-1323782161, A032);
    }

    public final boolean contains(String str) {
        boolean containsKey;
        int A032 = C14030oh.A03(-672662717);
        A01();
        synchronized (this.A06) {
            try {
                containsKey = this.A02.containsKey(str);
            } catch (Throwable th) {
                while (true) {
                    C14030oh.A0A(690115455, A032);
                    throw th;
                }
            }
        }
        C14030oh.A0A(2014532696, A032);
        return containsKey;
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor edit() {
        int A032 = C14030oh.A03(1294893344);
        int A033 = C14030oh.A03(1997504302);
        A01();
        AnonymousClass7M7 r1 = new AnonymousClass7M7(this);
        C14030oh.A0A(413305486, A033);
        C14030oh.A0A(1770509925, A032);
        return r1;
    }

    public final Map getAll() {
        HashMap A0j;
        int A032 = C14030oh.A03(69718043);
        A01();
        synchronized (this.A06) {
            try {
                A0j = C86164wN.A0j(this.A02);
            } catch (Throwable th) {
                while (true) {
                    C14030oh.A0A(2070442821, A032);
                    throw th;
                }
            }
        }
        C14030oh.A0A(-1209791716, A032);
        return A0j;
    }

    public final boolean getBoolean(String str, boolean z) {
        int A032 = C14030oh.A03(-57953491);
        boolean A1X = AnonymousClass0wJ.A1X(A00(str, Boolean.valueOf(z)));
        C14030oh.A0A(-482867039, A032);
        return A1X;
    }

    public final float getFloat(String str, float f) {
        int A032 = C14030oh.A03(-1258137148);
        float A002 = C18240wQ.A00(A00(str, Float.valueOf(f)));
        C14030oh.A0A(-1654660068, A032);
        return A002;
    }

    public final int getInt(String str, int i) {
        int A032 = C14030oh.A03(-1156680277);
        int A042 = AnonymousClass0wJ.A04(A00(str, Integer.valueOf(i)));
        C14030oh.A0A(-1637823457, A032);
        return A042;
    }

    public final long getLong(String str, long j) {
        int A032 = C14030oh.A03(-933570508);
        long A082 = C18190wL.A08(A00(str, Long.valueOf(j)));
        C14030oh.A0A(-114935842, A032);
        return A082;
    }

    public final String getString(String str, String str2) {
        int A032 = C14030oh.A03(-573993019);
        String str3 = (String) A00(str, str2);
        C14030oh.A0A(-272611614, A032);
        return str3;
    }

    public final Set getStringSet(String str, Set set) {
        int A032 = C14030oh.A03(-2082589080);
        Set set2 = (Set) A00(str, set);
        C14030oh.A0A(-653781812, A032);
        return set2;
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int A032 = C14030oh.A03(1284932394);
        this.A07.add(onSharedPreferenceChangeListener);
        C14030oh.A0A(-854971396, A032);
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int A032 = C14030oh.A03(-205434761);
        this.A07.remove(onSharedPreferenceChangeListener);
        C14030oh.A0A(-367345320, A032);
    }
}
