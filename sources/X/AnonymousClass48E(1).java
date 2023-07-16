package X;

import com.instagram.user.model.User;

/* renamed from: X.48E  reason: invalid class name */
public final class AnonymousClass48E implements C41882MfV {
    public final C57713Ce A00;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A01.getId();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        User user;
        AnonymousClass48E r5 = (AnonymousClass48E) obj;
        C57713Ce r3 = this.A00;
        User user2 = r3.A01;
        Boolean bool = null;
        if (r5 != null) {
            user = r5.A00.A01;
        } else {
            user = null;
        }
        if (C32572Cj.A00(user2, user)) {
            Boolean valueOf = Boolean.valueOf(r3.A00);
            if (r5 != null) {
                bool = Boolean.valueOf(r5.A00.A00);
            }
            if (!C32572Cj.A00(valueOf, bool)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass48E(C57713Ce r1) {
        this.A00 = r1;
    }
}
