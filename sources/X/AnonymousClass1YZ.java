package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0501000_I2;
import kotlin.jvm.internal.KtLambdaShape67S0100000_I2_47;
import kotlin.jvm.internal.KtLambdaShape68S0100000_I2_48;

/* renamed from: X.1YZ  reason: invalid class name */
public final class AnonymousClass1YZ extends C34640IcN {
    public static final String __redex_internal_original_name = "ResponseListSearchFragment";
    public C150388wA A00;
    public KU2 A01;
    public List A02;
    public final C04530Oa A03 = C80644m9.A00(this);
    public final C04530Oa A04;
    public final C83574rd A05;

    public final String getModuleName() {
        return "response_list_search_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View view2 = view;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        SearchEditText searchEditText = (SearchEditText) AnonymousClass0wJ.A0J(AnonymousClass0wJ.A0K(view, R.id.response_list_search_box_container), R.id.action_bar_search_edit_text);
        AnonymousClass0wJ.A16(AnonymousClass0wJ.A0K(view, R.id.action_bar_button_back), HttpStatus.SC_PRECONDITION_FAILED, this);
        KU2 ku2 = this.A01;
        if (ku2 == null) {
            str = "searchBarController";
        } else {
            ku2.A00(searchEditText, true);
            View A0K = AnonymousClass0wJ.A0K(view, R.id.search_progressbar);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.response_list_search_recycler_view);
            C150388wA r0 = this.A00;
            if (r0 == null) {
                str = "adapter";
            } else {
                recyclerView.setAdapter(r0);
                C18190wL.A1D(recyclerView);
                AnonymousClass061 r3 = AnonymousClass061.STARTED;
                AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape4S0501000_I2(r3, view2, this, viewLifecycleOwner, A0K, (C146958n9) null, 30), AnonymousClass067.A00(viewLifecycleOwner), 3);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public AnonymousClass1YZ() {
        KtLambdaShape68S0100000_I2_48 ktLambdaShape68S0100000_I2_48 = new KtLambdaShape68S0100000_I2_48(this, 2);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape68S0100000_I2_48(new KtLambdaShape67S0100000_I2_47(this, 49), 0));
        this.A04 = C18220wO.A0M(new KtLambdaShape68S0100000_I2_48(A012, 1), ktLambdaShape68S0100000_I2_48, C18250wR.A0d(A012, (Object) null, 35), C18210wN.A0l(AnonymousClass10H.class));
        this.A02 = AnonymousClass0wJ.A0v();
        this.A05 = new AnonymousClass4C0(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-453052873);
        super.onCreate(bundle);
        this.A00 = C18220wO.A0Z(C18220wO.A0Y(this), new AnonymousClass1lN(this, this.A05, AnonymousClass0wJ.A0X(this.A03), false));
        this.A01 = new KU2(new C71714Jx(this), 2131834892);
        C14030oh.A09(577570309, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(152290464);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.invitee_response_search, viewGroup, false);
        C14030oh.A09(2000351128, A022);
        return inflate;
    }
}
