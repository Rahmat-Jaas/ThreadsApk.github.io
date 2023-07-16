package X;

import android.view.View;
import android.view.Window;
import com.facebook.forker.Process;

/* renamed from: X.09W  reason: invalid class name */
public final class AnonymousClass09W extends AnonymousClass02W {
    public final void A04(boolean z) {
        if (z) {
            Window window = this.A01;
            window.clearFlags(134217728);
            window.addFlags(Process.WAIT_RESULT_TIMEOUT);
            A08(16);
            return;
        }
        A09(16);
    }

    public final void A05(boolean z) {
        if (z) {
            Window window = this.A01;
            window.clearFlags(67108864);
            window.addFlags(Process.WAIT_RESULT_TIMEOUT);
            A08(8192);
            return;
        }
        A09(8192);
    }

    public final boolean A06() {
        if ((this.A01.getDecorView().getSystemUiVisibility() & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean A07() {
        if ((this.A01.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        }
        return false;
    }

    public AnonymousClass09W(View view, Window window) {
        super(view, window);
    }
}
