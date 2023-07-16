package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.IDxObserverShape27S0400000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape32S0200000_I2_16;
import kotlin.jvm.internal.KtLambdaShape94S0100000_I2_74;
import kotlin.jvm.internal.KtLambdaShape95S0100000_I2_75;

/* renamed from: X.1d2  reason: invalid class name */
public final class AnonymousClass1d2 extends C34640IcN implements C21598Bx3 {
    public static final String __redex_internal_original_name = "ProfileTabbedExplorerFragment";
    public C168529ra A00;
    public final C04530Oa A01;
    public final C04530Oa A02 = C80644m9.A00(this);
    public final C04530Oa A03;

    public final String getModuleName() {
        return "tabbed_explorer_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) AnonymousClass0wJ.A0J(view, R.id.tab_layout);
        ViewPager viewPager = (ViewPager) AnonymousClass0wJ.A0J(view, R.id.tab_layout_pager);
        View A0J = AnonymousClass0wJ.A0J(view, R.id.tab_layout_header_container);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.tab_layout_header);
        C18230wP.A0z(requireContext(), igSegmentedTabLayout, C121907Is.A02(getContext(), R.attr.elevatedBackgroundColor));
        this.A00 = new C168529ra(getChildFragmentManager(), viewPager, this, igSegmentedTabLayout);
        viewPager.A0L(new AnonymousClass3y1(this));
        C29110FiC.A00((C27952Ew2) null, ((C19480zw) this.A03.getValue()).A02, 3).A0C(getViewLifecycleOwner(), new IDxObserverShape27S0400000_1_I2(2, this, A0J, igSegmentedTabLayout, A0K));
    }

    public final /* bridge */ /* synthetic */ Fragment AFR(Object obj) {
        int A04 = C18230wP.A04((AnonymousClass23Q) obj, 0);
        if (A04 == 1) {
            String string = requireArguments().getString("ProfileTabbedExplorerFragment.USER_ID");
            if (string != null) {
                UserSession A0X = AnonymousClass0wJ.A0X(this.A02);
                C04220Ms.A0B(A0X, 0);
                Bundle A06 = C18180wK.A06();
                AnonymousClass1ap r1 = new AnonymousClass1ap();
                C18190wL.A13(A06, A0X.token);
                A06.putString("ChannelsListFragment.USER_ID", string);
                A06.putString("ChannelsListFragment.ENTRY_POINT", (String) null);
                r1.setArguments(A06);
                return r1;
            }
            throw AnonymousClass0wJ.A0b();
        } else if (A04 != 0) {
            throw AnonymousClass4VZ.A00();
        } else if (requireArguments().getString("ProfileTabbedExplorerFragment.USER_ID") != null) {
            this.A02.getValue();
            C04220Ms.A0E("delegate");
            throw null;
        } else {
            throw AnonymousClass0wJ.A0b();
        }
    }

    public final /* bridge */ /* synthetic */ C17996AVq BFQ(Object obj) {
        AnonymousClass23Q r6 = (AnonymousClass23Q) obj;
        C04220Ms.A0B(r6, 0);
        return new C17996AVq((Drawable) null, getString(r6.A00), -1, false);
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public AnonymousClass1d2() {
        KtLambdaShape95S0100000_I2_75 ktLambdaShape95S0100000_I2_75 = new KtLambdaShape95S0100000_I2_75(this, 3);
        KtLambdaShape95S0100000_I2_75 ktLambdaShape95S0100000_I2_752 = new KtLambdaShape95S0100000_I2_75(this, 0);
        Integer num = AnonymousClass006.A0C;
        C04530Oa A012 = AnonymousClass0OY.A01(num, new KtLambdaShape95S0100000_I2_75(ktLambdaShape95S0100000_I2_752, 1));
        this.A03 = C18220wO.A0M(new KtLambdaShape95S0100000_I2_75(A012, 2), ktLambdaShape95S0100000_I2_75, new KtLambdaShape32S0200000_I2_16(41, (Object) null, A012), C18210wN.A0l(C19480zw.class));
        this.A01 = AnonymousClass0OY.A01(num, new KtLambdaShape94S0100000_I2_74(this, 49));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1099683920);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.layout_tabbed_explorer_fragment, false);
        C14030oh.A09(-473744090, A022);
        return A0D;
    }
}
