package X;

import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.02W  reason: invalid class name */
public class AnonymousClass02W extends C006903a {
    public final View A00;
    public final Window A01;

    public final int A00() {
        return 0;
    }

    public final void A01(int i) {
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                int i3 = 4;
                if (i2 != 1) {
                    i3 = 2;
                    if (i2 != 2) {
                        if (i2 == 8) {
                            Window window = this.A01;
                            ((InputMethodManager) window.getContext().getSystemService("input_method")).hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                        }
                    }
                }
                A08(i3);
            }
            i2 <<= 1;
        } while (i2 <= 256);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r2 == null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(int r5) {
        /*
            r4 = this;
            r3 = 1
        L_0x0001:
            r0 = r5 & r3
            if (r0 == 0) goto L_0x003c
            r0 = 1
            if (r3 == r0) goto L_0x004b
            r0 = 2
            if (r3 == r0) goto L_0x0047
            r0 = 8
            if (r3 != r0) goto L_0x003c
            android.view.View r2 = r4.A00
            boolean r0 = r2.isInEditMode()
            if (r0 != 0) goto L_0x0043
            boolean r0 = r2.onCheckIsTextEditor()
            if (r0 != 0) goto L_0x0043
            android.view.Window r1 = r4.A01
            android.view.View r2 = r1.getCurrentFocus()
            if (r2 != 0) goto L_0x002e
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r1.findViewById(r0)
            if (r2 == 0) goto L_0x003c
        L_0x002e:
            boolean r0 = r2.hasWindowFocus()
            if (r0 == 0) goto L_0x003c
            X.03Z r0 = new X.03Z
            r0.<init>(r2)
            r2.post(r0)
        L_0x003c:
            int r3 = r3 << 1
            r0 = 256(0x100, float:3.59E-43)
            if (r3 <= r0) goto L_0x0001
            return
        L_0x0043:
            r2.requestFocus()
            goto L_0x002e
        L_0x0047:
            r4.A09(r0)
            goto L_0x003c
        L_0x004b:
            r0 = 4
            r4.A09(r0)
            r1 = 1024(0x400, float:1.435E-42)
            android.view.Window r0 = r4.A01
            r0.clearFlags(r1)
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02W.A03(int):void");
    }

    public final void A02(int i) {
        if (i == 0) {
            A09(6144);
        } else if (i == 1) {
            A09(4096);
            A08(2048);
        } else if (i == 2) {
            A09(2048);
            A08(4096);
        }
    }

    public final void A08(int i) {
        View decorView = this.A01.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void A09(int i) {
        View decorView = this.A01.getDecorView();
        decorView.setSystemUiVisibility((i ^ -1) & decorView.getSystemUiVisibility());
    }

    public AnonymousClass02W(View view, Window window) {
        this.A01 = window;
        this.A00 = view;
    }
}
