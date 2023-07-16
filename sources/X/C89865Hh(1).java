package X;

import com.instagram.mediakit.model.MediaKitVisibility;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.5Hh  reason: invalid class name and case insensitive filesystem */
public final class C89865Hh extends AnonymousClass0Sf {
    public final MediaKitVisibility A00;
    public final User A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;

    public C89865Hh(MediaKitVisibility mediaKitVisibility, User user, String str, String str2, String str3, String str4, List list, boolean z) {
        C18190wL.A1S(list, 1, user);
        C18210wN.A1M(str4, 7, mediaKitVisibility);
        this.A06 = list;
        this.A02 = str;
        this.A03 = str2;
        this.A07 = z;
        this.A01 = user;
        this.A04 = str3;
        this.A05 = str4;
        this.A00 = mediaKitVisibility;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89865Hh) {
                C89865Hh r5 = (C89865Hh) obj;
                if (!C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || this.A07 != r5.A07 || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A05, r5.A05) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        User user = this.A01;
        return C18220wO.A06(this.A00, AnonymousClass0wJ.A07(this.A05, (AnonymousClass0wJ.A05(user, (((((C18210wN.A04(this.A06) + AnonymousClass0wJ.A06(this.A02)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + (C86164wN.A1S(this.A07) ? 1 : 0)) * 31) + C18200wM.A09(this.A04)) * 31));
    }
}
