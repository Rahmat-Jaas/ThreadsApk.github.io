package X;

import android.content.Context;
import java.util.Arrays;
import java.util.Set;

/* renamed from: X.1fI  reason: invalid class name */
public final class AnonymousClass1fI extends I4A {
    public Set A00 = C18200wM.A0u();
    public Context A01;
    public final C58733Gx A02;
    public final C58733Gx A03;
    public final C58733Gx A04;
    public final C23841fr A05;
    public final C23851fs A06;
    public final C23981gh A07;

    public AnonymousClass1fI(Context context, AnonymousClass1b1 r5, AnonymousClass1b1 r6) {
        this.A01 = context;
        C23841fr r2 = new C23841fr(r5);
        this.A05 = r2;
        C23851fs r1 = new C23851fs(r6);
        this.A06 = r1;
        C23981gh r0 = new C23981gh(context);
        this.A07 = r0;
        A07(C18200wM.A0s(Arrays.asList(new AnonymousClass436[]{r2, r1, r0})));
        this.A04 = new C58733Gx(this.A01.getString(2131834849), AnonymousClass3W8.A02(this.A01, "https://help.instagram.com/581066165581870"));
        this.A03 = new C58733Gx(this.A01.getString(2131834846), AnonymousClass3W8.A02(this.A01, "https://help.instagram.com/519522125107875"));
        this.A02 = new C58733Gx(this.A01.getString(2131834848), "https://help.instagram.com/626057554667531");
    }

    public final void A09() {
        A03();
        String string = this.A01.getString(2131821248);
        Set set = this.A00;
        A06(this.A05, string, Boolean.valueOf(AnonymousClass0wJ.A1T(set.size(), 3)));
        A05(this.A07, AnonymousClass22V.FULL_WIDTH);
        C58733Gx r1 = this.A04;
        Boolean valueOf = Boolean.valueOf(set.contains(r1));
        C23851fs r2 = this.A06;
        A06(r2, r1, valueOf);
        C58733Gx r12 = this.A03;
        A06(r2, r12, Boolean.valueOf(set.contains(r12)));
        C58733Gx r13 = this.A02;
        A06(r2, r13, Boolean.valueOf(set.contains(r13)));
        A04();
    }
}
