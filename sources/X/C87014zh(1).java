package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.4zh  reason: invalid class name and case insensitive filesystem */
public final class C87014zh extends ClickableSpan {
    public final /* synthetic */ C92595iu A00;

    public final void updateDrawState(TextPaint textPaint) {
        C04220Ms.A0B(textPaint, 0);
        textPaint.setColor(AnonymousClass7Kz.A0G().A03(this.A00.A01, 5));
        textPaint.setUnderlineText(false);
    }

    public C87014zh(C92595iu r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        C92595iu r1 = this.A00;
        IgBloksScreenConfig A0N = C18190wL.A0N(r1.A03);
        Context context = r1.A00;
        C18210wN.A0s(context, A0N, R.string.f0nameremoved);
        HashMap A0y = AnonymousClass0wJ.A0y();
        HashMap A0y2 = AnonymousClass0wJ.A0y();
        HashMap A0y3 = AnonymousClass0wJ.A0y();
        new BitSet(0);
        C63743iE A06 = C63743iE.A06("com.bloks.www.metacheckout.disclaimer.learnmore", C37067Jjv.A02(A0y), A0y2);
        C63743iE.A0A(A06, 719983200);
        A06.A03 = null;
        A06.A02 = null;
        A06.A04 = null;
        A06.A0G(A0y3);
        A06.A0D(context, A0N);
    }
}
