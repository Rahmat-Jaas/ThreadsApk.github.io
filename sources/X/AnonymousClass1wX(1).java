package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.redex.IDxCListenerShape219S0200000_1_I2;
import com.facebook.redex.IDxEListenerShape509S0100000_1_I2;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.KtSLambdaShape13S0301000_I2_5;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0101000_I2_11;
import kotlin.coroutines.jvm.internal.KtSLambdaShape22S0201000_I2_8;
import kotlin.jvm.internal.KtLambdaShape115S0100000_I2_95;
import kotlin.jvm.internal.KtLambdaShape33S0200000_I2_17;

/* renamed from: X.1wX  reason: invalid class name */
public final class AnonymousClass1wX extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "AvatarOptionsFragment";
    public AnonymousClass20F A00;
    public AnonymousClass3G2 A01;
    public String A02;
    public boolean A03;
    public final C27930Evg A04;
    public final C04530Oa A05 = C80644m9.A00(this);
    public final C04530Oa A06;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C04530Oa r4 = this.A06;
        C62793ak A0N = C18200wM.A0N(r4);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape22S0201000_I2_8((C146958n9) null, (Object) A0N, 16), AnonymousClass3J5.A00(A0N), 3);
        C62793ak A0N2 = C18200wM.A0N(r4);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape14S0101000_I2_11(A0N2, (C146958n9) null, 12), AnonymousClass3J5.A00(A0N2), 3);
        AnonymousClass061 r42 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape13S0301000_I2_5(viewLifecycleOwner, r42, this, (C146958n9) null, 4), AnonymousClass067.A00(viewLifecycleOwner), 3);
        AnonymousClass066 viewLifecycleOwner2 = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape13S0301000_I2_5(viewLifecycleOwner2, r42, this, (C146958n9) null, 5), AnonymousClass067.A00(viewLifecycleOwner2), 3);
        AnonymousClass066 viewLifecycleOwner3 = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape13S0301000_I2_5(viewLifecycleOwner3, r42, this, (C146958n9) null, 6), AnonymousClass067.A00(viewLifecycleOwner3), 3);
    }

    public static final void A0B(AnonymousClass1wX r14) {
        AnonymousClass20F r7;
        String str = r14.A02;
        if (str != null && (r7 = r14.A00) != null && !r14.A03) {
            C04220Ms.A0A(r7);
            ArrayList A0v = AnonymousClass0wJ.A0v();
            C63293hC r1 = new C63293hC((CharSequence) r14.requireContext().getString(2131821749));
            r1.A00 = R.style.igds_emphasized_body_1;
            AnonymousClass3G2 r8 = new AnonymousClass3G2(r14.requireActivity(), r14.requireContext(), r14.A04, AnonymousClass0wJ.A0X(r14.A05), str);
            r14.A01 = r8;
            A0v.add(r1);
            C04220Ms.A0A(r8);
            A0v.add(r8);
            C63273h9.A02(A0v);
            C63293hC r82 = new C63293hC((CharSequence) r14.requireContext().getString(2131821745));
            r82.A00 = R.style.igds_emphasized_body_1;
            r82.A02 = R.dimen.accent_edge_thickness;
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            String str2 = "EVERYONE";
            C62563aI.A01(str2, r14.requireContext().getString(2131821744), A0v2);
            C62563aI.A01("PEOPLE_YOU_FOLLOW", r14.requireContext().getString(2131821747), A0v2);
            C62563aI.A01("NO_ONE", r14.requireContext().getString(2131821746), A0v2);
            int ordinal = r7.ordinal();
            if (ordinal == 2) {
                str2 = "NO_ONE";
            } else if (ordinal == 3 || ordinal != 1) {
                str2 = "PEOPLE_YOU_FOLLOW";
            }
            A0v.add(r82);
            C61353Sw.A00(new IDxCListenerShape219S0200000_1_I2(2, r14, A0v2), str2, A0v, A0v2);
            C63293hC.A02(r14.requireContext().getString(2131821743), A0v);
            r14.setItems(A0v);
            r14.A03 = true;
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            AnonymousClass4u2.A07(r2, 2131821760);
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A05);
    }

    public AnonymousClass1wX() {
        KtLambdaShape115S0100000_I2_95 ktLambdaShape115S0100000_I2_95 = new KtLambdaShape115S0100000_I2_95(this, 18);
        C04530Oa A0l = C18240wQ.A0l(AnonymousClass006.A0C, new KtLambdaShape115S0100000_I2_95(this, 15), 16);
        this.A06 = C18220wO.A0M(new KtLambdaShape115S0100000_I2_95(A0l, 17), ktLambdaShape115S0100000_I2_95, new KtLambdaShape33S0200000_I2_17(45, (Object) null, A0l), C18210wN.A0l(AnonymousClass106.class));
        this.A04 = new IDxEListenerShape509S0100000_1_I2(this, 2);
    }
}
