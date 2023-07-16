package X;

import android.text.SpannableStringBuilder;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.48O  reason: invalid class name */
public final class AnonymousClass48O implements C41882MfV {
    public final SpannableStringBuilder A00;
    public final ImageUrl A01;
    public final ImageUrl A02;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.toString();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        AnonymousClass48O r3 = (AnonymousClass48O) obj;
        C04220Ms.A0B(r3, 0);
        if (!C32572Cj.A00(this.A00, r3.A00) || !C04220Ms.A0I(this.A01, r3.A01)) {
            return false;
        }
        ImageUrl imageUrl = this.A02;
        ImageUrl imageUrl2 = r3.A02;
        if (imageUrl == null) {
            if (imageUrl2 == null) {
                return true;
            }
            return false;
        } else if (imageUrl.equals(imageUrl2)) {
            return true;
        } else {
            return false;
        }
    }

    public AnonymousClass48O(SpannableStringBuilder spannableStringBuilder, ImageUrl imageUrl, ImageUrl imageUrl2) {
        this.A00 = spannableStringBuilder;
        this.A01 = imageUrl;
        this.A02 = imageUrl2;
    }
}
