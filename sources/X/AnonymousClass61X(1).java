package X;

import android.content.SharedPreferences;

/* renamed from: X.61X  reason: invalid class name */
public final class AnonymousClass61X extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61X(C697249u r7) {
        super("tryRegisterPushToken", 365, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C146338m4 A002 = C1190873l.A00();
        C08350dD A003 = C08360dF.A00();
        String str = A002.B59().A01;
        long j = AnonymousClass7GV.A01;
        C04220Ms.A0B(str, 0);
        String A0L = AnonymousClass00U.A0L("push_reg_date", str);
        SharedPreferences sharedPreferences = A003.A00;
        long j2 = sharedPreferences.getLong("push_reg_date", -1);
        if (j2 != -1) {
            AnonymousClass0wJ.A12(sharedPreferences.edit().remove("push_reg_date"), A0L, j2);
        }
        if (sharedPreferences.contains(A0L)) {
            if (Math.abs(C18180wK.A05(sharedPreferences, A0L) - System.currentTimeMillis()) <= j) {
                C38040KHr.A01.CWx(new C130977rD());
                return;
            }
        }
        A002.CZk();
    }
}
