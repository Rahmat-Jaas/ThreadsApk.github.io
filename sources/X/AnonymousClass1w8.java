package X;

import android.content.Context;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Date;

/* renamed from: X.1w8  reason: invalid class name */
public final class AnonymousClass1w8 extends C23411dm {
    public static final String __redex_internal_original_name = "QuietModePauseBottomSheetFragment";
    public final C04530Oa A00 = C80644m9.A00(this);

    public final String getModuleName() {
        return "quiet_mode_pause";
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final void onResume() {
        long j;
        int A02 = C14030oh.A02(1417060822);
        super.onResume();
        Context requireContext = requireContext();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass3S0.A00(A0v, R.drawable.ig_illustrations_qp_moon_refresh);
        AnonymousClass3TL r1 = new AnonymousClass3TL((CharSequence) requireContext.getString(2131833964));
        r1.A03 = R.style.igds_emphasized_title_panorama;
        r1.A02 = 4;
        r1.A06 = new C57853Cs(requireContext.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width), C18210wN.A02(requireContext), C18220wO.A01(requireContext, R.dimen.abc_dropdownitem_icon_width), 0, C18220wO.A01(requireContext, R.dimen.abc_dropdownitem_icon_width), C18220wO.A01(requireContext, R.dimen.abc_dropdownitem_icon_width));
        A0v.add(r1);
        C04620Ok r12 = C06810aP.A01;
        C04530Oa r13 = this.A00;
        User A01 = r12.A01(AnonymousClass0wJ.A0X(r13));
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long A022 = C63823iP.A02(AnonymousClass0wJ.A0X(r13), currentTimeMillis);
        if (C63823iP.A0G(AnonymousClass0wJ.A0X(r13), A01, currentTimeMillis)) {
            j = 1000 * A022;
        } else {
            j = 1000 * (SandboxRepository.CACHE_TTL + A022);
        }
        AnonymousClass3TL r14 = new AnonymousClass3TL((CharSequence) AnonymousClass0wJ.A0l(requireContext, C63823iP.A09(requireContext, A022).format(new Date(j)), 2131833958));
        r14.A03 = R.style.igds_body_1;
        r14.A02 = 4;
        r14.A06 = new C57853Cs(C18220wO.A01(requireContext, R.dimen.abc_dropdownitem_icon_width), requireContext.getResources().getDimensionPixelSize(R.dimen.account_permission_section_vertical_padding), C18220wO.A01(requireContext, R.dimen.abc_dropdownitem_icon_width), C18210wN.A02(requireContext), C18220wO.A01(requireContext, R.dimen.abc_dropdownitem_icon_width), C18220wO.A01(requireContext, R.dimen.abc_dropdownitem_icon_width));
        A0v.add(r14);
        setItems(A0v);
        C18200wM.A0H(this).setPadding(0, C18220wO.A01(requireContext, R.dimen.abc_dropdownitem_icon_width), 0, 0);
        C14030oh.A09(460338851, A02);
    }
}
