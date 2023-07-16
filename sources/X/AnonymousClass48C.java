package X;

import android.text.SpannableStringBuilder;

/* renamed from: X.48C  reason: invalid class name */
public final class AnonymousClass48C implements C41882MfV {
    public final SpannableStringBuilder A00;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00.hashCode());
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        AnonymousClass48C r3 = (AnonymousClass48C) obj;
        C04220Ms.A0B(r3, 0);
        return C04220Ms.A0I(this.A00, r3.A00);
    }

    public AnonymousClass48C(SpannableStringBuilder spannableStringBuilder) {
        this.A00 = spannableStringBuilder;
    }
}
