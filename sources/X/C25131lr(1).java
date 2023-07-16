package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.debug.devoptions.igds.IgdsTextGroupExamplesFragment;
import com.instagram.igds.components.textcell.IgdsFooterCell;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1lr  reason: invalid class name and case insensitive filesystem */
public final class C25131lr extends IgLinearLayout {
    public C25131lr(Context context) {
        super(context);
        setOrientation(1);
        IgLinearLayout.inflate(context, R.layout.igds_textgroup_layout, this);
    }

    public final void A03(List list) {
        C04220Ms.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18240wQ.A0x(this, it);
        }
    }

    public final void A00() {
        IgdsFooterCell igdsFooterCell = new IgdsFooterCell(C18190wL.A0A(this), (AttributeSet) null);
        igdsFooterCell.A00(IgdsTextGroupExamplesFragment.FOOTER_TEXT);
        addView(igdsFooterCell);
    }

    public final void A02(String str, View.OnClickListener onClickListener) {
        C19030yW r0 = new C19030yW(C18190wL.A0A(this));
        r0.A01("Header Text");
        if (!(onClickListener == null || str == null)) {
            r0.A03(str, onClickListener);
        }
        addView(r0);
    }

    public final void A01(String str) {
        C19010yT r1 = new C19010yT(C18190wL.A0A(this));
        r1.A00.setText(str);
        addView(r1);
    }
}
