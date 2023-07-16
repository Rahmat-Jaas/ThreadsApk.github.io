package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.migration.scrollingviewproxy.IDxSListenerShape170S0100000_1_I2;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0301000_I2_3;
import kotlin.coroutines.jvm.internal.KtSLambdaShape19S0201000_I2_5;
import kotlin.jvm.internal.KtLambdaShape67S0100000_I2_47;

/* renamed from: X.1xg  reason: invalid class name and case insensitive filesystem */
public final class C29281xg extends C23411dm implements C21735BzM {
    public static final String __redex_internal_original_name = "DogfoodingAssistantDiscoveryFragment";
    public C29341xn A00;
    public final C57593Br A01;
    public final C83874s8 A02;
    public final C04530Oa A03 = C62373Zc.A03(new KtLambdaShape67S0100000_I2_47(this, 22));
    public final C04530Oa A04;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass061 r5 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0301000_I2_3((Object) viewLifecycleOwner, (Object) r5, (Object) this, (C146958n9) null, 36), AnonymousClass067.A00(viewLifecycleOwner), 3);
        SearchEditText searchEditText = new SearchEditText(requireContext());
        searchEditText.setHint("Search Dogfooding Sessions");
        searchEditText.A0E = true;
        searchEditText.setAllowTextSelection(true);
        C57593Br r1 = this.A01;
        r1.A00 = searchEditText;
        r1.A01 = this.A02;
        r1.A02 = new AnonymousClass4MY(this);
        getScrollingViewProxy().A7b(new IDxSListenerShape170S0100000_1_I2(this, 0));
        C24 scrollingViewProxy = getScrollingViewProxy();
        C29341xn r0 = this.A00;
        if (r0 == null) {
            C04220Ms.A0E("filteringAdapter");
            throw null;
        }
        scrollingViewProxy.ChZ(r0);
        C29341xn r02 = this.A00;
        if (r02 == null) {
            C04220Ms.A0E("filteringAdapter");
            throw null;
        } else {
            r02.getFilter().filter((CharSequence) null);
        }
    }

    public static final void A0B(C29281xg r4, String str) {
        BottomSheetFragment bottomSheetFragment;
        C37383Jqm jqm;
        AnonymousClass1dH r3 = new AnonymousClass1dH();
        r3.setArguments(C18180wK.A09("dogfooding_assistant_session_id", str));
        Fragment fragment = r4.mParentFragment;
        if (!(fragment instanceof BottomSheetFragment) || (bottomSheetFragment = (BottomSheetFragment) fragment) == null || (jqm = bottomSheetFragment.A02) == null) {
            throw AnonymousClass0wJ.A0b();
        }
        try {
            C37032Jj9 A0L = C18210wN.A0L(AnonymousClass0wJ.A0U(r4.A03));
            A0L.A0I = r3;
            jqm.A0A(r3, A0L, true);
        } catch (IllegalArgumentException unused) {
            jqm.A06();
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public C29281xg() {
        KtLambdaShape67S0100000_I2_47 ktLambdaShape67S0100000_I2_47 = new KtLambdaShape67S0100000_I2_47(this, 23);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape67S0100000_I2_47(new KtLambdaShape67S0100000_I2_47(this, 19), 20));
        this.A04 = C18220wO.A0M(new KtLambdaShape67S0100000_I2_47(A012, 21), ktLambdaShape67S0100000_I2_47, C18250wR.A0d(A012, (Object) null, 26), C18210wN.A0l(AnonymousClass10P.class));
        this.A01 = new C57593Br();
        this.A02 = new AnonymousClass4MU(this);
    }

    public final boolean isScrolledToTop() {
        return !getRecyclerView().canScrollVertically(-1);
    }

    public final void onCreate(Bundle bundle) {
        Object value;
        int A022 = C14030oh.A02(1158965070);
        super.onCreate(bundle);
        this.A00 = new C29341xn(requireActivity(), AnonymousClass0wJ.A0U(this.A03), this);
        AnonymousClass10P r7 = (AnonymousClass10P) this.A04.getValue();
        C86074wE r5 = r7.A01;
        do {
            value = r5.getValue();
        } while (!r5.ADi(value, new KtCSuperShape1S0200000_I2_1(1, ((KtCSuperShape1S0200000_I2_1) value).A00, (Object) null)));
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape19S0201000_I2_5((Object) r7, (C146958n9) null, 43), AnonymousClass3J5.A00(r7), 3);
        C14030oh.A09(-301984330, A022);
    }
}
