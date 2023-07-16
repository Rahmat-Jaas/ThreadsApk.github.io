package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.4zi  reason: invalid class name and case insensitive filesystem */
public final class C87024zi extends ClickableSpan {
    public final /* synthetic */ C154959Em A00;
    public final /* synthetic */ User A01;

    public final void onClick(View view) {
        C04220Ms.A0B(view, 0);
        this.A00.A0A.invoke(this.A01, view);
    }

    public final void updateDrawState(TextPaint textPaint) {
        C04220Ms.A0B(textPaint, 0);
        textPaint.setUnderlineText(false);
        textPaint.setFakeBoldText(true);
    }

    public C87024zi(C154959Em r1, User user) {
        this.A00 = r1;
        this.A01 = user;
    }
}
