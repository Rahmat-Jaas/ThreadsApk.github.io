package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.7xc  reason: invalid class name and case insensitive filesystem */
public final class C134397xc implements C83144qr, C83154qs {
    public ImageUrl A00;
    public String A01;

    public static C134397xc A00(User user) {
        C134397xc r1 = new C134397xc();
        r1.A01 = user.getId();
        r1.A00 = user.B4M();
        return r1;
    }

    public final ImageUrl B4M() {
        return this.A00;
    }

    public final String getId() {
        return this.A01;
    }
}
