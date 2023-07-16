package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.407  reason: invalid class name */
public final class AnonymousClass407 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C40983LtS A01;
    public final /* synthetic */ AnonymousClass3A4 A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass407(C40983LtS ltS, AnonymousClass3A4 r2, int i, boolean z) {
        this.A02 = r2;
        this.A00 = i;
        this.A03 = z;
        this.A01 = ltS;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            C58303Ew r3 = this.A02.A01;
            int i = this.A00;
            boolean z = this.A03;
            r3.A00.put(Integer.valueOf(i), Boolean.valueOf(z));
        }
        C40983LtS ltS = this.A01;
        ltS.A02(bool);
        ltS.A00();
    }
}
