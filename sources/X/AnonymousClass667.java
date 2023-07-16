package X;

import java.io.IOException;

/* renamed from: X.667  reason: invalid class name */
public final class AnonymousClass667 extends IOException {
    public final String A00;

    public final void A00(String str) {
        C04220Ms.A0B(str, 0);
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[1];
        StringBuilder A0s = C18190wL.A0s("Exception message: ");
        A0s.append(this.A00);
        A0s.append(", Reported in: ");
        A0s.append(stackTraceElement.getClassName());
        A0s.append('.');
        C10450iM.A03(str, C18180wK.A0i(stackTraceElement.getMethodName(), A0s));
    }

    public AnonymousClass667(String str) {
        super(str);
        this.A00 = str;
    }
}
