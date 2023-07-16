package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.redex.IDxDListenerShape156S0200000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1iH  reason: invalid class name */
public final class AnonymousClass1iH extends C63873iU {
    public C58023Dm A00;
    public final Context A01;
    public final UserSession A02;

    public AnonymousClass1iH(Context context, C58023Dm r2, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = context;
        this.A00 = r2;
    }

    public final void onFail(AnonymousClass3XX r5) {
        C169839tz r0;
        C34640IcN icN;
        int A03 = C14030oh.A03(26380937);
        User A0Y = AnonymousClass0wJ.A0Y(this.A02);
        C169839tz A0e = A0Y.A0e();
        C169839tz r3 = C169839tz.PrivacyStatusPrivate;
        if (A0e == r3) {
            r0 = C169839tz.PrivacyStatusPublic;
        } else {
            r0 = r3;
        }
        A0Y.A20(r0);
        C58023Dm r1 = this.A00;
        if (r1 != null) {
            if (r1 instanceof C27511sd) {
                C29371xr r12 = ((C27511sd) r1).A00;
                r12.A0C = C18180wK.A1Z(AnonymousClass0wJ.A0Y(r12.A04).A0e(), r3);
                icN = r12.A02;
            } else if (r1 instanceof C27501sc) {
                AnonymousClass1x0 r13 = ((C27501sc) r1).A00;
                AnonymousClass1x0.A0D(r13, C18180wK.A1Z(AnonymousClass0wJ.A0Y(r13.A06).A0e(), r3));
                icN = r13;
            }
            C62973bE.A02(icN.requireContext(), r5);
        }
        C14030oh.A0A(5580472, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(-26927604);
        C58023Dm r1 = this.A00;
        if (r1 != null) {
            if (r1 instanceof C27511sd) {
                ((C27511sd) r1).A00.A07 = false;
            } else if (r1 instanceof C27501sc) {
                ((C27501sc) r1).A00.A09 = false;
            }
        }
        C14030oh.A0A(-1983286310, A03);
    }

    public final void onStart() {
        C14030oh.A0A(-286362420, C14030oh.A03(-61118774));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C25828Dsm A0W;
        int A03 = C14030oh.A03(-1493145733);
        C22091Ti r9 = (C22091Ti) obj;
        int A032 = C14030oh.A03(-1233725082);
        if (r9.A03) {
            String str = r9.A02;
            String str2 = r9.A01;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                C62973bE.A01(this.A01);
            } else {
                if (!r9.A04 || AnonymousClass0wJ.A0Y(this.A02).A0e() != C169839tz.PrivacyStatusPublic) {
                    A0W = C18190wL.A0W(this.A01);
                    C18200wM.A1O(A0W);
                    A0W.A02 = r9.A02;
                    A0W.A0p(r9.A01);
                    C18180wK.A1M(A0W);
                    A0W.A0e(new IDxDListenerShape156S0200000_1_I2(0, this, r9));
                } else {
                    Context context = this.A01;
                    A0W = C18190wL.A0W(context);
                    A0W.A02 = str;
                    A0W.A0p(str2);
                    A0W.A0Y(C18220wO.A0O(this, 120), AnonymousClass25l.DEFAULT, context.getString(2131830236), true);
                    A0W.A0X(C18220wO.A0O(this, 119), AnonymousClass25l.BLUE_BOLD, context.getString(2131823054), true);
                    C18240wQ.A1C(A0W, this, 3);
                }
                AnonymousClass0wJ.A1K(A0W);
            }
        } else {
            C58023Dm r0 = this.A00;
            if (r0 != null) {
                r0.A00(r9);
            }
        }
        C14030oh.A0A(-1824819817, A032);
        C14030oh.A0A(1114817841, A03);
    }
}
