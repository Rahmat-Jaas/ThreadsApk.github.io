package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.service.session.UserSession;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.User;
import kotlin.jvm.internal.IDxRImplShape188S0000000_1_I2;

/* renamed from: X.13u  reason: invalid class name and case insensitive filesystem */
public final class C202413u extends M5O {
    public final C84094sX A00;
    public final IgdsPeopleCell A01;

    public C202413u(C84094sX r1, IgdsPeopleCell igdsPeopleCell) {
        super(igdsPeopleCell);
        this.A01 = igdsPeopleCell;
        this.A00 = r1;
    }

    public static final C81504nu A00(Fragment fragment, C202413u r7, C11630kW r8, C57943Dd r9, C170019uI r10, UserSession userSession, User user, Integer num, Integer num2) {
        IDxRImplShape188S0000000_1_I2 iDxRImplShape188S0000000_1_I2;
        Context requireContext = fragment.requireContext();
        int intValue = num2.intValue();
        C84094sX r0 = r7.A00;
        if (intValue == 0) {
            iDxRImplShape188S0000000_1_I2 = new IDxRImplShape188S0000000_1_I2(r0, 0);
        }
        int intValue2 = num.intValue();
        if (intValue2 == 0) {
            Integer num3 = AnonymousClass006.A00;
            return new AnonymousClass1m0(requireContext, C18200wM.A0R(user, iDxRImplShape188S0000000_1_I2, 23), num3, num3, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_normal_text_color);
        } else if (intValue2 == 2) {
            Integer num4 = AnonymousClass006.A01;
            return new AnonymousClass1m0(requireContext, C18200wM.A0R(user, iDxRImplShape188S0000000_1_I2, 24), num4, num4, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
        } else if (intValue2 == 1) {
            View inflate = LayoutInflater.from(requireContext).inflate(R.layout.follow_button_medium, r7.A01, false);
            C04220Ms.A0C(inflate, "null cannot be cast to non-null type com.instagram.user.follow.FollowButton");
            FollowButtonBase followButtonBase = (FollowButtonBase) inflate;
            followButtonBase.setBaseStyle(D26.MEDIUM);
            C23894D0g A0L = C23527Ctp.A00(userSession).A0L(user);
            user.A03 = A0L;
            if (A0L == C23894D0g.FollowStatusUnknown) {
                C37088JkK.A00(userSession).A0C(user);
            }
            followButtonBase.A03.A02(r8, userSession, user);
            return followButtonBase;
        } else if (intValue2 != 3) {
            return null;
        } else {
            C26331qQ r5 = new C26331qQ(requireContext, r10, C59523Ld.A00(requireContext, r9).toString());
            AnonymousClass0wJ.A18(r5, 25, user, iDxRImplShape188S0000000_1_I2);
            return r5;
        }
    }
}
