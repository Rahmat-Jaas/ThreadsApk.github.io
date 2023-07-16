package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape206S0100000_4_I2_1;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import kotlin.jvm.internal.KtLambdaShape143S0100000_I2_123;

/* renamed from: X.1Y7  reason: invalid class name */
public final class AnonymousClass1Y7 extends C34640IcN {
    public static final String __redex_internal_original_name = "UserPayCMPViolationBottomSheet";
    public DRP A00;
    public final C04530Oa A01 = C62373Zc.A03(new KtLambdaShape143S0100000_I2_123(this, 0));

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0L = AnonymousClass0wJ.A0L(view, R.id.description);
        Context context = A0L.getContext();
        String string = context.getString(2131829989);
        SpannableStringBuilder A0E = C18200wM.A0E(context.getString(2131829997));
        AnonymousClass3Zw.A00(A0E, C18730xl.A00(this, C18210wN.A01(context), 54), string);
        A0L.setText(A0E);
        C18180wK.A0z(A0L);
        IgdsBottomButtonLayout A0W = C18230wP.A0W(view, R.id.bottom_button);
        Context context2 = view.getContext();
        A0W.setPrimaryAction(context2.getString(2131830004), new IDxCListenerShape206S0100000_4_I2_1((Object) this, 192));
        A0W.setSecondaryAction(context2.getString(2131830005), new IDxCListenerShape206S0100000_4_I2_1((Object) this, 193));
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(44764704);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.iglive_user_pay_cmp_violation_bottom_sheet, viewGroup, false);
        C14030oh.A09(-3668211, A02);
        return inflate;
    }
}
