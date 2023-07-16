package X;

import android.content.Context;
import com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: X.7ir  reason: invalid class name and case insensitive filesystem */
public final class C128087ir implements C146928n6 {
    public final PAYTextWithLinksFragmentImpl A00;
    public final C143638h4 A01;

    public final CharSequence BEM(Context context) {
        String stringValue;
        String stringValue2;
        PAYTextWithLinksFragmentImpl pAYTextWithLinksFragmentImpl = this.A00;
        if (pAYTextWithLinksFragmentImpl == null || (stringValue = pAYTextWithLinksFragmentImpl.getStringValue("text")) == null || AnonymousClass8bQ.A0n(stringValue)) {
            return null;
        }
        String stringValue3 = pAYTextWithLinksFragmentImpl.getStringValue("text");
        if (stringValue3 != null) {
            ImmutableList treeList = pAYTextWithLinksFragmentImpl.getTreeList("ranges", PAYTextWithLinksFragmentImpl.Ranges.class);
            if (treeList != null) {
                C143638h4 r6 = this.A01;
                ArrayList A0v = AnonymousClass0wJ.A0v();
                C1366783w it = treeList.iterator();
                while (it.hasNext()) {
                    TreeJNI treeJNI = (TreeJNI) it.next();
                    Class<PAYTextWithLinksFragmentImpl.Ranges.Entity> cls = PAYTextWithLinksFragmentImpl.Ranges.Entity.class;
                    if (treeJNI.getTreeValue("entity", cls) != null) {
                        TreeJNI treeValue = treeJNI.getTreeValue("entity", cls);
                        String str = null;
                        if (!(treeValue == null || (stringValue2 = treeValue.getStringValue("url")) == null || AnonymousClass8bQ.A0n(stringValue2))) {
                            int intValue = treeJNI.getIntValue("length");
                            int intValue2 = treeJNI.getIntValue("offset");
                            TreeJNI treeValue2 = treeJNI.getTreeValue("entity", cls);
                            if (treeValue2 != null) {
                                str = treeValue2.getStringValue("url");
                            }
                            A0v.add(new C108886j7(intValue, intValue2, str));
                        }
                    }
                }
                return new C112166p6(stringValue3, A0v).A00(r6, false);
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public C128087ir(PAYTextWithLinksFragmentImpl pAYTextWithLinksFragmentImpl, C143638h4 r2) {
        this.A00 = pAYTextWithLinksFragmentImpl;
        this.A01 = r2;
    }
}
