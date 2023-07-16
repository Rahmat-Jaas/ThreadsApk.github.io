package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.IDxSListenerShape58S0100000_1_I2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import com.facebook.redex.IDxCListenerShape345S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1cN  reason: invalid class name */
public final class AnonymousClass1cN extends C34640IcN implements C82424pb, C82034oy, C83604rg, C85904vx {
    public static final String __redex_internal_original_name = "ReelViewerSettingsFragment";
    public LinearLayoutManager A00;
    public InlineSearchBox A01;
    public AnonymousClass1fU A02;
    public C28526FPx A03;
    public UserSession A04;
    public String A05 = "";
    public final HJF A06 = new HJF();

    public final /* synthetic */ C32165H8c AGK(KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2, String str) {
        return C24238DEg.A00(ktCSuperShape0S2000000_I2, this, str);
    }

    public final void CGE(String str) {
    }

    public final /* synthetic */ void CGG(KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2, AnonymousClass3XX r2) {
        C25750DrM.A01(ktCSuperShape0S2000000_I2, r2, this);
    }

    public final void CGQ(String str) {
    }

    public final void CGa(String str) {
    }

    public final /* synthetic */ void CGd(KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2, C85814vo r2) {
        C25750DrM.A00(ktCSuperShape0S2000000_I2, r2, this);
    }

    public final String getModuleName() {
        return "reel_viewer_settings";
    }

