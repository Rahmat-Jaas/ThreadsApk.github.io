package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.service.session.UserSession;

/* renamed from: X.4zl  reason: invalid class name and case insensitive filesystem */
public final class C87054zl extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C3G A01;
    public final /* synthetic */ C20066BMj A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;

    public final void onClick(View view) {
        C04220Ms.A0B(view, 0);
        UserSession userSession = this.A03;
        C37235Jn1.A00(userSession).A03(view, C171469zS.TAP);
        BKU A002 = C19462Awj.A00(userSession, "MediaHeaderHelper", this.A04);
        if (A002 != null) {
            this.A01.BpI(A002, this.A02, this.A00);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        C04220Ms.A0B(textPaint, 0);
        textPaint.setUnderlineText(false);
        textPaint.setFakeBoldText(true);
    }

    public C87054zl(C3G c3g, C20066BMj bMj, UserSession userSession, String str, int i) {
        this.A03 = userSession;
        this.A04 = str;
        this.A01 = c3g;
        this.A02 = bMj;
        this.A00 = i;
    }
}
