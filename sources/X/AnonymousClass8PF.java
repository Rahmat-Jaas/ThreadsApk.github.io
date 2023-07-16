package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.8PF  reason: invalid class name */
public final class AnonymousClass8PF extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8PF A00 = new AnonymousClass8PF();

    public AnonymousClass8PF() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        C04220Ms.A0B(context, 0);
        LayoutInflater from = LayoutInflater.from(context);
        C04220Ms.A06(from);
        View A0D = C18180wK.A0D(from, (ViewGroup) null, R.layout.inform_header, false);
        A0D.setTag(new C36202JKs(A0D));
        return A0D;
    }
}
