package X;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Ya  reason: invalid class name and case insensitive filesystem */
public final class C62263Ya {
    public final Context A00;
    public final Boolean A01;
    public final Boolean A02;
    public final List A03 = AnonymousClass0wJ.A0v();

    public C62263Ya(Context context, Boolean bool, Boolean bool2) {
        C04220Ms.A0B(context, 1);
        this.A00 = context;
        this.A01 = bool;
        this.A02 = bool2;
    }

    public static C62263Ya A00(Context context) {
        return new C62263Ya(context, true, false);
    }

    public final List A02() {
        AnonymousClass256 r0;
        List<AnonymousClass3CE> list = this.A03;
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        for (AnonymousClass3CE r6 : list) {
            Context context = this.A00;
            C04220Ms.A0B(r6, 1);
            IgdsBulletCell igdsBulletCell = new IgdsBulletCell(context, (AttributeSet) null, 0);
            igdsBulletCell.setIcon(r6.A00);
            igdsBulletCell.setText(r6.A04, r6.A03);
            igdsBulletCell.setExcludeHorizontalPadding(C04220Ms.A0I(r6.A01, true));
            if (C04220Ms.A0I(r6.A02, true)) {
                r0 = AnonymousClass256.ON_MEDIA;
            } else {
                r0 = AnonymousClass256.DEFAULT;
            }
            igdsBulletCell.setSurfaceType(r0);
            A0w.add(igdsBulletCell);
        }
        return A0w;
    }

    public final void A03(CharSequence charSequence, CharSequence charSequence2, int i) {
        this.A03.add(new AnonymousClass3CE(this.A01, this.A02, charSequence, charSequence2, i));
    }

    public static List A01(C62263Ya r0, CharSequence charSequence, CharSequence charSequence2, int i) {
        r0.A03(charSequence, charSequence2, i);
        return r0.A02();
    }
}
