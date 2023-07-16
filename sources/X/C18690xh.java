package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.0xh  reason: invalid class name and case insensitive filesystem */
public final class C18690xh extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public C18690xh(Context context, FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = str;
        this.A00 = context;
    }

    public final void onClick(View view) {
        C37350Jpy A0Y = C18230wP.A0Y(this.A01, this.A02, C171209wF.A03, "https://help.instagram.com/907404106266466");
        A0Y.A07(this.A03);
        A0Y.A04();
    }

    public final void updateDrawState(TextPaint textPaint) {
        C18240wQ.A0t(textPaint);
        textPaint.setColor(C18220wO.A02(this.A00, R.attr.textColorRegularLink));
    }
}
