package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.instagram.barcelona.R;
import java.util.ArrayList;

/* renamed from: X.1bY  reason: invalid class name */
public final class AnonymousClass1bY extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "RapidFeedbackOutroFragment";
    public String A00;
    public View A01;
    public C10300i6 A02;

    public final void configureActionBar(AnonymousClass4u2 r19) {
        AnonymousClass4u2 r2 = r19;
        r2.CtT(false);
        r2.Cqb(2131834034);
        Integer num = AnonymousClass006.A00;
        ColorFilter A012 = C63393hP.A01(getContext(), R.color.blue_5);
        r2.CtQ(C18210wN.A0H(this, 319), true);
        r2.Cro(new C24758DYo(A012, (ColorFilter) null, (Drawable) null, (Drawable) null, (View.OnClickListener) null, num, -2, -2, -2, -2, -2, 2131824237, R.drawable.instagram_check_pano_outline_24, true));
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        C18190wL.A1A(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(2119421527);
        super.onCreate(bundle);
        this.A02 = C18190wL.A0S(requireArguments());
        this.A00 = requireArguments().getString("ARG_TOAST_TEXT");
        C24731jw.A01(this);
        C14030oh.A09(-1223269361, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(647407664);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.rapidfeedback_outro_view);
        this.A01 = A0H;
        C14030oh.A09(-146751303, A022);
        return A0H;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context context = getContext();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0v.add(new C35186IpP(this.A00));
        ((AbsListView) this.A01.requireViewById(R.id.rapidfeedback_page).requireViewById(R.id.rapidfeedback_page_list)).setAdapter(new I45(context, A0v));
    }
}
