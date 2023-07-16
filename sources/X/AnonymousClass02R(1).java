package X;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.02R  reason: invalid class name */
public final class AnonymousClass02R extends C006903a {
    public Window A00;
    public final WindowInsetsController A01;
    public final C002000x A02 = new C002000x();
    public final C007103c A03;

    public final int A00() {
        return this.A01.getSystemBarsBehavior();
    }

    public final void A01(int i) {
        this.A01.hide(i);
    }

    public final void A02(int i) {
        this.A01.setSystemBarsBehavior(i);
    }

    public final void A03(int i) {
        Window window = this.A00;
        if ((i & 8) != 0 && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
        }
        this.A01.show(i);
    }

    public final void A04(boolean z) {
        View decorView = this.A00.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z) {
            decorView.setSystemUiVisibility(systemUiVisibility | 16);
            this.A01.setSystemBarsAppearance(16, 16);
            return;
        }
        decorView.setSystemUiVisibility(systemUiVisibility & -17);
        this.A01.setSystemBarsAppearance(0, 16);
    }

    public final void A05(boolean z) {
        Window window = this.A00;
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
            this.A01.setSystemBarsAppearance(8, 8);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(-8193 & decorView2.getSystemUiVisibility());
        this.A01.setSystemBarsAppearance(0, 8);
    }

    public final boolean A06() {
        if ((this.A01.getSystemBarsAppearance() & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean A07() {
        if ((this.A01.getSystemBarsAppearance() & 8) != 0) {
            return true;
        }
        return false;
    }

    public AnonymousClass02R(Window window, C007103c r4) {
        WindowInsetsController insetsController = window.getInsetsController();
        this.A01 = insetsController;
        this.A03 = r4;
        this.A00 = window;
    }
}
