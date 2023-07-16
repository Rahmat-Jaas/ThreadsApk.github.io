package X;

import com.instagram.barcelona.R;

/* renamed from: X.199  reason: invalid class name */
public final class AnonymousClass199 extends AnonymousClass0Sf implements C41882MfV {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass199) && C04220Ms.A0I(this.A00, ((AnonymousClass199) obj).A00));
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final int hashCode() {
        return C18180wK.A03(this.A00) + R.color.default_cta_dominate_color;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("PartnerPromotionActionRowViewModel(title=");
        A0s.append(this.A00);
        A0s.append(", titleColorRes=");
        A0s.append(R.color.default_cta_dominate_color);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass199(String str) {
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
