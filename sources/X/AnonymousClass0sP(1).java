package X;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0sP  reason: invalid class name */
public final class AnonymousClass0sP {
    public static volatile AnonymousClass0sP A0B;
    public int A00 = -1;
    public int A01 = -1;
    public long A02 = -1;
    public C08620dv A03;
    public final Set A04 = Collections.synchronizedSet(new HashSet());
    public final AtomicBoolean A05 = new AtomicBoolean();
    public final Lock A06;
    public final SharedPreferences A07 = C08340dC.A01("last_django_tier_pref");
    public final Lock A08;
    public final ReadWriteLock A09;
    public volatile Integer A0A = AnonymousClass006.A0N;

    public static AnonymousClass0sP A00() {
        if (A0B == null) {
            synchronized (AnonymousClass0sP.class) {
                if (A0B == null) {
                    A0B = new AnonymousClass0sP();
                }
            }
        }
        return A0B;
    }

    public static void A01(AnonymousClass0sP r8) {
        if (r8.A03 != null) {
            Lock lock = r8.A08;
            lock.lock();
            try {
                if (r8.A05.compareAndSet(false, true)) {
                    int i = r8.A00;
                    long j = r8.A02;
                    String A002 = C10480iQ.A00(r8.A0A);
                    int i2 = r8.A01;
                    C04220Ms.A0B(A002, 2);
                    AnonymousClass0MI.A06(AnonymousClass0MS.A00("request_since_last_C1"), String.valueOf(i));
                    AnonymousClass0MI.A06(AnonymousClass0MS.A00("time_of_last_C1"), String.valueOf(j));
                    AnonymousClass0MI.A06(AnonymousClass0MS.A00("ig_push_phase"), A002);
                    AnonymousClass0MI.A06(AnonymousClass0MS.A00("request_since_last_canary"), String.valueOf(i2));
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public static void A02(AnonymousClass0sP r4, Integer num) {
        if (r4.A0A != num) {
            Set<C13170n9> set = r4.A04;
            synchronized (set) {
                for (C13170n9 CP6 : set) {
                    CP6.CP6(r4.A0A, num);
                }
            }
            r4.A0A = num;
            r4.A07.edit().putString("last_django_tier_pref", C10480iQ.A00(num)).apply();
        }
    }

    public final Integer A03() {
        if (this.A0A == AnonymousClass006.A0N) {
            SharedPreferences sharedPreferences = this.A07;
            if (sharedPreferences.contains("last_django_tier_pref")) {
                String string = sharedPreferences.getString("last_django_tier_pref", "UNKNOWN");
                string.getClass();
                this.A0A = C10490iR.A00(string);
            }
        }
        return this.A0A;
    }

    public AnonymousClass0sP() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(true);
        this.A09 = reentrantReadWriteLock;
        this.A06 = reentrantReadWriteLock.writeLock();
        this.A08 = reentrantReadWriteLock.readLock();
    }
}
