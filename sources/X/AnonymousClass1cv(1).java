package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.common.kotlindelegate.lifecycle.LazyAutoCleanup;
import kotlin.coroutines.jvm.internal.KtSLambdaShape19S0201000_I2_5;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2;
import kotlin.jvm.internal.KtLambdaShape158S0100000_I2_13;
import kotlin.jvm.internal.KtLambdaShape64S0100000_I2_44;

/* renamed from: X.1cv  reason: invalid class name */
public final class AnonymousClass1cv extends C34640IcN implements C27818Etn {
    public static final /* synthetic */ AnonymousClass0A5[] A08 = C18220wO.A1b(AnonymousClass1cv.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;");
    public static final String __redex_internal_original_name = "DirectHeadmojisTrayPickerFragment";
    public int A00;
    public C150388wA A01;
    public DVI A02;
    public K6u A03;
    public AnonymousClass0YY A04;
    public final LazyAutoCleanup A05 = new LazyAutoCleanup(this, new KtLambdaShape64S0100000_I2_44(this, 45));
    public final C04530Oa A06 = C80644m9.A00(this);
    public final C04530Oa A07;

    public final String getModuleName() {
        return "direct_headmoji_stickers_picker";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        DVI dvi;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) this.A05.A01();
        if (recyclerView != null) {
            Context context = recyclerView.getContext();
            recyclerView.setLayoutManager(new GridLayoutManager(3, 1));
            C150388wA r0 = this.A01;
            if (r0 == null) {
                C04220Ms.A0E("stickersAdapter");
                throw null;
            }
            recyclerView.setAdapter(r0);
            Resources resources = context.getResources();
            recyclerView.A0y(new C22031CDi(true, resources.getDimensionPixelOffset(R.dimen.activation_module_horizontal_margin), resources.getDimensionPixelOffset(R.dimen.asset_picker_cell_margin), resources.getDimensionPixelOffset(R.dimen.accent_edge_thickness), 0));
            View A0K = AnonymousClass0wJ.A0K(view, R.id.headmoji_status_snackbar);
            if (!(this.mView == null || (dvi = this.A02) == null)) {
                ((C19510zz) this.A07.getValue()).A03.CrC(dvi);
            }
            C18200wM.A0M(this).A00(new KtSLambdaShape1S0300000_I2((C146958n9) null, (Object) this, (Object) A0K, 38));
            C62793ak A0N = C18200wM.A0N(this.A07);
            Context requireContext = requireContext();
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape19S0201000_I2_5((Object) A0N, (Object) requireContext, (C146958n9) null, 39), AnonymousClass3J5.A00(A0N), 3);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A06);
    }

    public final boolean isScrolledToTop() {
        View view = (View) this.A05.A01();
        if (view == null || view.getScrollY() == 0) {
            return true;
        }
        return false;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        this.A00 = i;
        K6u k6u = this.A03;
        if (k6u != null) {
            k6u.A05(i);
        }
    }

    public AnonymousClass1cv() {
        KtLambdaShape64S0100000_I2_44 ktLambdaShape64S0100000_I2_44 = new KtLambdaShape64S0100000_I2_44(this, 49);
        C04530Oa A0z = C18220wO.A0z(AnonymousClass006.A0C, new KtLambdaShape64S0100000_I2_44(this, 46), 47);
        this.A07 = C18220wO.A0M(new KtLambdaShape64S0100000_I2_44(A0z, 48), ktLambdaShape64S0100000_I2_44, C18250wR.A0d(A0z, (Object) null, 19), C18210wN.A0l(C19510zz.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1158028686);
        super.onCreate(bundle);
        C18489AgL A0Y = C18220wO.A0Y(this);
        A0Y.A01(new C22434CZp(this, AnonymousClass0wJ.A0X(this.A06), new KtLambdaShape158S0100000_I2_13(this, 24)));
        this.A01 = C18220wO.A0Z(A0Y, new C22414CYt());
        C14030oh.A09(1379464484, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(190200194);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.direct_headmojis_picker_fragment, false);
        C14030oh.A09(-1515337529, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-2016194998);
        super.onDestroyView();
        this.A03 = null;
        C14030oh.A09(582467903, A022);
    }
}
