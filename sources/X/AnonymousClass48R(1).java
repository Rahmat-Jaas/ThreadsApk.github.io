package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;

/* renamed from: X.48R  reason: invalid class name */
public final class AnonymousClass48R implements C41882MfV {
    public SpannableStringBuilder A00;
    public final Typeface A01;
    public final Drawable A02;
    public final Drawable A03;
    public final C83174qu A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A06;
        if (str == null) {
            return String.valueOf(this.A00);
        }
        return str;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        AnonymousClass48R r4 = (AnonymousClass48R) obj;
        C04220Ms.A0B(r4, 0);
        if (!C04220Ms.A0I(this.A06, r4.A06) || this.A09 != r4.A09) {
            return false;
        }
        return true;
    }

    public AnonymousClass48R(Typeface typeface, Drawable drawable, Drawable drawable2, SpannableStringBuilder spannableStringBuilder, C83174qu r5, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A06 = str;
        this.A00 = spannableStringBuilder;
        this.A01 = typeface;
        this.A05 = str2;
        this.A03 = drawable;
        this.A02 = drawable2;
        this.A04 = r5;
        this.A09 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A0A = z4;
    }
}
