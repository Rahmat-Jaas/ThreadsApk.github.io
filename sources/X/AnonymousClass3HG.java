package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxCListenerShape1S1310000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3HG  reason: invalid class name */
public final class AnonymousClass3HG {
    public final Context A00;
    public final UserSession A01;
    public final Fragment A02;

    public final void A01(C83894sA r20, User user, String str, boolean z, boolean z2) {
        C25828Dsm dsm;
        int i;
        Object[] objArr;
        String BK7;
        int i2;
        Object[] objArr2;
        String BK72;
        String BK73;
        User user2 = user;
        C83894sA r8 = r20;
        String str2 = str;
        boolean z3 = z2;
        if (!user2.A3C()) {
            int Apb = user2.Apb();
            Context context = this.A00;
            if (Apb == 1) {
                i = 2131822338;
                objArr = new Object[1];
                BK7 = user2.Ak1();
            } else {
                i = 2131822358;
                if (z2) {
                    i = 2131830671;
                }
                objArr = new Object[1];
                BK7 = user2.BK7();
            }
            objArr[0] = BK7;
            String string = context.getString(i, objArr);
            if (user2.Apb() == 1) {
                i2 = 2131828316;
                objArr2 = new Object[1];
                BK72 = user2.Ak1();
            } else {
                i2 = 2131822356;
                if (C04000Lv.A00(context) >= 2011) {
                    i2 = 2131822357;
                }
                objArr2 = new Object[1];
                BK72 = user2.BK7();
            }
            objArr2[0] = BK72;
            String string2 = context.getString(i2, objArr2);
            dsm = C18190wL.A0W(context);
            dsm.A02 = string;
            dsm.A0p(string2);
            C18180wK.A1N(dsm, this, 178, 2131823054);
            dsm.A0P(new IDxCListenerShape1S1310000_1_I2(this, user2, r8, str2, 2, z3), 2131828308);
        } else if (z) {
            A00(this.A00, user2, Boolean.valueOf(z3), str2);
            if (r20 != null) {
                r8.CEZ();
                return;
            }
            return;
        } else {
            int i3 = 2131830404;
            if (z2) {
                i3 = 2131830401;
            }
            Context context2 = this.A00;
            if (user2.Apb() == 1) {
                BK73 = user2.Ak1();
            } else {
                BK73 = user2.BK7();
            }
            CharSequence[] charSequenceArr = {AnonymousClass0wJ.A0l(context2, BK73, i3)};
            dsm = C18190wL.A0W(context2);
            dsm.A0j(this.A02, this.A01);
            dsm.A0d(new IDxCListenerShape1S1310000_1_I2(this, user2, r8, str2, 1, z3), charSequenceArr);
        }
        dsm.A0q(true);
        dsm.A0r(true);
        AnonymousClass0wJ.A1K(dsm);
    }

    public AnonymousClass3HG(Fragment fragment, UserSession userSession) {
        this.A02 = fragment;
        this.A00 = fragment.requireContext();
        this.A01 = userSession;
    }

    public final void A00(Context context, User user, Boolean bool, String str) {
        String str2;
        Context context2;
        int i;
        int i2;
        Object[] objArr;
        String BK7;
        boolean A3C = user.A3C();
        user.A2I(!A3C);
        UserSession userSession = this.A01;
        user.A1t(userSession);
        int Apb = user.Apb();
        String id = user.getId();
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        Object[] objArr2 = {id};
        if (Apb == 1) {
            if (A3C) {
                str2 = "friendships/unblock_friend_reel_fb/%s/";
            } else {
                str2 = "friendships/block_friend_reel_fb/%s/";
            }
        } else if (A3C) {
            str2 = "friendships/unblock_friend_reel/%s/";
        } else {
            str2 = "friendships/block_friend_reel/%s/";
        }
        A0N.A0J(C18180wK.A0j(str2, objArr2));
        A0N.A0O("source", str);
        C32165H8c A0T = C18180wK.A0T(A0N, C22081Th.class, AnonymousClass3PJ.class);
        A0T.A00 = new C24291hq(context, this, user, A3C);
        C31155GhB.A00().schedule(A0T);
        if (user.Apb() == 1) {
            context2 = this.A00;
            i2 = 2131837668;
            if (user.A3C()) {
                i2 = 2131837567;
            }
            objArr = new Object[1];
            BK7 = user.Ak1();
        } else {
            boolean booleanValue = bool.booleanValue();
            context2 = this.A00;
            boolean A3C2 = user.A3C();
            if (booleanValue) {
                i = 2131837565;
                if (A3C2) {
                    i = 2131837564;
                }
            } else {
                i = 2131837668;
                if (A3C2) {
                    i = 2131837667;
                }
            }
            objArr = new Object[1];
            BK7 = user.BK7();
        }
        objArr[0] = BK7;
        C63813iO.A0D(context, context2.getString(i2, objArr), 0);
    }
}
