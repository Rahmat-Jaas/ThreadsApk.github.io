package X;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.0Wn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C05860Wn implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0W4 A01;
    public final /* synthetic */ C08640dy A02;
    public final /* synthetic */ C09350fH A03;
    public final /* synthetic */ C09780gf A04;
    public final /* synthetic */ SettableFuture A05;

    public /* synthetic */ C05860Wn(AnonymousClass0W4 r1, C08640dy r2, C09350fH r3, C09780gf r4, SettableFuture settableFuture, int i) {
        this.A04 = r4;
        this.A00 = i;
        this.A02 = r2;
        this.A05 = settableFuture;
        this.A03 = r3;
        this.A01 = r1;
    }

    public final void run() {
        C09780gf r3 = this.A04;
        int i = this.A00;
        C08640dy r1 = this.A02;
        SettableFuture settableFuture = this.A05;
        AnonymousClass01V.A0B(this.A01, r1, this.A03, r3, settableFuture, i);
    }
}
