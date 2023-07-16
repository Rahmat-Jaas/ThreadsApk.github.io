package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.redex.IDxFListenerShape748S0100000_1_I2;
import com.facebook.redex.IDxObserverShape27S0400000_1_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1Z0  reason: invalid class name */
public final class AnonymousClass1Z0 extends C34640IcN implements CallerContextable {
    public static final ImmutableList A03 = ImmutableList.of(AnonymousClass254.CALL, AnonymousClass254.EMAIL);
    public static final String __redex_internal_original_name = "ContactOptionsFragment";
    public C85874vu A00;
    public UserSession A01;
    public AnonymousClass101 A02;

    public final String getModuleName() {
        return "contact_sheet";
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-314400718);
        super.onCreate(bundle);
        UserSession A0W = AnonymousClass0wJ.A0W(this);
        this.A01 = A0W;
        this.A02 = (AnonymousClass101) new AnonymousClass7IU((C147138nS) new C66373xV(A0W, C18190wL.A0j(requireArguments(), "ContactOptionsFragment.USER_ID")), (AnonymousClass06C) this).A01(AnonymousClass101.class);
        C14030oh.A09(-888417653, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(575852606);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.layout_contact_options_fragment);
        C14030oh.A09(-1232582509, A022);
        return A0H;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.contact_options_rv);
        getContext();
        C18200wM.A1H(recyclerView, 1);
        Bundle requireArguments = requireArguments();
        ArrayList<Integer> integerArrayList = requireArguments.getIntegerArrayList("ContactOptionsFragment.ACTION_ID_LIST");
        AnonymousClass7Ko.A07(integerArrayList, "Missing Action Ids.");
        AnonymousClass7Ko.A0D(C18250wR.A1K(integerArrayList), "Missing Action Ids.");
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator<Integer> it = integerArrayList.iterator();
        while (it.hasNext()) {
            int A04 = AnonymousClass0wJ.A04(it.next());
            AnonymousClass254[] values = AnonymousClass254.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                AnonymousClass254 r1 = values[i];
                if (r1.A00 == A04) {
                    A0v.add(r1);
                } else {
                    i++;
                }
            }
            throw C18190wL.A0a("Invalid Button Id");
        }
        boolean z = requireArguments.getBoolean("ContactOptionsFragment.REQUEST_CONTACT_ENABLED", false);
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        if (z) {
            C1366783w it2 = A03.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (!A0v.contains(next)) {
                    A0v2.add(next);
                }
            }
        }
        C29110FiC.A00((C27952Ew2) null, this.A02.A03, 3).A0C(this, new IDxObserverShape27S0400000_1_I2(1, A0v2, A0v, recyclerView, this));
        C18210wN.A16(this, C29110FiC.A00((C27952Ew2) null, this.A02.A04, 3), 42);
        AnonymousClass101 r4 = this.A02;
        C25550Dnj dnj = r4.A01;
        String str = r4.A02;
        User A032 = dnj.A03(str);
        if (A032 == null) {
            AnonymousClass3Y8.A02.A00(r4.A00, new IDxFListenerShape748S0100000_1_I2(r4, 1), str);
        } else {
            r4.A03.CrC(new C567338i(A032, true));
        }
    }
}
