package X;

import android.content.Context;

/* renamed from: X.7bo  reason: invalid class name and case insensitive filesystem */
public final class C124827bo implements C147138nS {
    public final Context A00;
    public final AnonymousClass7IP A01;
    public final AnonymousClass7IP A02;
    public final C121157Ek A03;
    public final AnonymousClass76O A04;
    public final C104996ci A05;
    public final C109396jw A06;
    public final C125627dd A07;

    public C124827bo(Context context, AnonymousClass7IP r2, AnonymousClass7IP r3, C121157Ek r4, AnonymousClass76O r5, C104996ci r6, C109396jw r7, C125627dd r8) {
        this.A00 = context;
        this.A03 = r4;
        this.A02 = r2;
        this.A01 = r3;
        this.A06 = r7;
        this.A05 = r6;
        this.A04 = r5;
        this.A07 = r8;
    }

    public final /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
        return C147138nS.A00(this, cls);
    }

    public final C62793ak create(Class cls) {
        if (cls.equals(C883357q.class)) {
            C121157Ek r3 = this.A03;
            return new C883357q(new AnonymousClass583(this.A00, this.A02, r3, this.A04, this.A05), r3);
        } else if (cls.equals(AnonymousClass584.class)) {
            return new AnonymousClass584(this.A00, this.A03);
        } else {
            if (cls.equals(AnonymousClass5FI.class)) {
                return new AnonymousClass5FI(this.A02);
            }
            if (cls.equals(AnonymousClass5FH.class)) {
                return new AnonymousClass5FH(this.A02);
            }
            if (cls.equals(AnonymousClass572.class)) {
                return new AnonymousClass572(this.A02);
            }
            if (cls.equals(AnonymousClass577.class)) {
                return new AnonymousClass577(this.A01, this.A05, this.A06);
            } else if (cls.equals(AnonymousClass57F.class)) {
                return new AnonymousClass57F(this.A03);
            } else {
                if (cls.equals(AnonymousClass58D.class)) {
                    return new AnonymousClass58D(this.A00, this.A03);
                }
                if (cls.equals(AnonymousClass583.class)) {
                    Context context = this.A00;
                    C104996ci r9 = this.A05;
                    return new AnonymousClass583(context, this.A02, this.A03, this.A04, r9);
                } else if (cls.equals(AnonymousClass57R.class)) {
                    return new AnonymousClass57R(this.A00, this.A03, this.A07);
                } else {
                    throw C18190wL.A0a(AnonymousClass0wJ.A0t("Not aware about view model :", cls));
                }
            }
        }
    }
}
