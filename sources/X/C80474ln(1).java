package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import com.instagram.barcelona.R;

/* renamed from: X.4ln  reason: invalid class name and case insensitive filesystem */
public final class C80474ln extends C02220Ah implements AnonymousClass0YY {
    public static final C80474ln A00 = new C80474ln();

    public C80474ln() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        C04220Ms.A0B(context, 0);
        String A0k = AnonymousClass0wJ.A0k(context, 2131832884);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(A0k);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(context, R.style.AuthErrorTextAppearance), 0, AnonymousClass0hA.A01(A0k), 33);
        return spannableStringBuilder;
    }
}
