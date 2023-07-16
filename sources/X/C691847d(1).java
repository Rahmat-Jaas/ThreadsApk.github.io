package X;

import android.app.Activity;
import android.os.Handler;
import com.facebook.systrace.Systrace;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.47d  reason: invalid class name and case insensitive filesystem */
public final class C691847d implements C10420iJ {
    public static long A00;
    public static long A01;
    public static Boolean A02;
    public static Boolean A03;
    public static boolean A04 = true;
    public static boolean A05;
    public static boolean A06;
    public static final Handler A07 = AnonymousClass0wJ.A0F();
    public static final C691847d A08;
    public static final C11900kz A09 = new C11900kz(C09820gj.A00, AnonymousClass0gN.A00(), "backgroundDetector");
    public static final Runnable A0A = AnonymousClass4TL.A00;
    public static final Runnable A0B = AnonymousClass4TM.A00;
    public static final Queue A0C = new ConcurrentLinkedQueue();
    public static final CopyOnWriteArrayList A0D = new CopyOnWriteArrayList();
    public static final CopyOnWriteArrayList A0E = new CopyOnWriteArrayList();
    public static final CopyOnWriteArrayList A0F = new CopyOnWriteArrayList();

    public static final void A02(C10390iG r1) {
        C04220Ms.A0B(r1, 0);
        A0E.addIfAbsent(r1);
    }

    public static final void A03(C10390iG r1) {
        C04220Ms.A0B(r1, 0);
        A0E.remove(r1);
    }

    public static final void A04(C10390iG r1) {
        C04220Ms.A0B(r1, 0);
        A0F.remove(r1);
        A0D.remove(r1);
    }

    public final void BjV(Activity activity) {
    }

    public final void BjW(Activity activity) {
    }

    public final void BjX(Activity activity) {
    }

    public final void Bjc(Activity activity) {
    }

    public final void Bjd(Activity activity) {
    }

    static {
        C691847d r4 = new C691847d();
        A08 = r4;
        C10410iI.A00.A00(r4);
    }

    public static final String A00() {
        Boolean bool = A02;
        if (bool == null) {
            return "unset";
        }
        if (bool.booleanValue()) {
            return "true";
        }
        return "false";
    }

    public static final boolean A05() {
        Boolean bool = A02;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final boolean A06() {
        return C18210wN.A1T(A03);
    }

    public final void A07(C10390iG r2) {
        A0F.addIfAbsent(r2);
    }

    public static final void A01() {
        C63643hy.A02();
        if (Systrace.A0F(1)) {
            C13930oX.A01("notifyAppForegrounded", 558431923);
        }
        try {
            Handler handler = A07;
            handler.removeCallbacks(A0A);
            A04 = false;
            handler.removeCallbacks(A0B);
            if (C18210wN.A1T(A03)) {
                A03 = false;
                Iterator it = A0F.iterator();
                while (it.hasNext()) {
                    ((C10390iG) it.next()).onAppForegrounded();
                }
            } else if (!A06) {
                Iterator it2 = A0D.iterator();
                while (it2.hasNext()) {
                    ((C10390iG) it2.next()).onAppForegrounded();
                }
            }
            A06 = true;
            if (A05()) {
                A02 = false;
                A05 = true;
                Iterator it3 = A0E.iterator();
                while (it3.hasNext()) {
                    ((C10390iG) it3.next()).onAppForegrounded();
                }
            }
        } finally {
            if (Systrace.A0F(1)) {
                C13930oX.A00(-1276471802);
            }
        }
    }

    public final void BjY(Activity activity) {
        C63643hy.A02();
        A04 = true;
        Handler handler = A07;
        handler.postDelayed(A0B, 500);
        C63643hy.A02();
        A04 = true;
        Runnable runnable = A0A;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 5000);
    }

    public final void Bjb(Activity activity) {
        A01();
    }
}
