package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.IDxPredicateShape214S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgCheckBox;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1us  reason: invalid class name and case insensitive filesystem */
public final class C28721us extends AnonymousClass1cP {
    public static final String __redex_internal_original_name = "PrivateStoryPostCreationAudiencePickerFragment";
    public AnonymousClass3GJ A00;
    public IgdsButton A01;
    public UserSession A02;
    public String A03;
    public final C571439x A04 = new C571439x();
    public final C63873iU A05 = C63873iU.A06(this, 40);

    public final String getModuleName() {
        return "audience_selection";
    }

    public static void A02(C28721us r3) {
        AnonymousClass3GJ r1 = r3.A00;
        C571439x r2 = r3.A04;
        r1.A03 = r2.A02.size();
        r3.A00.A01 = r2.A00.size();
        r3.A00.A00 = r2.A01.size();
        AnonymousClass3GJ r12 = r3.A00;
        r12.A07 = AnonymousClass006.A0N;
        r12.A00();
        C18190wL.A1A(r3);
    }

    public final void A06() {
        String A0V;
        this.A00.A03(requireContext(), (View.OnClickListener) null, C170039uK.LOADING);
        Context requireContext = requireContext();
        AnonymousClass06E A002 = AnonymousClass06E.A00(this);
        UserSession userSession = this.A02;
        String str = this.A03;
        C04220Ms.A0B(userSession, 0);
        H1T A0P = AnonymousClass0wJ.A0P(userSession);
        if (str == null) {
            A0V = "stories/private_stories/members/";
        } else {
            A0V = AnonymousClass00U.A0V("stories/private_stories/media/", str, "/allowlist/");
        }
        A0P.A0J(A0V);
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0P, AnonymousClass1TM.class, AnonymousClass3LO.class);
        C63873iU.A0E(A0T, this, 41);
        C31155GhB.A01(requireContext, A002, A0T);
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public static List A01(C28721us r4) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (AnonymousClass395 r1 : C18220wO.A0S(r4.A00.A0C)) {
            if (r1.A00) {
                A0v.add(r1);
            }
        }
        for (AnonymousClass395 r12 : C18220wO.A0S(r4.A00.A0D)) {
            if (r12.A00) {
                A0v.add(r12);
            }
        }
        return A0v;
    }

    public final void A05(IgCheckBox igCheckBox, AnonymousClass395 r11) {
        User user;
        List list;
        boolean z = !igCheckBox.isChecked();
        igCheckBox.setChecked(z);
        r11.A00 = z;
        ArrayList A0s = C18200wM.A0s(C18220wO.A0S(this.A00.A0C));
        ArrayList A0s2 = C18200wM.A0s(C18220wO.A0S(this.A00.A0D));
        if (z) {
            A0s.add(r11);
            C19245AtA.A01(new IDxPredicateShape214S0200000_1_I2(0, this, r11), A0s2.iterator());
            C571439x r5 = this.A04;
            user = r11.A01;
            boolean z2 = this.A01.A01;
            r5.A02.remove(user);
            if (z2) {
                list = r5.A01;
            } else {
                list = r5.A00;
            }
            list.add(user);
        } else {
            A0s2.add(r11);
            C19245AtA.A01(new IDxPredicateShape214S0200000_1_I2(1, this, r11), A0s.iterator());
            C571439x r1 = this.A04;
            user = r11.A01;
            r1.A02.add(user);
            r1.A00.remove(user);
            r1.A01.remove(user);
        }
        this.A00.A04(A0s, A0s2);
        this.A00.A02(A01(this).size());
        UserSession userSession = this.A02;
        C312224t r0 = this.A00.A05;
        r0.getClass();
        AnonymousClass3LR.A00(this.A05, userSession, "audience_selection", r0.A00, user.getId(), this.A03, z);
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        r3.Crs(requireContext().getString(2131824038));
        r3.CtT(true);
        AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 260);
    }

    public final boolean onBackPressed() {
        A02(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1555443173);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = C18180wK.A0V(requireArguments);
        this.A03 = C18190wL.A0j(requireArguments, "media_id");
        this.A00 = new AnonymousClass3GJ(this, this.A02);
        C312224t r0 = (C312224t) requireArguments.getSerializable("entry_point");
        AnonymousClass3GJ r1 = this.A00;
        if (r0 == null) {
            r0 = C312224t.UNKNOWN;
        }
        r1.A05 = r0;
        r1.A09 = true;
        C14030oh.A09(-1325647333, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass0wJ.A0L(view, R.id.audience_picker_disclaimer_text).setText(2131832801);
        IgdsButton igdsButton = (IgdsButton) view.requireViewById(R.id.done_button);
        this.A01 = igdsButton;
        igdsButton.setText(2131826219);
        this.A01.setEnabled(true);
        AnonymousClass0wJ.A16(this.A01, 258, this);
        view.requireViewById(R.id.search_box);
        view.requireViewById(R.id.search_exit_button);
        this.A01.A00(C18180wK.A0j("users/search/", new Object[]{AnonymousClass0wJ.A0Y(this.A02).getId()}), "favorites_list_page");
        A06();
    }
}
