package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1l2  reason: invalid class name */
public final class AnonymousClass1l2 extends AnonymousClass1lO {
    public final Context A00;
    public final C83624ri A01;
    public final UserSession A02;
    public final Integer A03;

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        int i;
        Object[] objArr;
        AnonymousClass192 r9 = (AnonymousClass192) mfV;
        AnonymousClass136 r8 = (AnonymousClass136) m5o;
        AnonymousClass0wJ.A1N(r9, r8);
        Context context = this.A00;
        Integer num = this.A03;
        C83624ri r7 = this.A01;
        C04220Ms.A0B(num, 4);
        KtCSuperShape0S0110000_I2 ktCSuperShape0S0110000_I2 = r9.A00;
        TextView textView = r8.A01;
        textView.setTextAppearance(R.style.igds_emphasized_body_1);
        boolean z = ktCSuperShape0S0110000_I2.A01;
        int i2 = R.color.igds_bio_pill_text;
        if (z) {
            i2 = R.color.igds_bio_pill_active_text;
        }
        C18180wK.A0s(context, textView, i2);
        C21743BzU bzU = (C21743BzU) ktCSuperShape0S0110000_I2.A00;
        String name = bzU.getName();
        if (name == null) {
            name = "";
        }
        String AfR = bzU.AfR();
        Resources resources = context.getResources();
        if (AfR != null) {
            i = 2131833012;
            objArr = new Object[]{AfR, name};
        } else {
            i = 2131833013;
            objArr = new Object[]{name};
        }
        String string = resources.getString(i, objArr);
        C04220Ms.A09(string);
        textView.setText(GQD.A00().BfL(-1, string));
        r8.A02.A09(8);
        View view = r8.A00;
        AnonymousClass0wJ.A18(view, 125, ktCSuperShape0S0110000_I2, r7);
        view.setSelected(z);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new C65613tv(view, ktCSuperShape0S0110000_I2, r7, r8, r9));
    }

    public final Class modelClass() {
        return AnonymousClass192.class;
    }

    public AnonymousClass1l2(Context context, C83624ri r2, UserSession userSession, Integer num) {
        this.A02 = userSession;
        this.A00 = context;
        this.A03 = num;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass136(C18200wM.A0F(layoutInflater, viewGroup, R.layout.subinterest_round_pill, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
