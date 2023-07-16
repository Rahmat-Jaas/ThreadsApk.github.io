package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxRListenerShape541S0100000_1_I2;
import com.instagram.barcelona.R;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0501000_I2;
import kotlin.jvm.internal.KtLambdaShape32S0200000_I2_16;
import kotlin.jvm.internal.KtLambdaShape91S0100000_I2_71;

/* renamed from: X.1a7  reason: invalid class name */
public final class AnonymousClass1a7 extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "PublisherControlFragment";
    public final C04530Oa A00 = C62373Zc.A03(new KtLambdaShape91S0100000_I2_71(this, 44));
    public final C04530Oa A01 = C80644m9.A00(this);
    public final C04530Oa A02;

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131828594);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.loading_indicator);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        requireContext();
        C18190wL.A1D(recyclerView);
        C18240wQ.A12(recyclerView, this.A00);
        AnonymousClass061 r7 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape4S0501000_I2(recyclerView, viewLifecycleOwner, this, findViewById, r7, (C146958n9) null, 38), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public AnonymousClass1a7() {
        KtLambdaShape91S0100000_I2_71 ktLambdaShape91S0100000_I2_71 = new KtLambdaShape91S0100000_I2_71(this, 48);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape91S0100000_I2_71(new KtLambdaShape91S0100000_I2_71(this, 45), 46));
        this.A02 = C18220wO.A0M(new KtLambdaShape91S0100000_I2_71(A012, 47), ktLambdaShape91S0100000_I2_71, new KtLambdaShape32S0200000_I2_16(4, (Object) null, A012), C18210wN.A0l(AnonymousClass10J.class));
    }

    public static final void A00(AnonymousClass1a7 r8, List list, List list2, int i) {
        String quantityString;
        int size = list2.size();
        if (size <= 5) {
            quantityString = C18200wM.A0l(", ", list2);
        } else {
            int i2 = size - 5;
            quantityString = AnonymousClass0wJ.A0B(r8).getQuantityString(i, i2, new Object[]{C18240wQ.A0b(list2), list2.get(1), list2.get(2), list2.get(3), list2.get(4), Integer.valueOf(i2)});
            C04220Ms.A06(quantityString);
        }
        list.add(new C26532EJz(quantityString, R.style.igds_label));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1314368080);
        super.onCreate(bundle);
        getParentFragmentManager().A0y(new IDxRListenerShape541S0100000_1_I2(this, 4), this, "BLOCKLIST_FRAGMENT_REQUEST_KEY");
        C14030oh.A09(393284472, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1341733881);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.creator_blocklist, false);
        C14030oh.A09(-1385716381, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(2086751964);
        super.onDestroy();
        getParentFragmentManager().A10("BLOCKLIST_FRAGMENT_REQUEST_KEY");
        C14030oh.A09(-34427244, A022);
    }
}
