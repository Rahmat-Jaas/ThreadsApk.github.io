package X;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.IDxLambdaShape880S0100000_I2;

/* renamed from: X.00F  reason: invalid class name */
public final class AnonymousClass00F {
    public OnBackInvokedCallback A00;
    public OnBackInvokedDispatcher A01;
    public AnonymousClass0ZU A02;
    public boolean A03;
    public final Runnable A04;
    public final AnonymousClass8AL A05;

    public final void A04(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        C04220Ms.A0B(onBackInvokedDispatcher, 0);
        this.A01 = onBackInvokedDispatcher;
        A03();
    }

    public final void A05(AnonymousClass00C r4, AnonymousClass066 r5) {
        C04220Ms.A0B(r5, 0);
        C04220Ms.A0B(r4, 1);
        AnonymousClass062 lifecycle = r5.getLifecycle();
        if (((C14340pE) lifecycle).A00 != AnonymousClass061.DESTROYED) {
            r4.A02.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(r4, this, lifecycle));
            if (Build.VERSION.SDK_INT >= 33) {
                A03();
                r4.A00 = this.A02;
            }
        }
    }

    public final AnonymousClass001 A01(AnonymousClass00C r4) {
        this.A05.add(r4);
        AnonymousClass094 r2 = new AnonymousClass094(r4, this);
        r4.A02.add(r2);
        if (Build.VERSION.SDK_INT >= 33) {
            A03();
            r4.A00 = this.A02;
        }
        return r2;
    }

    public final void A02() {
        Object obj;
        AnonymousClass8AL r1 = this.A05;
        ListIterator listIterator = r1.listIterator(r1.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((AnonymousClass00C) obj).A01) {
                break;
            }
        }
        AnonymousClass00C r12 = (AnonymousClass00C) obj;
        if (r12 != null) {
            r12.A01();
            return;
        }
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final boolean A06() {
        AnonymousClass8AL r1 = this.A05;
        if (!(r1 instanceof Collection) || !r1.isEmpty()) {
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                if (((AnonymousClass00C) it.next()).A01) {
                    return true;
                }
            }
        }
        return false;
    }

    public AnonymousClass00F(Runnable runnable) {
        this.A04 = runnable;
        this.A05 = new AnonymousClass8AL();
        if (Build.VERSION.SDK_INT >= 33) {
            this.A02 = new IDxLambdaShape880S0100000_I2(this, 0);
            this.A00 = AnonymousClass00E.A00(new IDxLambdaShape880S0100000_I2(this, 1));
        }
    }

    public final void A03() {
        boolean A06 = A06();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.A01;
        OnBackInvokedCallback onBackInvokedCallback = this.A00;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            boolean z = false;
            if (A06) {
                if (!this.A03) {
                    AnonymousClass00E.A01(onBackInvokedDispatcher, onBackInvokedCallback);
                    z = true;
                } else {
                    return;
                }
            } else if (this.A03) {
                AnonymousClass00E.A02(onBackInvokedDispatcher, onBackInvokedCallback);
            } else {
                return;
            }
            this.A03 = z;
        }
    }

    public AnonymousClass00F() {
        this((Runnable) null);
    }
}
