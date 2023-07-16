package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.5y4  reason: invalid class name */
public final class AnonymousClass5y4 extends C19862BDo {
    public final ImageUrl A00;
    public final C171159wA A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5y4) {
                AnonymousClass5y4 r5 = (AnonymousClass5y4) obj;
                if (this.A01 != r5.A01 || !"CLIPS_LAYOUT".equals("CLIPS_LAYOUT") || !"".equals("") || !"".equals("") || !"".equals("") || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AnonymousClass5y4(C171159wA r2) {
        SimpleImageUrl A0K = C18250wR.A0K("");
        this.A01 = r2;
        this.A00 = A0K;
    }

    public final ImageUrl A00() {
        return this.A00;
    }

    public final String A01() {
        return "CLIPS_LAYOUT";
    }

    public final String A02() {
        return "";
    }

    public final String A03() {
        return "";
    }

    public final String A04() {
        return "";
    }

    public final boolean A06() {
        return false;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A00, (C18210wN.A04(this.A01) + 177652710) * 31 * 31 * 31 * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("RecipeLayout(attributedCameraTools=");
        A0s.append(this.A01);
        A0s.append(", id=");
        A0s.append("CLIPS_LAYOUT");
        A0s.append(", primaryText=");
        A0s.append("");
        A0s.append(", secondaryText=");
        A0s.append("");
        A0s.append(", tertiaryText=");
        A0s.append("");
        A0s.append(", imageUrl=");
        A0s.append(this.A00);
        C86134wK.A1U(A0s, ", isChecked=");
        return AnonymousClass0wJ.A0u(A0s);
    }
}
