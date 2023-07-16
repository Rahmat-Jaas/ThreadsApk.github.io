package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I2;
import com.facebook.redex.IDxCListenerShape7S0101000_2_I2;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.1aR  reason: invalid class name */
public final class AnonymousClass1aR extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "MultipleContactInfoFragment";
    public AnonymousClass1fQ A00;
    public C109416jy A01;
    public RecyclerView A02;
    public final List A03 = AnonymousClass0wJ.A0v();
    public final C04530Oa A04 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131824328);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0I(view, R.id.recycler_view);
        this.A02 = recyclerView;
        String str = "recyclerView";
        if (recyclerView != null) {
            AnonymousClass1fQ r0 = this.A00;
            if (r0 == null) {
                str = "adapter";
            } else {
                recyclerView.setAdapter(r0);
                RecyclerView recyclerView2 = this.A02;
                if (recyclerView2 != null) {
                    getContext();
                    C18200wM.A1H(recyclerView2, 1);
                    A01();
                    A00();
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    private final void A01() {
        List list = this.A03;
        list.clear();
        ArrayList A0s = C18200wM.A0s(C1201579a.A00(requireContext(), AnonymousClass0wJ.A0X(this.A04)).A02());
        ArrayList A0x = AnonymousClass0wJ.A0x(A0s, 10);
        int i = 0;
        for (Object next : A0s) {
            int i2 = i + 1;
            if (i < 0) {
                C06750aI.A1A();
                throw null;
            }
            Map unmodifiableMap = Collections.unmodifiableMap(new AutofillData(C18250wR.A0j((String) next)).A00);
            C04220Ms.A06(unmodifiableMap);
            String valueOf = String.valueOf(unmodifiableMap.get(FXPFAccessLibraryDebugFragment.NAME));
            StringBuilder A0r = C18200wM.A0r();
            if (unmodifiableMap.get("address-line1") != null) {
                A0r.append(C18220wO.A0r("address-line1", unmodifiableMap));
                A0r.append(", ");
            }
            A02("address-line2", A0r, unmodifiableMap);
            A0r.append(10);
            A02("address-level2", A0r, unmodifiableMap);
            A02("address-level1", A0r, unmodifiableMap);
            if (unmodifiableMap.get("postal-code") != null) {
                A0r.append(C18220wO.A0r("postal-code", unmodifiableMap));
            }
            A0r.append(10);
            A02("email", A0r, unmodifiableMap);
            if (unmodifiableMap.get("tel") != null) {
                A0r.append(C18220wO.A0r("tel", unmodifiableMap));
            }
            String A0n = C18190wL.A0n(A0r);
            A0x.add(new C57693Cc(new IDxCListenerShape7S0101000_2_I2(this, i, 1), AnonymousClass24V.TYPE_CHEVRON, (Integer) null, valueOf, A0n, 2810));
            i = i2;
        }
        list.addAll(A0x);
    }

    public static void A02(Object obj, StringBuilder sb, Map map) {
        if (map.get(obj) != null) {
            sb.append((String) map.get(obj));
            sb.append(", ");
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    private final void A00() {
        String A0k = AnonymousClass0wJ.A0k(requireContext(), 2131822682);
        SpannableStringBuilder A0E = C18200wM.A0E(A0k);
        AnonymousClass3Zw.A00(A0E, new C18730xl(C18220wO.A04(this)), A0k);
        C63293hC r2 = new C63293hC(A0E);
        r2.A00 = R.style.igds_label;
        r2.A01 = R.dimen.account_permission_section_vertical_padding;
        r2.A03 = new IDxCListenerShape203S0100000_2_I2(this, 133);
        this.A03.add(r2);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1429240219);
        super.onCreate(bundle);
        UserSession A0X = AnonymousClass0wJ.A0X(this.A04);
        this.A01 = new C109416jy(requireContext(), requireActivity(), A0X);
        this.A00 = new AnonymousClass1fQ(requireContext());
        C14030oh.A09(2069352627, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(882368675);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.layout_multiple_contact_info_recyclerview, false);
        C14030oh.A09(-995645439, A022);
        return A0D;
    }

    public final void onResume() {
        L2E l2e;
        int A022 = C14030oh.A02(-2120646599);
        super.onResume();
        A01();
        A00();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0v.addAll(this.A03);
        AnonymousClass1fQ r3 = this.A00;
        if (r3 == null) {
            C04220Ms.A0E("adapter");
            throw null;
        }
        List list = r3.A02;
        list.clear();
        list.addAll(A0v);
        r3.clear();
        for (Object next : list) {
            if (next instanceof C63293hC) {
                l2e = r3.A01;
            } else if (next instanceof C57693Cc) {
                l2e = r3.A00;
            } else {
                throw C18180wK.A0a("unsupported bindergroup added");
            }
            r3.addModel(next, l2e);
        }
        r3.notifyDataSetChanged();
        C14030oh.A09(93797530, A022);
    }
}
