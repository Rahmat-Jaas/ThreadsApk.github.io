package X;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxCListenerShape201S0100000_1_I2;
import com.instagram.actionbar.ActionButton;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.4u2  reason: invalid class name */
public interface AnonymousClass4u2 {
    static ActionButton A00(View.OnClickListener onClickListener, AnonymousClass4u2 r3, String str) {
        return r3.Crr(new C25348Dk8(onClickListener, str, 0));
    }

    static void A05(AnonymousClass4u2 r1) {
        C04220Ms.A0B(r1, 0);
        r1.CtT(true);
    }

    View A5d(int i);

    View A5e(View view);

    View A6M(C25435DlZ dlZ);

    View A7Q(C25435DlZ dlZ);

    View A7R(View.OnClickListener onClickListener, Integer num);

    View A7S(C25435DlZ dlZ);

    View A7T(C25435DlZ dlZ);

    void A7U(int i);

    void A7V(String str);

    void A7W(String str, View.OnClickListener onClickListener);

    View A7X(View.OnClickListener onClickListener, int i);

    void AD6();

    void AJT(boolean z);

    void AJa(int i, boolean z);

    void AJb(boolean z);

    void AJh(int i, boolean z);

    int AOg();

    TextView BHC();

    ViewGroup BHD();

    View Cjq(int i, int i2, int i3, boolean z);

    View Cjr(View view);

    View Cjs(View view, int i, int i2, boolean z);

    View Cjt(UserSession userSession, int i, int i2, int i3);

    void Cnm(CharSequence charSequence, CharSequence charSequence2);

    void Cnn(SpannableStringBuilder spannableStringBuilder, View view, CharSequence charSequence);

    void CpF(String str, View.OnClickListener onClickListener);

    void CqF(CharSequence charSequence);

    void Cqb(int i);

    void Cqc(View.OnClickListener onClickListener);

    ActionButton Crj(View.OnClickListener onClickListener, int i);

    void Crl(C25435DlZ dlZ);

    void Cro(C24758DYo dYo);

    ActionButton Crq(View.OnClickListener onClickListener, int i);

    ActionButton Crr(C25348Dk8 dk8);

    void Crs(String str);

    void Cru(C21199BqT bqT);

    void CtO(boolean z);

    void CtP(boolean z);

    void CtQ(View.OnClickListener onClickListener, boolean z);

    void CtT(boolean z);

    void CtU(View.OnClickListener onClickListener, boolean z);

    void CtW(boolean z);

    void setIsLoading(boolean z);

    void setTitle(String str);

    static void A01(View.OnClickListener onClickListener, C25764Drc drc, AnonymousClass4u2 r2) {
        drc.A0C = onClickListener;
        r2.A7Q(new C25435DlZ(drc));
    }

    static void A03(C25764Drc drc, AnonymousClass4u2 r2) {
        r2.Crl(new C25435DlZ(drc));
    }

    static void A04(C25764Drc drc, AnonymousClass4u2 r2, Object obj, int i) {
        drc.A0C = new IDxCListenerShape201S0100000_1_I2(obj, i);
        r2.Crl(new C25435DlZ(drc));
    }

    static void A06(AnonymousClass4u2 r2) {
        C25764Drc drc = new C25764Drc();
        drc.A00 = R.drawable.instagram_x_pano_outline_24;
        r2.Crl(new C25435DlZ(drc));
    }

    static void A02(Fragment fragment, AnonymousClass4u2 r1, int i) {
        r1.setTitle(fragment.getString(i));
    }

    static void A07(AnonymousClass4u2 r1, int i) {
        r1.Cqb(i);
        r1.CtT(true);
    }

    static void A08(AnonymousClass4u2 r1, String str) {
        r1.setTitle(str);
        r1.CtT(true);
    }
}
