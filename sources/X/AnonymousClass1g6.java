package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;

/* renamed from: X.1g6  reason: invalid class name */
public final class AnonymousClass1g6 extends AnonymousClass436 {
    public final FragmentActivity A00;
    public final AnonymousClass1cB A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1g6(FragmentActivity fragmentActivity, AnonymousClass1cB r2) {
        this.A01 = r2;
        this.A00 = fragmentActivity;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        FragmentActivity fragmentActivity;
        int A03 = C14030oh.A03(1563886060);
        if (!(view == null || (fragmentActivity = this.A00) == null || fragmentActivity.isFinishing())) {
            TextView A0L = AnonymousClass0wJ.A0L(view, R.id.account_missing_prompt_textview);
            A0L.setVisibility(0);
            C18200wM.A15(fragmentActivity, A0L, 2131820866);
            A0L.setTypeface(A0L.getTypeface(), 1);
            AnonymousClass0wJ.A16(A0L, 23, this);
        }
        C14030oh.A0A(1623177106, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(672236167);
        View A0H = AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.row_login_more_account);
        C14030oh.A0A(1677857068, A03);
        return A0H;
    }
}
