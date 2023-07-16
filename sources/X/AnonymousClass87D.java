package X;

import kotlin.Unit;

/* renamed from: X.87D  reason: invalid class name */
public final class AnonymousClass87D implements C83234r0 {
    public final /* synthetic */ C147368pE A00;
    public final /* synthetic */ C81784oM A01;
    public final /* synthetic */ C884958x A02;
    public final /* synthetic */ String A03;

    public AnonymousClass87D(C147368pE r1, C81784oM r2, C884958x r3, String str) {
        this.A00 = r1;
        this.A03 = str;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, C146958n9 r5) {
        AnonymousClass7AO r0;
        AnonymousClass5I9 r4 = (AnonymousClass5I9) obj;
        String str = null;
        this.A00.CrC((Object) null);
        C123917Zx r02 = (C123917Zx) this.A01.getValue();
        if (!(r02 == null || (r0 = r02.A03) == null)) {
            str = r0.A02;
        }
        String str2 = r4.A04.A01;
        if (C04220Ms.A0I(str, str2)) {
            C147368pE.A04(r4.A03, true);
        } else {
            boolean A0I = C04220Ms.A0I(this.A03, str2);
            C884958x r1 = this.A02;
            if (A0I) {
                AnonymousClass7GG.A01(r1, r4);
            } else {
                AnonymousClass7GG.A02(r1, r4, true);
            }
        }
        return Unit.A00;
    }
}
