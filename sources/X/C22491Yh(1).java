package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxBDelegateShape506S0100000_1_I2;
import com.facebook.redex.IDxCallbackShape695S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.banner.IgdsBanner;
import kotlin.coroutines.jvm.internal.KtSLambdaShape13S0301000_I2_5;
import kotlin.jvm.internal.KtLambdaShape115S0100000_I2_95;
import kotlin.jvm.internal.KtLambdaShape33S0200000_I2_17;

/* renamed from: X.1Yh  reason: invalid class name and case insensitive filesystem */
public final class C22491Yh extends C34640IcN {
    public static final String __redex_internal_original_name = "BirthdayCenterFragment";
    public View A00;
    public E2V A01;
    public AnonymousClass115 A02;
    public RecyclerView A03;
    public C58133Eb A04;
    public final C04530Oa A05 = C80644m9.A00(this);
    public final C04530Oa A06;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        E2V e2v = new E2V(C18210wN.A0H(this, 224), C18220wO.A0J(requireView(), R.id.birthday_center_action_bar));
        this.A01 = e2v;
        e2v.A0S(new IDxBDelegateShape506S0100000_1_I2(this, 3));
        AnonymousClass061 r4 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape13S0301000_I2_5(viewLifecycleOwner, r4, this, (C146958n9) null, 8), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A05);
    }

    public C22491Yh() {
        KtLambdaShape115S0100000_I2_95 ktLambdaShape115S0100000_I2_95 = new KtLambdaShape115S0100000_I2_95(this, 29);
        C04530Oa A0l = C18240wQ.A0l(AnonymousClass006.A0C, new KtLambdaShape115S0100000_I2_95(this, 26), 27);
        this.A06 = C18220wO.A0M(new KtLambdaShape115S0100000_I2_95(A0l, 28), ktLambdaShape115S0100000_I2_95, new KtLambdaShape33S0200000_I2_17(47, (Object) null, A0l), C18210wN.A0l(AnonymousClass107.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(529015839);
        super.onCreate(bundle);
        this.A02 = new AnonymousClass115(this, this);
        this.A04 = new C58133Eb(this, AnonymousClass0wJ.A0X(this.A05));
        C14030oh.A09(-1925787869, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1530951325);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.birthday_center_fragment, viewGroup, false);
        this.A00 = inflate.findViewById(R.id.loading_spinner);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.birthday_center_recycler_view);
        this.A03 = recyclerView;
        if (recyclerView != null) {
            AnonymousClass115 r0 = this.A02;
            if (r0 == null) {
                C04220Ms.A0E("birthdayCenterAdapter");
                throw null;
            }
            recyclerView.setAdapter(r0);
        }
        RecyclerView recyclerView2 = this.A03;
        if (recyclerView2 != null) {
            getContext();
            C18190wL.A1D(recyclerView2);
        }
        ((IgdsBanner) AnonymousClass0wJ.A0J(inflate, R.id.turn_off_notifications_banner)).A00 = new IDxCallbackShape695S0100000_1_I2(this, 1);
        C14030oh.A09(-1548550334, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1761523644);
        super.onDestroyView();
        this.A00 = null;
        this.A03 = null;
        C14030oh.A09(-649143032, A022);
    }
}
