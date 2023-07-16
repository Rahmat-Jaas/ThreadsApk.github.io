package X;

import com.instagram.user.model.User;

/* renamed from: X.5MO  reason: invalid class name */
public final class AnonymousClass5MO extends AnonymousClass0Sf implements C41882MfV {
    public final int A00;
    public final User A01;
    public final String A02;

    public AnonymousClass5MO(User user, String str, int i) {
        C04220Ms.A0B(user, 1);
        this.A01 = user;
        this.A00 = i;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5MO) {
                AnonymousClass5MO r5 = (AnonymousClass5MO) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || this.A00 != r5.A00 || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.getId();
    }

    public final int hashCode() {
        return ((C18210wN.A04(this.A01) + this.A00) * 31) + AnonymousClass0wJ.A06(this.A02);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("GroupMentionViewModel(user=");
        A0s.append(this.A01);
        A0s.append(", position=");
        A0s.append(this.A00);
        A0s.append(", reelPk=");
        A0s.append(this.A02);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
