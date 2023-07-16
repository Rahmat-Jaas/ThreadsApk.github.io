package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.4Bz  reason: invalid class name and case insensitive filesystem */
public final class C70044Bz implements C83574rd {
    public final /* synthetic */ AnonymousClass1aM A00;

    public C70044Bz(AnonymousClass1aM r1) {
        this.A00 = r1;
    }

    public final void C7j(User user) {
        AnonymousClass1aM r3 = this.A00;
        C58963Iu r2 = new C58963Iu(AnonymousClass0wJ.A0U(r3.A03));
        r2.A0A(user.BK7(), user.Ak1());
        ImageUrl B4M = user.B4M();
        C63613hu r0 = r2.A03;
        if (r0 != null) {
            r0.A08 = B4M;
        }
        r2.A08(r3.requireContext().getString(2131834749), C18200wM.A0R(r3, user, 95));
        C62763ag.A00(r3, r2);
    }

    public final void CSX(User user) {
        AnonymousClass1aM r5 = this.A00;
        C04530Oa r4 = r5.A03;
        C25586DoM.A02(AnonymousClass0wJ.A0X(r4), user.getId(), "events_user_search", "invitee_response_list_fragment");
        C60113Ns.A01(r5.getActivity(), AnonymousClass0wJ.A0U(r4));
        throw null;
    }
}
