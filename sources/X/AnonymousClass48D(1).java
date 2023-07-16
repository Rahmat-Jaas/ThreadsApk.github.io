package X;

import com.instagram.user.model.User;

/* renamed from: X.48D  reason: invalid class name */
public final class AnonymousClass48D implements C41882MfV {
    public final User A00;

    public AnonymousClass48D(User user) {
        C04220Ms.A0B(user, 1);
        this.A00 = user;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        User user;
        AnonymousClass48D r3 = (AnonymousClass48D) obj;
        User user2 = this.A00;
        if (r3 != null) {
            user = r3.A00;
        } else {
            user = null;
        }
        return C18180wK.A1Z(user2, user);
    }
}
