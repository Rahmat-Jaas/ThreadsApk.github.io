package X;

import com.instagram.bloks.hosting.IgBloksScreenConfig;

/* renamed from: X.3Yl  reason: invalid class name and case insensitive filesystem */
public final class C62343Yl {
    public final IgBloksScreenConfig A00;

    public static IgBloksScreenConfig A00(C130667qT r3, C62343Yl r4, AnonymousClass3HX r5, C127397h3 r6) {
        boolean z = r3.A00;
        IgBloksScreenConfig igBloksScreenConfig = r4.A00;
        igBloksScreenConfig.A0Y = z;
        AnonymousClass3TP A002 = C62863b2.A00((AnonymousClass4nQ) null, r5, C63763iI.A03(r6));
        if (A002 != null) {
            igBloksScreenConfig.A06(A002);
        }
        return igBloksScreenConfig;
    }

    public final void A01() {
        this.A00.A0O = AnonymousClass006.A01;
    }

    public final void A02(C121997Jj r3) {
        IgBloksScreenConfig igBloksScreenConfig = this.A00;
        if (igBloksScreenConfig.A08 == null) {
            igBloksScreenConfig.A08 = r3;
        }
    }

    public final void A03(String str) {
        this.A00.A0P = str;
    }

    public C62343Yl(C10300i6 r2) {
        this.A00 = C18190wL.A0N(r2);
    }

    public C62343Yl(AnonymousClass3TP r2, C10300i6 r3) {
        this(r3);
        if (r2 != null) {
            this.A00.A06(r2);
        }
    }
}
