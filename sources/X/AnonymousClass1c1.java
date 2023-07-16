package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.barcelona.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.modal.TransparentModalActivity;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0801000_I2;
import kotlin.jvm.internal.KtLambdaShape27S0200000_I2_11;
import kotlin.jvm.internal.KtLambdaShape70S0100000_I2_50;

/* renamed from: X.1c1  reason: invalid class name */
public final class AnonymousClass1c1 extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "FanClubPromoAndWelcomeVideoFragment";
    public AnonymousClass495 A00;
    public E72 A01;
    public AnonymousClass3HY A02;
    public final C04530Oa A03 = AnonymousClass0OY.A02(C18250wR.A0g(this, 19));
    public final C04530Oa A04 = C80644m9.A00(this);
    public final C04530Oa A05;

    public final void configureActionBar(AnonymousClass4u2 r5) {
        int i;
        C04220Ms.A0B(r5, 0);
        C04530Oa r1 = this.A05;
        r5.CtT(!((C195310c) r1.getValue()).A0D);
        AnonymousClass23Z A08 = C62793ak.A08(r1);
        Context requireContext = requireContext();
        int ordinal = A08.ordinal();
        if (ordinal == 0) {
            i = 2131837616;
        } else if (ordinal == 1) {
            i = 2131837648;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        r5.setTitle(AnonymousClass0wJ.A0k(requireContext, i));
    }

    public final String getModuleName() {
        return "FanClubPromoVideosFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        TextView A0L = AnonymousClass0wJ.A0L(view2, R.id.promo_video_title);
        C04530Oa r2 = this.A05;
        AnonymousClass23Z A08 = C62793ak.A08(r2);
        Context requireContext = requireContext();
        int ordinal = A08.ordinal();
        if (ordinal == 0) {
            i = 2131837627;
        } else if (ordinal == 1) {
            i = 2131837656;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        A0L.setText(AnonymousClass0wJ.A0k(requireContext, i));
        TextView A0L2 = AnonymousClass0wJ.A0L(view2, R.id.promo_video_subtitle);
        AnonymousClass23Z A082 = C62793ak.A08(r2);
        Context requireContext2 = requireContext();
        int ordinal2 = A082.ordinal();
        if (ordinal2 == 0) {
            i2 = 2131837623;
        } else if (ordinal2 == 1) {
            i2 = 2131837653;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        A0L2.setText(AnonymousClass0wJ.A0k(requireContext2, i2));
        View A0K = AnonymousClass0wJ.A0K(view2, R.id.promo_video_thumbnail);
        View A0J = AnonymousClass0wJ.A0J(view2, R.id.promo_video_thumbnail_shimmer);
        View A0K2 = AnonymousClass0wJ.A0K(view2, R.id.promo_video_footer_loading_spinner);
        View A0K3 = AnonymousClass0wJ.A0K(view2, R.id.uploaded_video_controls);
        View requireViewById = view2.requireViewById(R.id.continue_button);
        C04220Ms.A06(requireViewById);
        AnonymousClass0wJ.A16(requireViewById, HttpStatus.SC_FAILED_DEPENDENCY, this);
        View A0K4 = AnonymousClass0wJ.A0K(view2, R.id.skip_label);
        AnonymousClass0wJ.A16(A0K4, 425, this);
        IgdsListCell igdsListCell = (IgdsListCell) view2.requireViewById(R.id.video_disable_cell);
        AnonymousClass23Z A083 = C62793ak.A08(r2);
        Context requireContext3 = requireContext();
        int ordinal3 = A083.ordinal();
        if (ordinal3 == 0) {
            i3 = 2131837624;
        } else if (ordinal3 == 1) {
            i3 = 2131837654;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        igdsListCell.A0H(AnonymousClass0wJ.A0k(requireContext3, i3));
        AnonymousClass23Z A084 = C62793ak.A08(r2);
        Context requireContext4 = requireContext();
        int ordinal4 = A084.ordinal();
        if (ordinal4 == 0) {
            i4 = 2131837624;
        } else if (ordinal4 == 1) {
            i4 = 2131837654;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        igdsListCell.setContentDescription(AnonymousClass0wJ.A0k(requireContext4, i4));
        Integer num = AnonymousClass006.A01;
        AnonymousClass7FY.A02(igdsListCell, num);
        igdsListCell.A0B(C18190wL.A0H(this, 426));
        IgdsListCell igdsListCell2 = (IgdsListCell) AnonymousClass0wJ.A0K(view2, R.id.video_replace_cell);
        igdsListCell2.A0H(A00(C62793ak.A08(r2), this));
        igdsListCell2.setContentDescription(A00(C62793ak.A08(r2), this));
        AnonymousClass7FY.A02(igdsListCell2, num);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0801000_I2(A0J, A0K4, this, A0K2, igdsListCell2, A0K3, requireViewById, A0K, (C146958n9) null, 3), C18200wM.A0M(this), 3);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C18240wQ.A0n(this, (C146958n9) null, 35), C18200wM.A0M(this), 3);
    }

    public static final void A02(AnonymousClass1c1 r8) {
        Fragment A002;
        C195310c r2 = (C195310c) r8.A05.getValue();
        if (r2.A0D) {
            int ordinal = r2.A00.ordinal();
            if (ordinal == 0) {
                A002 = AnonymousClass2OG.A00(24, false, true, true, false, false);
            } else if (ordinal == 1) {
                A002 = C62853b1.A03(r2.A06, "com.instagram.user_pay.fan_club.screens.create_exclusive_story", AnonymousClass0wJ.A0y());
            } else {
                throw AnonymousClass4VZ.A00();
            }
        } else if (!r2.A0E || r2.A00 != AnonymousClass23Z.PROMOTIONAL) {
            C04220Ms.A0C((Object) null, "null cannot be cast to non-null type com.instagram.mainactivity.delegate.IgNavigator");
            throw C18210wN.A0W("scrollToTop");
        } else {
            A002 = AnonymousClass2OG.A00(8, false, true, false, false, true);
        }
        AnonymousClass0wJ.A19(A002, r8.requireActivity(), AnonymousClass0wJ.A0U(r8.A04));
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    public final boolean onBackPressed() {
        return ((C195310c) this.A05.getValue()).A0D;
    }

    public AnonymousClass1c1() {
        KtLambdaShape70S0100000_I2_50 A0g = C18250wR.A0g(this, 23);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, C18250wR.A0g(C18250wR.A0g(this, 20), 21));
        this.A05 = C18220wO.A0M(C18250wR.A0g(A012, 22), A0g, new KtLambdaShape27S0200000_I2_11(1, (Object) null, A012), C18210wN.A0l(C195310c.class));
    }

    public static final String A00(AnonymousClass23Z r1, AnonymousClass1c1 r2) {
        int i;
        Context requireContext = r2.requireContext();
        int ordinal = r1.ordinal();
        if (ordinal == 0) {
            i = 2131837626;
        } else if (ordinal == 1) {
            i = 2131837655;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        return AnonymousClass0wJ.A0k(requireContext, i);
    }

    public static final void A01(AnonymousClass1c1 r7) {
        C18534AhA A002 = AnonymousClass3LM.A00();
        C04530Oa r6 = r7.A04;
        C18439AfR A042 = A002.A04(C171799zz.A3g, AnonymousClass0wJ.A0X(r6));
        C04530Oa r4 = r7.A05;
        boolean z = true;
        boolean A1Z = C18180wK.A1Z(C62793ak.A08(r4), AnonymousClass23Z.PROMOTIONAL);
        if (C62793ak.A08(r4) != AnonymousClass23Z.WELCOME) {
            z = false;
        }
        A042.A0l = A1Z;
        A042.A0m = z;
        C63863iT.A03(r7.getActivity(), A042.A00(), AnonymousClass0wJ.A0U(r6), TransparentModalActivity.class, "clips_camera").A0J(r7, 9587);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (C18240wQ.A1S(requireArguments(), "is_from_recommendations")) {
            AnonymousClass3HY r2 = this.A02;
            if (r2 == null) {
                C04220Ms.A0E("fanClubSettingsRecommendationsNavigator");
                throw null;
            } else {
                r2.A00(requireContext(), C62793ak.A08(this.A05), i, i2);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(941651382);
        super.onCreate(bundle);
        C04530Oa r1 = this.A04;
        this.A00 = AnonymousClass2O7.A00(AnonymousClass0wJ.A0X(r1));
        E72 e72 = new E72(requireContext(), this, requireActivity(), this, C70014Bw.A00, (C21839C2o) null, (C28321u4) null, AnonymousClass0wJ.A0X(r1));
        this.A01 = e72;
        registerLifecycleListener(e72);
        this.A02 = new AnonymousClass3HY(this, requireActivity(), AnonymousClass0wJ.A0X(r1), C171799zz.A3j.toString(), 48);
        C195310c r5 = (C195310c) this.A05.getValue();
        C86074wE r12 = r5.A0A;
        r12.CrC(Integer.valueOf(AnonymousClass0wJ.A04(r12.getValue()) + 1));
        C25237DiI.A00((Integer) null, ((E5N) r5.A01).A03, C18240wQ.A0n(r5, (C146958n9) null, 36), AnonymousClass3J5.A00(r5), 2);
        C14030oh.A09(1358165906, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1346507775);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fan_club_promo_videos, viewGroup, false);
        C14030oh.A09(-1758863710, A022);
        return inflate;
    }
}
