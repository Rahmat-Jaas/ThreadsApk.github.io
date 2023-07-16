package X;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.IDxCSpanShape6S1200000_1_I2;

/* renamed from: X.1gK  reason: invalid class name */
public final class AnonymousClass1gK extends AnonymousClass436 {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gK(UserSession userSession, FragmentActivity fragmentActivity) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        int A03 = C14030oh.A03(-502974889);
        AnonymousClass0wJ.A1M(view, 1, obj);
        Object tag = view.getTag();
        C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.SearchSectionDescriptionViewBinder.Holder");
        C561535z r1 = (C561535z) tag;
        KtCSuperShape0S0300000_I2 ktCSuperShape0S0300000_I2 = (KtCSuperShape0S0300000_I2) obj;
        UserSession userSession = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        C18210wN.A0n(1, r1, ktCSuperShape0S0300000_I2);
        IgTextView igTextView = r1.A00;
        C18180wK.A0z(igTextView);
        igTextView.setHighlightColor(R.color.fds_transparent);
        Object obj3 = ktCSuperShape0S0300000_I2.A02;
        String str2 = null;
        if (obj3 != null) {
            str = obj3.toString();
        } else {
            str = null;
        }
        Object obj4 = ktCSuperShape0S0300000_I2.A01;
        if (obj4 != null) {
            str2 = obj4.toString();
        }
        if (str == null || str2 == null || fragmentActivity == null) {
            spannableStringBuilder = (CharSequence) ktCSuperShape0S0300000_I2.A00;
        } else {
            SpannableStringBuilder A0E = C18200wM.A0E((CharSequence) ktCSuperShape0S0300000_I2.A00);
            AnonymousClass3Zw.A01(A0E, new IDxCSpanShape6S1200000_1_I2(fragmentActivity, userSession, str, C18210wN.A01(fragmentActivity), 1), str2);
            spannableStringBuilder = A0E;
        }
        igTextView.setText(spannableStringBuilder);
        C14030oh.A0A(-1253100387, A03);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(-707001020, viewGroup);
        View A0D = C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.search_section_description, false);
        A0D.setTag(new C561535z(A0D));
        C14030oh.A0A(-561839693, A002);
        return A0D;
    }
}
