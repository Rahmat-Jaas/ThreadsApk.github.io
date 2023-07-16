package X;

import android.view.inputmethod.InputMethodManager;

/* renamed from: X.7yr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135087yr implements Runnable {
    public final /* synthetic */ AnonymousClass7Z5 A00;

    public /* synthetic */ C135087yr(AnonymousClass7Z5 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass7Z5 r3 = this.A00;
        r3.A03 = null;
        if (!r3.A07.isFocused()) {
            r3.A08.A05();
            return;
        }
        Boolean bool = null;
        Boolean bool2 = null;
        AnonymousClass84X r1 = r3.A08;
        int i = r1.A00;
        if (i > 0) {
            Object[] objArr = r1.A01;
            int i2 = 0;
            do {
                C969367g r7 = (C969367g) objArr[i2];
                int ordinal = r7.ordinal();
                boolean z = true;
                if (ordinal == 0) {
                    bool2 = true;
                    bool = bool2;
                } else if (ordinal == 1) {
                    bool2 = false;
                    bool = bool2;
                } else if ((ordinal == 2 || ordinal == 3) && !C18190wL.A1Z(bool, false)) {
                    if (r7 != C969367g.ShowKeyboard) {
                        z = false;
                    }
                    bool2 = Boolean.valueOf(z);
                }
                i2++;
            } while (i2 < i);
        }
        if (C18190wL.A1Z(bool, true)) {
            AnonymousClass7Z5.A01(r3);
        }
        if (bool2 != null) {
            boolean booleanValue = bool2.booleanValue();
            C123887Yy r0 = (C123887Yy) r3.A09;
            if (booleanValue) {
                r0.A01.Cu0((InputMethodManager) r0.A02.getValue());
            } else {
                r0.A01.BPF((InputMethodManager) r0.A02.getValue());
            }
        }
        if (C18190wL.A1Z(bool, false)) {
            AnonymousClass7Z5.A01(r3);
        }
    }
}
