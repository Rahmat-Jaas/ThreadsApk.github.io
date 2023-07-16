package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.business.Address;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.user.model.User;
import java.util.Arrays;

/* renamed from: X.3IK  reason: invalid class name */
public final class AnonymousClass3IK {
    public final int A00;
    public final C554733i A01;
    public final ImageUrl A02;
    public final Address A03;
    public final PublicPhoneContact A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3IK r5 = (AnonymousClass3IK) obj;
            if (!C32572Cj.A00(this.A08, r5.A08) || !C32572Cj.A00(this.A0A, r5.A0A) || !C32572Cj.A00(this.A05, r5.A05) || !C32572Cj.A00(this.A06, r5.A06) || !C32572Cj.A00(this.A02, r5.A02) || !C32572Cj.A00(this.A07, r5.A07) || !C32572Cj.A00(this.A03, r5.A03) || !C32572Cj.A00(this.A04, r5.A04)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A00(User user) {
        String str;
        if (!this.A0C || (str = this.A0B) == null) {
            return false;
        }
        if (user == null || !str.equals(user.getId())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A08, this.A0A, this.A05, this.A06, this.A02, this.A07, this.A03, this.A04});
    }

    public AnonymousClass3IK(C554733i r1, ImageUrl imageUrl, Address address, PublicPhoneContact publicPhoneContact, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z) {
        this.A08 = str;
        this.A0A = str2;
        this.A00 = i;
        this.A01 = r1;
        this.A05 = str3;
        this.A06 = str4;
        this.A02 = imageUrl;
        this.A07 = str5;
        this.A03 = address;
        this.A04 = publicPhoneContact;
        this.A09 = str6;
        this.A0B = str7;
        this.A0C = z;
    }
}
