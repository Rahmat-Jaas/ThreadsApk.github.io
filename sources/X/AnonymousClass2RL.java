package X;

import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2RL  reason: invalid class name */
public final class AnonymousClass2RL {
    public static final void A00(Drawable drawable, View.OnClickListener onClickListener, View view, C34640IcN icN, String str, String str2, String str3, List list) {
        AnonymousClass0wJ.A1M(view, 1, str);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass0wJ.A0J(view, R.id.headline);
        igdsHeadline.setImageDrawable(drawable);
        igdsHeadline.setHeadline((CharSequence) str);
        igdsHeadline.setBody(str2, (View.OnClickListener) null);
        igdsHeadline.setLink(str3, onClickListener);
        C62263Ya r3 = new C62263Ya(icN.requireContext(), true, C18180wK.A0X());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3SO r0 = (AnonymousClass3SO) it.next();
            r3.A03((CharSequence) null, r0.A01, r0.A00);
        }
        List<IgdsBulletCell> A02 = r3.A02();
        for (IgdsBulletCell movementMethod : A02) {
            movementMethod.setMovementMethod(LinkMovementMethod.getInstance(), LinkMovementMethod.getInstance());
        }
        igdsHeadline.setBulletList(A02);
    }
}