    public final boolean onBackPressed() {
        AnonymousClass1fU r0 = this.A02;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator A0z = AnonymousClass0wJ.A0z(r0.A07);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            if (AnonymousClass0wJ.A1X(A0o.getValue())) {
                A0v.add(((User) A0o.getKey()).getId());
            }
        }
        AnonymousClass1fU r02 = this.A02;
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        Iterator A0z2 = AnonymousClass0wJ.A0z(r02.A07);
        while (A0z2.hasNext()) {
            Map.Entry A0o2 = C18180wK.A0o(A0z2);
            if (!AnonymousClass0wJ.A1X(A0o2.getValue())) {
                A0v2.add(((User) A0o2.getKey()).getId());
            }
        }
        if (!A0v.isEmpty() || !A0v2.isEmpty()) {
            try {
                UserSession userSession = this.A04;
                JSONObject A0y = C18230wP.A0y();
                Iterator it = A0v.iterator();
                while (it.hasNext()) {
                    A0y.put(C18180wK.A0k(it), "block");
                }
                Iterator it2 = A0v2.iterator();
                while (it2.hasNext()) {
                    A0y.put(C18180wK.A0k(it2), C28174Ezk.A00(119));
                }
                H1T A0N = AnonymousClass0wJ.A0N(userSession);
                A0N.A0J("friendships/set_reel_block_status/");
                A0N.A0O("source", "settings");
                C18240wQ.A18(A0N);
                A0N.A0Q("user_block_statuses", A0y.toString());
                C32165H8c A0Q = C18190wL.A0Q(A0N);
                A0Q.A00 = new AnonymousClass1iW(this, A0v, A0v2);
                schedule(A0Q);
                return false;
            } catch (JSONException unused) {
                C63813iO.A03(getContext(), "updateBlocklist_request_error", 2131834837, 1);
                C57273Ak A002 = AnonymousClass2TB.A00(this.A04);
                A002.A01.flowEndFail(A002.A00, "error", (String) null);
                return false;
            }
        } else {
            C38039KHq A003 = AnonymousClass3LY.A00(this.A04);
            AnonymousClass1fU r03 = this.A02;
            ArrayList A0v3 = AnonymousClass0wJ.A0v();
            Iterator it3 = r03.A05.iterator();
            while (it3.hasNext()) {
                C18190wL.A1T(A0v3, it3);
            }
            A003.CWx(new AnonymousClass46M(A0v3));
            requireActivity().getFragmentManager().popBackStack();
            C57273Ak A004 = AnonymousClass2TB.A00(this.A04);
            A004.A01.flowEndCancel(A004.A00, "user_cancelled");
            return false;
        }
    }

    public final void onSearchCleared(String str) {
    }

    public final void CGL(AnonymousClass3XX r5, String str) {
        if (this.A05.equals(str)) {
            C63813iO.A03(getContext(), "UserListResponse_request_error", 2131834837, 1);
        }
    }

    public final /* bridge */ /* synthetic */ void CGj(C85814vo r4, String str) {
        AnonymousClass4K4 r42 = (AnonymousClass4K4) r4;
        if (this.A05.equals(str)) {
            AnonymousClass1fU r2 = this.A02;
            r2.A06.addAll(r42.getItems());
            r2.A00 = false;
            AnonymousClass1fU.A00(r2);
        }
    }

    public final C10300i6 getSession() {
        return this.A04;
    }

    public final void onSearchTextChanged(String str) {
        this.A05 = str;
        AnonymousClass1fU r2 = this.A02;
        boolean isEmpty = str.isEmpty();
        if (r2.A01 != isEmpty) {
            r2.A01 = isEmpty;
            AnonymousClass1fU.A00(r2);
        }
        FEP B5G = this.A06.B5G(this.A05);
        Integer num = B5G.A01;
        Integer num2 = AnonymousClass006.A0C;
        AnonymousClass1fU r22 = this.A02;
        if (num == num2) {
            List list = B5G.A06;
            list.getClass();
            List list2 = r22.A06;
            list2.clear();
            list2.addAll(list);
            r22.A00 = false;
            AnonymousClass1fU.A00(r22);
            return;
        }
        r22.A06.clear();
        r22.A00 = true;
        AnonymousClass1fU.A00(r22);
        this.A03.A05(this.A05);
    }

    public final C32165H8c AGL(String str, String str2) {
        String A0j;
        if (str.isEmpty() || AnonymousClass0wJ.A0Y(this.A04).A0e() == C169839tz.PrivacyStatusPrivate) {
            A0j = C18180wK.A0j("friendships/%s/followers/", new Object[]{this.A04.getUserId()});
        } else {
            A0j = "users/search/";
        }
        return AnonymousClass3Zx.A02(this.A04, A0j, str, "reel_viewer_settings_page", (String) null);
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131834316);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1199773572);
        super.onCreate(bundle);
        this.A04 = AnonymousClass0wJ.A0W(this);
        C24903Dbw dbw = new C24903Dbw();
        dbw.A01 = this;
        dbw.A04 = this.A06;
        dbw.A03 = this;
        this.A03 = dbw.A00();
        AnonymousClass1fU r1 = new AnonymousClass1fU(requireContext(), this, this);
        this.A02 = r1;
        r1.setHasStableIds(true);
        H1T A0N = AnonymousClass0wJ.A0N(this.A04);
        A0N.A0J("friendships/blocked_reels/");
        C63873iU.A0C(this, C18180wK.A0T(A0N, AnonymousClass4K4.class, AnonymousClass3PU.class), 131);
        this.A03.A05(this.A05);
        C57273Ak A002 = AnonymousClass2TB.A00(this.A04);
        A002.A00 = A002.A01.flowStartForMarker(18943604, "viewer_settings_fragment", false);
        C14030oh.A09(1095946313, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1136429731);
        View inflate = layoutInflater.inflate(R.layout.story_viewer_settings, viewGroup, false);
        InlineSearchBox inlineSearchBox = (InlineSearchBox) inflate.requireViewById(R.id.inline_search_box);
        this.A01 = inlineSearchBox;
        inlineSearchBox.A02 = this;
        inlineSearchBox.A07(this.A05, false);
        this.A01.A00 = new IDxCListenerShape345S0100000_1_I2(this, 15);
        RecyclerView A0L = C18230wP.A0L(inflate);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.A00 = linearLayoutManager;
        A0L.setLayoutManager(linearLayoutManager);
        A0L.setAdapter(this.A02);
        A0L.A11(new IDxSListenerShape58S0100000_1_I2(this, 4));
        C14030oh.A09(-1302474560, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(193335332);
        super.onDestroy();
        this.A03.onDestroy();
        C14030oh.A09(-211921828, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1267924042);
        super.onDestroyView();
        this.A03.onDestroyView();
        C14030oh.A09(656904286, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-670006630);
        super.onPause();
        C18240wQ.A10(this);
        C14030oh.A09(227259333, A022);
    }
}
