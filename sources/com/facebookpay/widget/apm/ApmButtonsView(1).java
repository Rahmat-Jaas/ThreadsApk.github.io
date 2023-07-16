package com.facebookpay.widget.apm;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass2LD;
import X.AnonymousClass6Q9;
import X.AnonymousClass7Kz;
import X.C04220Ms;
import X.C121047Dv;
import X.C121097Ec;
import X.C121997Jj;
import X.C130347pn;
import X.C130667qT;
import X.C130827qq;
import X.C147878q4;
import X.C18180wK;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C58513Fy;
import X.C86114wI;
import X.C86154wM;
import X.D57;
import X.LLF;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.graphql.impls.FBPayBloksComponentImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.barcelona.R;
import java.io.StringReader;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ApmButtonsView extends ConstraintLayout {
    public final ShimmerFrameLayout A00;
    public final ViewGroup A01;
    public final TextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApmButtonsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        ConstraintLayout.inflate(context, R.layout.fbpay_apm_view, this);
        ViewGroup viewGroup = (ViewGroup) AnonymousClass0wJ.A0J(this, R.id.apm_bloks_container);
        this.A01 = viewGroup;
        TextView textView = (TextView) AnonymousClass0wJ.A0J(this, R.id.or_pay_with_card_text_view);
        this.A02 = textView;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) AnonymousClass0wJ.A0J(this, R.id.shimmer);
        this.A00 = shimmerFrameLayout;
        C121047Dv.A01(context, viewGroup, AnonymousClass006.A00, C86154wM.A0X(), (Integer) null, 16);
        AnonymousClass7Kz.A0G();
        C86114wI.A0z(context, textView, R.color.igds_elevated_background);
        AnonymousClass7Kz.A0G();
        C18180wK.A0s(context, textView, R.color.igds_secondary_text);
        AnonymousClass7Kz.A0G();
        Drawable drawable = context.getDrawable(R.drawable.apm_buttons_shimmer_background);
        C121097Ec.A00(context, drawable, AnonymousClass7Kz.A0G(), 15);
        shimmerFrameLayout.setBackground(drawable);
        D57.A00(shimmerFrameLayout, (Integer) null);
    }

    public final void setupBloksApms(FragmentActivity fragmentActivity, C147878q4 r9, Map map) {
        String stringValue;
        boolean A1Z = AnonymousClass0wJ.A1Z(fragmentActivity, r9);
        C04220Ms.A0B(map, 2);
        AnonymousClass7Kz.A0M();
        Context context = getContext();
        ViewGroup viewGroup = this.A01;
        C04220Ms.A0B(context, 0);
        C04220Ms.A0B(viewGroup, A1Z ? 1 : 0);
        TreeJNI treeValue = ((TreeJNI) r9).getTreeValue("bundle", FBPayBloksComponentImpl.Bundle.class);
        if (treeValue != null && (stringValue = treeValue.getStringValue("bloks_bundle_tree")) != null) {
            C04220Ms.A06(AnonymousClass7Kz.A04());
            C130667qT A002 = C130667qT.A00((SparseArray) null, fragmentActivity, new C130347pn(), C18230wP.A0Z());
            C130827qq r0 = new C130827qq(new JsonReader(new StringReader(stringValue)));
            r0.Bhu();
            C121997Jj A022 = C121997Jj.A02((AnonymousClass2LD) null, AnonymousClass6Q9.A00(r0).A00.A00);
            LLF llf = new LLF(context);
            C58513Fy r02 = new C58513Fy(context, A022, A002);
            r02.A01 = map;
            r02.A00().A06(llf);
            viewGroup.addView(llf);
        }
    }

    public final ShimmerFrameLayout getShimmer() {
        return this.A00;
    }

    public final void setPayWithCardText(int i) {
        C18200wM.A15(getContext(), this.A02, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ApmButtonsView(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ApmButtonsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }

    public /* synthetic */ ApmButtonsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }
}
