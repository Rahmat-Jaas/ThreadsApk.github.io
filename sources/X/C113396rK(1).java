package X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.6rK  reason: invalid class name and case insensitive filesystem */
public final class C113396rK {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C113396rK) && AnonymousClass3ZT.A03(this.A00, ((C113396rK) obj).A00));
    }

    public final int hashCode() {
        return C86124wJ.A0E(this.A00);
    }

    public C113396rK(C104966cf r3) {
        String str = r3.A00;
        AnonymousClass3ZT.A02(str, DialogModule.KEY_TITLE);
        this.A00 = str;
    }
}
