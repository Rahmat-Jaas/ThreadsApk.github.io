package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.forker.Process;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1gr  reason: invalid class name and case insensitive filesystem */
public final class C24081gr extends AnonymousClass436 {
    public final Context A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final String getBinderGroupName() {
        return "ZeroRatingSlimBanner";
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return Process.WAIT_RESULT_TIMEOUT;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Process.WAIT_RESULT_TIMEOUT;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C24081gr(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(1037871134);
        Context context = this.A00;
        JUZ BHE = C34463IUv.A00(this.A01).BHE();
        TextView textView = ((C562836m) view.getTag()).A00;
        String str = BHE.A06;
        if (str == null || str.isEmpty()) {
            str = context.getString(2131838182);
        }
        textView.setText(AnonymousClass0wJ.A0l(context, str, 2131838183));
        textView.getPaint().setFakeBoldText(true);
        C14030oh.A0A(380213719, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-2033438470);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.zero_rating_free_data_banner);
        A0H.setTag(new C562836m(A0H));
        C14030oh.A0A(685145065, A03);
        return A0H;
    }
}
