package X;

import android.net.Uri;
import com.facebook.graphql.impls.PAYLinkableTextFragmentImpl;
import com.facebook.pando.TreeJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3JJ  reason: invalid class name */
public final class AnonymousClass3JJ {
    public static final List A00(List list) {
        String stringValue;
        Uri A01;
        String scheme;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TreeJNI treeValue = C18210wN.A0G(it).getTreeValue("entity", PAYLinkableTextFragmentImpl.Ranges.Entity.class);
            if (treeValue == null || (stringValue = treeValue.getStringValue("url")) == null || (A01 = C15430rJ.A01(stringValue)) == null || (scheme = A01.getScheme()) == null || !scheme.equalsIgnoreCase("https")) {
                throw C18190wL.A0a("Link has to be https");
            }
            A0v.add(String.valueOf(A01));
        }
        return AnonymousClass00J.A0N(A0v);
    }

    public static final List A01(List list, int i, boolean z) {
        Uri uri;
        String scheme;
        String stringValue;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TreeJNI A0G = C18210wN.A0G(it);
            TreeJNI treeValue = A0G.getTreeValue("entity", PAYLinkableTextFragmentImpl.Ranges.Entity.class);
            String str = null;
            if (treeValue == null || (stringValue = treeValue.getStringValue("url")) == null) {
                uri = null;
            } else {
                uri = C15430rJ.A01(stringValue);
            }
            if (!z || !(uri == null || (scheme = uri.getScheme()) == null || !scheme.equalsIgnoreCase("https"))) {
                int intValue = A0G.getIntValue("length");
                int intValue2 = A0G.getIntValue("offset") + i;
                if (C18210wN.A1W(z) && uri != null) {
                    str = uri.toString();
                }
                A0v.add(new C108886j7(intValue, intValue2, str));
            } else {
                throw C18190wL.A0a("Link has to be https");
            }
        }
        return AnonymousClass00J.A0N(A0v);
    }
}
