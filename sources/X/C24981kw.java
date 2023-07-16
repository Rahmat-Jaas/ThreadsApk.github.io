package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCSpanShape14S0100000_1_I2;
import com.instagram.igds.components.textcell.IgdsFooterCell;
import com.instagram.service.session.UserSession;

/* renamed from: X.1kw  reason: invalid class name and case insensitive filesystem */
public final class C24981kw extends AnonymousClass1lO {
    public final Context A00;
    public final FragmentActivity A01;
    public final UserSession A02;

    public C24981kw(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        C04220Ms.A0B(userSession, 3);
        this.A00 = context;
        this.A01 = fragmentActivity;
        this.A02 = userSession;
    }

    public final Class modelClass() {
        return AnonymousClass489.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass489 r6 = (AnonymousClass489) mfV;
        C197911w r7 = (C197911w) m5o;
        AnonymousClass0wJ.A1N(r6, r7);
        IDxCSpanShape14S0100000_1_I2 iDxCSpanShape14S0100000_1_I2 = new IDxCSpanShape14S0100000_1_I2(this, 0);
        Context context = this.A00;
        String string = context.getString(2131822614);
        SpannableStringBuilder A0E = C18200wM.A0E(context.getString(r6.A00));
        AnonymousClass3Zw.A01(A0E, iDxCSpanShape14S0100000_1_I2, string);
        IgdsFooterCell igdsFooterCell = r7.A00;
        MovementMethod instance = LinkMovementMethod.getInstance();
        C04220Ms.A06(instance);
        igdsFooterCell.A02.setMovementMethod(instance);
        igdsFooterCell.A00(A0E);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C18240wQ.A1H(viewGroup);
        return new C197911w(new IgdsFooterCell(C18190wL.A0A(viewGroup), (AttributeSet) null));
    }
}
