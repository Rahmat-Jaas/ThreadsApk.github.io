package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.barcelona.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.HashMap;

/* renamed from: X.1bX  reason: invalid class name */
public final class AnonymousClass1bX extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "CollabStatusFragment";
    public String A00 = "edit_profile";
    public final AnonymousClass28V A01 = AnonymousClass28V.OPEN_TO_COLLAB_V1;
    public final C04530Oa A02 = C80644m9.A00(this);

    public final String getModuleName() {
        return "collab_status_fragment";
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("entrypoint", this.A00);
        String A0p = C18220wO.A0p(A0y);
        C04220Ms.A06(A0p);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(new C15720rm("collab_status_fragment"), AnonymousClass0wJ.A0U(this.A02)), "ig_creator_connections_events"), 1148);
        C18220wO.A1D(AnonymousClass29Y.IMPRESSION, A0I);
        A0I.A0O(AnonymousClass28W.EDIT_OPEN_TO_COLLAB_SETTINGS, "screen");
        A0I.A0O(AnonymousClass27k.EDIT_SETTINGS, "target");
        A0I.A0O(this.A01, "project");
        A0I.A0T("extra", A0p);
        A0I.Bb4();
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        if (r3 != null) {
            r3.Cqb(2131824064);
            AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 131);
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1882118530);
        super.onCreate(bundle);
        String string = requireArguments().getString("args_entrypoint");
        if (string == null) {
            string = "edit_profile";
        }
        this.A00 = string;
        C14030oh.A09(-1618582132, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-899010357);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.collab_status_fragment, viewGroup, false);
        IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass0wJ.A0J(inflate, R.id.collab_status_switch_cell);
        igdsListCell.A0F(AnonymousClass24V.TYPE_SWITCH, false);
        igdsListCell.setEnabled(true);
        C10300i6 A0U = AnonymousClass0wJ.A0U(this.A02);
        C04220Ms.A0B(A0U, 0);
        H1T A0P = C18180wK.A0P(A0U);
        C18240wQ.A19(A0P);
        A0P.A0J(C18240wQ.A0h("creators/", "collaboration/", "settings/"));
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0P, C21361Qk.class, C59033Jf.class);
        C04220Ms.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.CollaborationSettingsResponse>>");
        C63873iU.A0E(A0T, igdsListCell, 10);
        schedule(A0T);
        C18230wP.A1N(igdsListCell, this, 3);
        ((TextView) AnonymousClass0wJ.A0J(inflate, R.id.collab_status_subtext)).setText(2131824063);
        C14030oh.A09(-277923977, A022);
        return inflate;
    }
}
