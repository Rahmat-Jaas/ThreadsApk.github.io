package X;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1kx  reason: invalid class name and case insensitive filesystem */
public final class C24991kx extends AnonymousClass1lO {
    public final Fragment A00;
    public final C58943Ip A01;
    public final UserSession A02;

    public final Class modelClass() {
        return AnonymousClass48P.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        String BK7;
        AnonymousClass48P r13 = (AnonymousClass48P) mfV;
        AnonymousClass122 r14 = (AnonymousClass122) m5o;
        boolean A1Y = AnonymousClass0wJ.A1Y(r13, r14);
        User user = r13.A01;
        String str = r13.A02;
        boolean z = r13.A04;
        boolean z2 = r13.A00;
        boolean z3 = r13.A03;
        Fragment fragment = this.A00;
        UserSession userSession = this.A02;
        C58943Ip r3 = this.A01;
        IgdsPeopleCell igdsPeopleCell = r14.A00;
        igdsPeopleCell.A00();
        if (z) {
            igdsPeopleCell.A09(user.BK7(), A1Y);
            BK7 = user.Ak1();
        } else {
            String Ak2 = user.Ak2();
            igdsPeopleCell.A09(Ak2, A1Y);
            if (!C04220Ms.A0I(Ak2, user.BK7())) {
                BK7 = user.BK7();
            }
            igdsPeopleCell.A07(str);
            AnonymousClass3AK r1 = new AnonymousClass3AK(fragment, user);
            r1.A00 = C65193sW.A00;
            igdsPeopleCell.A04(r1, userSession, user);
            C25101ln r0 = new C25101ln(fragment.requireContext());
            r0.setChecked(z2);
            igdsPeopleCell.A06(r0, (C81504nu) null);
            AnonymousClass0wJ.A18(igdsPeopleCell, 69, user, r3);
            igdsPeopleCell.setAlpha(C18230wP.A00(z3 ? 1 : 0));
        }
        igdsPeopleCell.A08(BK7);
        igdsPeopleCell.A07(str);
        AnonymousClass3AK r12 = new AnonymousClass3AK(fragment, user);
        r12.A00 = C65193sW.A00;
        igdsPeopleCell.A04(r12, userSession, user);
        C25101ln r02 = new C25101ln(fragment.requireContext());
        r02.setChecked(z2);
        igdsPeopleCell.A06(r02, (C81504nu) null);
        AnonymousClass0wJ.A18(igdsPeopleCell, 69, user, r3);
        igdsPeopleCell.setAlpha(C18230wP.A00(z3 ? 1 : 0));
    }

    public C24991kx(Fragment fragment, C58943Ip r2, UserSession userSession) {
        AnonymousClass0wJ.A1Q(userSession, r2);
        this.A00 = fragment;
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1Y = C18200wM.A1Y(viewGroup);
        return new AnonymousClass122(new IgdsPeopleCell(C18190wL.A0A(viewGroup), (AttributeSet) null, A1Y ? 1 : 0, A1Y));
    }
}
