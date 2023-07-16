package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3ac  reason: invalid class name and case insensitive filesystem */
public final class C62733ac {
    public long A00 = -1;
    public long A01 = -1;
    public ImageUrl A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("OneTapLoginUser{username='");
        A0s.append(this.A06);
        A0s.append('\'');
        A0s.append(", allowOneTap=");
        A0s.append(this.A07);
        return C18190wL.A0o(A0s);
    }

    public C62733ac(User user, String str) {
        this.A05 = user.getId();
        this.A06 = user.BK7();
        this.A02 = user.B4M();
        this.A03 = str;
        this.A07 = true;
        if (this.A06 == null) {
            C10450iM.A03("OneTapLoginUser", "OneTapLoginUser was created w/ NULL username - should never happen.");
        }
    }

    public final String A00() {
        if (System.currentTimeMillis() - this.A01 >= TimeUnit.DAYS.toMillis(85)) {
            this.A04 = null;
            this.A01 = -1;
        }
        return this.A04;
    }

    public C62733ac(ImageUrl imageUrl, String str, String str2, String str3) {
        this.A05 = str;
        this.A06 = str2;
        this.A02 = imageUrl;
        this.A03 = str3;
        this.A07 = true;
        this.A08 = false;
        if (str2 == null) {
            C10450iM.A03("OneTapLoginUser", "OneTapLoginUser was created w/ NULL username - should never happen.");
        }
    }

    public C62733ac(ImageUrl imageUrl, String str, String str2, String str3, boolean z) {
        this.A05 = str;
        this.A06 = str2;
        this.A02 = imageUrl;
        this.A03 = str3;
        this.A07 = true;
        this.A08 = true;
        if (str2 == null) {
            C10450iM.A03("OneTapLoginUser", "OneTapLoginUser was created w/ NULL username - should never happen.");
        }
    }

    public C62733ac() {
    }
}
