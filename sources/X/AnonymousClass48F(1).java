package X;

import com.instagram.user.model.User;

/* renamed from: X.48F  reason: invalid class name */
public final class AnonymousClass48F implements C41882MfV {
    public final C57713Ce A00;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A01.getId();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        User user;
        AnonymousClass48F r3 = (AnonymousClass48F) obj;
        User user2 = this.A00.A01;
        if (r3 != null) {
            user = r3.A00.A01;
        } else {
            user = null;
        }
        return C32572Cj.A00(user2, user);
    }

    public AnonymousClass48F(C57713Ce r1) {
        this.A00 = r1;
    }
}
