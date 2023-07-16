package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape134S0100000_I2_114;

/* renamed from: X.1Xr  reason: invalid class name */
public final class AnonymousClass1Xr extends C34640IcN {
    public static final String __redex_internal_original_name = "FacebookPlaysAndLikesFragment";
    public final C04530Oa A00 = AnonymousClass0OY.A02(new KtLambdaShape134S0100000_I2_114(this, 1));
    public final C04530Oa A01 = C80644m9.A00(this);

    public final String getModuleName() {
        return "facebook_plays_and_likes";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Resources A0B;
        Object[] objArr;
        int A02 = C14030oh.A02(-2062004572);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.facebook_plays_and_likes_layout, viewGroup, false);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.text);
        C04530Oa r2 = this.A00;
        String A012 = C120737Cg.A01(AnonymousClass0wJ.A0B(this), Integer.valueOf(((BKU) r2.getValue()).A1o()), false);
        C04220Ms.A06(A012);
        String A013 = C120737Cg.A01(AnonymousClass0wJ.A0B(this), Integer.valueOf(((BKU) r2.getValue()).A1p()), false);
        C04220Ms.A06(A013);
        if (((BKU) r2.getValue()).A1o() == 0) {
            i = 2131835631;
            A0B = AnonymousClass0wJ.A0B(this);
            objArr = new Object[]{A013, ""};
        } else {
            this.A01.getValue();
            BKU bku = (BKU) r2.getValue();
            C04220Ms.A06(bku);
            i = 2131835630;
            if (AnonymousClass3PV.A01(bku)) {
                i = 2131835632;
            }
            A0B = AnonymousClass0wJ.A0B(this);
            objArr = new Object[]{A012, A013, ""};
        }
        String string = A0B.getString(i, objArr);
        C04220Ms.A06(string);
        textView.setText(string);
        TextView textView2 = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.footer_text);
        String A0g = C18190wL.A0g(AnonymousClass0wJ.A0B(this), 2131835628);
        this.A01.getValue();
        BKU bku2 = (BKU) r2.getValue();
        C04220Ms.A06(bku2);
        int i2 = 2131835629;
        if (AnonymousClass3PV.A01(bku2)) {
            i2 = 2131835633;
        }
        String A0h = C18190wL.A0h(AnonymousClass0wJ.A0B(this), A0g, i2);
        C04220Ms.A06(A0h);
        C18670xb r0 = new C18670xb(C15430rJ.A01("https://help.instagram.com/1549313575265878"));
        SpannableStringBuilder A0E = C18200wM.A0E(A0h);
        AnonymousClass3Zw.A01(A0E, r0, A0g);
        textView2.setMovementMethod(C28241F2t.A00);
        textView2.setClickable(false);
        textView2.setLongClickable(false);
        textView2.setText(A0E);
        C14030oh.A09(384034778, A02);
        return inflate;
    }
}
