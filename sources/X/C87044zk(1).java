package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4zk  reason: invalid class name and case insensitive filesystem */
public final class C87044zk extends ClickableSpan {
    public final /* synthetic */ BKU A00;
    public final /* synthetic */ C3G A01;
    public final /* synthetic */ C20066BMj A02;
    public final /* synthetic */ UserSession A03;

    public final void updateDrawState(TextPaint textPaint) {
        C04220Ms.A0B(textPaint, 0);
        textPaint.setUnderlineText(false);
    }

    public C87044zk(BKU bku, C3G c3g, C20066BMj bMj, UserSession userSession) {
        this.A01 = c3g;
        this.A00 = bku;
        this.A02 = bMj;
        this.A03 = userSession;
    }

    public final void onClick(View view) {
        C3G c3g = this.A01;
        BKU bku = this.A00;
        C20066BMj bMj = this.A02;
        User A2Z = bku.A2Z(this.A03);
        if (A2Z != null) {
            c3g.Bq2(bku, bMj, A2Z.getId(), bMj.getPosition());
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
