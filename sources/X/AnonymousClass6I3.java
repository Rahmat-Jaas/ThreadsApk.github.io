package X;

import android.widget.TextView;
import com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.6I3  reason: invalid class name */
public final class AnonymousClass6I3 {
    public static final void A00(TextView textView, C121777Ib r5) {
        PAYTextWithLinksFragmentImpl pAYTextWithLinksFragmentImpl;
        ImmutableList treeList;
        String stringValue;
        if (r5 != null) {
            C146928n6 r1 = r5.A01;
            textView.setText(r1.BEM(C18190wL.A0A(textView)));
            AnonymousClass7Fd.A02(textView, r5.A02);
            C146998nD r0 = r5.A00;
            if (r0 != null) {
                r0.Chv(textView);
            }
            if ((r1 instanceof C128087ir) && (pAYTextWithLinksFragmentImpl = ((C128087ir) r1).A00) != null && (treeList = pAYTextWithLinksFragmentImpl.getTreeList("ranges", PAYTextWithLinksFragmentImpl.Ranges.class)) != null) {
                if (!(treeList instanceof Collection) || !treeList.isEmpty()) {
                    Iterator it = treeList.iterator();
                    while (it.hasNext()) {
                        TreeJNI treeValue = C18210wN.A0G(it).getTreeValue("entity", PAYTextWithLinksFragmentImpl.Ranges.Entity.class);
                        if (treeValue != null && (stringValue = treeValue.getStringValue("url")) != null && stringValue.length() > 0) {
                            textView.setClickable(true);
                            C18180wK.A0z(textView);
                            return;
                        }
                    }
                }
            }
        }
    }
}
