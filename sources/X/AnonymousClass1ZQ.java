package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxDelegateShape749S0100000_1_I2;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape6S0101000_I2_3;
import kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4;
import kotlin.jvm.internal.KtLambdaShape39S0100000_I2_19;

/* renamed from: X.1ZQ  reason: invalid class name */
public final class AnonymousClass1ZQ extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "BrandedContentApprovePostsForPromotionFragment";
    public final C04530Oa A00 = C18190wL.A0w(this, 18);
    public final C04530Oa A01;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C18489AgL A0Y = C18220wO.A0Y(this);
        A0Y.A01(new C158609Xi((AnonymousClass9Pd) null, new IDxDelegateShape749S0100000_1_I2(this, 2)));
        Context requireContext = requireContext();
        FragmentActivity requireActivity = requireActivity();
        C04530Oa r6 = this.A00;
        A0Y.A01(new C24981kw(requireContext, requireActivity, AnonymousClass0wJ.A0X(r6)));
        A0Y.A01(new C158629Xk());
        A0Y.A01(new C40199LXy(requireContext(), requireActivity(), this, AnonymousClass0wJ.A0X(r6)));
        A0Y.A01(new AnonymousClass60U(requireContext(), requireActivity(), this, AnonymousClass0wJ.A0X(r6)));
        C150388wA A0Z = C18220wO.A0Z(A0Y, new AnonymousClass9VR());
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0I(view, R.id.recycler_view);
        recyclerView.setAdapter(A0Z);
        requireContext();
        C18200wM.A1H(recyclerView, 1);
        AnonymousClass10Q r3 = (AnonymousClass10Q) this.A01.getValue();
        C18190wL.A1C(getViewLifecycleOwner(), r3.A01, A0Z, 5);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape16S0201000_I2_2((Object) r3, (Object) this, (C146958n9) null, 41), C18200wM.A0M(this), 3);
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            AnonymousClass4u2.A07(r2, 2131822573);
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public AnonymousClass1ZQ() {
        KtLambdaShape39S0100000_I2_19 ktLambdaShape39S0100000_I2_19 = new KtLambdaShape39S0100000_I2_19(this, 19);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape39S0100000_I2_19(new KtLambdaShape39S0100000_I2_19(this, 15), 16));
        this.A01 = C18220wO.A0M(new KtLambdaShape39S0100000_I2_19(A012, 17), ktLambdaShape39S0100000_I2_19, new KtLambdaShape20S0200000_I2_4(46, (Object) null, (Object) A012), C18210wN.A0l(AnonymousClass10Q.class));
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-900121055);
        super.onCreate(bundle);
        String A0k = C18190wL.A0k(this);
        if (A0k != null) {
            C04530Oa r1 = this.A01;
            ((AnonymousClass10Q) r1.getValue()).A00 = A0k;
            C62793ak A0N = C18200wM.A0N(r1);
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape6S0101000_I2_3(A0N, (C146958n9) null, 3), AnonymousClass3J5.A00(A0N), 3);
            C10300i6 A0U = AnonymousClass0wJ.A0U(this.A00);
            String string = requireArguments().getString("media_id");
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C18220wO.A0V(this, A0U), "instagram_bc_approve_partner_promotion_entry"), 1704);
            A0I.A0T("media_id", string);
            C18240wQ.A16(A0I, A0k);
            C14030oh.A09(891261602, A02);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(1864326280, A02);
        throw A0b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(310605558);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview, viewGroup, false);
        C14030oh.A09(-1365573602, A02);
        return inflate;
    }
}
