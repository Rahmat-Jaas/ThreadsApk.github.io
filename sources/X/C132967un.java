package X;

import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.7un  reason: invalid class name and case insensitive filesystem */
public final class C132967un implements C33655Hs1 {
    public int A00;
    public User A01;

    public final Integer BIz() {
        return AnonymousClass006.A0N;
    }

    public C132967un(User user, int i) {
        this.A00 = i;
        this.A01 = user;
    }

    public final String toJson() {
        try {
            StringWriter A0d = C18230wP.A0d();
            MMp A0K = C18180wK.A0K(A0d);
            A0K.A0b(AnonymousClass000.A00(143), this.A00);
            if (this.A01 != null) {
                A0K.A0U("user");
                C19527Axo.A05(A0K, this.A01);
            }
            return C18180wK.A0h(A0K, A0d);
        } catch (IOException unused) {
            return null;
        }
    }

    public C132967un() {
        this((User) null, 0);
    }
}
