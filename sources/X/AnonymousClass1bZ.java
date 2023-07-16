package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0801000_I2;
import kotlin.jvm.internal.IDxRImplShape188S0000000_1_I2;

/* renamed from: X.1bZ  reason: invalid class name */
public final class AnonymousClass1bZ extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "FundedContentSelectorFragment";
    public TextView A00;
    public TextView A01;
    public AnonymousClass10Y A02;
    public final C04530Oa A03 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r3) {
        int i;
        Context A0A = C18240wQ.A0A(this, r3, 0);
        AnonymousClass10Y r0 = this.A02;
        if (r0 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        if (r0 instanceof AnonymousClass1f7) {
            i = 2131823420;
        } else {
            i = 2131822390;
        }
        AnonymousClass4u2.A08(r3, A0A.getString(i));
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (TextView) AnonymousClass0wJ.A0I(view, R.id.title);
        this.A00 = (TextView) AnonymousClass0wJ.A0I(view, R.id.subtitle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass10Y r4 = this.A02;
        if (r4 != null) {
            AnonymousClass11F r10 = new AnonymousClass11F(requireActivity, new IDxRImplShape188S0000000_1_I2(r4, 2), new IDxRImplShape188S0000000_1_I2(r4, 3));
            recyclerView.setAdapter(r10);
            AnonymousClass10Y r0 = this.A02;
            if (r0 != null) {
                r0.A01();
                View findViewById = view.findViewById(R.id.loading_indicator);
                View findViewById2 = view.findViewById(R.id.loading_shimmer);
                AnonymousClass061 r5 = AnonymousClass061.STARTED;
                AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0801000_I2(viewLifecycleOwner, r5, this, findViewById, findViewById2, recyclerView, r10, view2, (C146958n9) null, 0), AnonymousClass067.A00(viewLifecycleOwner), 3);
                return;
            }
        }
        C04220Ms.A0E("viewModel");
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r12 = this;
            X.10Y r0 = r12.A02
            r11 = 0
            boolean r10 = X.AnonymousClass0wJ.A1W(r0)
            java.lang.String r9 = "viewModel"
            r7 = 0
            r6 = 0
            if (r10 == 0) goto L_0x003d
            if (r0 != 0) goto L_0x0014
            X.C04220Ms.A0E(r9)
            throw r6
        L_0x0014:
            X.4wG r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            long r2 = X.C18190wL.A08(r0)
            X.10Y r0 = r12.A02
            if (r0 != 0) goto L_0x0026
            X.C04220Ms.A0E(r9)
            throw r6
        L_0x0026:
            X.4wG r0 = r0.A08
            java.lang.Object r1 = r0.getValue()
            X.3Dd r1 = (X.C57943Dd) r1
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x003f
            if (r1 == 0) goto L_0x003f
            java.lang.CharSequence r0 = X.C59523Ld.A01(r12, r1)
            java.lang.String r5 = r0.toString()
            goto L_0x0040
        L_0x003d:
            r2 = 0
        L_0x003f:
            r5 = r6
        L_0x0040:
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x006d
            java.lang.String r4 = java.lang.String.valueOf(r2)
        L_0x0048:
            android.content.Intent r1 = X.C18230wP.A0B()
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_FUNDED_CONTENT_DEAL_ID"
            android.content.Intent r1 = r1.putExtra(r0, r4)
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_FUNDED_CONTENT_DEAL_NAME"
            android.content.Intent r2 = r1.putExtra(r0, r5)
            X.C04220Ms.A06(r2)
            androidx.fragment.app.FragmentActivity r1 = r12.requireActivity()
            r0 = -1
            r1.setResult(r0, r2)
            if (r10 == 0) goto L_0x007f
            X.10Y r3 = r12.A02
            if (r3 != 0) goto L_0x0070
            X.C04220Ms.A0E(r9)
            throw r6
        L_0x006d:
            java.lang.String r4 = "not_funded"
            goto L_0x0048
        L_0x0070:
            boolean r0 = r3 instanceof X.AnonymousClass1f8
            if (r0 == 0) goto L_0x007f
            X.1f8 r3 = (X.AnonymousClass1f8) r3
            X.48z r2 = r3.A02
            java.lang.Integer r1 = X.AnonymousClass006.A0C
            java.lang.String r0 = r3.A06
            r2.A00(r1, r5, r0, r4)
        L_0x007f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1bZ.onBackPressed():boolean");
    }

    public final void onCreate(Bundle bundle) {
        long j;
        C21281Qc r6;
        int A022 = C14030oh.A02(-1294493639);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("ClipsConstants.ARG_CLIPS_FUNDED_CONTENT_DEAL_ID");
        if (string == null || string.length() == 0 || "not_funded".equals(string)) {
            j = 0;
        } else {
            j = Long.parseLong(string);
        }
        boolean z = requireArguments.getBoolean("ClipsConstants.ARG_CLIPS_SHOULD_SHOW_BONUSES_DEAL");
        int i = requireArguments.getInt("ClipsConstants.ARG_CLIPS_CONTENT_SCHEDULED_PUBLISH_TIME");
        if (z) {
            C04530Oa r3 = this.A03;
            r6 = new C21281Qc(AnonymousClass0wJ.A0X(r3));
            r6.A0L(requireContext(), KK7.A00(AnonymousClass0wJ.A0U(r3)), this);
        } else {
            r6 = null;
        }
        this.A02 = (AnonymousClass10Y) new AnonymousClass7IU((C147138nS) new C66623xu(r6, AnonymousClass0wJ.A0X(this.A03), Integer.valueOf(i), requireArguments.getString("ClipsConstants.ARG_CLIPS_MEDIA_ID"), j, z), (AnonymousClass06C) requireActivity()).A01(AnonymousClass10Y.class);
        C14030oh.A09(430037863, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1805059916);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.layout_share_content_funding, false);
        C14030oh.A09(1686033506, A022);
        return A0D;
    }
}
