package X;

import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4Mq  reason: invalid class name and case insensitive filesystem */
public final class C72164Mq implements L1Q {
    public final /* synthetic */ AnonymousClass44T A00;

    public final void BrW() {
    }

    public final void Bxq() {
    }

    public C72164Mq(AnonymousClass44T r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r3 = X.C18230wP.A0A(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r11 = this;
            X.JXd r0 = X.C36480JXd.A02
            X.3Wi r10 = r0.A00()
            X.44T r0 = r11.A00
            com.instagram.service.session.UserSession r8 = r0.A06
            X.IcN r6 = r0.A03
            X.0nS r7 = r0.A05
            com.instagram.user.model.User r9 = r0.A09
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L_0x0079
            boolean r0 = r6.isAdded()
            if (r0 == 0) goto L_0x0079
            android.content.Context r3 = X.C18230wP.A0A(r6)
            r0 = 2131233755(0x7f080bdb, float:1.8083656E38)
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r0)
            if (r4 == 0) goto L_0x0079
            boolean r0 = r9.BRq()
            if (r0 != 0) goto L_0x0079
            boolean r0 = r9.BXy()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0079
            r5 = 3
            android.content.SharedPreferences r1 = X.C28161tl.A04(r8)
            java.lang.String r0 = "restrict_block_upsell_snackbar_shown_count"
            r2 = 0
            int r0 = r1.getInt(r0, r2)
            if (r5 <= r0) goto L_0x0079
            r1 = -1
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r4.setColorFilter(r1, r0)
            X.3iD r1 = X.C63733iD.A01()
            r0 = 2131834910(0x7f11381e, float:1.9302944E38)
            X.C63733iD.A07(r3, r1, r0)
            r1.A03 = r4
            X.22b r0 = X.AnonymousClass22b.ICON
            r1.A0E(r0)
            r0 = 2131829574(0x7f112346, float:1.929212E38)
            java.lang.String r0 = r3.getString(r0)
            X.C04220Ms.A0B(r0, r2)
            r1.A0D = r0
            X.4DA r5 = new X.4DA
            r5.<init>(r6, r7, r8, r9, r10)
            r1.A07 = r5
            r0 = 1
            r1.A0I = r0
            r0 = 8000(0x1f40, float:1.121E-41)
            r1.A01 = r0
            X.C63733iD.A0A(r1)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72164Mq.A00():void");
    }

    public final void Bmc() {
        AnonymousClass44T.A01(this.A00, true);
    }

    public final void onSuccess() {
        AnonymousClass3IR r2;
        String str;
        AnonymousClass44T r5 = this.A00;
        FragmentActivity activity = r5.A03.getActivity();
        C11630kW r1 = r5.A04;
        User user = r5.A09;
        UserSession userSession = r5.A06;
        C15730rn A002 = C15730rn.A00(r1, "report_user");
        A002.A0D("actor_id", userSession.getUserId());
        A002.A0D("action", "block_or_unblock_user");
        A002.A0D("target_id", user.getId());
        A002.A0D(I17.A00(HttpStatus.SC_SWITCHING_PROTOCOLS), C18240wQ.A0g(user.Aj4().toString()));
        AJ5.A00(activity, A002, userSession);
        C18180wK.A1K(A002, userSession);
        if (user.BRq() && (r2 = AnonymousClass3IR.A00) != null) {
            FragmentActivity fragmentActivity = r5.A01;
            if (user.Apo()) {
                str = "2333587946872064";
            } else {
                str = "308597689866606";
            }
            r2.A02(userSession, fragmentActivity, str);
        }
    }

    public final void CNe() {
        A00();
    }

    public final void onCancel() {
        A00();
    }
}
