package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import com.facebook.redex.IDxObjectShape277S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3Uw  reason: invalid class name and case insensitive filesystem */
public final class C61683Uw {
    public AnonymousClass4u2 A00;
    public User A01;
    public C83034qg A02;
    public final C34640IcN A03;
    public final UserSession A04;
    public final C19818BBs A05;
    public final String A06;
    public final String A07;
    public final Context A08;
    public final IDxObjectShape277S0100000_1_I2 A09 = new IDxObjectShape277S0100000_1_I2(this, 8);
    public final C11630kW A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;

    public static final void A00(C61683Uw r11) {
        AnonymousClass4u2 r5 = r11.A00;
        if (r5 != null) {
            Context context = r11.A08;
            C11630kW r10 = r11.A0A;
            User user = r11.A01;
            C83034qg r6 = r11.A02;
            boolean z = r11.A0D;
            String str = r11.A0C;
            String str2 = r11.A0B;
            if (user == null) {
                if (str == null) {
                    str = "";
                }
                SpannableStringBuilder A0E = C18200wM.A0E(str);
                if (!z) {
                    r5.Cnm(A0E, str2);
                    return;
                }
                CircularImageView circularImageView = new CircularImageView(context, (AttributeSet) null, 0);
                C18230wP.A0z(context, circularImageView, R.color.igds_status_pill_ripple);
                r5.Cnn(A0E, circularImageView, str2);
                return;
            }
            SpannableStringBuilder A0E2 = C18200wM.A0E(user.BK7());
            if (user.BZi()) {
                C63563ho.A04(context, A0E2, true);
            }
            if (!z) {
                if (str2 == null) {
                    str2 = user.A1K();
                }
                r5.Cnm(A0E2, str2);
            } else {
                CircularImageView circularImageView2 = new CircularImageView(context, (AttributeSet) null, 0);
                circularImageView2.A0F(1, context.getColor(R.color.igds_status_pill_ripple));
                circularImageView2.A02 = true;
                C18220wO.A1L(r10, circularImageView2, user);
                circularImageView2.setContentDescription(context.getString(2131833007));
                if (str2 == null) {
                    str2 = user.A1K();
                }
                r5.Cnn(A0E2, circularImageView2, str2);
            }
            r5.Cqc(C18200wM.A0R(user, r6, 210));
        }
    }

    public final void A01() {
        C19818BBs bBs = this.A05;
        if (bBs != null) {
            bBs.onDestroy();
        }
        AnonymousClass3LY.A00(this.A04).A02(this.A09, BBZ.class);
    }

    public C61683Uw(Context context, C34640IcN icN, C11630kW r5, UserSession userSession, C83034qg r7, C19818BBs bBs, String str, String str2, String str3, String str4, boolean z) {
        this.A06 = str;
        this.A0C = str2;
        this.A07 = str3;
        this.A03 = icN;
        this.A04 = userSession;
        this.A05 = bBs;
        this.A02 = r7;
        this.A0D = z;
        this.A08 = context;
        this.A0A = r5;
        this.A0B = str4;
    }
}
