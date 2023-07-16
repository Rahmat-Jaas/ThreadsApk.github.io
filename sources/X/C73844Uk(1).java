package X;

import kotlin.Function;

/* renamed from: X.4Uk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C73844Uk implements C04270Mx, C83004qd {
    public final /* synthetic */ AnonymousClass0YY A00;

    public C73844Uk(AnonymousClass0YY r1) {
        this.A00 = r1;
    }

    public final Function Ak7() {
        return this.A00;
    }

    public final /* synthetic */ void afterSelection(boolean z) {
        this.A00.invoke(Boolean.valueOf(z));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C83004qd) || !(obj instanceof C04270Mx)) {
            return false;
        }
        return C04220Ms.A0I(this.A00, ((C04270Mx) obj).Ak7());
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
