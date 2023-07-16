package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.barcelona.R;

/* renamed from: X.4zj  reason: invalid class name and case insensitive filesystem */
public final class C87034zj extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass767 A01;
    public final /* synthetic */ String A02;

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        C86104wH.A18(this.A00, textPaint, R.color.blue_5);
    }

    public C87034zj(Context context, AnonymousClass767 r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = context;
    }

    public final void onClick(View view) {
        AnonymousClass767 r4 = this.A01;
        String str = this.A02;
        if (str != null) {
            C25745DrH A0b = C18220wO.A0b(r4.A00.requireActivity());
            if (!r4.A01 || A0b == null) {
                AnonymousClass767.A00(r4, str);
                return;
            }
            ((C35189Ipf) A0b).A0B = new C134307xQ(r4, str);
            A0b.A0C();
        }
    }
}
