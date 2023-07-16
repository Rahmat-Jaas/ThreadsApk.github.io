package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.7hG  reason: invalid class name and case insensitive filesystem */
public final class C127507hG implements Mcm {
    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        LLI lli = (LLI) obj;
        C90955fM r7 = (C90955fM) obj2;
        lli.setOnTouchListener((View.OnTouchListener) null);
        lli.A00 = null;
        View.OnClickListener onClickListener = r7.A06;
        if (onClickListener != null) {
            lli.setOnClickListener(onClickListener);
        }
        lli.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        lli.setFocusable(false);
        lli.setFocusableInTouchMode(false);
        lli.setEnabled(r7.A09);
        if (r7.A00 != -1) {
            lli.setClickable(false);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        LLI lli = (LLI) obj;
        lli.setOnTouchListener((View.OnTouchListener) null);
        lli.A00 = null;
        lli.setOnClickListener((View.OnClickListener) null);
        lli.setClickable(false);
        lli.setOnLongClickListener((View.OnLongClickListener) null);
        lli.setLongClickable(false);
        lli.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        lli.setFocusable(false);
        lli.setFocusableInTouchMode(false);
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
