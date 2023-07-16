package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.0xj  reason: invalid class name and case insensitive filesystem */
public final class C18710xj extends ClickableSpan {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C171209wF A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ AnonymousClass0ZU A05;

    public C18710xj(FragmentActivity fragmentActivity, UserSession userSession, C171209wF r3, String str, String str2, AnonymousClass0ZU r6) {
        this.A05 = r6;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = r3;
        this.A04 = str2;
    }

    public final void onClick(View view) {
        AnonymousClass0ZU r0 = this.A05;
        if (r0 != null) {
            r0.invoke();
        }
        C37350Jpy A0Y = C18230wP.A0Y(this.A00, this.A01, this.A02, this.A03);
        A0Y.A07(this.A04);
        A0Y.A04();
    }

    public final void updateDrawState(TextPaint textPaint) {
        C18240wQ.A0t(textPaint);
        textPaint.setColor(C18220wO.A02(this.A00, R.attr.textColorRegularLink));
    }
}
