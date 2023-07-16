package X;

import android.content.SharedPreferences;
import com.instagram.common.task.IDxLTaskShape29S0300000_2_I2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7M7  reason: invalid class name */
public final class AnonymousClass7M7 implements SharedPreferences.Editor {
    public final Object A00 = C86144wL.A0d();
    public final Map A01 = AnonymousClass0wJ.A0y();
    public final /* synthetic */ AnonymousClass7M8 A02;

    public AnonymousClass7M7(AnonymousClass7M8 r3) {
        this.A02 = r3;
        int A03 = C14030oh.A03(1376558952);
        C14030oh.A0A(-1098578504, A03);
    }

    public static void A00(AnonymousClass7M7 r6, Set set) {
        int A03 = C14030oh.A03(-1542822346);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            AnonymousClass7M8 r2 = r6.A02;
            Iterator it2 = r2.A07.iterator();
            while (it2.hasNext()) {
                ((SharedPreferences.OnSharedPreferenceChangeListener) it2.next()).onSharedPreferenceChanged(r2, A0k);
            }
        }
        C14030oh.A0A(2101402947, A03);
    }

    private void A01(HashMap hashMap) {
        int A03 = C14030oh.A03(-997902121);
        Iterator A0u = C18190wL.A0u(hashMap);
        while (A0u.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0u);
            Object key = A0o.getKey();
            Object value = A0o.getValue();
            Map map = this.A02.A02;
            if (value == null) {
                map.remove(key);
            } else {
                map.put(key, value);
            }
        }
        C14030oh.A0A(1311280045, A03);
    }

    public final void apply() {
        HashMap A0j;
        int A03 = C14030oh.A03(-240198440);
        AnonymousClass7M8 r7 = this.A02;
        synchronized (r7.A06) {
            try {
                synchronized (this.A00) {
                    A0j = C86164wN.A0j(this.A01);
                }
                A01(A0j);
                r7.A04.schedule(new IDxLTaskShape29S0300000_2_I2(0, C86164wN.A0j(r7.A02), this, A0j.keySet()));
            } catch (Throwable th) {
                C14030oh.A0A(359217271, A03);
                throw th;
            }
        }
        C14030oh.A0A(1761489124, A03);
    }

    public final SharedPreferences.Editor clear() {
        int A03 = C14030oh.A03(-1339135936);
        synchronized (this.A00) {
            try {
                Iterator A0x = C18220wO.A0x(this.A02.A02);
                while (A0x.hasNext()) {
                    this.A01.put(C18180wK.A0k(A0x), (Object) null);
                }
            } catch (Throwable th) {
                while (true) {
                    C14030oh.A0A(1714204686, A03);
                    throw th;
                }
            }
        }
        C14030oh.A0A(-548350664, A03);
        return this;
    }

    public final boolean commit() {
        HashMap A0j;
        Set keySet;
        int A03 = C14030oh.A03(-1724877419);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AnonymousClass7M8 r9 = this.A02;
        synchronized (r9.A06) {
            try {
                synchronized (this.A00) {
                    A0j = C86164wN.A0j(this.A01);
                }
                A01(A0j);
                HashMap A0j2 = C86164wN.A0j(r9.A02);
                keySet = A0j.keySet();
                r9.A04.schedule(new C132607uC(this, A0j2, countDownLatch, atomicBoolean));
            } catch (Throwable th) {
                C14030oh.A0A(-416420332, A03);
                throw th;
            }
        }
        try {
            if (!countDownLatch.await(5, TimeUnit.SECONDS)) {
                C10450iM.A03("EncryptedSharedPrefs_commit_timedOut", "Timed out waiting for commit to complete.");
                C14030oh.A0A(753579580, A03);
                return false;
            }
            boolean z = atomicBoolean.get();
            if (z) {
                keySet.getClass();
                if (!keySet.isEmpty()) {
                    A00(this, keySet);
                }
            }
            C14030oh.A0A(-1524777310, A03);
            return z;
        } catch (InterruptedException e) {
            C10450iM.A07("EncryptedSharedPrefs_commit_interrupted", e);
            C14030oh.A0A(-1808759222, A03);
            return false;
        }
    }

    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        int A03 = C14030oh.A03(1007991373);
        synchronized (this.A00) {
            try {
                C86154wM.A1U(str, this.A01, z);
            } catch (Throwable th) {
                while (true) {
                    C14030oh.A0A(-201788752, A03);
                    throw th;
                }
            }
        }
        C14030oh.A0A(-27655855, A03);
        return this;
    }

    public final SharedPreferences.Editor putFloat(String str, float f) {
        int A03 = C14030oh.A03(1904793230);
        synchronized (this.A00) {
            try {
                this.A01.put(str, Float.valueOf(f));
            } catch (Throwable th) {
                while (true) {
                    C14030oh.A0A(992453712, A03);
                    throw th;
                }
            }
        }
        C14030oh.A0A(1038560459, A03);
        return this;
    }

    public final SharedPreferences.Editor putInt(String str, int i) {
        int A03 = C14030oh.A03(197580132);
        synchronized (this.A00) {
            try {
                C86154wM.A1T(str, this.A01, i);
            } catch (Throwable th) {
                while (true) {
                    C14030oh.A0A(-1106408722, A03);
                    throw th;
                }
            }
        }
        C14030oh.A0A(1539217503, A03);
        return this;
    }

    public final SharedPreferences.Editor putLong(String str, long j) {
        int A03 = C14030oh.A03(-1773933412);
        synchronized (this.A00) {
            try {
                this.A01.put(str, Long.valueOf(j));
            } catch (Throwable th) {
                while (true) {
                    C14030oh.A0A(829017319, A03);
                    throw th;
                }
            }
        }
        C14030oh.A0A(1085574366, A03);
        return this;
    }

    public final SharedPreferences.Editor putString(String str, String str2) {
        int A03 = C14030oh.A03(1179237999);
        synchronized (this.A00) {
            try {
                this.A01.put(str, str2);
            } catch (Throwable th) {
                while (true) {
                    C14030oh.A0A(-381436492, A03);
                    throw th;
                }
            }
        }
        C14030oh.A0A(-1485382964, A03);
        return this;
    }

    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        int A03 = C14030oh.A03(1848007994);
        synchronized (this.A00) {
            try {
                this.A01.put(str, set);
            } catch (Throwable th) {
                while (true) {
                    C14030oh.A0A(-433803450, A03);
                    throw th;
                }
            }
        }
        C14030oh.A0A(-1788916929, A03);
        return this;
    }

    public final SharedPreferences.Editor remove(String str) {
        int A03 = C14030oh.A03(1576692666);
        synchronized (this.A00) {
            try {
                this.A01.put(str, (Object) null);
            } catch (Throwable th) {
                while (true) {
                    C14030oh.A0A(1224858454, A03);
                    throw th;
                }
            }
        }
        C14030oh.A0A(-1082026171, A03);
        return this;
    }
}
