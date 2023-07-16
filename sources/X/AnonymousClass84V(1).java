package X;

import android.view.WindowManager;
import java.util.Observable;
import java.util.Observer;

/* renamed from: X.84V  reason: invalid class name */
public final class AnonymousClass84V implements Observer {
    public WindowManager.LayoutParams A00;
    public WindowManager A01;
    public C1377289u A02;
    public AnonymousClass50Q A03;
    public C1377389v A04;
    public boolean A05;

    public final void update(Observable observable, Object obj) {
        WindowManager windowManager;
        boolean z;
        WindowManager windowManager2;
        WindowManager windowManager3;
        boolean z2;
        WindowManager windowManager4;
        AnonymousClass50Q r3 = this.A03;
        if (r3 != null) {
            C1377289u r0 = this.A02;
            if (r0 != null) {
                String str = r0.A00;
                if (r0.A01) {
                    if (!this.A05 && (windowManager4 = this.A01) != null) {
                        windowManager4.addView(r3, this.A00);
                        z2 = true;
                    }
                    AnonymousClass50Q r02 = this.A03;
                    r02.A01 = str;
                    AnonymousClass50Q.A00(r02);
                    r02.invalidate();
                } else {
                    if (this.A05 && (windowManager3 = this.A01) != null) {
                        windowManager3.removeViewImmediate(r3);
                        z2 = false;
                    }
                    AnonymousClass50Q r022 = this.A03;
                    r022.A01 = str;
                    AnonymousClass50Q.A00(r022);
                    r022.invalidate();
                }
                this.A05 = z2;
                AnonymousClass50Q r0222 = this.A03;
                r0222.A01 = str;
                AnonymousClass50Q.A00(r0222);
                r0222.invalidate();
            }
            C1377389v r03 = this.A04;
            if (r03 != null) {
                if (r03.A01) {
                    if (!this.A05 && (windowManager2 = this.A01) != null) {
                        windowManager2.addView(this.A03, this.A00);
                        z = true;
                    }
                    AnonymousClass50Q r1 = this.A03;
                    r1.A00 = this.A04.A00;
                    AnonymousClass50Q.A00(r1);
                    r1.invalidate();
                }
                if (this.A05 && (windowManager = this.A01) != null) {
                    windowManager.removeViewImmediate(this.A03);
                    z = false;
                }
                AnonymousClass50Q r12 = this.A03;
                r12.A00 = this.A04.A00;
                AnonymousClass50Q.A00(r12);
                r12.invalidate();
                this.A05 = z;
                AnonymousClass50Q r122 = this.A03;
                r122.A00 = this.A04.A00;
                AnonymousClass50Q.A00(r122);
                r122.invalidate();
            }
        }
    }
}
