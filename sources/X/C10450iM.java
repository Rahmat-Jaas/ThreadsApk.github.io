package X;

import com.facebook.redex.IDxProviderShape104S0000000_I2;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0iM  reason: invalid class name and case insensitive filesystem */
public final class C10450iM {
    public static volatile AnonymousClass0IB A00;

    public static void A08(String str, Throwable th) {
        A00().Cua(str, th, 1);
    }

    public static AnonymousClass0IB A00() {
        if (A00 == null) {
            A01();
        }
        return A00;
    }

    public static synchronized void A01() {
        synchronized (C10450iM.class) {
            if (A00 == null) {
                IDxProviderShape104S0000000_I2 iDxProviderShape104S0000000_I2 = new IDxProviderShape104S0000000_I2(1);
                IDxProviderShape104S0000000_I2 iDxProviderShape104S0000000_I22 = new IDxProviderShape104S0000000_I2(2);
                synchronized (C10460iN.class) {
                    if (C10460iN.A00 == null) {
                        C10460iN.A00 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new AnonymousClass0iP());
                    }
                }
                A00 = new AnonymousClass0PY(new C26148E0u(), new Random(), C10460iN.A00, iDxProviderShape104S0000000_I2, iDxProviderShape104S0000000_I22);
            }
        }
    }

    public static void A02(String str, Integer num, String str2) {
        Integer num2;
        AnonymousClass0IB A002 = A00();
        switch (num.intValue()) {
            case 0:
                num2 = AnonymousClass006.A00;
                break;
            case 1:
                num2 = AnonymousClass006.A01;
                break;
            case 2:
                num2 = AnonymousClass006.A0C;
                break;
            case 3:
                num2 = AnonymousClass006.A0N;
                break;
            case 4:
                num2 = AnonymousClass006.A0Y;
                break;
            case 5:
                num2 = AnonymousClass006.A0j;
                break;
            case 6:
                num2 = AnonymousClass006.A0u;
                break;
            default:
                num2 = AnonymousClass006.A15;
                break;
        }
        A002.Ccz(str, num2, str2);
    }

    public static void A03(String str, String str2) {
        A00().CuW(str, str2);
    }

    public static void A04(String str, String str2, int i) {
        A00().CuX(str, str2, i);
    }

    public static void A05(String str, String str2, int i, Throwable th) {
        A00().Cuc(str, str2, i, th);
    }

    public static void A06(String str, String str2, Throwable th) {
        A00().CuY(str, str2, th);
    }

    public static void A07(String str, Throwable th) {
        A00().CuZ(str, th);
    }
}
