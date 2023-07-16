package X;

import android.view.View;
import com.facebook.forker.Process;

/* renamed from: X.76L  reason: invalid class name */
public final class AnonymousClass76L {
    public final C112976qV A00;
    public final C143468gn A01;
    public final boolean A02;
    public final AnonymousClass7KN A03;

    public static int A00(float f, float f2) {
        int round;
        int i;
        if (f == f2) {
            round = Math.round(f);
            i = 1073741824;
        } else if (Float.isNaN(f2)) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            round = Math.round(f2);
            i = Process.WAIT_RESULT_TIMEOUT;
        }
        return View.MeasureSpec.makeMeasureSpec(round, i);
    }

    public AnonymousClass76L(C112976qV r1, C143468gn r2, AnonymousClass7KN r3, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r3;
        this.A02 = z;
    }
}
