package X;

import java.util.List;

/* renamed from: X.474  reason: invalid class name */
public final class AnonymousClass474 implements C82394pY {
    public final /* synthetic */ AnonymousClass3HX A00;
    public final /* synthetic */ AnonymousClass601 A01;
    public final /* synthetic */ C38039KHq A02;
    public final /* synthetic */ C109326jp A03;
    public final /* synthetic */ List A04;

    public AnonymousClass474(AnonymousClass3HX r1, AnonymousClass601 r2, C38039KHq kHq, C109326jp r4, List list) {
        this.A02 = kHq;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = list;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = C14030oh.A03(-1319177722);
        AnonymousClass46M r7 = (AnonymousClass46M) obj;
        int A002 = AnonymousClass0wJ.A00(-1265063751, r7);
        this.A02.A02(this, AnonymousClass46M.class);
        AnonymousClass601 r3 = this.A01;
        C109326jp r2 = this.A03;
        List list = r7.A00;
        if (list == null) {
            list = this.A04;
        }
        C63913ic.A0K(r3, r2, list, this.A00);
        C14030oh.A0A(-1989333872, A002);
        C14030oh.A0A(-1441469309, A032);
    }
}
