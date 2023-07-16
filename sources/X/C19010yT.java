package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import com.instagram.common.accessibility.AccessibleTextView;

/* renamed from: X.0yT  reason: invalid class name and case insensitive filesystem */
public final class C19010yT extends LinearLayout {
    public final AccessibleTextView A00;

    public /* synthetic */ C19010yT(Context context) {
        super(context, (AttributeSet) null);
        setOrientation(1);
        this.A00 = (AccessibleTextView) AnonymousClass0wJ.A0J(LinearLayout.inflate(context, R.layout.igds_bodytext_layout, this), R.id.igds_body_text);
    }
}
