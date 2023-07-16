package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgCheckBox;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1ur  reason: invalid class name and case insensitive filesystem */
public final class C28711ur extends AnonymousClass1cP {
    public static final String __redex_internal_original_name = "VerifiedUserCallingAudiencePickerFragment";
    public String A00 = "call_settings";
    public final C04530Oa A01 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r3) {
        r3.Crs(C18240wQ.A0A(this, r3, 0).getString(2131837728));
        r3.CtT(true);
        r3.Crl(C18190wL.A0L(C18180wK.A0N(), this, 266));
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        ((TextView) AnonymousClass0wJ.A0J(view, R.id.audience_picker_disclaimer_text)).setText(2131837725);
        IgdsButton igdsButton = (IgdsButton) AnonymousClass0wJ.A0J(view, R.id.done_button);
        igdsButton.setText(2131826219);
        igdsButton.setEnabled(true);
        igdsButton.setVisibility(0);
        AnonymousClass0wJ.A17(igdsButton, 267, this);
        A04().A01 = new AnonymousClass3CS(requireContext, AnonymousClass0wJ.A0k(requireContext, 2131837727), AnonymousClass0wJ.A0k(requireContext, 2131837726), R.drawable.participant_cell_outline);
        C71734Jz r3 = this.A01;
        if (r3 != null) {
            C04620Ok r1 = C06810aP.A01;
            C04530Oa r2 = this.A01;
            String A0j = C18180wK.A0j("friendships/%s/following/", new Object[]{r1.A01(AnonymousClass0wJ.A0X(r2)).getId()});
            C04220Ms.A06(A0j);
            r3.A00(A0j, "verified_user_calling_page");
            A01(this);
            C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this, AnonymousClass0wJ.A0U(r2)), "call_settings_user_selection_page_impression"), StringTreeSet.MAX_SYMBOL_COUNT).Bb4();
            return;
        }
        C04220Ms.A0E("searchController");
        throw null;
    }

    public final String getModuleName() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public static final void A01(C28711ur r5) {
        r5.A04().A03(r5.requireContext(), (View.OnClickListener) null, C170039uK.LOADING);
        Context requireContext = r5.requireContext();
        AnonymousClass06E A002 = AnonymousClass06E.A00(r5);
        C10300i6 A0U = AnonymousClass0wJ.A0U(r5.A01);
        C04220Ms.A0B(A0U, 0);
        H1T A0P = AnonymousClass0wJ.A0P(A0U);
        A0P.A0J("video_call/retrieve_user_call_settings/");
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0P, AnonymousClass1RM.class, AnonymousClass3KF.class);
        C63873iU.A0E(A0T, r5, 158);
        C31155GhB.A01(requireContext, A002, A0T);
    }

    public final void A05(IgCheckBox igCheckBox, AnonymousClass395 r7) {
        AnonymousClass0A2 r1;
        int i;
        boolean A1V = C18210wN.A1V(igCheckBox);
        super.A05(igCheckBox, r7);
        A04().A02(this.A02.A01.size());
        boolean isChecked = igCheckBox.isChecked();
        C04530Oa r3 = this.A01;
        UserSession A0X = AnonymousClass0wJ.A0X(r3);
        ImmutableList of = ImmutableList.of(r7.A01);
        C04220Ms.A06(of);
        if (isChecked) {
            C04220Ms.A0B(A0X, A1V ? 1 : 0);
            ArrayList A0w = AnonymousClass0wJ.A0w(of);
            Iterator it = of.iterator();
            while (it.hasNext()) {
                C18190wL.A1T(A0w, it);
            }
            KtCSuperShape0S0100000_I2 ktCSuperShape0S0100000_I2 = new KtCSuperShape0S0100000_I2((List) A0w, 7);
            H1T A0O = AnonymousClass0wJ.A0O(A0X);
            A0O.A0J("video_call/add_user_to_allowlist/");
            A0O.A0O("users_to_add", ktCSuperShape0S0100000_I2.toString());
            C31155GhB.A03(AnonymousClass0wJ.A0T(A0O, C85814vo.class, AnonymousClass3Za.class));
            r1 = AnonymousClass0wJ.A0M(C13330nS.A01(this, AnonymousClass0wJ.A0U(r3)), "call_settings_user_selection_page_add_people");
            i = 125;
        } else {
            C49112qr.A00(A0X, of);
            r1 = AnonymousClass0wJ.A0M(C13330nS.A01(this, AnonymousClass0wJ.A0U(r3)), "call_settings_user_selection_page_remove_people");
            i = 128;
        }
        C18180wK.A0I(r1, i).Bb4();
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-2002982627);
        super.onCreate(bundle);
        String A0k = C18190wL.A0k(this);
        if (A0k != null) {
            this.A00 = A0k;
        }
        C14030oh.A09(-807319415, A02);
    }
}
