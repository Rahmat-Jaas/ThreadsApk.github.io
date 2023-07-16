package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: X.565  reason: invalid class name */
public final class AnonymousClass565 extends Fragment {
    public C111206mx A00;
    public AnonymousClass58D A01;
    public AnonymousClass4x8 A02;
    public AnonymousClass5jG A03;
    public final AnonymousClass6S2 A04 = AnonymousClass7Kz.A0F();

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x013f, code lost:
        if (r1.A00.getBoolean("AUTH_FLOW_UTIL_PIN_FORGOT_VISIBLE", true) == false) goto L_0x0141;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            X.6mx r0 = new X.6mx
            r0.<init>(r8)
            r7.A00 = r0
            X.8nS r0 = X.C1203379t.A00()
            X.7IU r3 = X.AnonymousClass7IU.A00(r0, r7)
            java.lang.Class<X.58D> r0 = X.AnonymousClass58D.class
            X.3ak r4 = r3.A01(r0)
            X.58D r4 = (X.AnonymousClass58D) r4
            r7.A01 = r4
            android.os.Bundle r2 = r7.requireArguments()
            androidx.fragment.app.Fragment r1 = r7.mParentFragment
            boolean r0 = r1 instanceof X.C145868lF
            if (r0 == 0) goto L_0x0187
            X.8lF r1 = (X.C145868lF) r1
            X.7Dk r0 = r1.ArH()
        L_0x0029:
            r4.A02(r2, r0)
            android.os.Bundle r1 = r7.requireArguments()
            java.lang.String r0 = "FBPAY_AUTH_STEP_SCREEN_DISPLAY_LOG"
            java.lang.String r0 = X.C18190wL.A0j(r1, r0)
            A00(r7, r0)
            X.6mx r0 = r7.A00
            android.view.View r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
            X.6mx r0 = r7.A00
            android.widget.TextView r2 = r0.A08
            X.4x8 r1 = r7.A02
            r0 = 2131821645(0x7f11044d, float:1.927604E38)
            X.C18200wM.A15(r1, r2, r0)
            X.6mx r0 = r7.A00
            androidx.appcompat.widget.Toolbar r1 = r0.A0A
            r0 = 49
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r0 = X.C86134wK.A0P(r7, r0)
            r1.setNavigationOnClickListener(r0)
            X.6mx r0 = r7.A00
            androidx.appcompat.widget.Toolbar r0 = r0.A0A
            android.graphics.drawable.Drawable r4 = r0.getNavigationIcon()
            if (r4 == 0) goto L_0x0079
            X.6mx r0 = r7.A00
            androidx.appcompat.widget.Toolbar r2 = r0.A0A
            X.AnonymousClass7Kz.A0G()
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            r0 = 2130969932(0x7f04054c, float:1.754856E38)
            X.C63403hQ.A02(r1, r4, r0)
            r2.setNavigationIcon((android.graphics.drawable.Drawable) r4)
        L_0x0079:
            X.AnonymousClass7Kz.A0G()
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            X.6mx r0 = r7.A00
            android.widget.ImageView r4 = r0.A03
            r2 = 0
            r5 = 1
            X.C04220Ms.A0B(r4, r5)
            r0 = 2130969932(0x7f04054c, float:1.754856E38)
            android.util.TypedValue r0 = X.C86104wH.A0G(r1, r0)
            int r1 = r0.resourceId
            android.content.Context r0 = r4.getContext()
            X.C63393hP.A04(r0, r4, r1)
            X.58D r1 = r7.A01
            android.os.Bundle r0 = r1.A00
            java.lang.String r6 = X.AnonymousClass7Hq.A01(r0)
            android.os.Bundle r0 = r1.A00
            java.lang.String r4 = X.AnonymousClass7Hq.A02(r0)
            r4.getClass()
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            java.util.Set r0 = X.AnonymousClass58D.A0B
            if (r1 != 0) goto L_0x0181
            boolean r0 = r0.contains(r6)
        L_0x00b6:
            if (r0 == 0) goto L_0x0167
            r4 = 18
            r1 = 4
        L_0x00bb:
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r1)
            android.text.InputFilter[] r1 = new android.text.InputFilter[]{r0}
            X.6mx r0 = r7.A00
            android.widget.EditText r0 = r0.A02
            r0.setFilters(r1)
            X.6mx r0 = r7.A00
            android.widget.EditText r0 = r0.A02
            r0.setInputType(r4)
            X.6mx r0 = r7.A00
            android.widget.EditText r4 = r0.A02
            r1 = 2
            com.facebook.redex.IDxObjectShape283S0100000_2_I2 r0 = new com.facebook.redex.IDxObjectShape283S0100000_2_I2
            r0.<init>(r7, r1)
            r4.addTextChangedListener(r0)
            X.58D r0 = r7.A01
            boolean r0 = r0.A04()
            int r1 = X.C18190wL.A00(r0)
            X.6mx r0 = r7.A00
            android.widget.Button r0 = r0.A01
            r0.setVisibility(r1)
            X.6mx r0 = r7.A00
            android.widget.TextView r0 = r0.A07
            r0.setVisibility(r1)
            X.6mx r0 = r7.A00
            android.widget.Button r1 = r0.A01
            r0 = 51
            X.C86104wH.A1C(r1, r0, r7)
            X.6mx r0 = r7.A00
            android.widget.TextView r1 = r0.A07
            r0 = 52
            X.C86104wH.A1C(r1, r0, r7)
            X.58D r0 = r7.A01
            X.56q r1 = r0.A05
            r0 = 194(0xc2, float:2.72E-43)
            X.C86104wH.A1F(r7, r1, r0)
            X.58D r0 = r7.A01
            X.56q r4 = r0.A06
            r0 = 195(0xc3, float:2.73E-43)
            com.facebook.redex.IDxObserverShape211S0100000_2_I2 r1 = X.C86114wI.A0Q(r7, r0)
            r0 = 275(0x113, float:3.85E-43)
            X.C86114wI.A1A(r7, r4, r1, r0)
            X.58D r0 = r7.A01
            X.56q r1 = r0.A07
            r0 = 196(0xc4, float:2.75E-43)
            X.C86104wH.A1F(r7, r1, r0)
            X.6mx r0 = r7.A00
            android.widget.TextView r4 = r0.A06
            X.58D r1 = r7.A01
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0141
            android.os.Bundle r1 = r1.A00
            java.lang.String r0 = "AUTH_FLOW_UTIL_PIN_FORGOT_VISIBLE"
            boolean r1 = r1.getBoolean(r0, r5)
            r0 = 0
            if (r1 != 0) goto L_0x0143
        L_0x0141:
            r0 = 8
        L_0x0143:
            r4.setVisibility(r0)
            X.6mx r0 = r7.A00
            android.widget.TextView r1 = r0.A06
            r0 = 50
            X.C86104wH.A1C(r1, r0, r7)
            X.6mx r0 = r7.A00
            android.view.View r0 = r0.A00
            r0.setVisibility(r2)
            X.58D r2 = r7.A01
            android.os.Bundle r0 = r7.requireArguments()
            X.56l r1 = new X.56l
            r1.<init>(r0, r3, r2)
            r0 = 197(0xc5, float:2.76E-43)
            X.C86104wH.A1F(r7, r1, r0)
            return
        L_0x0167:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r0 = "RECOVER_PIN"
            if (r1 != 0) goto L_0x017c
            boolean r0 = r0.equalsIgnoreCase(r6)
        L_0x0173:
            if (r0 == 0) goto L_0x018a
            r4 = 129(0x81, float:1.81E-43)
            r1 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00bb
        L_0x017c:
            boolean r0 = r0.equalsIgnoreCase(r4)
            goto L_0x0173
        L_0x0181:
            boolean r0 = r0.contains(r4)
            goto L_0x00b6
        L_0x0187:
            r0 = 0
            goto L_0x0029
        L_0x018a:
            java.lang.String r1 = "not supported step by this screen"
            java.lang.String r0 = " second:"
            java.lang.String r0 = X.AnonymousClass00U.A0d(r1, r4, r0, r6)
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass565.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static void A00(AnonymousClass565 r1, String str) {
        AnonymousClass7Kz.A07().A07.Bb8(str, C121257Ff.A00(r1.requireArguments()));
    }

    public final void onConfigurationChanged(Configuration configuration) {
        requireContext().getResources();
        super.onConfigurationChanged(configuration);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-2066164819);
        super.onCreate(bundle);
        this.A02 = new AnonymousClass4x8(requireContext(), this.A04);
        this.A03 = (AnonymousClass5jG) AnonymousClass7Kz.A07().A02(this.A02, AnonymousClass5jG.class);
        C14030oh.A09(-962646801, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-2082763139);
        AnonymousClass5jG r1 = this.A03;
        C143608h1 r0 = r1.A01;
        View A0D = C18180wK.A0D(((C128707k8) r0).A00, viewGroup, r1.A00, false);
        C14030oh.A09(-2039305757, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-714681413);
        super.onDestroyView();
        C116976xv.A00(this.A00.A02);
        this.A00 = null;
        C14030oh.A09(993306556, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1161161828);
        super.onResume();
        requireContext().getResources();
        C14030oh.A09(1465883729, A022);
    }
}
