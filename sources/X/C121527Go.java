package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.CallToAction;
import com.instagram.business.fragment.SupportLinksFragment;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.7Go  reason: invalid class name and case insensitive filesystem */
public final class C121527Go {
    public static final C121527Go A00 = new C121527Go();

    public static final void A00(FragmentActivity fragmentActivity, C170809vb r11, UserSession userSession, User user) {
        int i;
        C04220Ms.A0B(user, 1);
        C04220Ms.A0B(r11, 4);
        C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, userSession);
        C62883b4.A01().A00();
        String BK7 = user.BK7();
        ImageUrl B4M = user.B4M();
        Integer A0n = user.A0n();
        if (A0n != null) {
            i = A0n.intValue();
        } else {
            i = 0;
        }
        String id = user.getId();
        long A0D = C86144wL.A0D(user.A14());
        String str = r11.A01.A00;
        C04220Ms.A0B(BK7, 0);
        C18190wL.A1S(id, 3, str);
        Bundle A06 = C18180wK.A06();
        CRQ crq = new CRQ();
        A06.putString(AnonymousClass000.A00(131), BK7);
        A06.putParcelable(AnonymousClass000.A00(130), B4M);
        A06.putInt(AnonymousClass000.A00(129), i);
        A06.putString(AnonymousClass000.A00(1219), id);
        A06.putLong(AnonymousClass000.A00(128), A0D);
        A06.putString("args_entry_point", str);
        crq.setArguments(A06);
        String A002 = AnonymousClass000.A00(393);
        A0Q.A09 = A002;
        A0Q.A07 = A002;
        A0Q.A03 = crq;
        A0Q.A05();
    }

    public final void A02(FragmentActivity fragmentActivity, CallToAction callToAction, UserSession userSession) {
        C04220Ms.A0B(callToAction, 1);
        C10650ih.A02(fragmentActivity, C62333Yi.A00(fragmentActivity));
        String A0l = AnonymousClass0wJ.A0l(fragmentActivity, fragmentActivity.getString(AnonymousClass6T6.A00(callToAction)), 2131829526);
        C04220Ms.A06(A0l);
        String string = fragmentActivity.getString(AnonymousClass6T6.A00(callToAction));
        SpannableStringBuilder A0E = C18200wM.A0E(A0l);
        AnonymousClass3Zw.A01(A0E, new StyleSpan(1), string);
        C63733iD r1 = new C63733iD();
        r1.A0A = A0E;
        r1.A0D = AnonymousClass0wJ.A0k(fragmentActivity, 2131829525);
        r1.A07 = new C133587vw(fragmentActivity, callToAction, userSession);
        r1.A0I = true;
        C63733iD.A0A(r1);
    }

    public static final boolean A01(FragmentActivity fragmentActivity) {
        C12560m7 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        AnonymousClass8bH A0C = AnonymousClass8bI.A0C(0, supportFragmentManager.A0I());
        if (!(A0C instanceof Collection) || !((Collection) A0C).isEmpty()) {
            Iterator it = A0C.iterator();
            while (it.hasNext()) {
                String str = ((AnonymousClass05O) ((AnonymousClass051) supportFragmentManager.A0D.get(((C1367083z) it).A00()))).A0A;
                String str2 = SupportLinksFragment.A06;
                if (str == null) {
                    if (str2 == null) {
                        return true;
                    }
                } else if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
