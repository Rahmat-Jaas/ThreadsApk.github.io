package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.forker.Process;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1gq  reason: invalid class name and case insensitive filesystem */
public final class C24071gq extends AnonymousClass436 {
    public final Context A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final String getBinderGroupName() {
        return "ZeroRatingNewResBanner";
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

    public C24071gq(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-1016161244);
        Context context = this.A00;
        UserSession userSession = this.A01;
        C562736l r5 = (C562736l) view.getTag();
        JUZ BHE = C34463IUv.A00(userSession).BHE();
        TextView textView = r5.A00;
        String str = BHE.A06;
        if (str == null || str.isEmpty()) {
            str = context.getString(2131838182);
        }
        textView.setText(AnonymousClass0wJ.A0l(context, str, 2131838183));
        r5.A00.getPaint().setFakeBoldText(true);
        C14030oh.A0A(-1167349107, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(84419179);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.zero_rating_free_data_banner);
        C562736l r1 = new C562736l();
        r1.A00 = C18180wK.A0G(A0H, R.id.title);
        A0H.setTag(r1);
        C14030oh.A0A(-1979608776, A03);
        return A0H;
    }
}
