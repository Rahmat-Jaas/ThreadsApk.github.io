package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2;
import com.instagram.api.sessionscoped.IDxACallbackShape102S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.searchedittext.SearchWithDeleteEditText;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Ip  reason: invalid class name and case insensitive filesystem */
public final class C58943Ip {
    public Context A00;
    public C84474tC A01;
    public AnonymousClass3TN A02;
    public C30991Gcv A03;
    public UserSession A04;
    public List A05;
    public Map A06 = C18220wO.A0y();
    public boolean A07;
    public final C69934Bn A08 = new C69934Bn(this);
    public final C04530Oa A09 = C62373Zc.A00(this, 16);
    public final C04530Oa A0A = C62373Zc.A00(this, 17);

    public final List A01(List list) {
        String str;
        boolean z;
        C04220Ms.A0B(list, 0);
        ArrayList<KtCSuperShape0S1100000_I2> A0v = AnonymousClass0wJ.A0v();
        for (Object next : list) {
            KtCSuperShape0S1100000_I2 ktCSuperShape0S1100000_I2 = (KtCSuperShape0S1100000_I2) next;
            List list2 = this.A05;
            if (list2 == null) {
                list2 = AnonymousClass0ZV.A00;
            }
            if (!list2.contains(((User) ktCSuperShape0S1100000_I2.A00).getId())) {
                A0v.add(next);
            }
        }
        ArrayList A0w = AnonymousClass0wJ.A0w(A0v);
        for (KtCSuperShape0S1100000_I2 ktCSuperShape0S1100000_I22 : A0v) {
            Map map = this.A06;
            User user = (User) ktCSuperShape0S1100000_I22.A00;
            boolean containsKey = map.containsKey(user.BK7());
            if (!this.A07) {
                Context context = this.A00;
                if (context == null) {
                    C04220Ms.A0E("context");
                    throw null;
                }
                str = AnonymousClass0wJ.A0l(context, ktCSuperShape0S1100000_I22.A01, 2131837635);
            } else {
                str = "";
            }
            C04220Ms.A09(str);
            boolean z2 = !this.A07;
            if (!containsKey) {
                z = false;
                if (A06()) {
                    A0w.add(new AnonymousClass48P(user, str, z2, containsKey, z));
                }
            }
            z = true;
            A0w.add(new AnonymousClass48P(user, str, z2, containsKey, z));
        }
        return A0w;
    }

    public final void A05(Map map, boolean z) {
        C04220Ms.A0B(map, 0);
        this.A06 = map;
        C30991Gcv gcv = this.A03;
        if (gcv == null) {
            C04220Ms.A0E("recipientsBarController");
            throw null;
        }
        Collection values = map.values();
        ArrayList A0w = AnonymousClass0wJ.A0w(values);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            A0w.add(new DirectShareTarget(C18220wO.A0c(it)));
        }
        List list = gcv.A0J;
        list.clear();
        list.addAll(A0w);
        C30991Gcv.A02(gcv, (String) null, z, false);
        C84474tC r0 = this.A01;
        if (r0 == null) {
            C04220Ms.A0E("delegate");
            throw null;
        } else {
            r0.CER();
        }
    }

    public final AnonymousClass194 A00(String str, int i, int i2) {
        if (str == null) {
            Context context = this.A00;
            if (context == null) {
                C04220Ms.A0E("context");
                throw null;
            }
            str = AnonymousClass0wJ.A0m(context.getResources(), i, R.plurals.user_pay_fanclub_all_subscribers_header);
            C04220Ms.A06(str);
        }
        if (i2 <= 0) {
            return new AnonymousClass194((View.OnClickListener) null, new AnonymousClass1kB(str), (C57943Dd) null);
        }
        return new AnonymousClass194(C18190wL.A0H(this, 315), new AnonymousClass1kB(str), AnonymousClass1kC.A00(C18210wN.A1X(i2), 2131824627));
    }

    public final void A02() {
        C30991Gcv gcv = this.A03;
        if (gcv == null) {
            C04220Ms.A0E("recipientsBarController");
        } else {
            ViewGroup viewGroup = gcv.A06;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                SearchWithDeleteEditText searchWithDeleteEditText = gcv.A09;
                if (searchWithDeleteEditText != null) {
                    searchWithDeleteEditText.A06 = new AnonymousClass4ML(gcv);
                    return;
                }
                return;
            }
        }
        throw null;
    }

    public final void A03(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        Context context = this.A00;
        if (context == null) {
            C04220Ms.A0E("context");
            throw null;
        }
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A0L(2131826135);
        A0W.A0K(2131824622);
        AnonymousClass25l.A00(onClickListener, A0W, 2131826133);
        A0W.A0O(onClickListener2, 2131823054);
        AnonymousClass0wJ.A1K(A0W);
    }

    public final void A04(Fragment fragment, Boolean bool, Integer num, String str) {
        int seconds;
        boolean z;
        if (str == null) {
            str = "";
        }
        if (num != null) {
            seconds = num.intValue();
        } else {
            seconds = (int) TimeUnit.DAYS.toSeconds(1);
        }
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        AnonymousClass4BM r3 = new AnonymousClass4BM(fragment, this, num);
        UserSession userSession = this.A04;
        if (userSession == null) {
            C18210wN.A0m();
            throw null;
        }
        Collection values = this.A06.values();
        ArrayList A0w = AnonymousClass0wJ.A0w(values);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            C18190wL.A1T(A0w, it);
        }
        String valueOf = String.valueOf(AnonymousClass0Ix.A00());
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        C18190wL.A1N(A0O, A0w, valueOf);
        A0O.A0R("pin_to_profile", z);
        A0O.A0R("is_creator_subscriber_thread", true);
        A0O.A0K("duration_s", seconds);
        if (!TextUtils.isEmpty(str)) {
            A0O.A0O("thread_title", str);
        }
        C32165H8c A022 = A0O.A02();
        A022.A00 = new IDxACallbackShape102S0100000_1_I2(userSession, r3, 0);
        C31155GhB.A03(A022);
    }

    public final boolean A06() {
        int i;
        List list = this.A05;
        if (list == null || (i = list.size() - 1) < 0) {
            i = 0;
        }
        if (i + this.A06.size() < AnonymousClass0wJ.A04(this.A09.getValue())) {
            return false;
        }
        return true;
    }
}
