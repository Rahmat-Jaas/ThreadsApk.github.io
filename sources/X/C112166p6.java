package X;

import android.text.SpannableString;
import com.fbpay.common.LinkableText$1;
import java.util.List;

/* renamed from: X.6p6  reason: invalid class name and case insensitive filesystem */
public final class C112166p6 {
    public final CharSequence A00;
    public final List A01;

    public final CharSequence A00(C143638h4 r12, boolean z) {
        SpannableString spannableString = new SpannableString(this.A00);
        for (C108886j7 r6 : this.A01) {
            LinkableText$1 linkableText$1 = new LinkableText$1(r6, r12, this, r6.A02, z);
            int i = r6.A01;
            spannableString.setSpan(linkableText$1, i, i + r6.A00, 33);
        }
        return spannableString;
    }

    public C112166p6(CharSequence charSequence, List list) {
        this.A00 = charSequence;
        this.A01 = list;
    }
}
