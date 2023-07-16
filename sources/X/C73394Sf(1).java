package X;

import android.os.Bundle;

/* renamed from: X.4Sf  reason: invalid class name and case insensitive filesystem */
public final class C73394Sf implements Runnable {
    public final /* synthetic */ AnonymousClass3Um A00;
    public final /* synthetic */ AnonymousClass4JS A01;
    public final /* synthetic */ String A02;

    public C73394Sf(AnonymousClass3Um r1, AnonymousClass4JS r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass4JS r0 = this.A01;
        C25786Drz A002 = C63463hW.A00(r0.A02, r0.A04);
        AnonymousClass1aA r1 = new AnonymousClass1aA();
        String str = this.A02;
        AnonymousClass3Um r02 = this.A00;
        Bundle A06 = C18180wK.A06();
        r02.A00(A06);
        AnonymousClass2SL.A00(A06, str, (String) null, (String) null, false, false);
        A002.A0A(A06, r1);
        A002.A05();
    }
}
