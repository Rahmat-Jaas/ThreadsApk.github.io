package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.common.task.IDxLTaskShape133S0100000_1_I2;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1ZH  reason: invalid class name */
public final class AnonymousClass1ZH extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "QuickPromotionDebugItemFragment";
    public AnonymousClass3HO A00;
    public AnonymousClass11E A01;
    public UserSession A02;

    public final void configureActionBar(AnonymousClass4u2 r3) {
        String str;
        r3.CtT(true);
        AnonymousClass3HO r0 = this.A00;
        if (r0 != null) {
            str = r0.A00.name();
        } else {
            str = "Slot";
        }
        r3.setTitle(AnonymousClass0wJ.A0o(this, str, 2131825616));
    }

    public final String getModuleName() {
        return "quick_promotion_item";
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(280954916);
        super.onCreate(bundle);
        this.A02 = C18180wK.A0V(this.mArguments);
        C14030oh.A09(378528926, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1044080801);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_slot_details_fragment, viewGroup, false);
        TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.qp_slot_info_tv);
        C61833Vz A002 = C36622Sa.A00();
        UserSession userSession = this.A02;
        QuickPromotionSlot quickPromotionSlot = this.A00.A00;
        C28161tl A012 = AnonymousClass3WS.A01(userSession);
        String name = this.A00.A00.name();
        C04220Ms.A0B(name, 0);
        int i = 2131825594;
        if (A002.A0B(quickPromotionSlot, new AnonymousClass3UV(C18200wM.A0h(A012.A00, AnonymousClass00U.A0L(name, "_qp_slot_impression_data"))), userSession)) {
            i = 2131825597;
        }
        A0L.setText(i);
        RecyclerView recyclerView = (RecyclerView) inflate.requireViewById(R.id.qp_slot_details_rv);
        AnonymousClass3HO r1 = this.A00;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Map map = r1.A02;
        Map map2 = r1.A03;
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            List<C57833Cq> list = (List) A0o.getValue();
            C40337Lct lct = (C40337Lct) A0o.getKey();
            if (list != null && !list.isEmpty()) {
                for (C57833Cq r3 : list) {
                    Object obj = map2.get(r3.A02.A05);
                    obj.getClass();
                    A0v.add(new C57183Ab((C62573aJ) obj, lct, r3));
                }
            }
        }
        this.A01 = new AnonymousClass11E(this, A0v);
        getContext();
        C18190wL.A1D(recyclerView);
        recyclerView.A0y(new C34195I7r(getContext()));
        recyclerView.setAdapter(this.A01);
        schedule(new IDxLTaskShape133S0100000_1_I2(this, 3));
        C14030oh.A09(533966296, A022);
        return inflate;
    }
}
