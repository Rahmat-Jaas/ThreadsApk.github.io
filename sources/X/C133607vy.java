package X;

import android.content.Context;
import android.view.View;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.7vy  reason: invalid class name and case insensitive filesystem */
public final class C133607vy implements C39777Kzl {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C11630kW A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ AnonymousClass79D A04;
    public final /* synthetic */ C134527xq A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public final void onDismiss() {
    }

    public C133607vy(Context context, C11630kW r2, UserSession userSession, User user, AnonymousClass79D r5, C134527xq r6, String str, String str2) {
        this.A04 = r5;
        this.A06 = str;
        this.A05 = r6;
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = r2;
        this.A03 = user;
        this.A07 = str2;
    }

    public final void onButtonClick(View view) {
        this.A04.A03("upsell_snackbar", this.A06, "comment_deletion_block", I17.A00(218));
        C134527xq r4 = this.A05;
        C134527xq.A00(this.A00, this.A01, this.A02, this.A03, r4, "comment_deletion_toast_upsell", this.A07);
    }

    public final void onShow() {
        this.A04.A02("upsell_snackbar", this.A06, "comment_deletion_block");
        C134527xq.A01(this.A02, AnonymousClass006.A01, "toast");
    }
}
