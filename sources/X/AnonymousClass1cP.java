package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.IDxSListenerShape58S0100000_1_I2;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgCheckBox;
import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1cP  reason: invalid class name */
public abstract class AnonymousClass1cP extends C34640IcN implements C82424pb, C82034oy, C83074qk {
    public static final String __redex_internal_original_name = "AudiencePickerFragment";
    public AnonymousClass1fV A00;
    public C71734Jz A01;
    public final AnonymousClass3I8 A02 = new AnonymousClass3I8();
    public final C04530Oa A03 = C80644m9.A00(this);

    public void A05(IgCheckBox igCheckBox, AnonymousClass395 r6) {
        C04220Ms.A0B(igCheckBox, 1);
        boolean z = !igCheckBox.isChecked();
        igCheckBox.setChecked(z);
        C71734Jz r0 = this.A01;
        if (r0 != null) {
            boolean z2 = r0.A01;
            AnonymousClass3I8 r3 = this.A02;
            r3.A01(r6, z, z2);
            A04().A04(C18220wO.A0S(r3.A01), C18220wO.A0S(r3.A02));
            return;
        }
        C04220Ms.A0E("searchController");
        throw null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InlineSearchBox inlineSearchBox = (InlineSearchBox) AnonymousClass0wJ.A0J(view, R.id.search_box);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.search_exit_button);
        this.A01 = new C71734Jz(requireContext(), A0K, AnonymousClass06E.A00(this), inlineSearchBox, AnonymousClass0wJ.A0X(this.A03), A04());
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0J(view, R.id.recycler_view);
        requireContext();
        C18190wL.A1D(recyclerView);
        recyclerView.setAdapter(A04());
        recyclerView.A11(new IDxSListenerShape58S0100000_1_I2(inlineSearchBox, 6));
    }

    public static void A00(C28731ut r3) {
        AnonymousClass1fV r2 = r3.A00;
        ImmutableList copyOf = ImmutableList.copyOf((Collection) r3.A04.A01);
        C04220Ms.A06(copyOf);
        ImmutableList copyOf2 = ImmutableList.copyOf((Collection) r3.A04.A02);
        C04220Ms.A06(copyOf2);
        r2.A04(copyOf, copyOf2);
    }

    public final AnonymousClass1fV A04() {
        AnonymousClass1fV r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C04220Ms.A0E("listAdapter");
        throw null;
    }

    public void BjF(C63613hu r9) {
        AnonymousClass3GJ r1;
        if (this instanceof C28711ur) {
            C28711ur r3 = (C28711ur) this;
            C04530Oa r4 = r3.A01;
            UserSession A0X = AnonymousClass0wJ.A0X(r4);
            AnonymousClass3I8 r6 = r3.A02;
            List list = r6.A01;
            ImmutableList A0S = C18220wO.A0S(list);
            ArrayList A0w = AnonymousClass0wJ.A0w(A0S);
            Iterator it = A0S.iterator();
            while (it.hasNext()) {
                A0w.add(((AnonymousClass395) it.next()).A01);
            }
            C49112qr.A00(A0X, A0w);
            r6.A00();
            r3.A04().A04(C18220wO.A0S(list), C18220wO.A0S(r6.A02));
            r3.A04().A01();
            r3.A04().A02(list.size());
            C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r3, AnonymousClass0wJ.A0U(r4)), "call_settings_user_selection_page_bulk_remove"), 126).Bb4();
            return;
        }
        if (this instanceof C28721us) {
            C28721us r42 = (C28721us) this;
            List<AnonymousClass395> A012 = C28721us.A01(r42);
            UserSession userSession = r42.A02;
            C312224t r0 = r42.A00.A05;
            r0.getClass();
            AnonymousClass3LR.A01(r42.A05, userSession, r0.A00, r42.A03, A012);
            for (AnonymousClass395 r02 : A012) {
                C571439x r2 = r42.A04;
                User user = r02.A01;
                r2.A02.add(user);
                r2.A00.remove(user);
                r2.A01.remove(user);
            }
            AnonymousClass1fV r22 = r42.A00;
            r22.A0C.clear();
            for (AnonymousClass395 r03 : r22.A0D) {
                r03.A00 = false;
            }
            r22.A01();
            r1 = r42.A00;
        } else {
            C28731ut r5 = (C28731ut) this;
            UserSession userSession2 = r5.A03;
            C312224t r04 = r5.A02.A05;
            r04.getClass();
            String str = r04.A00;
            ImmutableList A0S2 = C18220wO.A0S(r5.A04.A01);
            AnonymousClass0wJ.A1M(userSession2, 0, str);
            AnonymousClass3LR.A01((C63873iU) null, userSession2, str, (String) null, A0S2);
            r5.A04.A00();
            r5.A05.A05(AnonymousClass006.A01, false);
            A00(r5);
            r5.A00.A01();
            C28731ut.A03(r5);
            r1 = r5.A02;
        }
        r1.A08 = true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1632508860);
        this.A00 = new AnonymousClass1fV(C18240wQ.A0A(this, layoutInflater, 0), this, this, this, this);
        View inflate = layoutInflater.inflate(R.layout.layout_audience_picker, viewGroup, false);
        C14030oh.A09(1178973527, A022);
        return inflate;
    }
}
