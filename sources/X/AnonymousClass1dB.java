package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: X.1dB  reason: invalid class name */
public final class AnonymousClass1dB extends C34640IcN implements C33534HpU, C84234sm {
    public static final String __redex_internal_original_name = "EventCohostSearchFragment";
    public C150388wA A00;
    public C22781Zl A01;
    public final LinkedHashSet A02 = new LinkedHashSet();
    public final C04530Oa A03 = C80644m9.A00(this);
    public final LinkedHashMap A04 = C18220wO.A0y();

    public final boolean BXJ(User user) {
        return false;
    }

    public final boolean BYF(User user) {
        return true;
    }

    public final void CDk(C33900Hwe hwe) {
        C04220Ms.A0B(hwe, 0);
        LinkedHashMap linkedHashMap = this.A04;
        linkedHashMap.clear();
        LinkedHashSet linkedHashSet = this.A02;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            User user = (User) it.next();
            linkedHashMap.put(user.getId(), new C57713Ce(user, user.BK7(), user.Ak1(), user.A1I(), true));
        }
        Object B80 = hwe.B80();
        C04220Ms.A06(B80);
        for (User user2 : (Iterable) B80) {
            if (!linkedHashSet.contains(user2)) {
                linkedHashMap.put(user2.getId(), new C57713Ce(user2, user2.BK7(), user2.Ak1(), user2.A1I(), false));
            }
        }
        A00();
    }

    public final boolean CSB(User user, boolean z) {
        LinkedHashSet linkedHashSet = this.A02;
        if (linkedHashSet.contains(user)) {
            linkedHashSet.remove(user);
        } else if (5 <= linkedHashSet.size()) {
            return false;
        } else {
            linkedHashSet.add(user);
        }
        C57713Ce r1 = (C57713Ce) this.A04.get(user.getId());
        if (r1 != null) {
            r1.A00 = linkedHashSet.contains(user);
        }
        A00();
        return true;
    }

    public final String getModuleName() {
        return "event_cohost_search_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = C18220wO.A0Z(C18220wO.A0Y(this), new AnonymousClass1lM(this, this));
        RecyclerView A0L = C18230wP.A0L(view);
        A0L.setItemAnimator((M0E) null);
        C150388wA r0 = this.A00;
        if (r0 == null) {
            C04220Ms.A0E("recyclerViewAdapter");
            throw null;
        }
        A0L.setAdapter(r0);
        requireContext();
        C18200wM.A1H(A0L, 1);
        C18230wP.A0W(view, R.id.bottom_button).setPrimaryActionOnClickListener(C18190wL.A0H(this, HttpStatus.SC_REQUEST_TOO_LONG));
        Context requireContext = requireContext();
        UserSession A0X = AnonymousClass0wJ.A0X(this.A03);
        AnonymousClass06E A002 = AnonymousClass06E.A00(this);
        C04220Ms.A0B(A0X, 1);
        AnonymousClass2TH.A00(new H8Q(requireContext, A002), A0X, true, false).Cmd(this);
    }

    private final void A00() {
        C150388wA r4 = this.A00;
        if (r4 == null) {
            C04220Ms.A0E("recyclerViewAdapter");
            throw null;
        }
        AnonymousClass3I1 r3 = new AnonymousClass3I1();
        Collection<C57713Ce> values = this.A04.values();
        C04220Ms.A06(values);
        ArrayList A0w = AnonymousClass0wJ.A0w(values);
        for (C57713Ce r0 : values) {
            User user = r0.A01;
            A0w.add(new AnonymousClass48E(new C57713Ce(user, user.BK7(), user.Ak1(), user.A1I(), r0.A00)));
        }
        r3.A02(A0w);
        r4.A04(r3);
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public final void onCreate(Bundle bundle) {
        Collection collection;
        ArrayList parcelableArrayList;
        int A022 = C14030oh.A02(-1211009895);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (parcelableArrayList = bundle2.getParcelableArrayList("arg_cohosts")) == null) {
            collection = AnonymousClass0ZV.A00;
        } else {
            collection = AnonymousClass00J.A0N(parcelableArrayList);
        }
        this.A02.addAll(collection);
        C14030oh.A09(100978417, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-648938521);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.event_cohost_search_fragment, viewGroup, false);
        C14030oh.A09(60196459, A022);
        return inflate;
    }
}
