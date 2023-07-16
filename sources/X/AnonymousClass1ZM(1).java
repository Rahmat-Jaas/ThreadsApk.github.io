package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S1501000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0101000_I2_6;
import kotlin.jvm.internal.KtLambdaShape25S0200000_I2_9;
import kotlin.jvm.internal.KtLambdaShape60S0100000_I2_40;

/* renamed from: X.1ZM  reason: invalid class name */
public final class AnonymousClass1ZM extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "CreatorToolsValuePropsFragment";
    public final C04530Oa A00 = C62373Zc.A00(this, 33);
    public final C04530Oa A01 = C62373Zc.A00(this, 34);
    public final C04530Oa A02 = C62373Zc.A00(this, 35);
    public final C04530Oa A03 = C80644m9.A00(this);
    public final C04530Oa A04 = C18220wO.A0M(new KtLambdaShape60S0100000_I2_40(this, 36), new KtLambdaShape60S0100000_I2_40(this, 37), new KtLambdaShape25S0200000_I2_9(46, (Object) null, this), C18210wN.A0l(AnonymousClass10W.class));

    public final void configureActionBar(AnonymousClass4u2 r4) {
        int i;
        C04220Ms.A0B(r4, 0);
        r4.CtT(true);
        Object value = this.A02.getValue();
        C04220Ms.A0B(value, 0);
        if (value.equals(ValuePropsFlow.INSIGHTS.A00)) {
            i = 2131829076;
        } else if (value.equals(ValuePropsFlow.INSPIRATION.A00)) {
            i = 2131829081;
        } else if (value.equals(ValuePropsFlow.BONUSES.A00)) {
            i = 2131830675;
        } else if (value.equals(ValuePropsFlow.SUBSCRIPTION.A00)) {
            i = 2131830686;
        } else if (value.equals(ValuePropsFlow.BADGES.A00)) {
            i = 2131830674;
        } else {
            boolean equals = value.equals(ValuePropsFlow.CREATOR_MARKETPLACE.A00);
            i = 2131837710;
            if (equals) {
                i = 2131830677;
            }
        }
        r4.Cqb(i);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        C04530Oa r2 = this.A01;
        if (r2.getValue() != null) {
            ((AnonymousClass10W) this.A04.getValue()).A00 = C18200wM.A0q(r2);
        }
        C18240wQ.A12((RecyclerView) view2.findViewById(R.id.value_props_recycle_view), this.A00);
        C04530Oa r22 = this.A04;
        AnonymousClass10W r6 = (AnonymousClass10W) r22.getValue();
        String A0q = C18200wM.A0q(this.A02);
        C04220Ms.A0B(A0q, 0);
        r6.A0C.CrC(C18180wK.A0Y());
        AnonymousClass0MJ r9 = new AnonymousClass0MJ();
        AnonymousClass0ZV r0 = AnonymousClass0ZV.A00;
        r9.A00 = r0;
        AnonymousClass0MJ r12 = new AnonymousClass0MJ();
        r12.A00 = r0;
        AnonymousClass0MJ r10 = new AnonymousClass0MJ();
        C305321r r02 = C305321r.FETCHING;
        r10.A00 = r02;
        AnonymousClass0MJ r11 = new AnonymousClass0MJ();
        r11.A00 = r02;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S1501000_I2(r6, A0q, (C146958n9) null, r9, r10, r11, r12, 5), AnonymousClass3J5.A00(r6), 3);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S1501000_I2(r6, A0q, (C146958n9) null, r12, r11, r10, r9, 6), AnonymousClass3J5.A00(r6), 3);
        boolean A3a = C06810aP.A01.A01(AnonymousClass0wJ.A0X(this.A03)).A3a();
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view2.findViewById(R.id.value_props_bottom_button_layout);
        if (A3a) {
            if (igdsBottomButtonLayout != null) {
                C18210wN.A15(this, igdsBottomButtonLayout, 2131829580);
                i = 320;
            }
            C18190wL.A1C(getViewLifecycleOwner(), ((AnonymousClass10W) r22.getValue()).A05, this, 19);
            C18250wR.A0v(getViewLifecycleOwner(), ((AnonymousClass10W) r22.getValue()).A02, view2, this, 6);
            C18250wR.A0v(getViewLifecycleOwner(), ((AnonymousClass10W) r22.getValue()).A03, view2, this, 7);
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape9S0101000_I2_6(this, (C146958n9) null, 30), C18200wM.A0M(this), 3);
        }
        if (igdsBottomButtonLayout != null) {
            C18210wN.A15(this, igdsBottomButtonLayout, 2131824413);
            i = 321;
        }
        C18190wL.A1C(getViewLifecycleOwner(), ((AnonymousClass10W) r22.getValue()).A05, this, 19);
        C18250wR.A0v(getViewLifecycleOwner(), ((AnonymousClass10W) r22.getValue()).A02, view2, this, 6);
        C18250wR.A0v(getViewLifecycleOwner(), ((AnonymousClass10W) r22.getValue()).A03, view2, this, 7);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape9S0101000_I2_6(this, (C146958n9) null, 30), C18200wM.A0M(this), 3);
        igdsBottomButtonLayout.setPrimaryActionOnClickListener(C18190wL.A0H(this, i));
        C18190wL.A1C(getViewLifecycleOwner(), ((AnonymousClass10W) r22.getValue()).A05, this, 19);
        C18250wR.A0v(getViewLifecycleOwner(), ((AnonymousClass10W) r22.getValue()).A02, view2, this, 6);
        C18250wR.A0v(getViewLifecycleOwner(), ((AnonymousClass10W) r22.getValue()).A03, view2, this, 7);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape9S0101000_I2_6(this, (C146958n9) null, 30), C18200wM.A0M(this), 3);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-628175983);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.creator_tools_value_props_screen, viewGroup, false);
        C14030oh.A09(-1754488417, A022);
        return inflate;
    }
}
