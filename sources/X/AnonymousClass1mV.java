package X;

import android.app.Activity;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1mV  reason: invalid class name */
public final class AnonymousClass1mV extends AnonymousClass0gG {
    public final /* synthetic */ C26641qy A00;
    public final /* synthetic */ C24431ij A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1mV(C26641qy r2, C24431ij r3) {
        super(706);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final void run() {
        AnonymousClass269 r0;
        int intValue;
        C26641qy r3 = this.A00;
        User user = r3.A00;
        user.A2E(r3.A07);
        ImmutableList A0J = C18210wN.A0J(r3.A0A);
        C18210wN.A1K(user);
        Integer num = AnonymousClass006.A0j;
        C24431ij r4 = this.A01;
        Integer num2 = r4.A09;
        if (!num.equals(num2) || C63173fJ.A05(AnonymousClass0TJ.A05, 18302964477201981L)) {
            if ((r4 instanceof C26801rE) || (intValue = num2.intValue()) == 1) {
                r0 = AnonymousClass269.LogInSso;
            } else if (intValue != 2) {
                r0 = AnonymousClass269.LogIn;
            } else {
                r0 = AnonymousClass269.A0Q;
            }
            r4.A01(user, r0);
            synchronized (AnonymousClass3XU.A00(r4.A07).A00) {
            }
        }
        if (r3.A06 != null && AnonymousClass0wJ.A1V(C09120et.A02().A1z)) {
            AnonymousClass0wJ.A1L(C09120et.A02().A20, true);
        }
        C07530bf r7 = r4.A07;
        Activity activity = r4.A01;
        UserSession A03 = C67323zM.A03(activity, r4.A04, r7, user, r3.A06, false);
        if (!C09790gg.A00(A0J)) {
            C62353Yv.A00(A03).A04(A0J);
        }
        activity.runOnUiThread(new AnonymousClass4SL(this, A03, user));
        if (!TextUtils.isEmpty(r3.A08)) {
            C62653aT.A02().A02(user.getId(), r3.A08);
        }
    }
}
