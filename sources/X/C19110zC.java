package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.barcelona.R;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.0zC  reason: invalid class name and case insensitive filesystem */
public final class C19110zC extends ConstraintLayout {
    public C81744oI A00;

    public /* synthetic */ C19110zC(Context context) {
        super(context, (AttributeSet) null, 0);
        IgdsHeadline igdsHeadline = new IgdsHeadline(context, (AttributeSet) null, 0, 0);
        igdsHeadline.setHeadline((CharSequence) context.getString(2131826764));
        igdsHeadline.setBody(context.getString(2131826765), (View.OnClickListener) null);
        igdsHeadline.setPadding(C18240wQ.A01(context, 32), C18240wQ.A01(context, 32), C18240wQ.A01(context, 32), C18240wQ.A01(context, 16));
        igdsHeadline.A08(R.drawable.ig_illustrations_qp_warning2_refresh, false);
        igdsHeadline.setId(View.generateViewId());
        igdsHeadline.setLayoutParams(getEmptyStateLayoutParams());
        addView(igdsHeadline);
        IgdsMediaButton igdsMediaButton = new IgdsMediaButton(context, (AttributeSet) null, 0);
        igdsMediaButton.setButtonStyle(AnonymousClass25V.SECONDARY_ON_BLACK);
        igdsMediaButton.setLabel(context.getString(2131826763));
        AnonymousClass0wJ.A17(igdsMediaButton, 326, this);
        C39909L6z l6z = new C39909L6z(-2, -2);
        l6z.A0K = 0;
        l6z.A0q = 0;
        l6z.A0r = igdsHeadline.getId();
        igdsMediaButton.setLayoutParams(l6z);
        addView(igdsMediaButton);
    }

    public final C39909L6z getEmptyStateLayoutParams() {
        C39909L6z l6z = new C39909L6z(-2, -2);
        l6z.A0E = 0;
        l6z.A0K = 0;
        l6z.A0q = 0;
        l6z.A0s = 0;
        return l6z;
    }

    public final void setCardProvider(C81744oI r2) {
        C04220Ms.A0B(r2, 0);
        this.A00 = r2;
    }
}
