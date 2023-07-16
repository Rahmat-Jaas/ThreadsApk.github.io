package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.7YE  reason: invalid class name */
public final class AnonymousClass7YE implements C147498pR, C141798cy {
    public static final AnonymousClass7XP A05 = new AnonymousClass7XP();
    public final C967266l A00;
    public final C103996b4 A01;
    public final AnonymousClass8cj A02;
    public final AnonymousClass69J A03;
    public final boolean A04;

    public AnonymousClass7YE(C967266l r2, C103996b4 r3, AnonymousClass8cj r4, AnonymousClass69J r5, boolean z) {
        C18180wK.A1Q(r4, 1, r5);
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = z;
        this.A03 = r5;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005d, code lost:
        if (r4.A04 != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0068, code lost:
        if (r4.A04 != false) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0064 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.C114486tN r3, X.AnonymousClass7YE r4, int r5) {
        /*
            r0 = 5
            r2 = 5
            if (r5 == r0) goto L_0x001a
            r0 = 6
            if (r5 == r0) goto L_0x001a
            r0 = 3
            if (r5 == r0) goto L_0x001f
            r0 = 4
            if (r5 == r0) goto L_0x001f
            r0 = 1
            if (r5 == r0) goto L_0x005f
            r0 = 2
            if (r5 == r0) goto L_0x006a
            java.lang.String r0 = "Lazy list does not support beyond bounds layout for the specified direction"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x001a:
            X.66l r1 = r4.A00
            X.66l r0 = X.C967266l.Horizontal
            goto L_0x0023
        L_0x001f:
            X.66l r1 = r4.A00
            X.66l r0 = X.C967266l.Vertical
        L_0x0023:
            if (r1 == r0) goto L_0x0064
            if (r5 == r2) goto L_0x0066
            r0 = 6
            if (r5 == r0) goto L_0x005b
            r0 = 3
            boolean r0 = X.AnonymousClass0wJ.A1T(r5, r0)
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L_0x0042
            X.69J r0 = r4.A03
            int r0 = r0.ordinal()
            if (r0 == r1) goto L_0x0066
            if (r0 == r2) goto L_0x005b
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0042:
            r0 = 4
            if (r5 != r0) goto L_0x0054
            X.69J r0 = r4.A03
            int r0 = r0.ordinal()
            if (r0 == r1) goto L_0x005b
            if (r0 == r2) goto L_0x0066
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0054:
            java.lang.String r0 = "Lazy list does not support beyond bounds layout for the specified direction"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x005b:
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x006a
        L_0x005f:
            int r0 = r3.A01
            r2 = 1
            if (r0 > 0) goto L_0x0065
        L_0x0064:
            r2 = 0
        L_0x0065:
            return r2
        L_0x0066:
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x005f
        L_0x006a:
            int r1 = r3.A00
            X.8cj r0 = r4.A02
            X.7VU r0 = (X.AnonymousClass7VU) r0
            androidx.compose.foundation.lazy.LazyListState r0 = r0.A00
            X.8nU r0 = r0.A02()
            int r0 = r0.BHd()
            r2 = 1
            int r0 = r0 - r2
            if (r1 >= r0) goto L_0x0064
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7YE.A00(X.6tN, X.7YE, int):boolean");
    }

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    public final C104176bM Aqd() {
        return C102786Wn.A00;
    }

    public final /* bridge */ /* synthetic */ Object getValue() {
        return this;
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }
}
