package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape25S0200000_I2_9;
import kotlin.jvm.internal.KtLambdaShape61S0100000_I2_41;

/* renamed from: X.1ap  reason: invalid class name */
public final class AnonymousClass1ap extends C34640IcN implements C11630kW {
    public static final String __redex_internal_original_name = "ChannelsListFragment";
    public C150388wA A00;
    public final C04530Oa A01 = C80644m9.A00(this);
    public final C04530Oa A02;

    public final String getModuleName() {
        return "channels_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0J(view, R.id.channels_list);
        this.A00 = C18220wO.A0Z(C18220wO.A0Y(this), new C25001ky(this, this, requireContext().getColor(R.color.fds_transparent)));
        requireContext();
        C18200wM.A1H(recyclerView, 1);
        C18250wR.A0v(getViewLifecycleOwner(), C29110FiC.A00((C27952Ew2) null, ((C19380zm) this.A02.getValue()).A02, 3), recyclerView, this, 8);
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public AnonymousClass1ap() {
        KtLambdaShape61S0100000_I2_41 ktLambdaShape61S0100000_I2_41 = new KtLambdaShape61S0100000_I2_41(this, 10);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape61S0100000_I2_41(new KtLambdaShape61S0100000_I2_41(this, 7), 8));
        this.A02 = C18220wO.A0M(new KtLambdaShape61S0100000_I2_41(A012, 9), ktLambdaShape61S0100000_I2_41, new KtLambdaShape25S0200000_I2_9(47, (Object) null, A012), C18210wN.A0l(C19380zm.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1234067214);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.layout_channels_fragment, false);
        C14030oh.A09(1597316329, A022);
        return A0D;
    }
}
