package X;

import com.instagram.user.model.User;

/* renamed from: X.48P  reason: invalid class name */
public final class AnonymousClass48P implements C41882MfV {
    public boolean A00;
    public final User A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.getId();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        AnonymousClass48P r4 = (AnonymousClass48P) obj;
        C04220Ms.A0B(r4, 0);
        if (C04220Ms.A0I(this.A01.getId(), r4.A01.getId()) && this.A00 == r4.A00 && this.A03 == r4.A03) {
            return true;
        }
        return false;
    }

    public AnonymousClass48P(User user, String str, boolean z, boolean z2, boolean z3) {
        this.A01 = user;
        this.A02 = str;
        this.A04 = z;
        this.A00 = z2;
        this.A03 = z3;
    }
}
