package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.5LV  reason: invalid class name */
public final class AnonymousClass5LV extends AnonymousClass0Sf implements C142298ed {
    public final int A00;
    public final Drawable A01;
    public final ImageUrl A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5LV) {
                AnonymousClass5LV r5 = (AnonymousClass5LV) obj;
                if (this.A00 != r5.A00 || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A06, AnonymousClass0wJ.A07(this.A04, AnonymousClass0wJ.A07(this.A05, AnonymousClass0wJ.A05(this.A02, AnonymousClass0wJ.A05(this.A01, AnonymousClass0wJ.A07(this.A03, this.A00 * 31))))));
    }

    public AnonymousClass5LV(Drawable drawable, ImageUrl imageUrl, String str, String str2, String str3, List list, int i) {
        AnonymousClass0wJ.A1R(drawable, imageUrl);
        C04220Ms.A0B(list, 7);
        this.A00 = i;
        this.A03 = str;
        this.A01 = drawable;
        this.A02 = imageUrl;
        this.A05 = str2;
        this.A04 = str3;
        this.A06 = list;
    }
}
