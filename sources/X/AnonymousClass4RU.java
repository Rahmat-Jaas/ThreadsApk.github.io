package X;

import android.content.Context;

/* renamed from: X.4RU  reason: invalid class name */
public final class AnonymousClass4RU implements Runnable {
    public final /* synthetic */ AnonymousClass1TW A00;
    public final /* synthetic */ C24331hv A01;

    public AnonymousClass4RU(AnonymousClass1TW r1, C24331hv r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        Context context = this.A01.A00;
        C25828Dsm A0W = C18190wL.A0W(context);
        AnonymousClass1TW r2 = this.A00;
        String str = r2.A02;
        if (str == null) {
            str = null;
        }
        String string = context.getString(2131826851);
        if (str == null) {
            str = string;
        }
        A0W.A02 = str;
        String str2 = r2.A01;
        if (str2 == null) {
            str2 = null;
        }
        String string2 = context.getString(2131826986);
        if (str2 == null) {
            str2 = string2;
        }
        A0W.A0p(str2);
        C18180wK.A1M(A0W);
        AnonymousClass0wJ.A1K(A0W);
    }
}
