package X;

import android.text.TextUtils;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.redex.IDxFCallbackShape314S0100000_2_I2;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.service.session.UserSession;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.77n  reason: invalid class name and case insensitive filesystem */
public final class C1199077n {
    public static final AtomicBoolean A02 = C18230wP.A0w();
    public final C11150jb A00;
    public final C11160jc A01;

    public final void A00(String str, String str2, String str3) {
        C31580Grx A002;
        if (!this.A00.A00.A01.getBoolean("PHONEID_APP_DEVICEID_SYNCED", false) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && A02.compareAndSet(false, true)) {
            GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
            A003.A0F(str, AnonymousClass000.A00(155));
            A003.A0F(str3, "appid");
            A003.A0F(str2, "app_scoped_id");
            try {
                C126627fY r1 = (C126627fY) C86104wH.A0p("create", C116526x7.class);
                C67463zb.A01(A003, r1.A00);
                r1.A02 = true;
                C85754vi AB4 = r1.AB4();
                C11160jc r0 = this.A01;
                SettableFuture settableFuture = new SettableFuture();
                C11170jd r2 = new C11170jd(settableFuture, r0);
                C10300i6 r12 = r0.A01;
                if (r12 instanceof UserSession) {
                    A002 = AnonymousClass3WK.A01(C05030Qo.A02(r12));
                } else {
                    A002 = AnonymousClass3WK.A00(C05030Qo.A00(r12));
                }
                A002.AMA(AB4, r2);
                C30954Gc6.A03(new IDxFCallbackShape314S0100000_2_I2(this, 4), settableFuture, C97356Ba.A01);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw C86114wI.A0k(e);
            }
        }
    }

    public C1199077n(C11160jc r1, C11150jb r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
