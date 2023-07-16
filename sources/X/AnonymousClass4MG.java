package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.redex.IDxPCallbackShape31S0400000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import java.util.List;

/* renamed from: X.4MG  reason: invalid class name */
public final class AnonymousClass4MG implements AnonymousClass4tH {
    public final /* synthetic */ C201413h A00;
    public final /* synthetic */ AnonymousClass4JZ A01;

    public final void Bl8() {
    }

    public final boolean Bvc(int i) {
        if (i != 2) {
            return false;
        }
        TextView textView = this.A00.A04;
        textView.getClass();
        textView.performClick();
        return true;
    }

    public final void CSm() {
    }

    public AnonymousClass4MG(C201413h r1, AnonymousClass4JZ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void CAo() {
        Context context;
        UserSession userSession = this.A01.A00;
        if (C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 36313836818597580L)) {
            EditPhoneNumberView editPhoneNumberView = this.A00.A00;
            editPhoneNumberView.getClass();
            if ((AnonymousClass4JZ.A00(editPhoneNumberView) == null || !AnonymousClass4JZ.A00(editPhoneNumberView).A01.get()) && (context = editPhoneNumberView.getContext()) != null && (context instanceof Activity) && C09860go.A0p(editPhoneNumberView.A01)) {
                C568538u A002 = AnonymousClass4JZ.A00(editPhoneNumberView);
                if (A002 != null) {
                    A002.A01.set(true);
                }
                Activity activity = (Activity) context;
                if (AnonymousClass7K8.A03(activity, AnonymousClass4JZ.A01())) {
                    AnonymousClass3AW r3 = new AnonymousClass3AW(activity);
                    String string = activity.getString(2131832448);
                    C25828Dsm dsm = r3.A00;
                    dsm.A02 = string;
                    String string2 = activity.getString(2131832481);
                    String string3 = activity.getString(2131832480);
                    List list = r3.A01;
                    list.add(new AnonymousClass3AV(r3, string2, string3));
                    dsm.A0c(C18250wR.A0E(activity, editPhoneNumberView, userSession, 38), activity.getString(2131821284));
                    dsm.A0b(C18220wO.A0O(editPhoneNumberView, 143), activity.getString(2131824941));
                    dsm.A0q(false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    for (int i = 0; i < list.size(); i++) {
                        AnonymousClass3AV r9 = (AnonymousClass3AV) list.get(i);
                        SpannableStringBuilder A0E = C18200wM.A0E(r9.A01);
                        A0E.setSpan(new StyleSpan(1), 0, A0E.length(), 33);
                        A0E.append("\n");
                        A0E.append(r9.A00);
                        spannableStringBuilder.append(A0E);
                        if (i != list.size() - 1) {
                            spannableStringBuilder.append("\n\n");
                        }
                    }
                    dsm.A0p(spannableStringBuilder);
                    AnonymousClass0wJ.A1K(dsm);
                } else if (!C18180wK.A1W(activity.checkSelfPermission(AnonymousClass4JZ.A01()))) {
                    EditText editText = editPhoneNumberView.A01;
                    editText.setFocusable(false);
                    AnonymousClass7K8.A02(activity, new IDxPCallbackShape31S0400000_1_I2(1, activity, editText, userSession, editPhoneNumberView), new String[]{AnonymousClass4JZ.A01()});
                } else {
                    AnonymousClass4JZ.A03(activity, userSession, editPhoneNumberView);
                }
            }
        }
    }

    public final void CRi() {
        C568538u A002;
        EditPhoneNumberView editPhoneNumberView = this.A00.A00;
        if (editPhoneNumberView != null && (A002 = AnonymousClass4JZ.A00(editPhoneNumberView)) != null) {
            A002.A00 = true;
        }
    }
}
