package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import com.instagram.service.session.UserSession;

/* renamed from: X.77R  reason: invalid class name */
public final class AnonymousClass77R {
    public final UserSession A00;

    public final Dialog A01(Context context, C114026sZ r8) {
        DialogInterface.OnClickListener onClickListener;
        DialogInterface.OnClickListener onClickListener2;
        AnonymousClass25l r0;
        C04220Ms.A0B(context, 0);
        C25828Dsm dsm = new C25828Dsm(context);
        Boolean bool = r8.A0C;
        C04220Ms.A06(bool);
        dsm.A0q(bool.booleanValue());
        dsm.A02 = r8.A0G;
        dsm.A0p(r8.A0D);
        dsm.A0r(false);
        Drawable drawable = r8.A0B;
        if (drawable != null) {
            dsm.A0h(drawable);
        }
        int i = r8.A05;
        if (i != 0) {
            dsm.A0L(i);
        }
        int i2 = r8.A00;
        if (i2 != 0) {
            dsm.A0K(i2);
        }
        int i3 = r8.A04;
        if (i3 != 0) {
            DialogInterface.OnClickListener onClickListener3 = r8.A09;
            int i4 = r8.A03;
            if (i4 == 0) {
                r0 = AnonymousClass25l.RED_BOLD;
            } else if (i4 == 1 || i4 != 2) {
                r0 = AnonymousClass25l.DEFAULT;
            } else {
                r0 = AnonymousClass25l.BLUE_BOLD;
            }
            dsm.A0T(onClickListener3, r0, i3);
        } else {
            String str = r8.A0F;
            if (!(str == null || (onClickListener = r8.A09) == null)) {
                dsm.A0c(onClickListener, str);
            }
        }
        int i5 = r8.A02;
        if (i5 != 0) {
            dsm.A0R(r8.A08, AnonymousClass25l.DEFAULT, i5);
        }
        int i6 = r8.A01;
        if (i6 != 0) {
            dsm.A0S(r8.A07, AnonymousClass25l.DEFAULT, i6);
        } else {
            String str2 = r8.A0E;
            if (!(str2 == null || (onClickListener2 = r8.A07) == null)) {
                dsm.A0b(onClickListener2, str2);
            }
        }
        DialogInterface.OnDismissListener onDismissListener = r8.A0A;
        if (onDismissListener != null) {
            dsm.A0e(onDismissListener);
        }
        return dsm.A0G();
    }

    public AnonymousClass77R(UserSession userSession) {
        this.A00 = userSession;
    }

    public static void A00(Context context, C114026sZ r1, AnonymousClass77R r2) {
        C13950oZ.A00(r2.A01(context, r1));
    }
}
