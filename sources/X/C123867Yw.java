package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.7Yw  reason: invalid class name and case insensitive filesystem */
public final class C123867Yw implements C145138ju {
    public C123857Yv A00;
    public final View A01;

    public final void BPF(InputMethodManager inputMethodManager) {
        C04220Ms.A0B(inputMethodManager, 0);
        C007103c A002 = A00();
        if (A002 != null) {
            A002.A00.A01(8);
            return;
        }
        C123857Yv r1 = this.A00;
        if (r1 == null) {
            r1 = new C123857Yv(this.A01);
            this.A00 = r1;
        }
        r1.BPF(inputMethodManager);
    }

    public final void Cu0(InputMethodManager inputMethodManager) {
        C04220Ms.A0B(inputMethodManager, 0);
        C007103c A002 = A00();
        if (A002 != null) {
            A002.A00.A03(8);
            return;
        }
        C123857Yv r1 = this.A00;
        if (r1 == null) {
            r1 = new C123857Yv(this.A01);
            this.A00 = r1;
        }
        r1.Cu0(inputMethodManager);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0008 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C007103c A00() {
        /*
            r4 = this;
            android.view.View r1 = r4.A01
            r3 = r1
        L_0x0003:
            r2 = r1
            boolean r0 = r1 instanceof X.C141848dI
            if (r0 == 0) goto L_0x0016
            X.8dI r2 = (X.C141848dI) r2
            X.54o r2 = (X.C877954o) r2
            android.view.Window r1 = r2.A02
            if (r1 == 0) goto L_0x004a
        L_0x0010:
            X.03c r0 = new X.03c
            r0.<init>(r3, r1)
            return r0
        L_0x0016:
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0022
            android.view.View r1 = (android.view.View) r1
            if (r1 != 0) goto L_0x0003
        L_0x0022:
            android.content.Context r1 = X.C18190wL.A0A(r2)
        L_0x0026:
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L_0x003c
            android.app.Activity r1 = (android.app.Activity) r1
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L_0x004a
            android.view.View r0 = r1.getDecorView()
            X.C04220Ms.A06(r0)
            if (r0 != r2) goto L_0x004a
            goto L_0x0010
        L_0x003c:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x004a
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            X.C04220Ms.A06(r1)
            goto L_0x0026
        L_0x004a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C123867Yw.A00():X.03c");
    }

    public C123867Yw(View view) {
        this.A01 = view;
    }
}
