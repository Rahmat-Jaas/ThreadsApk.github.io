package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1lN  reason: invalid class name */
public final class AnonymousClass1lN extends C18523Agw {
    public final Fragment A00;
    public final C83574rd A01;
    public final UserSession A02;
    public final boolean A03;

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C04220Ms.A0B(layoutInflater, 1);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.invitee_user_row);
        C04220Ms.A06(A0H);
        return new C199012i(A0H);
    }

    public final Class modelClass() {
        return AnonymousClass48D.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass48D r13 = (AnonymousClass48D) mfV;
        C199012i r14 = (C199012i) m5o;
        boolean A1Y = AnonymousClass0wJ.A1Y(r13, r14);
        IgdsPeopleCell igdsPeopleCell = r14.A00;
        igdsPeopleCell.A00();
        User user = r13.A00;
        Fragment fragment = this.A00;
        Context requireContext = fragment.requireContext();
        Integer num = AnonymousClass006.A01;
        AnonymousClass1m0 r6 = new AnonymousClass1m0(requireContext, C18200wM.A0R(this, user, 92), num, num, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
        igdsPeopleCell.A09(user.BK7(), A1Y);
        igdsPeopleCell.A08(user.Ak1());
        igdsPeopleCell.A04(new AnonymousClass3AK(fragment, user), this.A02, (User) null);
        AnonymousClass0wJ.A18(igdsPeopleCell, 91, this, user);
        if (this.A03) {
            igdsPeopleCell.A06(r6, (C81504nu) null);
        }
    }

    public AnonymousClass1lN(Fragment fragment, C83574rd r2, UserSession userSession, boolean z) {
        AnonymousClass0wJ.A1O(userSession, r2);
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = fragment;
        this.A03 = z;
    }
}
